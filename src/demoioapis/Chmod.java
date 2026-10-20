package demoioapis;

import java.nio.file.*;
import java.nio.file.attribute.*;
import static java.nio.file.attribute.PosixFilePermission.*;
import static java.nio.file.FileVisitResult.*;
import java.io.IOException;
import java.util.*;

/**
 * chmod(1) dasturi kabi file'larni ruxsatlarini o'zgartiradigan sample code.
 */

public class Chmod {

    /**
     * File ruxsatlari set'ini o'zgartiriw ucun foydalaniliwi mumkin bo'lgan bir yo bir neca
     * <em>symbolic mode expressions</em> list'ini compile'laydi.
     * Bu method file ruxsatlarini UNIX <i>chmod</i> dasturi kabi
     * uzgartiriw talab etadigan hollarda foydalaniw ucun muljallangan.
     *
     * <p> {@code exprs} parameter bu vergul ila ajratilgan expression'lar list'i
     * va ularni har biri quyidagi form'ani oladi:
     * <blockquote>
     * <i>who operator</i> [<i>permissions</i>]
     * </blockquote>
     * bu yerda <i>who</i> mos raviwda
     * {@code 'u'}, {@code 'g'}, {@code 'o'}, {@code 'a'}
     * character'lardan biri yoki bir nectasi bo'lib,
     * owner (user), group, bowqalarni yo hammasi (owner, group va bowqalar)ni anlatadi.
     *
     * <p> <i>operator</i> bu ruxsatlarni qanday o'zgartiriw kerakligini anlatuvci character:
     * {@code '+'}, {@code '-'}, {@code '='}
     * {@code '+'} ruxsatlar qo'wilganini anlatadi,
     * {@code '-'} ruxsatlar olib tawlanganini anlatadi,
     * {@code '='} ruxsatlar absolute tayinlanganini anlatadi.
     *
     * <p> <i>permissions</i> bu quyidagilarni zero yo undan ko'p ketma ketligi:
     * {@code 'r'} o'qiw ucun ruxsat,
     * {@code 'w'} yoziw ucun ruxsat,
     * {@code 'x'} ijro ucun ruxsat.
     * Ba warti <i>permissions</i> absolute tayinlanganida tuwib qoldirilgan bo'lsa,
     * u holda <i>who</i> tomonidan identify'langan owner, group yo bowqalar ucun ruxsatlar tozalanadi.
     * Qo'wiw yo olib tawlaw paytida tuwirib qoldirilsa, u holda expression ignore'lanadi.
     *
     * <p> Quyidagi example'lar {@code exprs} parameter ucun mumkin qiymatlarni namayiw etadi:
     *
     * <table border="0">
     * <tr>
     *   <td> {@code u=rw} </td>
     *   <td>  O'qiw va yoziw ucun owner ruxsatlarini o'rnatadi. </td>
     * </tr>
     * <tr>
     *   <td> {@code ug+w} </td>
     *   <td> Owner yoziw va group yoziw ruxsatlarini o'rnatadi. </td>
     * </tr>
     * <tr>
     *   <td> {@code u+w,o-rwx} </td>
     *   <td> Owner'ni yoziwini o'rnatadi va bowqalarni o'qiw, yoziw, ijro ruxsatlarini olib tawlaydi. </td>
     * </tr>
     * <tr>
     *   <td> {@code o=} </td>
     *   <td> Bowqalarga ruxsat yo'qligini o'rnatadi (agar o'rnatilgan bo'lsa,
     *        bowqalar o'qiwi, yoziwi, ijro etiwi mumkin bo'lgan ruxsatlar olib tawlanadi) </td>
     * </tr>
     * </table>
     *
     * @param   exprs
     *           Bir yo bir neca <em>symbolic mode expressions</em> list'i
     *
     * @return {@code Changer}
     *           file ruxsatlari set'ini changer'i ucun foydalaniliwi mumkin
     *
     * @throws  IllegalArgumentException
     *           Ba warti {@code exprs} parameter'ni qiymati invalid bo'lsa.
     */
    public static Changer compile(String exprs) {
        // minimum bu who va operator (example ucun u=)
        if (exprs.length() < 2)
            throw new IllegalArgumentException(
                    "Argument kamida 2 ta character'dan iborat bo'liwi kerak: " + exprs);

        // changer qo'wadigan yo olib tawlaydigan ruxsatlar
        final Set<PosixFilePermission> toAdd = new HashSet<PosixFilePermission>();
        final Set<PosixFilePermission> toRemove = new HashSet<PosixFilePermission>();

        // expression mode'larni har biri bo'ylab iterate qiliw
        for (String expr: exprs.split(",")) {
            // who va operator'ni minimum'i
            if (expr.length() < 2)
                throw new IllegalArgumentException(
                        "Element'lar kamida 2 ta character'dan iborat bo'liwi kerak: " + expr +
                                " argument'da:"  + exprs);

            int pos = 0;

            // who
            boolean u = false;
            boolean g = false;
            boolean o = false;
            boolean done = false;
            for (;;) {
                switch (expr.charAt(pos)) {
                    case 'u' : u = true; break;
                    case 'g' : g = true; break;
                    case 'o' : o = true; break;
                    case 'a' : u = true; g = true; o = true; break;
                    default : done = true;
                }
                if (done)
                    break;
                pos++;
            }
            if (!u && !g && !o)
                throw new IllegalArgumentException("Invalid mode");

            // operator va ruxsatlar oliw
            char op = expr.charAt(pos++);
            String mask = (expr.length() == pos) ? "" : expr.substring(pos);

            // operator
            boolean add = (op == '+');
            boolean remove = (op == '-');
            boolean assign = (op == '=');
            if (!add && !remove && !assign)
                throw new IllegalArgumentException("Invalid mode");

            // who= hammasini olib tawlaw degani
            if (assign && mask.length() == 0) {
                assign = false;
                remove = true;
                mask = "rwx";
            }

            // ruxsatlar
            boolean r = false;
            boolean w = false;
            boolean x = false;
            for (int i=0; i<mask.length(); i++) {
                switch (mask.charAt(i)) {
                    case 'r' : r = true; break;
                    case 'w' : w = true; break;
                    case 'x' : x = true; break;
                    default:
                        throw new IllegalArgumentException("Invalid mode");
                }
            }

            // update ruxsatlarni o'rnatiw
            if (add) {
                if (u) {
                    if (r) toAdd.add(OWNER_READ);
                    if (w) toAdd.add(OWNER_WRITE);
                    if (x) toAdd.add(OWNER_EXECUTE);
                }
                if (g) {
                    if (r) toAdd.add(GROUP_READ);
                    if (w) toAdd.add(GROUP_WRITE);
                    if (x) toAdd.add(GROUP_EXECUTE);
                }
                if (o) {
                    if (r) toAdd.add(OTHERS_READ);
                    if (w) toAdd.add(OTHERS_WRITE);
                    if (x) toAdd.add(OTHERS_EXECUTE);
                }
            }
            if (remove) {
                if (u) {
                    if (r) toRemove.add(OWNER_READ);
                    if (w) toRemove.add(OWNER_WRITE);
                    if (x) toRemove.add(OWNER_EXECUTE);
                }
                if (g) {
                    if (r) toRemove.add(GROUP_READ);
                    if (w) toRemove.add(GROUP_WRITE);
                    if (x) toRemove.add(GROUP_EXECUTE);
                }
                if (o) {
                    if (r) toRemove.add(OTHERS_READ);
                    if (w) toRemove.add(OTHERS_WRITE);
                    if (x) toRemove.add(OTHERS_EXECUTE);
                }
            }
            if (assign) {
                if (u) {
                    if (r) toAdd.add(OWNER_READ);
                    else toRemove.add(OWNER_READ);
                    if (w) toAdd.add(OWNER_WRITE);
                    else toRemove.add(OWNER_WRITE);
                    if (x) toAdd.add(OWNER_EXECUTE);
                    else toRemove.add(OWNER_EXECUTE);
                }
                if (g) {
                    if (r) toAdd.add(GROUP_READ);
                    else toRemove.add(GROUP_READ);
                    if (w) toAdd.add(GROUP_WRITE);
                    else toRemove.add(GROUP_WRITE);
                    if (x) toAdd.add(GROUP_EXECUTE);
                    else toRemove.add(GROUP_EXECUTE);
                }
                if (o) {
                    if (r) toAdd.add(OTHERS_READ);
                    else toRemove.add(OTHERS_READ);
                    if (w) toAdd.add(OTHERS_WRITE);
                    else toRemove.add(OTHERS_WRITE);
                    if (x) toAdd.add(OTHERS_EXECUTE);
                    else toRemove.add(OTHERS_EXECUTE);
                }
            }
        }

        // changer'ni qaytariw
        return new Changer() {
            @Override
            public Set<PosixFilePermission> change(Set<PosixFilePermission> perms) {
                perms.addAll(toAdd);
                perms.removeAll(toRemove);
                return perms;
            }
        };
    }

    /**
     * {@link PosixFilePermission} element'lari set'ini <i>changes</i> bajaradigan task.
     */
    public interface Changer {
        /**
         * Berilgan ruxsatlar set'iga uzgariwlarni qollaydi.
         *
         * @param   perms
         *          Uzgartiriw ucun ruxsatlar set'i
         *
         * @return  {@code perms} parameter
         */
        Set<PosixFilePermission> change(Set<PosixFilePermission> perms);
    }

    /**
     * Berilgan Changer yordamida file ruxsatlarini uzgartiradi.
     */
    static void chmod(Path file, Changer changer) {
        try {
            Set<PosixFilePermission> perms = Files.getPosixFilePermissions(file);
            Files.setPosixFilePermissions(file, changer.change(perms));
        } catch (IOException x) {
            System.err.println(x);
        }
    }

    /**
     * Tawriflangan har bir file va directory'ni ruxsatini uzgartiradi.
     */
    static class TreeVisitor implements FileVisitor<Path> {
        private final Changer changer;

        TreeVisitor(Changer changer) {
            this.changer = changer;
        }

        @Override
        public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) {
            chmod(dir, changer);
            return CONTINUE;
        }

        @Override
        public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) {
            chmod(file, changer);
            return CONTINUE;
        }

        @Override
        public FileVisitResult postVisitDirectory(Path dir, IOException exc) {
            if (exc != null)
                System.err.println("WARNING: " + exc);
            return CONTINUE;
        }

        @Override
        public FileVisitResult visitFileFailed(Path file, IOException exc) {
            System.err.println("WARNING: " + exc);
            return CONTINUE;
        }
    }

    static void usage() {
        System.err.println("java Chmod [-R] symbolic-mode-list file...");
        System.exit(-1);
    }

    static void main(String[] args) throws IOException {
        if (args.length < 2)
            usage();
        int argi = 0;
        int maxDepth = 0;
        if (args[argi].equals("-R")) {
            if (args.length < 3)
                usage();
            argi++;
            maxDepth = Integer.MAX_VALUE;
        }

        // symbolic mode expression'larni compile'law
        Changer changer = compile(args[argi++]);
        TreeVisitor visitor = new TreeVisitor(changer);

        Set<FileVisitOption> opts = Collections.emptySet();
        while (argi < args.length) {
            Path file = Paths.get(args[argi]);
            Files.walkFileTree(file, opts, maxDepth, visitor);
            argi++;
        }
    }
}

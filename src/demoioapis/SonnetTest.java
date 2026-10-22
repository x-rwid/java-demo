package demoioapis;

import java.io.*;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.GZIPInputStream;

/**
 * Ilovani iwga tuwiriw ucun project folder'ni ustiga mouse'ni olib borib, ung tugmasini bosiw orqali
 * menu'dan New > Directory ni tanlab files nomli folder tuziw kerak.
 * Cunki sonnet'lar wu folder iciga tuzilgan binary file'ga yoziladi.
 */

public class SonnetTest {
    void main() throws IOException, InterruptedException {

        URI sonnetsURI = URI.create("https://www.gutenberg.org/cache/epub/1041/pg1041.txt");
        HttpRequest request =
                HttpRequest.newBuilder(sonnetsURI)
                        .GET()
                        .build();
        HttpClient client =
                HttpClient.newBuilder().build();
        HttpResponse<InputStream> response = client.send(request, HttpResponse.BodyHandlers.ofInputStream());
        InputStream inputStream = response.body();

        int start = 33;

        List<Sonnet> sonnets = new ArrayList<>();

        try (var reader = new SonnetReader(inputStream);) {
            reader.skipLines(start);
            Sonnet sonnet = reader.readNextSonnet();
            while (sonnet != null) {
                sonnets.add(sonnet);
                sonnet = reader.readNextSonnet();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        IO.println("# sonnet'lar = " + sonnets.size());

        int numberOfSonnets = sonnets.size();
        Path sonnetsFile = Path.of("files/sonnets.bin");
        try (var sonnetFile = Files.newOutputStream(sonnetsFile);
             var dos = new DataOutputStream(sonnetFile);) {

            List<Integer> offsets = new ArrayList<>();
            List<Integer> lengths = new ArrayList<>();
            byte[] encodedSonnetsBytesArray = null;

            try (ByteArrayOutputStream encodedSonnets = new ByteArrayOutputStream();) {
                for (Sonnet sonnet : sonnets) {
                    byte[] sonnetCompressedBytes = sonnet.getCompressedBytes();

                    offsets.add(encodedSonnets.size());
                    lengths.add(sonnetCompressedBytes.length);
                    encodedSonnets.write(sonnetCompressedBytes);
                }

                dos.writeInt(numberOfSonnets);
                for (int index = 0; index < numberOfSonnets; index++) {
                    dos.writeInt(offsets.get(index));
                    dos.writeInt(lengths.get(index));
                }
                encodedSonnetsBytesArray = encodedSonnets.toByteArray();
            }
            sonnetFile.write(encodedSonnetsBytesArray);

        } catch (IOException e) {
            e.printStackTrace();
        }

        Path path = Path.of("files/sonnets.bin");

        try (var file = Files.newInputStream(path);
             var bis = new BufferedInputStream(file);
             var dos = new DataInputStream(file);) {

            numberOfSonnets = dos.readInt();
            IO.println("numberOfSonnets = " + numberOfSonnets);
            List<Integer> offsets = new ArrayList<>();
            List<Integer> lengths = new ArrayList<>();
            for (int i = 0; i < numberOfSonnets; i++) {
                offsets.add(dos.readInt());
                lengths.add(dos.readInt());
            }

            // bu point'da hamma sonnet'larni offset'lari va length'lari mavjud
            int sonnet = 75; // uqilayotgan sonnet
            int offset = offsets.get(sonnet - 1);
            int length = lengths.get(sonnet - 1);

            skip(bis, offset);
            byte[] bytes = readBytes(bis, length);

            try (
                    ByteArrayInputStream bais = new ByteArrayInputStream(bytes);
                    GZIPInputStream gzbais = new GZIPInputStream(bais);
                    InputStreamReader isr = new InputStreamReader(gzbais);
                    BufferedReader reader = new BufferedReader(isr);) {

                List<String> sonnetLines = reader.lines().toList();
                sonnetLines.forEach(IO::println);
            }
        }
    }

    long skip(BufferedInputStream bis, int offset) throws IOException {
        long skip = 0L;
        while (skip < offset) {
            skip += bis.skip(offset - skip);
        }
        return skip;
    }

    byte[] readBytes(BufferedInputStream bis, int length) throws IOException {
        byte[] bytes = new byte[length];
        byte[] buffer = new byte[length];
        int read = bis.read(buffer);
        int copied = 0;
        while (copied < length) {
            System.arraycopy(buffer, 0, bytes, copied, read);
            copied += read;
            read = bis.read(buffer);
        }
        return bytes;
    }
}

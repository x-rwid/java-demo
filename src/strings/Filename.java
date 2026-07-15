package strings;

public class Filename {
    private String fullPath;
    private char pathSeparator, extensionSeparator;

    public Filename(String str, char sep, char ext) {
        fullPath = str;
        pathSeparator = sep;
        extensionSeparator = ext;
    }
    public String extension() {
        int dot = fullPath.lastIndexOf(extensionSeparator);
        if (dot == -1) {
            return ""; // nuqta topilmadi, biz bo'w kengaytmani qaytaramiz
        } else {
            return fullPath.substring(dot + 1);
        }
    }
    // kengaytmasiz file nomini oladi
    public String filename() {
        int dot = fullPath.lastIndexOf(extensionSeparator);
        int sep = fullPath.lastIndexOf(pathSeparator);
        if (dot == -1) { // kengaytma yo'q
            return fullPath.substring(sep + 1, dot);
        } else {
            return fullPath.substring(sep + 1, dot);
        }
    }
    public String path() {
        int sep = fullPath.lastIndexOf(pathSeparator);
        return fullPath.substring(0, sep);
    }
}

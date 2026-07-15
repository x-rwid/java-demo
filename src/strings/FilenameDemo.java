package strings;

public class FilenameDemo {
    static void main() {
        // Filename object'ini sozlaydigan va uni hamma method'larini caqiradigan dastur

        final String FPATH = "/home/user/index.html";
        Filename myHomePage = new Filename(FPATH, '/', '.');
        IO.println("Extension = " + myHomePage.extension());
        IO.println("Filename = " + myHomePage.filename());
        IO.println("Path = " + myHomePage.path());
    }
}

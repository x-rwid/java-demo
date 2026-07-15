package interfaces;

public class TimeClientTest {
    static void main(String... args) {
        TimeClient myTimeClient = new TimeClientSimple();
        IO.println("Joriy vaqt: " + myTimeClient.toString());
        IO.println("California'dagi vaqt: " + myTimeClient.getZonedDateTime("Blah blah").toString());
    }
}

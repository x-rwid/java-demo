package cases;

import java.time.LocalTime;

public class DigitalClock {
    static void main() {
        // raqamli soat

        LocalTime thisSec;
        // infinite loop
        for (; ; ) {
            thisSec = LocalTime.now();

            // display'ni caqiriw
            display(thisSec.getHour(), thisSec.getMinute(), thisSec.getSecond());

            try {
                // code har millisaniyada aylanib, computer'ni qizdirmasligi ucun
                // 1 saniya (1000 millisaniya) kutiw qo'wiw
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                IO.println("Error sodir bo'ldi: " + e.getMessage());
            }
        }
    }
    public static void display(int hour, int minute, int second) {
        // %02d format bu sonlar bitta raqamli bo'lsa, oldiga 0 qo'yiw ucun (masalan: 09:05:01)
        System.out.printf("\rHozirgi Vaqt: %02d:%02d:%02d", hour, minute, second);
    }
}

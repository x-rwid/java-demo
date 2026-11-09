package demodatetime;

import java.time.Month;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalAccessor;

public class FamilyBirthdays {
    // agar uzatilgan sana oilaviy tavallud kunlaridan birida bo'lsa, true qaytaradi
    // query faqat oy va kunni taqqoslagani sababli Temporal type'lari bir xil bo'lmasayam check muvaffaqiyatli bo'ladi
    public static Boolean isFamilyBirthday(TemporalAccessor date) {
        int month = date.get(ChronoField.MONTH_OF_YEAR);
        int day = date.get(ChronoField.DAY_OF_MONTH);

        // onamni tavallud kuni 29 April'da
        if ((month == Month.APRIL.getValue()) && (day == 29))
            return Boolean.TRUE;

        // otamni tavallud kuni 26 October'da
        if ((month == Month.OCTOBER.getValue()) && (day == 26))
            return Boolean.TRUE;

        // ukamni tavallud kuni 29 November'da
        if ((month == Month.NOVEMBER.getValue()) && (day == 29))
            return Boolean.TRUE;

        return Boolean.FALSE;
    }
}

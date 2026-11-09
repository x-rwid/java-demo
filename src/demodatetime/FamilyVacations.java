package demodatetime;

import java.time.Month;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalAccessor;
import java.time.temporal.TemporalQuery;

public class FamilyVacations implements TemporalQuery<Boolean> {
    // agar uzatilgan sana oilaviy ta'tillardan birida bo'lsa, true qaytaradi
    // query faqat oy va kunni taqqoslagani sababli Temporal type'lari bir xil bo'lmasayam check muvaffaqiyatli bo'ladi
    public Boolean queryFrom(TemporalAccessor date) {
        int month = date.get(ChronoField.MONTH_OF_YEAR);
        int day = date.get(ChronoField.DAY_OF_MONTH);

        // bahargi ta'til Buxoroda
        if ((month == Month.APRIL.getValue()) && ((day >= 3) && (day <= 8)))
            return Boolean.TRUE;

        // Rasuliy oilasini ucrawuvi Andijanda
        if ((month == Month.AUGUST.getValue()) && ((day >= 8) && (day <= 14)))
            return Boolean.TRUE;

        return Boolean.FALSE;
    }
}

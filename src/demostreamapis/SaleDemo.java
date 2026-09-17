package demostreamapis;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

public class SaleDemo {
    static void main() {

        List<Sale> sales = List.of(
                new Sale("Apelsin", LocalDate.of(2026, Month.JANUARY, 2), 4),
                new Sale("Owqovoq", LocalDate.of(2026, Month.OCTOBER, 18), 12),
                new Sale("Yongoq", LocalDate.of(2026, Month.OCTOBER, 03), 6),
                new Sale("Tarvuz", LocalDate.of(2026, Month.AUGUST, 28), 3)
        );


        int amountSoldInOctober = 0;
        for (Sale sale : sales) {
            if (sale.date().getMonth() == Month.OCTOBER) {
                amountSoldInOctober += sale.amount();
            }
        }
        IO.println("October'da sotilgan miqdar: " + amountSoldInOctober);
    }
}

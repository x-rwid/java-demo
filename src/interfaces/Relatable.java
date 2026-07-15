package interfaces;

public interface Relatable {
    // (object'ni caqiriw isLargerThan())
    // va bowqa instance'lar bo'liwi kerak
    // xuddi wu class 1, 0, -1 larni qaytaradi
    // agar bu bowqasidan katta, teng yo kicik bo'lsa
    public int isLargerThan(Relatable other);
}

package demostreamapis;

import java.util.Optional;

public record AuthorsPair(Author first, Author second) {
    public static Optional<AuthorsPair> of(Author first, Author second) {
        if (first.compareTo(second) > 0) {
            return Optional.of(new AuthorsPair(first, second));
        } else {
            return Optional.empty();
        }
    }
}

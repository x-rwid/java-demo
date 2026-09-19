package demostreamapis;

public record Author(String name) implements Comparable<Author> {
    @Override
    public int compareTo(Author other) {
        return this.name.compareTo(other.name);
    }
}

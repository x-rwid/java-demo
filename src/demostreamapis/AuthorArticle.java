package demostreamapis;

import java.util.List;

public record AuthorArticle(String title, int inceptionYear, List<Author> authors) {}

package demostreamapis;

import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AuthorDemo {
    static void main() {

        var yaqub = new Author("Yaqub");
        var maryam = new Author("Maryam");
        var xurwid = new Author("Xurwid");
        var sofiya = new Author("Sofiya");

        var a0 = new AuthorArticle("Anda janim", 2015, List.of(yaqub));
        var a1 = new AuthorArticle("Bu Sizga Yoqqani Kabi", 2016, List.of(maryam));
        var a2 = new AuthorArticle("Al Xorazmiy haqida",  2018, List.of(xurwid));
        var a3 = new AuthorArticle("Ocil Dasturxon", 2017,  List.of(sofiya));
        var a4 = new AuthorArticle("Virus Code", 2019,  List.of(maryam, sofiya));
        var a5 = new AuthorArticle("Java Qahvasi", 2019,  List.of(xurwid, sofiya));
        var a6 = new AuthorArticle("Kelajak", 2020, List.of(maryam, sofiya));
        var a7 = new AuthorArticle("Duke'ni Izlab", 2021, List.of(yaqub, xurwid, sofiya));
        var a8 = new AuthorArticle("Kiberpunk", 2022, List.of(xurwid, sofiya));
        var a9 = new AuthorArticle("Suniy Aql", 2023, List.of(maryam, yaqub, sofiya, xurwid));
        var articles = List.of(a0, a1, a2, a3, a4, a5, a6, a7, a8, a9);

        BiFunction<AuthorArticle, Author, Stream<AuthorsPair>> buildPairOfAuthors =
                (article, firstAuthor) ->
                        article.authors()
                                .stream()
                                .flatMap(secondAuthor -> AuthorsPair.of(firstAuthor, secondAuthor).stream());

        Function<AuthorArticle, Stream<AuthorsPair>> toPairOfAuthors =
                article ->
                        article.authors()
                                .stream()
                                .flatMap(firstAuthor -> buildPairOfAuthors.apply(article, firstAuthor));

        Map<AuthorsPair, Long> numberOfAuthorsTogether =
                articles.stream()
                        .flatMap(toPairOfAuthors)
                        .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        Function<Map<AuthorsPair, Long>, Map.Entry<AuthorsPair, Long>> maxExtractor =
                map -> map.entrySet().stream().max(Map.Entry.comparingByValue()).orElseThrow();

        Map.Entry<AuthorsPair, Long> pair = maxExtractor.apply(numberOfAuthorsTogether);

        IO.println("Eng ko'p birgalikda nawr etgan mualliflar: " +
                pair.getKey().first().name() + " va " + pair.getKey().second().name() +
                ", ular birgalikda " + pair.getValue() + " ta maqola yoziwgan.");
    }
}

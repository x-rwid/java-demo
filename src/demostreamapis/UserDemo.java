package demostreamapis;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class UserDemo {
    static void main() {

        List<User> users = List.of(
                new User(1L, "Xurwid"),
                new User(2L, "Maryam"),
                new User(3L, "Ya'qub"),
                new User(4L, "Sofiya")
        );

        Map<Long, User> userCache =
                users.stream()
                        .collect(
                                Collectors.toMap(
                                        User::id,
                                        Function.identity()));

        IO.println("Map hajmi = " +  userCache.size());
        IO.println("Kalitlar = " + userCache.keySet());
    }
}

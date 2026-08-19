package collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapLambda5 {
    static void main() {

        // Namuna: Talabalarni baholari bo'yica guruhlaw

        String[] students =
                {"Alisa-A", "BiBi-B", "Caros-A", "David-C", "Eva-B", "Fazlan-A"};
        Map<String, List<String>> studentsByGrade = new HashMap<>();

        for (String student : students) {
            String[] parts = student.split("-");
            String name = parts[0];
            String grade = parts[1];

            studentsByGrade
                    .computeIfAbsent(grade, _ -> new ArrayList<>()).add(name);
        }

        IO.println("");
        IO.println("Baholar bo'yica guruhlangan talbalar:");
        studentsByGrade.forEach(
                (grade, studentList) ->
                IO.println("Baho " + grade + ": " + studentList));
    }
}

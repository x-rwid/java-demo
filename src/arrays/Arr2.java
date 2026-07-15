package arrays;

public class Arr2 {
    static void main() {

        // 2D Array - matrix
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        IO.println("3x3 Matrix:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                IO.print(matrix[i][j] + " ");
            }
            IO.println(); // har bir qatordan yangi satr
        }
        IO.println();

        // Jagged Array
        String[][] names = {
                {"Mr. ", "Sir ", "Dr. "},
                {"Holmes", "Watson"}
        };
        IO.println(names[0][0] + names[1][0]); // Mr. Holmes
        IO.println(names[0][2] + names[1][1]); // Dr. Watson

        // 2D Array - bowqa wakldagi matrix
        String[][] schedule = {
                {"Ingliz Tili", "Tarix", "Falsafa"},
                {"Mantiq", "Handasa", "Tabiat"},
                {"Riyaziyat", "Computer Ilmi", "Dasturlaw"}
        };
        IO.println("");
        IO.println("Dars Jadvali:");
        String[] periods = {"Davr 1", "Davr 2", "Davr 3"};
        for (int day = 0; day < schedule.length; day++) {
            IO.println("Kun " + (day + 1) + ":");
            for (int period = 0; period < schedule[day].length; period++) {
                IO.println(" " + periods[period] + ": " + schedule[day][period]);
            }
        }
    }
}


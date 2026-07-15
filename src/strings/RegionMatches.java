package strings;

public class RegionMatches {
    static void main() {
        // bowqa string icidagi string'ni qidiriw

        String searchMe = "Qirmizi Olmalar va Warbat";
        String findMe = "Olmalar";
        int searchMeLength = searchMe.length();
        int findMeLength = findMe.length();
        boolean foundIt = false;
        for (int i = 0;
             i <= (searchMeLength - findMeLength);
        i++) {
            if (searchMe.regionMatches(i, findMe, 0, findMeLength)) {
                foundIt = true;
                IO.println(searchMe.substring(i, i + findMeLength));
                break;
            }
        }
        if (!foundIt)
            IO.println("Moslik topilmadi.");
    }
}

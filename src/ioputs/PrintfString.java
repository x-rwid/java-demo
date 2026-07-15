package ioputs;

public class PrintfString {
    static void main() {
        // printf method

        String lan = "Java";
        String soha = "Dasturlaw";

        System.out.printf("%s Beginner \n", lan);
        System.out.printf("%s sohasi \n", soha);
        System.out.printf("%s sohasida %s Beginner \n", soha, lan);
        System.out.printf("%S Beginner %S sohasida \n", lan, soha);
    }
}

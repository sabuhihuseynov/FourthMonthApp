package main;


import java.util.HashMap;
import java.util.Scanner;
import static Util.Functions.*;

public class Main {
    public static void main(String[] args) throws Exception {
        String filePath = "C:\\Workspace\\FourthMonthApp\\words.txt";
        HashMap<String, String> words = readFileIntoHashMap(filePath);

        Scanner sc = new Scanner(System.in);
        System.out.println("Sual ingilisce(english) sorusulsun yoxsa azerbaycan dilinde?");
        String questionLanguage = sc.nextLine();
        if (questionLanguage.equalsIgnoreCase("AZERBAYCAN")) {
            questionLanguageAzerbaijan(words);
        } else if (questionLanguage.equalsIgnoreCase("ENGLISH")) {
            questionLanguageEnglish(words);
        } else System.out.println("Secdiyiniz dil teyin olunmayib!");

    }

}
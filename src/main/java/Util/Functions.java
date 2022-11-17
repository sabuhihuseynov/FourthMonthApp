package Util;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.*;

public class Functions {
    public static HashMap<String, String> readFileIntoHashMap(String filePath) throws Exception {
        HashMap<String, String> words = new HashMap<>();

        String line;
        BufferedReader reader = new BufferedReader(new FileReader(filePath));
        while ((line = reader.readLine()) != null) {
            String[] parts = line.split(", ", 2);
            if (parts.length >= 2) {
                String key = parts[0];
                String value = parts[1];
                words.put(key, value);
            }
        }
        reader.close();
        return words;
    }

    public static void questionLanguageEnglish(HashMap<String, String> words) {
        while (true) {
            boolean flag = false;
            Set<String> keySet = words.keySet();
            List<String> keyList = new ArrayList<>(keySet);

            int size = keyList.size();
            int randIdx = new Random().nextInt(size);

            String randomKey = keyList.get(randIdx);
            String randomValue = words.get(randomKey);
            for (int i = 1; i <= 3; i++) {
                Scanner sc = new Scanner(System.in);
                System.out.println(randomKey + " nedir? 3 cavab haqqiniz var! \n" + i + ": ");
                String answer = sc.nextLine();
                if (answer.equalsIgnoreCase(randomValue)) {
                    System.out.println("Tebrikler!");
                    flag = true;
                    break;
                } else System.out.println("Sehv cavab !");
            }
            if (!flag) {
                System.out.println("Duzgun cavab : " + randomValue);
            }
        }
    }

    public static void questionLanguageAzerbaijan(HashMap<String, String> words) {
        while (true) {
            boolean flag = false;
            Set<String> keySet = words.keySet();
            List<String> keyList = new ArrayList<>(keySet);

            int size = keyList.size();
            int randIdx = new Random().nextInt(size);

            String randomKey = keyList.get(randIdx);
            String randomValue = words.get(randomKey);
            for (int i = 1; i <= 3; i++) {
                Scanner sc = new Scanner(System.in);
                System.out.println(randomValue + " nedir? 3 cavab haqqiniz var! \n" + i + ": ");
                String answer = sc.nextLine();
                if (answer.equalsIgnoreCase(randomKey)) {
                    System.out.println("Tebrikler!");
                    flag = true;
                    break;
                } else System.out.println("Sehv cavab !");
            }
            if (!flag) {
                System.out.println("Duzgun cavab : " + randomKey);
            }
        }
    }
}

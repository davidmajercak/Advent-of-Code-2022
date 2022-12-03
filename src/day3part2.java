import java.util.*;
import java.io.*;

public class day3part2 {

    public static void main(String[] args) throws FileNotFoundException {
        File inputFile = new File("src/day3.txt");
        Scanner scanner = new Scanner(inputFile);

        Map<Character, Integer> alphabetMap = new HashMap<>();

        for (char c = 'a'; c <= 'z'; c++) {
            alphabetMap.put(c, (int) c - 'a' + 1);
        }
        for (char c = 'A'; c <= 'Z'; c++) {
            alphabetMap.put(c, (int) c - 'A' + 27);
        }

        int totalPriority = 0;
        String line = "";

        while(scanner.hasNextLine()) {
            String first = scanner.nextLine();
            String second = scanner.nextLine();
            String third = scanner.nextLine();

            char common = findCommon(first, second, third);
            totalPriority += alphabetMap.get(common);
        }

        System.out.println(totalPriority);
    }

    public static char findCommon(String first, String second, String third) {
        for(int i = 0; i < first.length(); i++) {
            char c = first.charAt(i);
            if(second.contains(c + "") && third.contains(c + "")) {
                return first.charAt(i);
            }
        }
        return '0';
    }
}

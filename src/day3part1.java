import java.util.*;
import java.io.*;

public class day3part1 {

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
            line = scanner.nextLine();
            String first = line.substring(0, line.length() / 2);
            String second = line.substring(line.length() / 2);

            char common = findCommon(first, second);
            totalPriority += alphabetMap.get(common);
        }

        System.out.println(totalPriority);
    }

    public static char findCommon(String first, String second) {
        for(int i = 0; i < first.length(); i++) {
            char c = first.charAt(i);
            if(second.contains(c + "")) {
                return first.charAt(i);
            }
        }
        return '0';
    }
}

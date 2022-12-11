import java.util.*;
import java.io.*;

public class day6part1 {

    public static void main(String[] args) throws FileNotFoundException {
        File inputFile = new File("src/day6.txt");
        Scanner scanner = new Scanner(inputFile);

        Set<Character> set = new HashSet<>();
        String input = scanner.nextLine();

        System.out.println(findPacketMarker(input, 4));
        System.out.println(findPacketMarker(input, 14));

    }

    public static int findPacketMarker(String input, int len) {
        for(int i = 0; i < input.length() - len; i++) {
            Set<Character> set = new HashSet<>();
            for(int j = 0; j < len; j++) {
                char c = input.charAt(i + j);
                set.add(c);
            }
            if(set.size() == len) {
                return i + len;
            }
        }
        return -1;
    }
}

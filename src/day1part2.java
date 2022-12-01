import java.util.*;
import java.io.*;

public class day1part2 {

    public static void main(String[] args) throws FileNotFoundException {
        File inputFile = new File("src/day1part1.txt");
        Scanner scanner = new Scanner(inputFile);
        //Scanner scanner = new Scanner(System.in);

        int max1 = 0;
        int max2 = 0;
        int max3 = 0;
        int current = 0;
        String line = "";

        while(scanner.hasNextLine()) {
            line = scanner.nextLine();
            if(line.equals("")) {
                if(current > max1) {
                    max3 = max2;
                    max2 = max1;
                    max1 = current;
                } else if (current > max2) {
                    max2 = max1;
                    max1 = current;
                } else if (current > max3) {
                    max1 = current;
                }
                current = 0;
                continue;
            }
            current += Integer.parseInt(line);
        }

        System.out.println(max1 + max2 + max3);
    }
}

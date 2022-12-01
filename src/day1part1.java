import java.util.*;
import java.io.*;

public class day1part1 {

    public static void main(String[] args) throws FileNotFoundException {
        File inputFile = new File("src/day1part1.txt");
        Scanner scanner = new Scanner(inputFile);
        //Scanner scanner = new Scanner(System.in);

        int max = 0;
        int current = 0;
        String line = "";

        while(scanner.hasNextLine()) {
            line = scanner.nextLine();
            if(line.equals("")) {
                if(current > max) {
                    max = current;
                }
                current = 0;
                continue;
            }
            current += Integer.parseInt(line);
        }

        System.out.println(max);
    }
}

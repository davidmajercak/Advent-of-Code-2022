import java.util.*;
import java.io.*;

public class day4part2 {

    public static void main(String[] args) throws FileNotFoundException {
        File inputFile = new File("src/day4.txt");
        Scanner scanner = new Scanner(inputFile);

        int overlaps = 0;
        String line = "";

        while(scanner.hasNextLine()) {
            line = scanner.nextLine();
            String[] assignments = line.split(",");
            overlaps += overlap(assignments[0], assignments[1]);
        }

        System.out.println(overlaps);
    }

    public static int overlap(String a1, String a2) {
        String[] a = a1.split("-");
        String[] b = a2.split("-");
        int lower1 = Integer.parseInt(a[0]);
        int higher1 = Integer.parseInt(a[1]);
        int lower2 = Integer.parseInt(b[0]);
        int higher2 = Integer.parseInt(b[1]);

        if ((lower1 <= higher2 && higher1 >= lower2) || (lower2 <= higher1 && higher2 >= lower1))
                return 1;
        return 0;
    }
}

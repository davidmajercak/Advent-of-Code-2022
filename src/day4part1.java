import java.util.*;
import java.io.*;

public class day4part1 {

    public static void main(String[] args) throws FileNotFoundException {
        File inputFile = new File("src/day4.txt");
        Scanner scanner = new Scanner(inputFile);
        //Scanner scanner = new Scanner(System.in);

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
        // Need to account for multi-digit numbers
        String[] a = a1.split("-");
        String[] b = a2.split("-");
        int n1 = Integer.parseInt(a[0]);
        int n2 = Integer.parseInt(a[1]);
        int n3 = Integer.parseInt(b[0]);
        int n4 = Integer.parseInt(b[1]);
        if(n1 <= n3 && n2 >= n4 ||
                n1 >= n3 && n2 <= n4)
            return 1;
        return 0;
    }
}

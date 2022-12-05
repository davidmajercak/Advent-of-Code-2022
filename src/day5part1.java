import java.util.*;
import java.io.*;

public class day5part1 {

    public static void main(String[] args) throws FileNotFoundException {
        File inputFile = new File("src/day5.txt");
        Scanner scanner = new Scanner(inputFile);

        List<Stack<Character>> stacks = new ArrayList<>();
        // Not using stack at 0 index
        for (int i = 0; i < 10; i++) {
            stacks.add(new Stack<>());
        }

        stacks.get(1).add('R');
        stacks.get(1).add('G');
        stacks.get(1).add('J');
        stacks.get(1).add('B');
        stacks.get(1).add('T');
        stacks.get(1).add('V');
        stacks.get(1).add('Z');

        stacks.get(2).add('J');
        stacks.get(2).add('R');
        stacks.get(2).add('V');
        stacks.get(2).add('L');

        stacks.get(3).add('S');
        stacks.get(3).add('Q');
        stacks.get(3).add('F');

        stacks.get(4).add('Z');
        stacks.get(4).add('H');
        stacks.get(4).add('N');
        stacks.get(4).add('L');
        stacks.get(4).add('F');
        stacks.get(4).add('V');
        stacks.get(4).add('Q');
        stacks.get(4).add('G');

        stacks.get(5).add('R');
        stacks.get(5).add('Q');
        stacks.get(5).add('T');
        stacks.get(5).add('J');
        stacks.get(5).add('C');
        stacks.get(5).add('S');
        stacks.get(5).add('M');
        stacks.get(5).add('W');

        stacks.get(6).add('S');
        stacks.get(6).add('W');
        stacks.get(6).add('T');
        stacks.get(6).add('C');
        stacks.get(6).add('H');
        stacks.get(6).add('F');

        stacks.get(7).add('D');
        stacks.get(7).add('Z');
        stacks.get(7).add('C');
        stacks.get(7).add('V');
        stacks.get(7).add('F');
        stacks.get(7).add('N');
        stacks.get(7).add('J');

        stacks.get(8).add('L');
        stacks.get(8).add('G');
        stacks.get(8).add('Z');
        stacks.get(8).add('D');
        stacks.get(8).add('W');
        stacks.get(8).add('R');
        stacks.get(8).add('F');
        stacks.get(8).add('Q');

        stacks.get(9).add('J');
        stacks.get(9).add('B');
        stacks.get(9).add('W');
        stacks.get(9).add('V');
        stacks.get(9).add('P');

        String[] line;

        while (scanner.hasNextLine()) {
            line = scanner.nextLine().split(" ");
            for (int i = 0; i < Integer.parseInt(line[1]); i++) {
                if(!stacks.get(Integer.parseInt(line[3])).isEmpty()) {
                    stacks.get(Integer.parseInt(line[5])).push(stacks.get(Integer.parseInt(line[3])).pop());
                }
            }
        }
        for (int i = 1; i < 10; i++) {
            System.out.print(stacks.get(i).pop());
        }
    }
}

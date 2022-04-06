package average;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        System.out.println("\nSequence must be consists of integer values and finishes with 0.\nFor instance: 1 2 3 4 5 0");

        String string = scanner.nextLine();

        InputSequence sequence = new InputSequence(string);
        AverageNumber averageNumber = new AverageNumber();

        System.out.println("The sequence:\t" + sequence.getSequence());

        System.out.println("Average:\t" + averageNumber.average(sequence.getArray()));

    }
}

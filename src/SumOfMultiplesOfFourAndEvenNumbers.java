import java.util.Scanner;

public class SumOfMultiplesOfFourAndEvenNumbers {
    public static void main(String[] args) {
        int number = 0, total = 0;

        Scanner input = new Scanner(System.in);

        do {
            System.out.print("Enter a number: ");
            number = input.nextInt();
            if (number % 4 == 0){
                total += number;
            }
        } while (number > 0);

        System.out.println("Total = " + total);
    }
}

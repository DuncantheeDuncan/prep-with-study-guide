package codes;

import java.util.Scanner;

public class EvenAndOddNumbers {

    public void NumbersCheck(int oddOrEven){

        if ((oddOrEven%2)==0){
            System.out.println("The number entered is an Even number: "+ oddOrEven);
        }else {
            System.out.println("The number entered is an Odd number: "+ oddOrEven);
        }

    }

    public static void main(String[] args) {

        EvenAndOddNumbers evenAndOddNumbers =new EvenAndOddNumbers();
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter number to check if Even or Odd ");
        while (true) {
            int oddOrEven = scanner.nextInt();
            evenAndOddNumbers.NumbersCheck(oddOrEven);
        }

    }
}

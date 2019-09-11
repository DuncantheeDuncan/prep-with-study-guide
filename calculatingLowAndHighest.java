package codes;
import java.lang.reflect.Array;
import java.util.*;
public class calculatingLowAndHighest {
    /*
    * The question
    *
    * Using your knowledge of classes and methods create a programme that
    * will calculate the lowest and the greatest between the 3 numbers a user will input.
    * Using those methods the first...
    * */

    public void calculateTheLowest(int number1, int number2, int number3){

        int lowest = Math.min(number1,number2);
        System.out.println("The lowest number is: "+ lowest+ " <-- this value can be wrong since it takes only two numbers");

//        this method can count multiple numbers

        int[] lowestArray ={number1,number2,number3};
        Arrays.sort(lowestArray);
        System.out.println("This is sorted lowest number is: "+lowestArray[0]);



    }

public void calculateTheHighest(int number1, int number2, int number3){
// this method works well if comparing between two numbers..
    int highest = Math.max(number1,number2);
    System.out.println("The highest number is: "+ highest+ " <-- this value can be wrong since it takes only two numbers");

//    this method can count multiple numbers
    int[] highestArray ={number1,number2,number3};
    Arrays.sort(highestArray);
    System.out.println("This is sorted highest number is: "+ highestArray[highestArray.length-1]);



}
    public void calculateTheRange(int number1, int number2, int number3){
// this method works well if comparing between two numbers..
        int range = Math.subtractExact(number1,number2);
        System.out.println("The range is: "+ range + " <-- this value can be wrong since it takes only two numbers");

//  this method can count multiple numbers
        int[] rangeArray = {number1,number2,number3};

        Arrays.sort(rangeArray);
        int rangeArrayTotal = rangeArray[0] - rangeArray[rangeArray.length-1];
        System.out.println("This is sorted range: "+ rangeArrayTotal);

    }

    public static void main(String[] args) {
    calculatingLowAndHighest calculatingLowAndHighes = new calculatingLowAndHighest();
    Scanner scanner = new Scanner(System.in);
        String string = "please enter 3 numbers: ";
        System.out.println(string);
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int number3 = scanner.nextInt();

    calculatingLowAndHighes.calculateTheLowest(number1,number2,number3);
    calculatingLowAndHighes.calculateTheHighest(number1,number2,number3);
    calculatingLowAndHighes.calculateTheRange(number1,number2,number3);

    }
    
    
}
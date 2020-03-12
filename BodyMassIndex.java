package codes;

import javax.swing.plaf.PanelUI;
import java.util.Scanner;

public class BodyMassIndex {


    public void BMI(float heigh, float weight){

//        heigh = 176.7;
//        weight = 45.5;
 String no = "Classification: ";
 String rec ="Recommendation: ";
        float bmi = (weight/(heigh/100)*(heigh/100));
        System.out.println(bmi);

        if (bmi < 18.5){
            System.out.println(no+ "Underweight " + rec+" See your nutritionist");
        }else if (bmi >= 18.5 ){
            if (bmi <= 24.9){
                System.out.println(no+ "Normal weight " + rec+" Maintain your diet ");

            }
        }else if (bmi >= 25 ){
            if (bmi <= 29.9){
                System.out.println(no+ "Overweight " + rec+" Adjust your diet ");

            }
        }else if (bmi >= 30 ){
            if (bmi <= 34.9){
                System.out.println(no+ "Obesity (class 1) " + rec+" Consider exercising ");

            }
        }else if (bmi >=35 ){
            if (bmi <= 39.9){
                System.out.println(no+ "Obesity (class 2)" + rec+" Consider exercising and see a nutritionist");

            }
        }

    }
    public static void main(String[] args) {
        BodyMassIndex bodyMassIndex = new BodyMassIndex();
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a height and weight: ");
        float heigh = scanner.nextFloat();
        double weight= scanner.nexf;
//        float weight =0;
        bodyMassIndex.BMI(heigh,weight);

    }

}

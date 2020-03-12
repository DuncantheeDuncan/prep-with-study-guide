package codes;

public class CountNumberOfVowels {

    public static void main(String[] args) {
        String word = "aeioubghyt";

String lm = word.replace(""," ").trim();
        System.out.println(lm);
        int countV = 0;
        int countC = 0;
        for (int i = 0;i<word.length(); i++){

            if (word.charAt(i) == 'a'||word.charAt(i) == 'e'||word.charAt(i) == 'i'||word.charAt(i) == 'o'||word.charAt(i) == 'u'){
                countV++;

            }

        }

//        for (int i = 0;i<word.length(); i++){
//
//            if (word.charAt(i)'bcdfghjklmnopqrstuvwxyz'){
//                countC++;
//
//            }
//
//        }
        int le = word.length();
       int tt= le - countV;

        System.out.print(countV+" "+ tt);
    }
}

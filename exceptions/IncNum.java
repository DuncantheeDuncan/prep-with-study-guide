/**
 * IncNum
 */
public class IncNum {

    public static void main(String[] args) {
        int a = 10; 
        String name = null; 
        try { 
            a = name.length(); 
           a++; 
           System.out.println("there is no erro yuo wont see the catch block");
        } 
        catch (RuntimeException e){ 
            System.out.println("there is an error you wont see a try catch");
            System.out.println(a);
            ++a; 
            System.out.println(a);
        } 
        System.out.println(a);
    }
}
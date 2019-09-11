package oca.exceptions;
class ExceptionTryCatch{


    public static void main(String[] argv){
        System.out.println("just print a"); 
        try { 
          System.out.println("about to throw exception"); 
        //   throw new IllegalArgumentException(); 
        } catch (ArithmeticException e) { 
            System.out.println("caught exeption"); 
                    
        } finally { 
          System.out.println("finally done handling exception"); 
        } 
        System.out.println("some code after finally"); 
     }
}
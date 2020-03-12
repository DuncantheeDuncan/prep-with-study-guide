class MainBase { 
    void myMethod() throws ExceptionInInitializerError { 
         System.out.println("Base"); 
     }
     void myOther(){
        System.out.println("Other");
    }
      
  } 
 class MainDerived extends MainBase { 
     void myMethod() throws RuntimeException { 
         System.out.println("Derived"); 
     }
     void myOther(){
         System.out.println("Other 2");
     }
     
  } 
 public class MainClass { 
     public static void main(String args[]) { 
         MainDerived obj = new MainDerived(); 
        // MainBase obj = new MainBase();
         // MainDerived.myMethod(); //you can use this if methods are static
         obj.myOther();
         obj.myMethod();
 
     } 
  } 
 
 
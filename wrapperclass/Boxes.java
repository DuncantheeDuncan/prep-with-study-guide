package online.wrapperclass;
import java.util.*;
class Boxes{

void autobxing(){
    System.out.println("Auto Boxing..");
    List <Integer> list = new ArrayList<>();

    list.add(123);//--autoboxing--
    list.add(654);
    list.add(2);

    System.out.println(list.get(2));
    System.out.println("********************");
}

void manualboxing(){
    System.out.println("manual wrapping..");
    Integer manualboxing = new Integer(500);//!! deprecated
    Integer manualboxing2 = new Integer(500);
    Integer manualboxing3 = Integer.valueOf(manualboxing);// manual
    
    
    System.out.println((manualboxing + manualboxing2));
    System.out.println(Integer.parseInt("1000")+ 500);
    System.out.println("***************************");
}

void uboxing(){
    // System.out.println("************************");
    System.out.println("unboxing...");
    Integer unboxing = new Integer(987);

    int ub = unboxing;

    System.out.println(ub);
    System.out.println("*****************************");
}
// -------------- unboxing from method

// String ub = wrappermethod("12");//!! -----------------casting---------------------------------
// String ub = "12";
// String ubs = parseInt(ub);//!! --------------------------------------------------

// -----------------------
String  wrappermethod(String wrappmeth){return   wrappmeth;}
public static void main(String[] args) {
  
    Boxes b = new Boxes();
    b.autobxing();
    b.manualboxing();
    b.uboxing();
// System.out.println("unboxing from a method\n"+b.ubs);//??
System.out.println(b.wrappermethod("check "));

}

}
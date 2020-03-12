package methods;
// import java.utils.System;
public class Methods{


public String aname(String name){


return name;
}

public int age(int dateOfBirth){

// int dateOfBirth= 1997;
int age  = dateOfBirth *12;

	return age;
}




public static void main(String[] args) {
	
Methods methods = new Methods();

System.out.println(methods.aname("Phumlani"));
System.out.println(methods.age(1997));

// out.print("println");

// converting integer into a string..!!!!
// int s_Num = 100;
String myInt12 = "26000";
String bol = "true";
int myInt1 = Integer.parseInt(myInt12);
double doub = Double.parseDouble(myInt12);
boolean boo = Boolean.parseBoolean(myInt12);

System.out.println("Double " +doub);
System.out.println("Integer "+myInt1);
System.out.println("Boolean " + bol);


}


}
class StringClass{

public static void main(String[] args) {
	
String theName = "Phumlani";

String theeName = new String("Phumlani Mthembu");

System.out.println(theeName+ "\n");

	String myName = "Jabulile";
	myName = myName + " Hazel";

	myName = myName.concat(" mavuso");


	System.out.println(myName);

	// primitive int

	String words = "Uman Ungu muntu, azi ABANYE abantu".toLowerCase();

	System.out.println(words);

	int length = words.length();
	System.out.println(length + " is the lenght of varaible words");
// indexOf Method Example

String phoneNUmber = "+27-712-550-387";

int idx1 = phoneNUmber.indexOf('5');
System.out.println(idx1);

int idx2 = phoneNUmber.indexOf(" - ", idx1 + 1);
System.out.println(idx2);



 final int NUmber_of_months = 30;

System.out.println(NUmber_of_months);

int NUmber_of_monthss = NUmber_of_months;
NUmber_of_monthss = NUmber_of_monthss +10;
NUmber_of_monthss +=10;
System.out.println(NUmber_of_monthss);

int i = 20;

System.out.println(i++);
System.out.println(i++);
System.out.println(++i);
System.out.println(++i);
System.out.println(++i);
System.out.println(i);

}

}
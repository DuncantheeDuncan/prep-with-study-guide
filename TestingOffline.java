<<<<<<< HEAD
class TesingOffline{

// contents of Multiple2.java
interface Printable {
//.. we are not detailing
}
class MyClass {
//.. we are not detailing
}
class MyfClass {
//.. we are not detailing
}
class MeClass {
//.. we are not detailing
}
interface Movable {
//.. we are not detailing
}
public class Car {
//.. we are not detailing
}
public interface Multiple2 {}
	public static void main(String... xxxxx) {
		

		System.out.println("Connected..");
		System.out.println("Connected.. "+ xxxxx[0]);
=======
class Che{

	public int id;
	public String name;
	public boolean preffered;

	public void display(){


		if (preffered){
			System.out.format("%s (%d) is preffered.", name,id);
		}else{
			System.out.format("%s (%d) is not preffered.", name,id);
		}
	}



}

class TestingOffline{

	//  static void jumper() /*throws RuntimeException*/{

	// // 	try {
	// // 		System.out.println("qwertyuiop[");
	// // 		throw new Exception();// only Runtime exception will help..
			
	// // 	} finally{
	// // 		System.out.println("Finally");
	// // 	}

	public static void printSum(Integer a, Integer b){ 
		System.out.println("In Integer "+(a+b));
	}
	// throw new RuntimeException();
	public static void printSum(int a, int b){ 
		System.out.println("In int "+(a+b));
	}
	
	
	
	public static void printSum(double a, double b){ 
		System.out.println("In double "+(a+b));
	}
	
	// public static void main(String[] args) {
		// printSum(1, 2);
	// }







	static Che tes = new Che();
	public static void main(String[] args) {
		
		System.out.println("connected");

		printSum(1, 2);
	// 


		try{
			System.out.println("hello world..");
			// jumper();
			System.out.println("hello world2..");
		}finally{
			System.out.println("exited...");//!! ????????????.......
		}

// 		tes.id = 2;
// 		tes.name = "phumlani";
// 		tes.display();


// 		StringBuilder sb = new StringBuilder("qwertyuiopasd");
// // sb.append("qh");
// 		// System.out.println(sb.length());
// 		// sb.delete(0, 3);
// 		// System.out.println(sb.length());
// 		// sb.delete(0,sb.length());
// 		System.out.println(sb.length());
// 		System.out.println(sb.capacity());

>>>>>>> 216fe8e16aebc4c92cd71bad6c33bdd9aab29b19
	}
}
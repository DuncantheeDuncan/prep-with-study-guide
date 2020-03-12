package methods;

class Myhouse{

public String mrPainter(String color){

String painted = "the color of the house is "+ color +" now.";
return painted;

}

// public static String Myhouse(){


// return ;
// }











	public static void main(String[] args) {
		System.out.println("checking");

		Myhouse myhouse1 = new Myhouse();

		System.out.println(myhouse1.mrPainter("green"));

		Myhouse myhouse2 = new Myhouse();

		System.out.println(myhouse2.mrPainter("blue"));
		// new Myhouse().mrPainter("black")
		System.out.println(new Myhouse().mrPainter("black"));
			String n = new Myhouse().mrPainter("pink");
			n = new Myhouse().mrPainter("brown");
		System.out.println(n);



		
	}
}
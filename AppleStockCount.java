/*
*Change the program to work of multiples of dozens of apples.

For 12 apples it should return: You have bought 1 dozen of apples for a total cost of 54.0.

This should work for any multiple of 12.

For 36 apples it should return: You have bought 3 dozens of apples for a total cost of 138.0.

Extra challenge:

Format the prices to 2 decimal points.
Supply the price of an apple as a parameter when running the program.

*/
public class AppleStockCount {
  public static void main(String[] args) {

    if (args.length == 0) {
        System.out.println("Please give me a quantity!");
        return;
    }
 	System.out.println(3 *4.50);
    	int qty = Integer.parseInt(args[0]);
    	double cost = 4.50;
	double dozen = 12;
	double total;
	double d = qty*cost;
	//System.out.print("thisssss "+d + dozen);

if (qty < 1){
	System.out.println("out of stock");
}else{
	total = qty * cost;
	StringBuilder message = new StringBuilder();
	message.append("you have bought");
	//message.append(

}

	//System.out.println(message);
	}   
}


/* double cost = 4.50;
    double total;

    if (qty < 1) {
        System.out.println("Out of stock.");
    }
    else {
      total = qty * cost;

      StringBuilder message = new StringBuilder();
      message.append("You have bought ");
      message.append(qty);
      message.append(" apple");
      if (qty > 1) {
        message.append("s");
      }
      message.append(" for a total cost of ");
      message.append(total);
      message.append(".");

      System.out.println(message.toString());

    }


  }
}
*/

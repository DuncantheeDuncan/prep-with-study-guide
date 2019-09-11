package oca;

class Incremanting_A_ReferanceMthod{
public Incremanting_A_ReferanceMthod(){
	this("black");
}
// int root;
// Incremanting_A_ReferanceMthod(int root){

// this.root = root++;
// }


	// public static void main(String[] args) {
	// 	Incremanting_A_ReferanceMthod in = new Incremanting_A_ReferanceMthod(42);


	// 	System.out.println(++in.root);

	// 	System.out.println("cheking..");
	// }



	static int thrower() throws Exception{

		return 42;
	}
	
	public static void main(String[] args) throws Exception{
		int x = thrower();
		try{
			
		}catch (Exception e){
			// int x = 10;
			x++;
		}finally{
			System.out.println("X = " + ++x);
		}

	}
}
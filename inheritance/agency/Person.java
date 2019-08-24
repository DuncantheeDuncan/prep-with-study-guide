package agency;
class Person{
 public String fname;
 String lname;
 private int dob;
 
Person(String fname,String lname){

this.fname = fname;
this.lname = lname;
// this.dob = dob;

}
// if there are no params passed in..
Person(){
	this("Unknown", "Unknown");
}

void setDOB(int dob){
int mydb = this.dob = dob;
System.out.println("I was born in this year " + mydb);
}



public String makepersonalDetails(){ return  "the name "+fname+" the surname "+ lname; }

void getpersonalDetails(){


	System.out.print("My name is " + this.fname+ ",");
	System.out.print(" my surname is "+ lname);
	System.out.println(" and i was born In "+ dob);

	
}

	public static void main(String[] args) {

		// Person person1 = new Cleaner("phumlani","Mthembu");
		Person person1 = new Person("phumlani","Mthembu");
		// Person person1 = new Person();

		person1.setDOB(2000);
		person1.getpersonalDetails();
		System.out.println(person1.makepersonalDetails());
		// person1.getCleaner();
		// Cleaner clener = new Person();
		Cleaner clener = new Cleaner("phumlani","Mthembu",8,12000);

		clener.setDOB(3000);
		clener.getpersonalDetails();
		System.out.println(clener.makepersonalDetails());
		clener.shiftDuration();

		 
	}


	}

	class Cleaner extends Person{

		private int shiftDur;
		private double salary;

		Cleaner(String fname, String lname,int shiftDur, double salary){
			super(fname , lname);
			// this.dob = dob;
			this.shiftDur = shiftDur;
			this.salary = salary;
		}
		Cleaner(){
			this("no","no",0,2.0);
		}

		void shiftDuration(){
		System.out.print("My shift is "+shiftDur+" hours ");
		System.out.println("My Basic salary is R"+salary+"");
}

	}

//  !! -----------------------------------------

	// class Grandfather{


	// 	Cleaner  familyName(String famlyName){

	// 		return famlyName
	// 	}

		
	// } 
	
	// class Father extends Grandfather{ 



	// }

// !! ----------------------------------- 




















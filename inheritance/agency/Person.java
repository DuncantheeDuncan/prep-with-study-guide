// package agency;
// import agency.*;
 class Person{
 private String fname;
 private String lname;
 private int dob;
 
Person(String fname,String lname){

this.fname = fname;
this.lname = lname;
// this.dob = dob;

}
// if there are no params passed in..
Person(){
	this("Unknown(Name)", "Unknown(surname)");
}

void setDOB(int dob){
int mydb = this.dob = dob;
System.out.println("I was born in this year " + mydb);
}



public String makepersonalDetails(){ return  "Start with name "+fname+" then with surname "+ lname; }



void getpersonalDetails(){


	System.out.print("My name is " + this.fname+ ",");
	System.out.print(" my surname is "+ lname);
	System.out.println(" and i was born In "+ dob);

	
}

	public static void main(String[] args) {

		
		Person person1 = new Person("phumlani","Mthembu");
		// String iiii = null;
		// Person person2 = new Person("Jack",iiii);

		person1.setDOB(2000);
		person1.getpersonalDetails();
		System.out.println(person1.makepersonalDetails());
		System.out.println("* * * * * * * * * * * * * * * * * * ** **");
		// person1.getCleaner();
		// Cleaner clener = new Person();

		// Person clener = new Cleaner("'Phumlani thee-cleaner 1'","Mthembu");
		Clearner clener = new Clearner("'Phumlani thee-cleaner 2'","Mthembu",8,12000);	
		clener.setDOB(3000);
		clener.getpersonalDetails();
		System.out.println(clener.makepersonalDetails());
		clener.shiftDuration();
		System.out.println("* * * * * * * * * * * * * * * * * * ** **");
		
		


		// person2.setDOB(10);
		// person2.getpersonalDetails();
		// person2.setDOB(1990);
		// System.out.println(person2.makepersonalDetails());
		


		 
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




















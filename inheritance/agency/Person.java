// package agency;
// import agency.*;
import java.time.LocalDate;
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
		person1.setDOB(2000);
		person1.getpersonalDetails();
		System.out.println(person1.makepersonalDetails());
		CallToMeeting call = new CallToMeeting(person1.fname,person1.lname);
		call.mettingTime(person1);
		System.out.println("* * * * * * * * * * * * * * * * * * ** **");
	



		Person person2 = new Person("Jaccobs","Mvelase");
		person2.setDOB(10);
		person2.getpersonalDetails();
		person2.setDOB(1990);
		System.out.println(person2.makepersonalDetails());
		System.out.println("* * * * * * * * * * * * * * * * * * ** **");

		
		

		
		Clearner clener1 = new Clearner("'Phumlani thee-cleaner 2'","Mthembu",8,12000);	
		clener1.setDOB(3000);
		clener1.getpersonalDetails();
		System.out.println(clener1.makepersonalDetails());
		clener1.shiftDuration();
		// !!CallToMeeting callcleanre = new CallToMeeting(clener1.fname,clener1.lname);
		// !!callcleanre.mettingTime(clener1);
		clener1.putonUniform();
		uniform.startTime("17-march-2017");
		System.out.println(clener1.two());
		System.out.println("* * * * * * * * * * * * * * * * * * ** **");
		Last take = new Last();
		System.out.println(take.ABC());
		System.out.println("* * * * * * * * * * * * * * * * * * ** **");

		System.out.println(clener1.getOne());
		System.out.println("* * * * * * * * * * * * * * * * * * ** **");

		
		
		
		


		


		 
	}


}







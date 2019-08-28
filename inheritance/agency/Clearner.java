// package agency;
// import agency.Person;

  class Clearner extends Person implements uniform,meee{
       

    private int shiftDur;
    private double salary;
    private String fname;
    private String lname;


    Clearner(String fname, String lname,int shiftDur, double salary){// overloading
        super(fname , lname);
        // this.dob = dob;
        this.shiftDur = shiftDur;
        this.salary = salary;
        this.fname = fname;
        this.lname = lname;
    
    }
    Clearner(){
        this("no","no",0,2.0);
    }
Clearner getOne(){

    return this;

}
public void me(){
    System.out.println("me1 overriden");
}
// TODO: is_the_uniform_on  false
public String two(){
            System.out.println("interface default");
            return null;
        }

public void putonUniform(){


System.out.println("the uniform is on, you can work now.");

}
    void shiftDuration(){
    System.out.print("My shift is "+shiftDur+" hours ");
    System.out.println("My Basic salary is R"+salary+"");
}
@Override
public String makepersonalDetails(){// overriding
    
    return "start with surname => "+ lname+" then follow with surname "+ fname;}
    // return super.makepersonalDetails();}// calling the super
    // String g = "qwertyuiop[";
    // this.makepersonalDetails()
    // g = this.makepersonalDetails();
    // return g;}

}

 class TakeAlook{

    String  ABC(){
        // System.out.println("phum");
        return "Phum";
    }
  

}

class TakeAlookAtMe extends TakeAlook{
 String ABC(){
    //  System.out.println("lani");
    return "lani";
 }

}

class Last extends TakeAlookAtMe{

}

// private interface one {


// }
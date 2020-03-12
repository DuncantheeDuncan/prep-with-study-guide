/**
 * AboutINterface
 */
interface  PersonalInfo{
    String names(String firstNamel,  String secondName);
    String lastName(String sur_Name);
    static int DOB(){int dob = 444; return dob; }
}
abstract class gender{

    abstract boolean boy();
    abstract boolean gilr();

}

class whicGender extends gender{


}

public class AboutINterface  implements PersonalInfo  {

   public  String lastName(String sur_Name){
        return "My surname is: "+sur_Name;
     }

  public  String names(String firstName,  String secondName){ 
      
        return "My first name is: " + firstName+ ", my second Name is: "+ secondName+" ";
    }

    void displayPersonalInfo() {
        System.out.println();
        System.out.print(names("Phumlani", "Duncan"));
        System.out.println(lastName("Mthembu"));
        System.out.println(PersonalInfo.DOB());
    }

    public static void main(String[] args) {
    PersonalInfo info = new AboutINterface();
    // AboutAbstructs abt = new AboutAbstructs();
    ForLearners lernes = new ForLearners();
    
    lernes.show();
    System.out.println(lernes.age(45));

    System.out.print(info.names("Sthembile", "Jele"));
    System.out.println(info.lastName("Oliphant"));
    System.out.println(PersonalInfo.DOB());

    AboutINterface about = new AboutINterface();
    about.displayPersonalInfo();
        
    }
}
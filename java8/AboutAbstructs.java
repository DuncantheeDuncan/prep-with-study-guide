/**
 * AboutAbstructs
 */


 abstract class learners{

    abstract int age(int age);
   private String name;

   void setName(String name){
       this.name = name;
   }
   public String getName(){

    return this.name;
   }
    
 }
 class ForLearners extends learners{

void show(){
    System.out.println("connected..");
    System.out.println("My age is: "+age(30));
    setName("Jack Mavuso");
    System.out.println(getName());

    
    
}
int age(int age){
    return age;
}

 }
 
public class AboutAbstructs {
    public static void main(String[] args) {
        
ForLearners learner = new ForLearners();
learner.show();
learner.age(28);


    }

}
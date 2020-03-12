


 abstract class Writer{
    public static void writer(){System.out.println("writting");}
}

 class Author extends Writer{
    public static void writer(){System.out.println("writting a Book");}
    
}
public class staticInheritance extends Writer {
    public static void writer(){System.out.println("writting code");}
    public String check(){return "vissible";} 
    public static void main(String[] args) {
        Writer n= new staticInheritance();
        
        n.writer();


        
    }
}
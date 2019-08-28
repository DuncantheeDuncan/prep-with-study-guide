import java.time.LocalDateTime;
interface uniform{
abstract void putonUniform();
public static final boolean is_the_uniform_on = false;
default String two(){
return "default interface";
}

static void startTime(String dateTime){
	System.out.println("the shift commenced on "+ dateTime);
}

static void mestatic(){
  System.out.println("me 1 in interface");
}

default void imnotcalled(){

  System.out.println("im called not overridden or called staticaly..");
}







  // default interface one{}
}

interface meee{
  default void me(){
    System.out.println("me 2");
  }
  
}
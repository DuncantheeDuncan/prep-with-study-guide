public class ObjectReference{
private String shirt;
private String color;
private int size;


public void setSize(int size){

this.size =size;
}

public int getSize(){

return size;

}

public static void main(String args[]){

System.out.println("Object Reference");

ObjectReference shirt1 = new ObjectReference();
ObjectReference shirt2 = new ObjectReference();





shirt1.setSize(17);
shirt2.setSize(10);
shirt2 = shirt1;
System.out.println(shirt1.getSize());
System.out.println(shirt2.getSize());

}



}

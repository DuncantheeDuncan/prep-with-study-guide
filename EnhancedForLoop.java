public class EnhancedForLoop{

public static void main(String []args){




System.out.println("displaying for loop");
String lines = "------------------------------------";

String[] names ={"phumlani","Mthembu","Jack","Bavumile","Sthembiso"};




for (int i = 0; i <names.length;i++){

System.out.println("displaying from normal loop: "+names[i]);


}

System.out.println("\n\n\n");
for(String name :names){

System.out.println("displaying from enhanced for loop: "+name);

}

System.out.println(lines+"\n\n\n");


int passMark =50;
int num = 0;

int[] marks ={30,20,37,40,90,15,79};
boolean passed =false;
for(int mark:marks){
num++;
System.out.println("module number "+num +" you got "+ mark);

if(mark >= passMark){
passed = true;
//break;
int passeMarks = mark;
System.out.println("these are passesd maraks length"+ passeMarks);
//System.out.println("these are passesd maraks "+ mark);
}

}
System.out.println("at last you got one module passsed? "+passed);











}


}

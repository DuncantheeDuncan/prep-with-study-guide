public class Arrays{


public static void main(String [] args){

System.out.println("checcking");


// string array

String fruits[] = {
"Apple",
"Orange",
"Banana",
"Grapes"
};
String[] fruits2 = {"Apple","Orange","Banana","Grapes"};
double fruits3[] = {1,2,3,4,5,};
fruits2[2] = "Mango";



System.out.println(fruits.length);
System.out.println("__________________\nfor loop\n------------------");
for(int i = 0; i<fruits2.length;i++){
System.out.println(fruits2[i]+" ");
}
int i = 0;
System.out.println("__________________\nwhile loop\n------------------");
while(i <fruits2.length){

System.out.println(fruits2[i]);
i++;
//break;

}

//System.out.println("__________________\ndo while loop\n------------------");
//int ii = 0;

//do{

//System.out.println(fruits2[ii]);

//}while{

//ii <fruits2.length;

//}




String cars[] = new String[3];

cars[0] = "Volve";
cars[1] = "IsuZu";
cars[2] = "BMW";
cars[2] = "phumlani";
int inc = 2;
System.out.println("cars: "+cars[inc]);






// 		exercise!!!!

String[] names = {"phumlani","Thabiso","Bavumile","Sifiso","Sandile","Sthembiso"};

System.out.println(names[2]);




/*

Open the Java Code Console and access Lessons > 05-ConditionsLoopsArrays > Exercise2
• In the ShoppingCart class, follow the instructions below the code editor to:
-
-
-
nd
a
ity array to hold four distinct String values.
Declare and initialize r a s String
ive variable to reflect not only the customer name, but a message
Change the message
n
e U the number of items the customer wants to purchase. (Hint: Use the
that includes
l
c
length
Ora property of the array.)
Print the message.
- Print the third element of the names array.
- Run the file.
- Change the element index number in the print statement to 4 and run the file again.
You will get an error. Why?
Note: If you need help, the solution for this exercise can be found by the clicking the Solution link.


*/











System.out.println(fruits3.length);




}



}

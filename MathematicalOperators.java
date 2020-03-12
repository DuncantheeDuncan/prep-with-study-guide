class MathematicalOperators{

public static void main(String []args){

System.out.println("cheking");
System.out.println("------- Adding string and ints-------");

int one,two,three;

one = 1; two = 2; three = 3;

double quot, num1;
num1 =32;
int num2=5;
quot = num1 / num2;

System.out.println(one+two+ three);
System.out.println(quot);

int incr = 3;

incr++;

int decr = 5;
decr--;
decr += incr;

System.out.println("Decrement 5 "+decr);
System.out.println("Increment 3 "+ incr);

while(incr <10){
incr++;

System.out.println("While loop " +incr);

}

if(incr == 10){

while(incr > 1){

incr--;
System.out.println("If statement in While loop "+incr);



}
}


int a = 25 - 5 * 4 / 2 - 10 + 4;
int b = (((25 - 5) * 4) / (2 - 10)) + 4;
int c = ((20 * 4) / (2 - 10)) + 4;
int d = (80 / (2 - 10)) + 4;
int e = (80 / -8) + 4;
int f = -10 + 4;
int g = -6;

System.out.println(a);
System.out.println(b);
System.out.println(c);
System.out.println(d);
System.out.println(e);
System.out.println(f);
System.out.println(g);
System.out.println("--------------------------------");

double tax = 14.00,price = 20;
int numItems =5;
double total;
//String msg = "you bought " ;

StringBuilder msg = new StringBuilder();

msg.append("you bought ");
msg.append(numItems);
msg.append(" items");
msg.append(" for R");
msg.append(price);
msg.append(" with ");
msg.append(tax);
msg.append("% of tax\n");
msg.append("The total amount is ");

total = price*numItems/100*tax;
msg.append(total);

System.out.println(msg);

System.out.println("--------------------------------");

int cost = 133_452_667;
System.out.println(cost);
System.out.println("--------------------------------");
String ms;
ms = "Bob wrote "+ (2+1) + " Java programs.";
System.out.println(ms);












}





}

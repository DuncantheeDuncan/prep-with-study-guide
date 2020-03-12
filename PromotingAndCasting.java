class PromotingAndCasting{

public static void main(String[] args) {
	System.out.println("Casting");
int num1I = 55555;
int num2I = 66666;
long num3I;
num3I = num1I * num2I;

System.out.println("Integer "+num3I);

int num1L = 55555;
long num2L = 66666;
long num3LL;
num3LL = num1L * num2L;

System.out.println("Long "+num3LL);


byte b = 5;

// b = b *2;
byte bb = 5;
b +=  bb * 3;
System.out.println(b);

byte byt = 100;

int in = byt + byt;
// byte byt +=  in;

System.out.println(in + " promoted");


double stri = 123.89;

int num;

// int minus = num  (string);
num = (int) (stri);
System.out.println(num);



int qa =34;
int qu =50;
long lng = qa + qu;
System.out.println(lng);


}


}
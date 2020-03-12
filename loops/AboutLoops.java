/**
 * AboutLoops
 */
public class AboutLoops {


    public static void main(String[] args) {

        // String[] sA = new String[] { "fffff","aaa"};
        String[] sA = new String[1] ; sA[0] = "aaa";
        System.out.println(sA.length+"\n* * * * * * * * * * * * * ");
int [] arr = new int[2];
int arr2[] = new int[10]; 
arr = arr2;
arr[0]= 1;
arr[1]= 2;
arr[2]= 3;
arr[3]= 4;


 
System.out.println(arr[3]);

System.out.println(arr.length);
System.out.println(arr2.length);


int iii = 0, jjj = 5;
lab1 : for( ; ; iii++){
  for( ; ; --jjj)  if( iii >jjj ) break lab1;
}
System.out.println(" i = "+iii+", j = "+jjj);

        
    }
}
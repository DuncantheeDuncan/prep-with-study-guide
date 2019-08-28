import java.lang.ArrayIndexOutOfBoundsException;
class OfExceptions{

// void addNumbers(int numb){

// int[] arr = new int[5];
// // arr = new numb;
// arr.add(numb);
// System.out.println(arr.length);

// }





void takesNumber()throws ArrayIndexOutOfBoundsException{
    String[] arr = new String[20];

    arr[0]= "12";
    arr[1]= "12";
    // arr[2]= "12";
    arr[3]= "Stevens";
    arr[4]= "12";
    arr[5]= "12";
    System.out.println(arr[2]);
    // arr.toString();
    System.out.println(arr.length);
    if(arr.length > arr.length){
        System.out.println("You will see me only if there is an error.");
        throw new ArrayIndexOutOfBoundsException();
        
    }else{
        System.out.println(arr[3]+" ghjkl");

    }
    
    

}

int[] addDoors = {1,2,3,4,5,6,7};
void Doors(){

    System.out.println(("Starting..."));
    if(addDoors.length>1){

        if(addDoors.length >5){
            try{
                System.out.println("I am greter than 5");
                System.out.println(addDoors[7]);
            }catch (ArrayIndexOutOfBoundsException e){
                System.out.println("array index out of bound!!\n" +e);
            }finally{
                addDoors = new int[6];

                // addDoors[]
            }
        }
    }else{
        System.out.println("The length is " +addDoors.length);

    }

    
}



}



class RunException{


// there are two types of throwable -> error and  -> Exception



    public static void main (String[] args) {

 OfExceptions of = new OfExceptions();

 of.takesNumber();
 System.out.println("* * ** * * * * * * * * * * * * * * *");
 of.Doors();












// !! https://github.com/SKocur/awesome-for-beginners



try {

    	  int[] ones = new int[4];
        ones[0]=31;
        ones[1]=32;
        ones[2]=33;
        ones[3]=34;
        // ones[4]=35;
		System.out.println(ones[2]);

        String str = "A char string";
        System.out.println("befor the problem");
        char ch = str.charAt(20);
        System.out.println("After problem");
        System.out.println("woooooopiee...");
      
    }catch(java.lang.StringIndexOutOfBoundsException e){
    	System.out.println();
    	System.out.println("there is an UnknownError in your code..");
    }catch(ArrayIndexOutOfBoundsException e){

    	System.out.println("it seems like you just specified more numbers..");
    	System.out.println();
    }finally{
System.out.println();
    	System.out.println("I always execute no matter what..");
    }

    

    }
}
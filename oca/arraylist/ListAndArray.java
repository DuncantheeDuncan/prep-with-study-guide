package oca.arraylist;
import java.util.*;

class ListAndArray{

    // public static void main(String[] phumlani){
    //     int[] array = {6,9,8}; 
    //     List<Integer> list = new ArrayList<>(); 
    //     System.out.println(list.size());
    //     list.add(array[0]); //6
    //     System.out.println(list);
    //     list.add(array[2]);//8 
    //     System.out.println(list.get(1)+ " this");// this proves that List has it own indeces.
    //     System.out.println(list);
    //     list.set(1, array[1]); 
    //     System.out.println(list);
        
    //     list.remove(0); 
    //     System.out.println(list);
    //     System.out.println(list.size()); 
    //  }

    public static void addToInt(int x, int amountToAdd) { 
             x = x + amountToAdd; 
             System.out.println(x);
           } 
           public static void main(String[] args) { 
             int a = 15; 
             int b = 10; 
             
        // ListAndArray listAndArray = new ListAndArray();
       ListAndArray.addToInt(a, b); 
         /* //TODO:   try and check how static methods 
            re-act if it in a diffrent folder
            */
            
            // addToInt(a, b);
            // System.out.println();
            // System.out.println(a);   
         } 
   
}
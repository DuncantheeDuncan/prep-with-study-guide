package oca.referancing;
class Referancing{

    public static void main(String[] args) { 
        Shape rectangle = new Rectangle(5);  // A
        System.out.println(","+rectangle.hasEdges()); // B
    
        
      } 
 }
 
 class Shape  { 
      public Shape() { 
        System.out.print("Shape"); 
      } 
  
      public Shape(int edge) { 
        System.out.print("ShapeEdge"); 
      } 
      public Shape(int edge, String name ) { 
        System.out.print("ShapeName"); 
      } 
      public boolean hasEdges() { 
        return false; 
      } 
 } 
 class Rectangle extends Shape{ 
   public Rectangle(int age) { 
       super(3);// super can i dentify a class by it parameters but first it goes for default    
     System.out.print("Rectangle"); 
   } 
   
   public boolean hasEdges() { // C
     return true; 
   } 



}
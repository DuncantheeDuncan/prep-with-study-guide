import java.util.*;
    // !! page 19  
    class Shape {} 
      interface ShapeFactory { public java.util.List<Shape> getShapes(); } 
      public class MyShapefactory { 
        public static void main(String[] args) { 
          ShapeFactory house = new MyShapeFactory(); //* */ 
        // ShapeFactory house =  new ShapeFactory();// !! error
          Shape chicken = house.getShapes().get(0); 
          for(int i=0; i<house.getShapes().size();
            chicken = house.getShapes().get(i++)) { 
            System.out.println("Shape"); 
         } 
      }  
     } 
     class MyShapeFactory implements ShapeFactory{
           public java.util.List<Shape> getShapes(){
              List<Shape> list = new LinkedList<>();
              list.add(new Shape());
              list.add(new Shape());
              list.add(new Shape());
              list.add(new Shape());
              list.add(new Shape());
              list.add(new Shape());
              return list;
           }
     }
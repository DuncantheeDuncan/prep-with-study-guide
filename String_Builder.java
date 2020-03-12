public class String_Builder {
    public static void main(String args[]) {
      StringBuilder sb1 = new StringBuilder("123456");
      String str = "Phumlaniy";
      System.out.println(str.subSequence(3, str.length()));

      sb1.subSequence(2, 4);

      sb1.deleteCharAt(3);
      System.out.println(sb1);
      sb1.reverse();
      int arryint[][] = new int[1][];
      // System.out.println(arryint[0][4]);
    //   System.out.println(sb1);
    }
  }
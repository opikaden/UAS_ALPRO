public class pattern_java1 {
  
  public static void main(int c) {

    int a, b;

    for (a = 0; a < c; a++) {

      for (b = 2 * (c - a); b >= 0; b--) {

        System.out.print(" ");

      }

      for (b = 0; b <= a; b++) {

        System.out.print("* ");

      }

      System.out.println("");

    }
  }
  
  public static void main(String args[]) {

    int c = 5;
    main(c);
    
  }
}

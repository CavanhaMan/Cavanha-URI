package projeto01;

import java.lang.*;

public class testaUpperLowerCase {

   public static void main(String[] args) {

      // create 2 char primitives ch1, ch2
      char ch1, ch2;

      // assign values to ch1, ch2
      ch1 = 'K';
      ch2 = '\u0e16'; // represents THAI CHARACTER THO THUNG

      // create 2 boolean primitives b1, b2
      boolean b1, b2;

      // check if ch1, ch2 are uppercase and assign results to b1, b2
      b1 = Character.isUpperCase(ch1);
      b2 = Character.isUpperCase(ch2);

      String str1 = ch1 + " is uppercase character is " + b1;
      String str2 = "ch2 is uppercase character is " + b2;

      // print b1, b2 values
      System.out.println( str1 );
      System.out.println( str2 );
   }
}
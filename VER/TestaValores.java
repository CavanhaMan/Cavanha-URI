/*
+------------------+
|Rodrigo CavanhaMan|
|URI 2782          |
|Escadinha         |
+------------------+
*/
public class TestaValores {
	public static void main (String[] args) {
	    Byte b1=127;
	    Byte b2=127;

	    Short s1=127; //incorrect should use Byte
	    Short s2=127; //incorrect should use Byte
	    Short s3=128;
	    Short s4=128;

	    Integer i1=127; //incorrect should use Byte
	    Integer i2=127; //incorrect should use Byte
	    Integer i3=128;
	    Integer i4=128;

	    Integer i5=32767; //incorrect should use Short
	    Integer i6=32767; //incorrect should use Short

	    Long l1=127L;           //incorrect should use Byte
	    Long l2=127L;           //incorrect should use Byte
	    Long l3=13267L;         //incorrect should use Short
	    Long l4=32767L;         //incorrect should use Short
	    Long l5=2147483647L;    //incorrect should use Integer 
	    Long l6=2147483647L;    //incorrect should use Integer
	    Long l7=2147483648L;
	    Long l8=2147483648L;

	    System.out.println(b1==b2); //true  (incorrect) Used API correctly
	    System.out.println(s1==s2); //true  (incorrect) Used API incorrectly
	    System.out.println(i1==i2); //true  (incorrect) Used API incorrectly
	    System.out.println(l1==l2); //true  (incorrect) Used API incorrectly

	    System.out.println(s3==s4); //false (correct) Used API correctly
	    System.out.println(i3==i4); //false (correct) Used API correctly
	    System.out.println(i5==i6); //false (correct) Used API correctly
	    System.out.println(l3==l4); //false (correct) Used API correctly
	    System.out.println(l7==l8); //false (correct) Used API correctly
	    System.out.println(l5==l6); //false (correct) Used API incorrectly
	    
	    Long val1 = 127L;
	    Long val2 = 127L;
	    System.out.println(val1 == val2);

	    Long val3 = 128L;
	    Long val4 = 128L;
	    System.out.println(val3 == val4);

	}
}

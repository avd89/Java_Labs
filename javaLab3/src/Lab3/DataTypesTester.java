/* This is a class with a different methods, which allow us to compare two same type(byte, short, char, int, long, float, double, student, string,boolean) objects
 * Created by Aliaksei Dubrouski
 * 09.03.2018-10.03.2018
 * POIS1709v1 group (BSU)
 */
package Lab3;
/**
 *
 * @author Aliaksei Dubrouski
 */
public class DataTypesTester {
public static void testByte(byte a1,byte b1){   //method for testing two byte type objects
  byte a=a1,b=b1,c=0;
  System.out.println("Testing two objects byte type");
  System.out.println("\n***** Arithmetical Operators for byte type objects *****");
  // addition a + b
  System.out.printf("addition : %d + %d = %d\n", a, b, (byte)(a + b)); 
  // subtraction a - b
  System.out.printf("subtraction : %d - %d = %d\n", a, b,(byte)(a - b)); 
  // multiplication a * b
  System.out.printf("multiplication : %d * %d = %d\n", a, b,(byte)(a * b)); 
  // division a / b
  System.out.printf("division : %d / %d = %d\n", a, b,(byte)(a / b)); 
  // modulus a % b
  System.out.printf("modulus : %d %% %d = %d\n", a, b,(byte)(a % b));
  // a / 0; --> Arithmetical Exception 
  // a % 0; --> Arithmetical Exception
  // unary minus -a
  a=a1;
  System.out.printf("unary minus : -%d = %d\n", a,(byte) -a); 
  // unary plus  +a 
  a=a1;
  System.out.printf("unary plus : +%d = %d\n", a,(byte)+a); 
  // prefix increment 
  a=a1;
  System.out.printf("prefix increment : ++%d = %d\n", a, (byte)++a);
  // postfix increment
  a=a1; 
  System.out.printf("postfix increment : %d++ = %d\n", a, (byte)a++);
   // prefix decrement 
  a=a1;
  System.out.printf("prefix decrement  : --%d = %d\n", a,(byte) --a); 
  // postfix decrement
  a=a1;
  System.out.printf("postfix decrement : %d-- = %d\n", a,(byte) a--);

  System.out.println("\n***** Bitwise Operators for byte type objects *****"); 
  // bitwise AND  (a & b) 
  a=a1;
  System.out.printf("bitwise AND : %d & %d = %d\n", a, b,(byte)(a & b)); 
  System.out.println("in binary form:"); 
  System.out.printf("%s & %s = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(b), Integer.toBinaryString((byte)(a & b)));

  // bitwise OR (a | b)
  System.out.printf("bitwise OR : %d | %d = %d\n", a, b,(byte)(a | b));
  System.out.println("in binary form:"); 
  System.out.printf("%s | %s = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(b), Integer.toBinaryString((byte)(a | b)));

  // bitwise XOR (a ^ b)
  System.out.printf("bitwise XOR : %d ^ %d = %d\n", a, b,(byte)(a ^ b));
  System.out.println("in binary form:"); 
  System.out.printf("%s ^ %s = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(b), Integer.toBinaryString((byte)(a ^ b)));

  // bitwise unary compliment (~a)
  System.out.printf("bitwise unary compliment : ~%d = %d\n", a,(byte)~a); 
  System.out.println("in binary form:"); 
  System.out.printf("~%s = %s\n", Integer.toBinaryString(a), Integer.toBinaryString((byte)~a)); 

   // left shift (a << 1)
  System.out.printf("left shift : %d << 1 = %d\n", a,(byte)(a << 1)); 
  System.out.println("in binary form:"); 
  System.out.printf("%s << 1 = %s\n", Integer.toBinaryString(a), Integer.toBinaryString((byte)(a << 1)));

   // right shift (a >> 1)
  System.out.printf("right shift : %d >> 1 = %d\n", a,(byte)(a >> 1)); 
  System.out.println("in binary form:"); 
  System.out.printf("%s >> 1 = %s\n", Integer.toBinaryString(a), Integer.toBinaryString((byte)(a >> 1)));
 
  a=a1;
  // right shift (a >> 1) 
  System.out.printf("right shift : %d >> 1 = %d\n", a,(byte)(a >> 1)); 
  System.out.println("in binary form:"); 
  System.out.printf("%s >> 1 = %s\n", Integer.toBinaryString(a), Integer.toBinaryString((byte)(a >> 1)));

  a=(byte)-Math.abs(a1);
  // zero fill right shift (a >>> 1)
  System.out.printf("zero fill right shift : %d >>> 1 = %d\n", a,(byte)(a >>> 1));
  System.out.println("in binary form:"); 
  System.out.printf("%s >>> 1 = %s\n", Integer.toBinaryString(a), Integer.toBinaryString((byte)(a >>> 1))); 

  a=(byte)-Math.abs(a1);

  // zero fill right shift (a >>> 1)
  System.out.printf("zero fill right shift : %d >>> 1 = %d\n", a,(byte)(a >>> 1)); 
  System.out.println("in binary form:");
  System.out.printf("%s >>> 1 = %s\n", Integer.toBinaryString(a), Integer.toBinaryString((byte)(a >>> 1))); 

  System.out.println("\n***** Assignment Operators for byte type objects*****"); 

  a=a1;
  c =(byte)(a+b);
  //combined assignment
  System.out.printf("%d += %d --> c = %d\n", c, a,(byte)(c += a));
  System.out.printf("%d -= %d --> c = %d\n", c, a,(byte)(c -= a)); 
  System.out.printf("%d *= %d --> c = %d\n", c, a,(byte)(c *= a));
  System.out.printf("%d /= %d --> c = %d\n", c, a,(byte)(c /= a)); 
  System.out.printf("%d %%= %d --> c = %d\n", c, a,(byte)(c %= a)); 
  // c %= 0; --> Arithmetical Exception 
  // c /= 0; --> Arithmetical Exception
  System.out.printf("%d |= %d --> c = %d\n", c, a,(byte)(c |= a)); 
  System.out.printf("%d &= %d --> c = %d\n", c, a,(byte)(c &= a));
  System.out.printf("%d ^= %d --> c = %d\n", c, a,(byte)(c ^= a)); 
  System.out.printf("%d >>= 1 --> c = %d\n", c,(byte)(c >>= 1)); 
  System.out.printf("%d <<= 1 --> c = %d\n", c,(byte)(c <<= 1)); 
  System.out.printf("%d >>>= 1 --> c = %d\n", c,(byte)(c >>>= 1)); 

  System.out.println("\n***** Relational Operators for byte type objects*****");
   // greater than
  System.out.printf("greater than : %d > %d --> %b\n", a, b, a > b); 
  // greater than or equal to 
  System.out.printf("greater than or equal to : %d >= %d --> %b\n", a, b, a >= b); 
  // less than 
  System.out.printf("less than : %d < %d --> %b\n", a, b, a < b); 
  // less than or equal to 
  System.out.printf("less than or equal to : %d <= %d --> %b\n", a, b, a <= b); 
  // equal to
  System.out.printf("equal to : %d == %d --> %b\n", a, b, a == b); 
  // not equal to 
  System.out.printf("not equal to : %d != %d --> %b\n", a, b, a != b); 
  System.out.println("\n***** Logical Operations for byte type objects*****");
  // logical AND 
  System.out.printf("logical AND  : (%d > %d) && (%d > 0) --> %b\n", a, b, a, (a > b) && (a > 0)); 
  // bitwise logical AND
  System.out.printf("bitwise logical AND : (%d > %d) & (%d > 0) --> %b\n", a, b, a, (a > b) & (a > 0)); 
  // logical OR 
  System.out.printf("logical OR : (%d >= %d) || (%d != 0) --> %b\n", a, b, b, (a >= b) || (b != 0));
  // bitwise logical OR
  System.out.printf("bitwise logical OR : (%d >= %d) | (%d != 0) --> %b\n", a, b, b, (a >= b) | (b != 0));

  // logical XOR 
  System.out.printf("logical XOR : (%d >= %d) | (%d != 0) --> %b\n", a, b, b, (a >= b) ^ (b != 0)); 
  // logical NOT 
  System.out.printf("logical NOT : !(%d >= %d) --> %b\n", a, b, !(a >= b));
  System.out.println("\n***** Misc Operators for byte type objects*****"); 
  System.out.println("\nCondition Operator:");
  System.out.printf("%d > %d ? %d : %d --> %d\n", a, b, a, b, (a > b ? a : b)); 

  System.out.println("\nType Cast Operator:"); 
  short sh = -32000; 
  char ch = 'C';
  int i = 2147483647;
  long l = 100000000000000000L;
  float f = 1.9f; 
  double d = 123456789.625; 
  boolean bool = true;
  //convertion to different types
  c =(byte) sh;
  System.out.printf("byte = short: c = %d --> c = %d\n", sh, c); 
  c =(byte) ch; 
  System.out.printf("byte = char: c = '%c' --> c = %d\n", ch, c);   
  c =(byte) i;
  System.out.printf("byte = int: c = %d --> c = %d\n", i, c); 
  c = (byte) l;
  System.out.printf("byte = long: c = (byte)%d --> c = %d\n", l, c);
  c = (byte) f;
  System.out.printf("byte = float: c = (byte)%f --> c = %d\n", f, c);
  c = (byte) d; 
  System.out.printf("byte = double: c = (byte)%f --> c = %d\n", d, c); 
  // c = (byte)bool;
  System.out.printf("byte = boolean: c = (byte)%b --> Compile Error\n", bool); 
 }       
 
 public static void testShort(short a1,short b1){     //method for testing two short type objects
  short a=a1,b=b1,c=0;
  System.out.println("Testing two objects short type");
  System.out.println("\n***** Arithmetical Operators for short type objects*****");
  // addition a + b
  System.out.printf("addition : %d + %d = %d\n", a, b,(short)(a + b)); 
  // subtraction a - b
  System.out.printf("subtraction : %d - %d = %d\n", a, b,(short)(a - b)); 
  // multiplication a * b
  System.out.printf("multiplication : %d * %d = %d\n", a, b,(short)(a * b)); 
  // division a / b
  System.out.printf("division : %d / %d = %d\n", a, b,(short)(a / b)); 
  // modulus a % b
  System.out.printf("modulus : %d %% %d = %d\n", a, b,(short)(a % b));
  // a / 0; --> Arithmetical Exception 
  // a % 0; --> Arithmetical Exception
  // unary minus -a
  a=a1;
  System.out.printf("unary minus : -%d = %d\n", a, (short)-a); 
  // unary plus  +a 
  a=a1;
  System.out.printf("unary plus : +%d = %d\n", a, (short)+a); 
  // prefix increment 
  a=a1;
  System.out.printf("prefix increment : ++%d = %d\n", a, (short)++a);
  // postfix increment
  a=a1; 
  System.out.printf("postfix increment : %d++ = %d\n", a, (short)a++);
   // prefix decrement 
  a=a1;
  System.out.printf("prefix decrement  : --%d = %d\n", a,(short) --a); 
  // postfix decrement
  a=a1;
  System.out.printf("postfix decrement : %d-- = %d\n", a,(short) a--);

  System.out.println("\n***** Bitwise Operators for short type objects*****"); 
  // bitwise AND  (a & b) 
  a=a1;
  System.out.printf("bitwise AND : %d & %d = %d\n", a, b, (short)(a & b)); 
  System.out.println("in binary form:"); 
  System.out.printf("%s & %s = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(b), Integer.toBinaryString((short)(a & b)));

  // bitwise OR (a | b)
  System.out.printf("bitwise OR : %d | %d = %d\n", a, b,(short)(a | b));
  System.out.println("in binary form:"); 
  System.out.printf("%s | %s = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(b), Integer.toBinaryString((short)(a | b)));

  // bitwise XOR (a ^ b)
  System.out.printf("bitwise XOR : %d ^ %d = %d\n", a, b, (short)(a ^ b));
  System.out.println("in binary form:"); 
  System.out.printf("%s ^ %s = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(b), Integer.toBinaryString((short)(a ^ b)));

  // bitwise unary compliment (~a)
  System.out.printf("bitwise unary compliment : ~%d = %d\n", a,(short) ~a); 
  System.out.println("in binary form:"); 
  System.out.printf("~%s = %s\n", Integer.toBinaryString(a), Integer.toBinaryString((short) ~a)); 

   // left shift (a << 1)
  System.out.printf("left shift : %d << 1 = %d\n", a, (short)(a << 1)); 
  System.out.println("in binary form:"); 
  System.out.printf("%s << 1 = %s\n", Integer.toBinaryString(a), Integer.toBinaryString((short)(a << 1)));

   // right shift (a >> 1)
  System.out.printf("right shift : %d >> 1 = %d\n", a, (short)(a >> 1)); 
  System.out.println("in binary form:"); 
  System.out.printf("%s >> 1 = %s\n", Integer.toBinaryString(a), Integer.toBinaryString((short)(a >> 1)));
 
  a=a1;
  // right shift (a >> 1) 
  System.out.printf("right shift : %d >> 1 = %d\n", a, (short)(a >> 1)); 
  System.out.println("in binary form:"); 
  System.out.printf("%s >> 1 = %s\n", Integer.toBinaryString(a), Integer.toBinaryString((short)(a >> 1)));

  a=(short)-Math.abs(a1);
  // zero fill right shift (a >>> 1)
  System.out.printf("zero fill right shift : %d >>> 1 = %d\n", a, (short)(a >>> 1));
  System.out.println("in binary form:"); 
  System.out.printf("%s >>> 1 = %s\n", Integer.toBinaryString(a), Integer.toBinaryString((short)(a >>> 1))); 

  a=(short)-Math.abs(a1);

  // zero fill right shift (a >>> 1)
  System.out.printf("zero fill right shift : %d >>> 1 = %d\n", a, (short)(a >>> 1)); 
  System.out.println("in binary form:");
  System.out.printf("%s >>> 1 = %s\n", Integer.toBinaryString(a), Integer.toBinaryString((short)(a >>> 1))); 

  System.out.println("\n***** Assignment Operators for short type objects*****"); 

  a=a1;
  c =(short)(a+b);
  //combined assignment
  System.out.printf("%d += %d --> c = %d\n", c, a,(short)(c += a));
  System.out.printf("%d -= %d --> c = %d\n", c, a,(short)(c -= a)); 
  System.out.printf("%d *= %d --> c = %d\n", c, a,(short)(c *= a));
  System.out.printf("%d /= %d --> c = %d\n", c, a,(short)(c /= a)); 
  System.out.printf("%d %%= %d --> c = %d\n", c, a,(short)(c %= a)); 
  // c %= 0; --> Arithmetical Exception 
  // c /= 0; --> Arithmetical Exception
  System.out.printf("%d |= %d --> c = %d\n", c, a,(short)(c |= a)); 
  System.out.printf("%d &= %d --> c = %d\n", c, a,(short)(c &= a));
  System.out.printf("%d ^= %d --> c = %d\n", c, a, (short)(c ^= a)); 
  System.out.printf("%d >>= 1 --> c = %d\n", c, (short)(c >>= 1)); 
  System.out.printf("%d <<= 1 --> c = %d\n", c, (short)(c <<= 1)); 
  System.out.printf("%d >>>= 1 --> c = %d\n", c, (short)(c >>>= 1)); 

  System.out.println("\n***** Relational Operators for short type objects*****");
   // greater than
  System.out.printf("greater than : %d > %d --> %b\n", a, b, a > b); 
  // greater than or equal to 
  System.out.printf("greater than or equal to : %d >= %d --> %b\n", a, b, a >= b); 
  // less than 
  System.out.printf("less than : %d < %d --> %b\n", a, b, a < b); 
  // less than or equal to 
  System.out.printf("less than or equal to : %d <= %d --> %b\n", a, b, a <= b); 
  // equal to
  System.out.printf("equal to : %d == %d --> %b\n", a, b, a == b); 
  // not equal to 
  System.out.printf("not equal to : %d != %d --> %b\n", a, b, a != b); 
  System.out.println("\n***** Logical Operations for short type objects*****");
  // logical AND 
  System.out.printf("logical AND  : (%d > %d) && (%d > 0) --> %b\n", a, b, a, (a > b) && (a > 0)); 
  // bitwise logical AND
  System.out.printf("bitwise logical AND : (%d > %d) & (%d > 0) --> %b\n", a, b, a, (a > b) & (a > 0)); 
  // logical OR 
  System.out.printf("logical OR : (%d >= %d) || (%d != 0) --> %b\n", a, b, b, (a >= b) || (b != 0));
  // bitwise logical OR
  System.out.printf("bitwise logical OR : (%d >= %d) | (%d != 0) --> %b\n", a, b, b, (a >= b) | (b != 0));

  // logical XOR 
  System.out.printf("logical XOR : (%d >= %d) | (%d != 0) --> %b\n", a, b, b, (a >= b) ^ (b != 0)); 
  // logical NOT 
  System.out.printf("logical NOT : !(%d >= %d) --> %b\n", a, b, !(a >= b));
  System.out.println("\n***** Misc Operators for short type objects*****"); 
  System.out.println("\nCondition Operator:");
  System.out.printf("%d > %d ? %d : %d --> %d\n", a, b, a, b, (a > b ? a : b)); 

  System.out.println("\nType Cast Operator:"); 
  byte by=127;
  char ch = 'C';
  int i = 2147483647;
  long l = 100000000000000000L;
  float f = 1.9f; 
  double d = 123456789.625; 
  boolean bool = true;
  //convertion to different types
  //short to byte
  c =(short) by;
  System.out.printf("short = byte: c = %d --> c = %d\n", by, c); 
  //short to char
  c =(short) ch; 
  System.out.printf("short = char: c = '%c' --> c = %d\n", ch, c);  
  //short to int
  c =(short) i;
  System.out.printf("short = int: c = %d --> c = %d\n", i, c); 
  //short to long
  c = (short) l;
  System.out.printf("short = long: c = (byte)%d --> c = %d\n", l, c);
  //short to float
  c = (byte) f;
  System.out.printf("short = float: c = (byte)%f --> c = %d\n", f, c);
  //short to double
  c = (byte) d; 
  System.out.printf("short = double: c = (byte)%f --> c = %d\n", d, c); 
 // c = (short)bool;
  System.out.printf("short = boolean: c = (byte)%b --> Compile Error\n", bool); 
 }       
 
  public static void testChar(char a1,char b1){  //method for testing two char type objects
  char a=a1,b=b1,c=0;
  System.out.println("Testing two objects char type");
  System.out.println("\n***** Arithmetical Operators for char type objects*****");
  // addition a + b
  System.out.printf("addition : %c + %c = %c\n", a, b,(char)(a + b)); 
  // subtraction a - b
  System.out.printf("subtraction : %c - %c = %c\n", a, b,(char)(a - b)); 
  // multiplication a * b
  System.out.printf("multiplication : %c * %c = %c\n", a, b,(char)(a * b)); 
  // division a / b
  System.out.printf("division : %c / %c = %c\n", a, b,(char)(a / b)); 
  // modulus a % b
  System.out.printf("modulus : %c %% %c = %c\n", a, b,(char)(a % b));
  // a / 0; --> Arithmetical Exception 
  // a % 0; --> Arithmetical Exception
  // unary minus -a
  a=a1;
  System.out.printf("unary minus : -%c = %c\n", a, (char)-a); 
  // unary plus  +a 
  a=a1;
  System.out.printf("unary plus : +%c = %c\n", a, (char)+a); 
  // prefix increment 
  a=a1;
  System.out.printf("prefix increment : ++%c = %c\n", a, (char)++a);
  // postfix increment
  a=a1; 
  System.out.printf("postfix increment : %c++ = %c\n", a, (char)a++);
   // prefix decrement 
  a=a1;
  System.out.printf("prefix decrement  : --%c = %c\n", a,(char) --a); 
  // postfix decrement
  a=a1;
  System.out.printf("postfix decrement : %c-- = %c\n", a,(char) a--);

  System.out.println("\n***** Bitwise Operators for char type objects*****"); 
  // bitwise AND  (a & b) 
  a=a1;
  System.out.printf("bitwise AND : %c & %c = %c\n", a, b, (char)(a & b)); 
  System.out.println("in binary form:"); 
  System.out.printf("%s & %s = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(b), Integer.toBinaryString((char)(a & b)));

  // bitwise OR (a | b)
  System.out.printf("bitwise OR : %c | %c = %c\n", a, b,(char)(a | b));
  System.out.println("in binary form:"); 
  System.out.printf("%s | %s = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(b), Integer.toBinaryString((char)(a | b)));

  // bitwise XOR (a ^ b)
  System.out.printf("bitwise XOR : %c ^ %c = %c\n", a, b, (char)(a ^ b));
  System.out.println("in binary form:"); 
  System.out.printf("%s ^ %s = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(b), Integer.toBinaryString((char)(a ^ b)));

  // bitwise unary compliment (~a)
  System.out.printf("bitwise unary compliment : ~%c = %c\n", a,(char) ~a); 
  System.out.println("in binary form:"); 
  System.out.printf("~%s = %s\n", Integer.toBinaryString(a), Integer.toBinaryString((char) ~a)); 

   // left shift (a << 1)
  System.out.printf("left shift : %c << 1 = %c\n", a, (char)(a << 1)); 
  System.out.println("in binary form:"); 
  System.out.printf("%s << 1 = %s\n", Integer.toBinaryString(a), Integer.toBinaryString((char)(a << 1)));

   // right shift (a >> 1)
  System.out.printf("right shift : %c >> 1 = %c\n", a, (char)(a >> 1)); 
  System.out.println("in binary form:"); 
  System.out.printf("%s >> 1 = %s\n", Integer.toBinaryString(a), Integer.toBinaryString((char)(a >> 1)));
 
  a=a1;
  // right shift (a >> 1) 
  System.out.printf("right shift : %c >> 1 = %c\n", a, (char)(a >> 1)); 
  System.out.println("in binary form:"); 
  System.out.printf("%s >> 1 = %s\n", Integer.toBinaryString(a), Integer.toBinaryString((char)(a >> 1)));

  a=(char)-a1;
  // zero fill right shift (a >>> 1)
  System.out.printf("zero fill right shift : %c >>> 1 = %c\n", a, (char)(a >>> 1));
  System.out.println("in binary form:"); 
  System.out.printf("%s >>> 1 = %s\n", Integer.toBinaryString(a), Integer.toBinaryString((char)(a >>> 1))); 

  a=(char)-a1;

  // zero fill right shift (a >>> 1)
  System.out.printf("zero fill right shift : %c >>> 1 = %c\n", a, (char)(a >>> 1)); 
  System.out.println("in binary form:");
  System.out.printf("%s >>> 1 = %s\n", Integer.toBinaryString(a), Integer.toBinaryString((char)(a >>> 1))); 

  System.out.println("\n***** Assignment Operators for char type objects*****"); 

  a=a1;
  c =(char)(a+b);
  //combined assignment
  System.out.printf("%c += %c --> c = %c\n", c, a,(char)(c += a));
  System.out.printf("%c -= %c --> c = %c\n", c, a,(char)(c -= a)); 
  System.out.printf("%c *= %c --> c = %c\n", c, a,(char)(c *= a));
  System.out.printf("%c /= %c --> c = %c\n", c, a,(char)(c /= a)); 
  System.out.printf("%c %%= %c --> c = %c\n", c, a,(char)(c %= a)); 
  // c %= 0; --> Arithmetical Exception 
  // c /= 0; --> Arithmetical Exception
  System.out.printf("%c |= %c --> c = %c\n", c, a,(char)(c |= a)); 
  System.out.printf("%c &= %c --> c = %c\n", c, a,(char)(c &= a));
  
  System.out.println("\n***** Relational Operators for char type objects*****");
   // greater than
  System.out.printf("greater than : %c > %c --> %b\n", a, b, a > b); 
  // greater than or equal to 
  System.out.printf("greater than or equal to : %c >= %c --> %b\n", a, b, a >= b); 
  // less than 
  System.out.printf("less than : %c < %c --> %b\n", a, b, a < b); 
  // less than or equal to 
  System.out.printf("less than or equal to : %c <= %c --> %b\n", a, b, a <= b); 
  // equal to
  System.out.printf("equal to : %c == %c --> %b\n", a, b, a == b); 
  // not equal to 
  System.out.printf("not equal to : %c != %c --> %b\n", a, b, a != b); 
  System.out.println("\n***** Logical Operations for char type objects*****");
  // logical AND 
  System.out.printf("logical AND  : (%c > %c) && (%c > 0) --> %b\n", a, b, a, (a > b) && (a > 0)); 
  // bitwise logical AND
  System.out.printf("bitwise logical AND : (%c > %c) & (%c > 0) --> %b\n", a, b, a, (a > b) & (a > 0)); 
  // logical OR 
  System.out.printf("logical OR : (%c >= %c) || (%c != 0) --> %b\n", a, b, b, (a >= b) || (b != 0));
  // bitwise logical OR
  System.out.printf("bitwise logical OR : (%c >= %c) | (%c != 0) --> %b\n", a, b, b, (a >= b) | (b != 0));

  // logical XOR 
  System.out.printf("logical XOR : (%c >= %c) | (%c != 0) --> %b\n", a, b, b, (a >= b) ^ (b != 0)); 
  // logical NOT 
  System.out.printf("logical NOT : !(%c >= %c) --> %b\n", a, b, !(a >= b));
  System.out.println("\n***** Misc Operators for char type objects*****"); 
  System.out.println("\nCondition Operator:");
  System.out.printf("%c > %c ? %c : %c --> %c\n", a, b, a, b, (a > b ? a : b)); 

  System.out.println("\nType Cast Operator:"); 
  byte by=12;
  short sh = 32767;
  int i = 2147483647;
  long l = 10000000000000L;
  float f = 1.9f; 
  double d = 123456789.625; 
  boolean bool = true;
  //convertion to different types
  c =(char) by;
  System.out.printf("char = byte: c = %d --> c = %c\n", by, c); 
  c =(char) sh; 
  System.out.printf("char = short: c = '%d' --> c = %c\n", sh, c);   
  c =(char) i;
  System.out.printf("char = int: c = (char)%d --> c = %c\n", i, c); 
  c = (char) l;
  System.out.printf("char = long: c = (char)%d --> c = %c\n", l, c);
  c = (char) f;
  System.out.printf("char = float: c = (char)%f --> c = %c\n", f, c);
  c = (char) d; 
  System.out.printf("char = double: c = (char)%f --> c = %c\n", d, c); 
 // c = (char)bool;
  System.out.printf("char = boolean: c = (char)%b --> Compile Error\n", bool); 
 }   
 
public static void testInt(int a1,int b1){     //method for testing two int type objects
  int a=a1, b=b1, c=0;
  System.out.println("Testing two objects int type");
  System.out.println("\n***** Arithmetical Operators for int type objects *****");
  // addition a + b
  System.out.printf("addition : %d + %d = %d\n", a, b, a + b); 
  // subtraction a - b
  System.out.printf("subtraction : %d - %d = %d\n", a, b, a - b); 
  // multiplication a * b
  System.out.printf("multiplication : %d * %d = %d\n", a, b, a * b); 
  // division a / b
  System.out.printf("division : %d / %d = %d\n", a, b,  a / b); 
  // modulus a % b
  System.out.printf("modulus : %d %% %d = %d\n", a, b, a % b);
  // a / 0; --> Arithmetical Exception 
  // a % 0; --> Arithmetical Exception
  // unary minus -a
  a=a1;
  System.out.printf("unary minus : -%d = %d\n", a, -a); 
  // unary plus  +a 
  a=a1;
  System.out.printf("unary plus : +%d = %d\n", a, +a); 
  // prefix increment 
  a=a1;
  System.out.printf("prefix increment : ++%d = %d\n", a, ++a);
  // postfix increment
  a=a1; 
  System.out.printf("postfix increment : %d++ = %d\n", a, a++);
   // prefix decrement 
  a=a1;
  System.out.printf("prefix decrement  : --%d = %d\n", a, --a); 
  // postfix decrement
  a=a1;
  System.out.printf("postfix decrement : %d-- = %d\n", a, a--);

  System.out.println("\n***** Bitwise Operators for int type objects*****"); 
  // bitwise AND  (a & b) 
  a=a1;
  System.out.printf("bitwise AND : %d & %d = %d\n", a, b, a & b ); 
  System.out.println("in binary form:"); 
  System.out.printf("%s & %s = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(b), Integer.toBinaryString(a & b));

  // bitwise OR (a | b)
  System.out.printf("bitwise OR : %d | %d = %d\n", a, b, a | b);
  System.out.println("in binary form:"); 
  System.out.printf("%s | %s = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(b), Integer.toBinaryString(a | b));

  // bitwise XOR (a ^ b)
  System.out.printf("bitwise XOR : %d ^ %d = %d\n", a, b, a ^ b);
  System.out.println("in binary form:"); 
  System.out.printf("%s ^ %s = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(b), Integer.toBinaryString(a ^ b));

  // bitwise unary compliment (~a)
  System.out.printf("bitwise unary compliment : ~%d = %d\n", a, ~a); 
  System.out.println("in binary form:"); 
  System.out.printf("~%s = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(~a)); 

   // left shift (a << 1)
  System.out.printf("left shift : %d << 1 = %d\n", a, a << 1); 
  System.out.println("in binary form:"); 
  System.out.printf("%s << 1 = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(a << 1));

   // right shift (a >> 1)
  System.out.printf("right shift : %d >> 1 = %d\n", a, a >> 1); 
  System.out.println("in binary form:"); 
  System.out.printf("%s >> 1 = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(a >> 1));
 
  a=-Math.abs(a1);
  // right shift (a >> 1) 
  System.out.printf("right shift : %d >> 1 = %d\n", a, a >> 1); 
  System.out.println("in binary form:"); 
  System.out.printf("%s >> 1 = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(a >> 1));

  a = Math.abs(a1);
  // zero fill right shift (a >>> 1)
  System.out.printf("zero fill right shift : %d >>> 1 = %d\n", a, a >>> 1);
  System.out.println("in binary form:"); 
  System.out.printf("%s >>> 1 = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(a >>> 1)); 

  a=-Math.abs(a1);

  // zero fill right shift (a >>> 1)
  System.out.printf("zero fill right shift : %d >>> 1 = %d\n", a, a >>> 1); 
  System.out.println("in binary form:");
  System.out.printf("%s >>> 1 = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(a >>> 1)); 

  System.out.println("\n***** Assignment Operators for int type objects*****"); 

  a=a1;
  c = a+b;
  //combined assignment
  System.out.printf("%d += %d --> c = %d\n", c, a, c += a);
  System.out.printf("%d -= %d --> c = %d\n", c, a, c -= a); 
  System.out.printf("%d *= %d --> c = %d\n", c, a, c *= a);
  System.out.printf("%d /= %d --> c = %d\n", c, a, c /= a); 
  System.out.printf("%d %%= %d --> c = %d\n", c, a, c %= a); 
  // c %= 0; --> Arithmetical Exception 
  // c /= 0; --> Arithmetical Exception
  System.out.printf("%d |= %d --> c = %d\n", c, a, c |= a); 
  System.out.printf("%d &= %d --> c = %d\n", c, a, c &= a);
  System.out.printf("%d ^= %d --> c = %d\n", c, a, c ^= a); 
  System.out.printf("%d >>= 1 --> c = %d\n", c, c >>= 1); 
  System.out.printf("%d <<= 1 --> c = %d\n", c, c <<= 1); 
  System.out.printf("%d >>>= 1 --> c = %d\n", c, c >>>= 1); 

  System.out.println("\n***** Relational Operators for int type objects*****");
   // greater than
  System.out.printf("greater than : %d > %d --> %b\n", a, b, a > b); 
  // greater than or equal to 
  System.out.printf("greater than or equal to : %d >= %d --> %b\n", a, b, a >= b); 
  // less than 
  System.out.printf("less than : %d < %d --> %b\n", a, b, a < b); 
  // less than or equal to 
  System.out.printf("less than or equal to : %d <= %d --> %b\n", a, b, a <= b); 
  // equal to
  System.out.printf("equal to : %d == %d --> %b\n", a, b, a == b); 
  // not equal to 
  System.out.printf("not equal to : %d != %d --> %b\n", a, b, a != b); 
  System.out.println("\n***** Logical Operations for int type objects*****");
  // logical AND 
  System.out.printf("logical AND  : (%d > %d) && (%d > 0) --> %b\n", a, b, a, (a > b) && (a > 0)); 
  // bitwise logical AND
  System.out.printf("bitwise logical AND : (%d > %d) & (%d > 0) --> %b\n", a, b, a, (a > b) & (a > 0)); 
  // logical OR 
  System.out.printf("logical OR : (%d >= %d) || (%d != 0) --> %b\n", a, b, b, (a >= b) || (b != 0));
  // bitwise logical OR
  System.out.printf("bitwise logical OR : (%d >= %d) | (%d != 0) --> %b\n", a, b, b, (a >= b) | (b != 0));

  // logical XOR 
  System.out.printf("logical XOR : (%d >= %d) | (%d != 0) --> %b\n", a, b, b, (a >= b) ^ (b != 0)); 
  // logical NOT 
  System.out.printf("logical NOT : !(%d >= %d) --> %b\n", a, b, !(a >= b));
  System.out.println("\n***** Misc Operators for int type objects*****"); 
  System.out.println("\nCondition Operator:");
  System.out.printf("%d > %d ? %d : %d --> %d\n", a, b, a, b, (a > b ? a : b)); 

  System.out.println("\nType Cast Operator:"); 
  byte bt = 1; 
  short sh = -32000; 
  char ch = '\u0002';
  long l = 100000000000000000L;
  float f = 1.9f; 
  double d = 123456789.625; 
  boolean bool = true;
  //convertion to different types
  //int to byte conversion
  c = bt;
  System.out.printf("int = byte: c = %d --> c = %d\n", bt, c); 
  //int to short conversion
  c = sh;
  System.out.printf("int = short: c = %d --> c = %d\n", sh, c); 
  //int to char conversion
  c = ch; 
  System.out.printf("int = char: c = '%c' --> c = %d\n", ch, c); 
  //int to long conversion
  c = (int) l; 
  System.out.printf("int = long: c = (int)%d --> c = %d\n", l, c);
  //int to float conversion
  c = (int) f;
  System.out.printf("int = float: c = (int)%f --> c = %d\n", f, c);
  //int to double conversion
  c = (int) d; 
  System.out.printf("int = double: c = (int)%f --> c = %d\n", d, c);
  //int to boolean conversion
  //c = (int)bool;
  System.out.printf("int = boolean: c = (int)%b --> Compile Error\n", bool); 
 }  

public static void testLong(long a1,long b1){       //method for testing two long type objects
  long a=a1, b=b1, c=0;
  System.out.println("Testing two objects long type");
  System.out.println("\n***** Arithmetical Operators for long type objects*****");
  // addition a + b
  System.out.printf("addition : %d + %d = %d\n", a, b, a + b); 
  // subtraction a - b
  System.out.printf("subtraction : %d - %d = %d\n", a, b, a - b); 
  // multiplication a * b
  System.out.printf("multiplication : %d * %d = %d\n", a, b, a * b); 
  // division a / b
  System.out.printf("division : %d / %d = %d\n", a, b,  a / b); 
  // modulus a % b
  System.out.printf("modulus : %d %% %d = %d\n", a, b, a % b);
  // a / 0; --> Arithmetical Exception 
  // a % 0; --> Arithmetical Exception
  // unary minus -a
  a=a1;
  System.out.printf("unary minus : -%d = %d\n", a, -a); 
  // unary plus  +a 
  a=a1;
  System.out.printf("unary plus : +%d = %d\n", a, +a); 
  // prefix increment 
  a=a1;
  System.out.printf("prefix increment : ++%d = %d\n", a, ++a);
  // postfix increment
  a=a1; 
  System.out.printf("postfix increment : %d++ = %d\n", a, a++);
   // prefix decrement 
  a=a1;
  System.out.printf("prefix decrement  : --%d = %d\n", a, --a); 
  // postfix decrement
  a=a1;
  System.out.printf("postfix decrement : %d-- = %d\n", a, a--);

  System.out.println("\n***** Bitwise Operators for long type objects*****"); 
  // bitwise AND  (a & b) 
  a=a1;
  System.out.printf("bitwise AND : %d & %d = %d\n", a, b, a & b ); 
  System.out.println("in binary form:"); 
  System.out.printf("%s & %s = %s\n", Long.toBinaryString(a), Long.toBinaryString(b), Long.toBinaryString(a & b));

  // bitwise OR (a | b)
  System.out.printf("bitwise OR : %d | %d = %d\n", a, b, a | b);
  System.out.println("in binary form:"); 
  System.out.printf("%s | %s = %s\n", Long.toBinaryString(a), Long.toBinaryString(b), Long.toBinaryString(a | b));

  // bitwise XOR (a ^ b)
  System.out.printf("bitwise XOR : %d ^ %d = %d\n", a, b, a ^ b);
  System.out.println("in binary form:"); 
  System.out.printf("%s ^ %s = %s\n", Long.toBinaryString(a), Long.toBinaryString(b), Long.toBinaryString(a ^ b));

  // bitwise unary compliment (~a)
  System.out.printf("bitwise unary compliment : ~%d = %d\n", a, ~a); 
  System.out.println("in binary form:"); 
  System.out.printf("~%s = %s\n", Long.toBinaryString(a), Long.toBinaryString(~a)); 

   // left shift (a << 1)
  System.out.printf("left shift : %d << 1 = %d\n", a, a << 1); 
  System.out.println("in binary form:"); 
  System.out.printf("%s << 1 = %s\n", Long.toBinaryString(a), Long.toBinaryString(a << 1));

   // right shift (a >> 1)
  System.out.printf("right shift : %d >> 1 = %d\n", a, a >> 1); 
  System.out.println("in binary form:"); 
  System.out.printf("%s >> 1 = %s\n", Long.toBinaryString(a), Long.toBinaryString(a >> 1));
 
  a=-Math.abs(a1);
  // right shift (a >> 1) 
  System.out.printf("right shift : %d >> 1 = %d\n", a, a >> 1); 
  System.out.println("in binary form:"); 
  System.out.printf("%s >> 1 = %s\n", Long.toBinaryString(a), Long.toBinaryString(a >> 1));

  a = Math.abs(a1);
  // zero fill right shift (a >>> 1)
  System.out.printf("zero fill right shift : %d >>> 1 = %d\n", a, a >>> 1);
  System.out.println("in binary form:"); 
  System.out.printf("%s >>> 1 = %s\n", Long.toBinaryString(a), Long.toBinaryString(a >>> 1)); 

  a=-Math.abs(a1);

  // zero fill right shift (a >>> 1)
  System.out.printf("zero fill right shift : %d >>> 1 = %d\n", a, a >>> 1); 
  System.out.println("in binary form:");
  System.out.printf("%s >>> 1 = %s\n", Long.toBinaryString(a), Long.toBinaryString(a >>> 1)); 

  System.out.println("\n***** Assignment Operators for long type objects*****"); 

  a=a1;
  c = a+b; 
  //combined assignment
  System.out.printf("%d += %d --> c = %d\n", c, a, c += a);
  System.out.printf("%d -= %d --> c = %d\n", c, a, c -= a); 
  System.out.printf("%d *= %d --> c = %d\n", c, a, c *= a);
  System.out.printf("%d /= %d --> c = %d\n", c, a, c /= a); 
  System.out.printf("%d %%= %d --> c = %d\n", c, a, c %= a); 
  // c %= 0; --> Arithmetical Exception 
  // c /= 0; --> Arithmetical Exception
  System.out.printf("%d |= %d --> c = %d\n", c, a, c |= a); 
  System.out.printf("%d &= %d --> c = %d\n", c, a, c &= a);
  System.out.printf("%d ^= %d --> c = %d\n", c, a, c ^= a); 
  System.out.printf("%d >>= 1 --> c = %d\n", c, c >>= 1); 
  System.out.printf("%d <<= 1 --> c = %d\n", c, c <<= 1); 
  System.out.printf("%d >>>= 1 --> c = %d\n", c, c >>>= 1); 

  System.out.println("\n***** Relational Operators for long type objects*****");
   // greater than
  System.out.printf("greater than : %d > %d --> %b\n", a, b, a > b); 
  // greater than or equal to 
  System.out.printf("greater than or equal to : %d >= %d --> %b\n", a, b, a >= b); 
  // less than 
  System.out.printf("less than : %d < %d --> %b\n", a, b, a < b); 
  // less than or equal to 
  System.out.printf("less than or equal to : %d <= %d --> %b\n", a, b, a <= b); 
  // equal to
  System.out.printf("equal to : %d == %d --> %b\n", a, b, a == b); 
  // not equal to 
  System.out.printf("not equal to : %d != %d --> %b\n", a, b, a != b); 
  System.out.println("\n***** Logical Operations for long type objects*****");
  // logical AND 
  System.out.printf("logical AND  : (%d > %d) && (%d > 0) --> %b\n", a, b, a, (a > b) && (a > 0)); 
  // bitwise logical AND
  System.out.printf("bitwise logical AND : (%d > %d) & (%d > 0) --> %b\n", a, b, a, (a > b) & (a > 0)); 
  // logical OR 
  System.out.printf("logical OR : (%d >= %d) || (%d != 0) --> %b\n", a, b, b, (a >= b) || (b != 0));
  // bitwise logical OR
  System.out.printf("bitwise logical OR : (%d >= %d) | (%d != 0) --> %b\n", a, b, b, (a >= b) | (b != 0));

  // logical XOR 
  System.out.printf("logical XOR : (%d >= %d) | (%d != 0) --> %b\n", a, b, b, (a >= b) ^ (b != 0)); 
  // logical NOT 
  System.out.printf("logical NOT : !(%d >= %d) --> %b\n", a, b, !(a >= b));
  System.out.println("\n***** Misc Operators for long type objects*****"); 
  System.out.println("\nCondition Operator:");
  System.out.printf("%d > %d ? %d : %d --> %d\n", a, b, a, b, (a > b ? a : b)); 

  System.out.println("\nType Cast Operator:"); 
  byte bt = 127; 
  short sh = -32000; 
  char ch = '\u0002';
  int i=32767;
  float f = 1.9f; 
  double d = 123456789.625; 
  boolean bool = true;
  //convertion to different types
  c = bt;
  System.out.printf("long = byte: c = %d --> c = %d\n", bt, c); 
  c = sh;
  System.out.printf("long = short: c = %d --> c = %d\n", sh, c); 
  c = ch; 
  System.out.printf("long = char: c = '%c' --> c = %d\n", ch, c); 
  c = i; 
  System.out.printf("long = int: c = (int)%d --> c = %d\n", i, c);
  c = (long) f;
  System.out.printf("long = float: c = (int)%f --> c = %d\n", f, c);
  c = (long) d; 
  System.out.printf("long = double: c = (int)%f --> c = %d\n", d, c); 
  //c = (long)bool;
  System.out.printf("long = boolean: c = (long)%b --> Compile Error\n", bool); 
 }   

public static void testFloat(float a1,float b1){      //method for testing two float objects
  float a=a1, b=b1, c=0;
  System.out.println("Testing two objects float type");
  System.out.println("\n***** Arithmetical Operators for float type objects*****");
  // addition a + b
  System.out.printf("addition : %f + %f = %f\n", a, b, a + b); 
  // subtraction a - b
  System.out.printf("subtraction : %f - %f = %f\n", a, b, a - b); 
  // multiplication a * b
  System.out.printf("multiplication : %f * %f = %f\n", a, b, a * b); 
  // division a / b
  System.out.printf("division : %f / %f = %f\n", a, b,  a / b); 
  // modulus a % b
  System.out.printf("modulus : %f %% %f = %f\n", a, b, a % b);
  // a / 0; --> Arithmetical Exception 
  // a % 0; --> Arithmetical Exception
  // unary minus -a
  a=a1;
  System.out.printf("unary minus : -%f = %f\n", a, -a); 
  // unary plus  +a 
  a=a1;
  System.out.printf("unary plus : +%f = %f\n", a, +a); 
  // prefix increment 
  a=a1;
  System.out.printf("prefix increment : ++%f = %f\n", a, ++a);
  // postfix increment
  a=a1; 
  System.out.printf("postfix increment : %f++ = %f\n", a, a++);
   // prefix decrement 
  a=a1;
  System.out.printf("prefix decrement  : --%f = %f\n", a, --a); 
  // postfix decrement
  a=a1;
  System.out.printf("postfix decrement : %f-- = %f\n", a, a--);

    
  System.out.println("\n***** Assignment Operators for float type objects*****"); 
  
  a=a1;
  c = a+b;
  //combined assignment
  System.out.printf("%f += %f --> c = %f\n", c, a, c += a);
  System.out.printf("%f -= %f --> c = %f\n", c, a, c -= a); 
  System.out.printf("%f* = %f --> c = %f\n", c, a, c *= a);
  System.out.printf("%f /= %f --> c = %f\n", c, a, c /= a); 
  System.out.printf("%f %%= %f --> c = %f\n", c, a, c %= a); 
 

  System.out.println("\n***** Relational Operators for float type objects*****");
   // greater than
  System.out.printf("greater than : %f > %f --> %b\n", a, b, a > b); 
  // greater than or equal to 
  System.out.printf("greater than or equal to : %f >= %f --> %b\n", a, b, a >= b); 
  // less than 
  System.out.printf("less than : %f < %f --> %b\n", a, b, a < b); 
  // less than or equal to 
  System.out.printf("less than or equal to : %f <= %f --> %b\n", a, b, a <= b); 
  // equal to
  System.out.printf("equal to : %f == %f --> %b\n", a, b, a == b); 
  // not equal to 
  System.out.printf("not equal to : %f != %f --> %b\n", a, b, a != b); 
  System.out.println("\n***** Logical Operations for float type objects*****");
  // logical AND 
  System.out.printf("logical AND  : (%f > %f) && (%f > 0) --> %b\n", a, b, a, (a > b) && (a > 0)); 
  // bitwise logical AND
  System.out.printf("bitwise logical AND : (%f > %f) & (%f > 0) --> %b\n", a, b, a, (a > b) & (a > 0)); 
  // logical OR 
  System.out.printf("logical OR : (%f >= %f) || (%f != 0) --> %b\n", a, b, b, (a >= b) || (b != 0));
  // bitwise logical OR
  System.out.printf("bitwise logical OR : (%f >= %f) | (%f != 0) --> %b\n", a, b, b, (a >= b) | (b != 0));

  // logical XOR 
  System.out.printf("logical XOR : (%f >= %f) | (%f != 0) --> %b\n", a, b, b, (a >= b) ^ (b != 0)); 
  // logical NOT 
  System.out.printf("logical NOT : !(%f >= %f) --> %b\n", a, b, !(a >= b));
  System.out.println("\n***** Misc Operators for float type objects*****"); 
  System.out.println("\nCondition Operator:");
  System.out.printf("%f > %f ? %f : %f --> %f\n", a, b, a, b, (a > b ? a : b)); 

  System.out.println("\nType Cast Operator:"); 
  byte bt = 127; 
  short sh = -32000; 
  char ch = '\u0002';
  int i=32767;
   long l = 100000000000000000L;
  double d = 123456789.625; 
  boolean bool = true;
  //convertion to different types
  c = bt;
  System.out.printf("float = byte: c = %d --> c = %f\n", bt, c); 
  c = sh;
  System.out.printf("float = short: c = %d --> c = %f\n", sh, c); 
  c = ch; 
  System.out.printf("float = char: c = '%c' --> c = %f\n", ch, c); 
  c = i; 
  System.out.printf("float = int: c = %d --> c = %f\n", i, c);
  c =  (float)l;
  System.out.printf("float = float: c = %d --> c = %f\n", l, c);
  c = (float)d; 
  System.out.printf("float = double: c = (float)%f --> c = %f\n", d, c); 
  //c = (float)bool;
  System.out.printf("float = boolean: c = (float)%b --> Compile Error\n", bool); 
 } 

public static void testDouble(double a1,double b1){      //method for testing two double objects
  double a=a1, b=b1, c=0;
  System.out.println("Testing two objects double type");
  System.out.println("\n***** Arithmetical Operators for double type objects*****");
  // addition a + b
  System.out.printf("addition : %f + %f = %f\n", a, b, a + b); 
  // subtraction a - b
  System.out.printf("subtraction : %f - %f = %f\n", a, b, a - b); 
  // multiplication a * b
  System.out.printf("multiplication : %f * %f = %f\n", a, b, a * b); 
  // division a / b
  System.out.printf("division : %f / %f = %f\n", a, b,  a / b); 
  // modulus a % b
  System.out.printf("modulus : %f %% %f = %f\n", a, b, a % b);
  // a / 0; --> Arithmetical Exception 
  // a % 0; --> Arithmetical Exception
  // unary minus -a
  a=a1;
  System.out.printf("unary minus : -%f = %f\n", a, -a); 
  // unary plus  +a 
  a=a1;
  System.out.printf("unary plus : +%f = %f\n", a, +a); 
  // prefix increment 
  a=a1;
  System.out.printf("prefix increment : ++%f = %f\n", a, ++a);
  // postfix increment
  a=a1; 
  System.out.printf("postfix increment : %f++ = %f\n", a, a++);
   // prefix decrement 
  a=a1;
  System.out.printf("prefix decrement  : --%f = %f\n", a, --a); 
  // postfix decrement
  a=a1;
  System.out.printf("postfix decrement : %f-- = %f\n", a, a--);

    
  System.out.println("\n***** Assignment Operators for double type objects*****"); 
  
  a=a1;
  c = a+b; 
  //combined assignment
  System.out.printf("%f += %f --> c = %f\n", c, a, c += a);
  System.out.printf("%f -= %f --> c = %f\n", c, a, c -= a); 
  System.out.printf("%f* = %f --> c = %f\n", c, a, c *= a);
  System.out.printf("%f /= %f --> c = %f\n", c, a, c /= a); 
  System.out.printf("%f %%= %f --> c = %f\n", c, a, c %= a); 
 

  System.out.println("\n***** Relational Operators for double type objects*****");
   // greater than
  System.out.printf("greater than : %f > %f --> %b\n", a, b, a > b); 
  // greater than or equal to 
  System.out.printf("greater than or equal to : %f >= %f --> %b\n", a, b, a >= b); 
  // less than 
  System.out.printf("less than : %f < %f --> %b\n", a, b, a < b); 
  // less than or equal to 
  System.out.printf("less than or equal to : %f <= %f --> %b\n", a, b, a <= b); 
  // equal to
  System.out.printf("equal to : %f == %f --> %b\n", a, b, a == b); 
  // not equal to 
  System.out.printf("not equal to : %f != %f --> %b\n", a, b, a != b); 
  System.out.println("\n***** Logical Operations for double type objects*****");
  // logical AND 
  System.out.printf("logical AND  : (%f > %f) && (%f > 0) --> %b\n", a, b, a, (a > b) && (a > 0)); 
  // bitwise logical AND
  System.out.printf("bitwise logical AND : (%f > %f) & (%f > 0) --> %b\n", a, b, a, (a > b) & (a > 0)); 
  // logical OR 
  System.out.printf("logical OR : (%f >= %f) || (%f != 0) --> %b\n", a, b, b, (a >= b) || (b != 0));
  // bitwise logical OR
  System.out.printf("bitwise logical OR : (%f >= %f) | (%f != 0) --> %b\n", a, b, b, (a >= b) | (b != 0));

  // logical XOR 
  System.out.printf("logical XOR : (%f >= %f) | (%f != 0) --> %b\n", a, b, b, (a >= b) ^ (b != 0)); 
  // logical NOT 
  System.out.printf("logical NOT : !(%f >= %f) --> %b\n", a, b, !(a >= b));
  System.out.println("\n***** Misc Operators for double type objects*****"); 
  System.out.println("\nCondition Operator:");
  System.out.printf("%f > %f ? %f : %f --> %f\n", a, b, a, b, (a > b ? a : b)); 

  System.out.println("\nType Cast Operator:"); 
  byte bt = 127; 
  short sh = -32000; 
  char ch = '\u0002';
  int i=32767;
  long l = 100000000000000000L;
  float f = 1.9f; 
  boolean bool = true;
  c = bt;
  //convertion to different types
  System.out.printf("double = byte: c = %d --> c = %f\n", bt, c); 
  c = sh;
  System.out.printf("double = short: c = %d --> c = %f\n", sh, c); 
  c = ch; 
  System.out.printf("double = char: c = '%c' --> c = %f\n", ch, c); 
  c = i; 
  System.out.printf("double = int: c = %d --> c = %f\n", i, c);
  c =  l;
  System.out.printf("double = float: c = %d --> c = %f\n", l, c);
  c = f; 
  System.out.printf("double = float: c = (double)%f --> c = %f\n", f, c); 
  //c = (double)bool;
  System.out.printf("double = boolean: c = (double)%b --> Compile Error\n", bool); 
 } 

public static void testString(String a1,String b1){     //method for testing two string type objects
  String a=a1, b=b1, c;
  System.out.println("Testing two objects String type");
  // concatenation a + b
  System.out.printf("concatenation : %s + %s = %s\n", a, b, a + b); 
  // concatenation a += b
  System.out.printf("concatenation : %s += %s = %s\n", a, b, a += b); 
  a=a1;
  System.out.printf("comparison %s and %s --> %b\n",a,b, a.equals(b)); //comparison of two strings 
  System.out.println("\nType Cast Operator:"); 
  byte bt = 1; 
  short sh = -32000; 
  char ch = 'A';
  int i=32767;
  long l = 100000000000000000L;
  float f = 1.9f; 
  double d = 123456789.625; 
  boolean bool = true;
  
   //using method .valueOf 
   //convertion to different types
  c = String.valueOf(bt);
  System.out.printf("byte to string: c = %d --> c = %s\n", bt, c);
  c = String.valueOf(sh);
  System.out.printf("short to string: c = %d --> c = %s\n", sh, c);  
  c = String.valueOf(ch);
  System.out.printf("char to string: c = %c --> c = %s\n", ch, c);
  c = String.valueOf(i);
  System.out.printf("int to string: c = %d --> c = %s\n", i, c);  
  c = String.valueOf(l);
  System.out.printf("long to string: c = %d --> c = %s\n", l, c);  
  c = String.valueOf(f);
  System.out.printf("float to string: c = %f --> c = %s\n", f, c);
  c = String.valueOf(d);
  System.out.printf("double to string: c = %f --> c = %s\n", d, c);
  c = String.valueOf(bool);
  System.out.printf("boolean to string: c = %b --> c = %s\n", bool, c);

 }  


public static void testStudent(Student a,Student b){ //testing method for 2 Stydent objects
System.out.println("Testing two objects Student type");

System.out.printf("Compare a and b student lastnames : %s ==%s --> %b\n",a.getLastName(),b.getLastName(), Student.compareLastNames(a, b));//compare students lastnames
System.out.printf("Compare a and b student ages : %d ==%d --> %b\n",a.getAge(),b.getAge(), Student.compareAges(a, b)); //compare students ages
}

public static void testBoolean(boolean a1,boolean b1) {    //method for testing two boolean type objects
  boolean a = a1, b = b1, c;
  System.out.println("Testing two objects boolean type");
  System.out.println("\n***** Bitwise Operators for boolean type objects*****"); 
  // bitwise AND 
  System.out.printf("bitwise AND : %b & %b = %b\n", a, b, a & b);
  // bitwise OR 
  System.out.printf("bitwise OR : %b | %b = %b\n", a, b,a | b);
  // bitwise XOR
  c = a ^ b;
  System.out.printf("%b ^ %b = %b\n", a, b, c);
  
  System.out.println("\n***** Assignment Operators for boolean type objects*****"); 
    
  System.out.printf("%b |= %b --> c = %b\n", c, a, c |= a); 
  System.out.printf("%b &= %b --> c = %b\n", c, a, c &= a); 
  System.out.printf("%b ^= %b --> c = %b\n", c, a, c ^= a); 
  
  System.out.println("\n***** Relational Operators for boolean type objects*****"); 
  // equal to
  System.out.printf("%b == %b --> %b\n", a, b, a == b);
  // not equal to
  System.out.printf("%b != %b --> %b\n", a, b, a != b);

  System.out.println("\n***** Logical Operations for boolean type objects*****"); 
  // logical AND 
  System.out.printf("logical AND : %b && %b = %b\n", a, b, a && b);
  // logical OR 
  System.out.printf("logical OR : %b || %b = %b\n", a, b, a || b); 
  // logical XOR 
  System.out.printf("logical XOR : %b ^ %b = %b\n", a, b, a ^ b); 
  // logical NOT
  System.out.printf("logical NOT: !%b --> %b\n", a, !a);
  System.out.println("\n***** Misc Operators for boolean type objects*****");
  System.out.println("\nCondition Operator:"); 
  System.out.printf(" %b ? %b : %b --> %b\n", c, a, b, (c ? a : b));
 
 }

}

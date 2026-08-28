//public static void main(String[] args)  // any code inside main() will be executed

/*public static void main(String[] args) {
  System.out.println("Hello Ernesto"); //(caps 'S')System is a java class, out is short for output , println is short for print line
} // all ststements must end with a semi colon (;)
*/
/*  public static void main(String[] args) {
  System.out.println("Java is fun!");
  System.out.println("Have a good day!");
}   */


/* public static void main (String[] args) {
    System.out.print("Hello World   ");
    System.out.print("I will probably print on the same line");
  }  //therefore the diference between print and println is the fact that one produces a new line   */
    
  
  //PRINTING NUMBERS
 /*  public static void main (String[] args) {
    System.out.println(3 + 3);
    System.out.println(3005 * 2);
}  //concatination exists in Java just like pyton ("10" + 5)  = 105
*/

/*VARIABLES  
type variableName = value;    */

/*public static void main(String[] args) {
  String name = "Leroy" ;  // declaring a string
  System.out.println(name) ;
  int age = 73 ; //declaring an integer
  System.out.println(age);
  final int YearOfBirth; // use the 'final' keyword to prevent change or 'constant'
  YearOfBirth = 1943;
  System.out.println(YearOfBirth);
  age = 35 ; // this is how you redeclare ,NB: dont add 'int'
  System.out.println("New age is " + age);

  float myFloat = 7.99f ;
  char myletter = 'A' ;
  boolean mybool = true; //use lowercase for 'true' / 'false'
  String mytext = "Jooolof";
  double myDouble = 9.44
}    */

/* 
public static void main(String[] args) {
  String firstName = "Kiiza " ;
  String lastName = "Ernest";
  String fullName = firstName + lastName ; 
  System.out.println(fullName);

  int x = 5;
  int y = 4;
  System.out.println("The sum is " + (x+y));  //you must add parenthess when addind numbers inside of a string

}
*/


//DECLARING MANY VARIABLES ON ONE LINE  
/* 
public static void main(String[] args) {
  int x = 5 , y = 6 , z = 50; //single line declaration
  System.out.println(x + y + z); 

  int a,b,c ; 
  a=b=c= 50 ;
  System.out.println(a + b + c);
}   
*/

/*public static void main(String[] args) {
  //student data
  String studentName = "John Doe";
  int studentID = 15;
  int studentAge = 22;
  float studentFee = 75.22f;
  char studentGrade = 'B' ;

//printing the variables
System.out.println("Student name : " + studentName);
System.out.println("Student ID : " + studentID);
}  */

/* 
public static void main(String[] args) {
 int items = 50;
float costPerItem = 9.99f;   //the 'f' at the end fo this is to tell the system that it is a float
float totalCost = items * costPerItem;
char currency = '$';

// Print variables
System.out.println("Number of items: " + items);
System.out.println("Cost per item: " + costPerItem + currency);
System.out.println("Total cost = " + totalCost + currency);

}
*/

//use the 'var' keyword to automatically detect , when you use 'var' , you must asign there and then


/*   /WIDENING CASTING
public static void main(String[] args) {
  int myInt= 8;
  double myDouble = myInt ;//Autocasting int to double

  System.out.println(myInt) ;
  System.out.println(myDouble);

  //Narrowing Casting
  double Adouble = 9.54d ;  //Must add a 'd'
  int anInt = (int) Adouble; // manual casting
  
  System.out.println(Adouble);
  System.out.println(anInt);

}   */

/* 
public static void main(String[] args) {
  int maxScore = 500 ;
  int userSCore = 459;
  double percentage = (double) userSCore / maxScore * 100.0d ;

  System.out.println("The User's percentage is " + percentage) ;
  
}
  */


/*   LOGICAL OPERATORS
|| - Logical OR 
&& - Logical AND

JAVA FOLLOWS BODMAS

//JAVA STRINGS
Use .length()  , to get the length of a string
toUpperCase()     OR     toLowerCase()
String txt = "Hello World";
System.out.println(txt.toUpperCase());   // Outputs "HELLO WORLD"
System.out.println(txt.toLowerCase());   // Outputs "hello world"

indexOf() //to get the position of a string
.trim()  // to remove whitespace

instead of using '+' to concatenate , we can also use the .concat()


//FOR EACH LOOPS (MADE FOR ARRAYS)
public static void main(String[] args) {
  String[] cars = {"Volvo" , "BMW" , "Ford" , "Mazda"};

  for (String car : cars) {
    System.out.println(car);
  }
}


public static void main(String[] args) {
  int[] numbers = {10 ,20,30,40} ; 

  for (int num : numbers) {
    System.out.println(num);
  }
}


public static void main (String[] args) {
  int number = 2;
   //multiplication table of 2
  for (int i = 1 ; i <= 10 ; i++) {
    System.out.println(number + " x " + i + " = " + (number * i));
  }

//ARRAYS 
String[] cars = {"Benz" , "Mazda"} ;
int[] number = {33,42,67,2};

String[] cars = new String[4]; // size is 4
*/


public class Main{
  static void myMethod() {
      System.out.println("I just got executed");
  }


  public static void main(String[] args) {
    myMethod();
  }
}
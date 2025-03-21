
import java.util.Arrays;
import java.util.Scanner;
class Main{
public static void main(String[] args){

Scanner sc = new Scanner(System.in);
/*
//question 1
  System.out.println("I am an Indian");

//question 2
int m = 55;
System.out.println(m);


//queston 3
int i=4;
int j=77;
int sum=i+j;
System.out.println("Sum is:"+sum);
  
//question 4
  double c=4.5f;
  double d=3.4f;
  double product=c*d;
  System.out.println("double:"+product); 


//checking no. is even or odd
  //Scanner sc = new Scanner(System.in);
  //System.out.println("Enter a number:");
  //int n =sc.nextInt();
  //if(n%2==0)
  //   System.out.println(n+" is Even.");
  //else
   //  System.out.println(n+"is Odd.");

//question 5

System.out.println("Enter the length:");
int l = sc.nextInt();
System.out.println("Enter the breadth:");
int bd = sc.nextInt();
System.out.println("The area of rectangle:"+(l*bd));


//question 6
System.out.println("Enter the radius:");
double radius = sc.nextDouble();
double circumference = 2* Math.PI *radius;
System.out.println("The circumference of circle is: "+circumference);


//question 7
System.out.println("Enter the input:");
int input = sc.nextInt();
if(input==0)
    System.out.println("Input is Zero...");
else if(input>0)
    System.out.println("Input is Positive...");
else
    System.out.println("Input is Negative...");

//question 8
  int a=1;
  int b=2147;
  System.out.println("max:"+Math.max(a,b));



//question 9
System.out.println("Enter the input:");
double input = sc.nextDouble();
if(input%2 != 0)
   System.out.println("Odd...");
else
   System.out.println("Even");



//question 10
for (int i = 1; i <= 10; i++) {
            System.out.print(i + " \n");
        }

//question 11
int i = 1;
int sum = 0;
while(i<=10){
     sum += i;
     i++;
   }
System.out.println("The sum of 1 to 10 is: "+sum);


//question 12
int n = sc.nextInt();
for(int i=1;i<=10;i++){
      System.out.println("Table of "+ n + "x"+i+ ": "+ (n*i));   
     }


//question 13
int i = 1;
do{
    System.out.println(i);
    i++;
  }while(i<=5);


//question 14
int[] arr = {12,13,14,15};
for(int i=0;i<arr.length;i++){
    System.out.println("The array: "+ arr[i]); 
    }


//question 15
int[] arr = {12,13,14,15};
int sum=0;
for(int i=0;i<arr.length;i++){
     sum+= arr[i];
     }
double average = sum/arr.length;
System.out.println("Average is :"+average);



//question 16
int arr[] = {11,12,13,14,15};
int max = arr[0];
for(int i=1;i<arr.length;i++){
   if(arr[i]>max){
      max = arr[i];
      }
    }
System.out.println("The maximum is : "+max);

//question 17

int n = sc.nextInt();
if(n<0){
   System.out.println("The input is not in negative:");
   }
else{
int factorial = 1;
for(int i=1;i<=n;i++){
  factorial*=i;
  }
System.out.println("The factorial is: "+factorial);
}


//question 18
int n,r;
System.out.print("Enter input: ");
n = sc.nextInt();
System.out.print("Input in reverse order: ");
while(n>0){
   r = n%10;
   System.out.print(r);
   n = n/10;
   }


//question 19
int n,c,r,s=0;
System.out.print("Enter the input: ");
n = sc.nextInt();
c=n;
while(n>0){
  r=n%10;
  s=(s*10)+r;
  n=n/10;
  }
if(c==s){
System.out.println("Palindrome Number...");
}
else{
System.out.println("Not Palindrome Number...");
}


//question 20
String m = ("Mukund");
m = m.concat("Thakur");
System.out.println(m);


//question 21
System.out.println("Enter a string in lower case:");
String input = sc.nextLine();
String uppercase = input.toUpperCase();
System.out.println("Uppercase:"+uppercase);


//question 22
String str = sc.nextLine();
int count = 0;
for(int i = 0; i<str.length();i++){
  char ch = str.charAt(i);
  if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
    count++;
   } 
 }
System.out.println("Vowel is: "+count);



//question 23
  int a = 4;
  int b = 9;
  int temp = a;
  a = b;
  b = temp;
  System.out.println("After swapping: a="+a +",b="+ b); 

//question 24
int n = sc.nextInt();
int sum=0;
while(n>0){
 sum+=n%10;
 n/=10;
}
System.out.println(sum);


//question 25
int n = sc.nextInt();
for(int i=1;i<=n;i++){
   for(int j=1;j<=i;j++){
      System.out.print("* ");
      }
     System.out.println();
    }

//question 26
double celsius = sc.nextDouble();
double fahrenheit = ((celsius*9/5)+32);
System.out.println(fahrenheit);


//question 27
double mile = sc.nextDouble();
double km = (mile*1.60934);
System.out.println(km);


//question 28

int day = sc.nextInt();
switch(day){
   case 1: 
       System.out.println("Monday");
       break;
   case 2:
       System.out.println("Tuesday");
       break;
   case 3:
       System.out.println("wednesday");
       break;
   case 4:
       System.out.println("Thursday");
       break;
   case 5:
       System.out.println("Friday");
       break;
   case 6:
       System.out.println("Saturday");
       break;
   case 7:
       System.out.println("Sunday");
       break;
  default:
       System.out.println("Please enter a valid number between 1 to 7...");

}

//question 29
double n = sc.nextDouble();
int m = (int) n;
System.out.println(n); 
System.out.println(m);


//question 30
int sum = 0;
int arr[] = {1,2,3};
for(int i = 0;i<arr.length;i++){
  sum+= arr[i];
  }
System.out.println(sum);


//question 31
String str[] = {"Mukund","aryan","shivam"};
for(int i = 0; i<str.length;i++){
System.out.println(str[i]);
}


//question 32
String str="Mukund  thakur";
System.out.println(str.length());




//question 33
String str[] = {"Mukund","aryan","shivam"};
String num[] = {"Mukund","aryan","shivam"};

if(Arrays.equals(str,num)){
  System.out.println("it is equal");
 }
else{
  System.out.println("Not equal");
 }

*/

//question 34
int n = sc.nextInt();
int a=0,b=1;
System.out.print(a);
System.out.print(b);
for(int i=2;i<n;i++){
 c=a+b;
 System.out.println(c);
 a=b;
 b=c;
 }


//question 35
int n = sc.nextInt();
if((n%4==0 && n%100==0) || n%400==0){
   System.out.println("Leap year...");
}
else{
   System.out.println("Not a leap yaear...");
}




 }
}
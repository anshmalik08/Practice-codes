import java.lang.management.MemoryNotificationInfo;
import java.util.Scanner;

import javax.swing.text.html.HTMLDocument.RunElement;

public class function {
    // public static void  printHelloWorld(){
    //     System.out.println("Hello world");
    //     System.out.println("Hello world");
    //     System.out.println("Hello world");
    //     // return 3 ;
    // }
    // public static void calculateSum(int num1 , int num2){// a and b is parameters here
    //     int sum = num1 + num2;
    //     System.out.println("sum is " + sum);
    // }


    // public static void main(String args[]){ 
    //     Scanner sc = new Scanner(System.in);
    //     int a = sc.nextInt();
    //     int b = sc.nextInt();
    //     calculateSum(a, b);// arguments and actual parameters
        
        
    // }


    // call by value
//     public static void swap(int a , int b){
//          a = 5;
//          b = 10;
    
//             // swap
//         int temp = a;
//         a = b;
//         b = temp;
//         System.out.println("a = " + a);
//         System.out.println("b = " + b);
//     }
//     public static void main(String args[]){
//    int a = 5;
//    int b = 10;
//    swap(a,b);
        
//     }

// Multiply
// public static int multiply(int a , int b){
//     int product = a*b;
//    System.out.println("Enter the product :  " + product); 
//     return product;
// }
// public static void main(String[] args) {
    
//     multiply(12, 5);
//     multiply(12, 11);
// }

// factorial
// public static int factorial(int n ){
//     int f = 1;

//     for(int i = 1;i<=n;i++){

//         f  = f * i;
//         System.out.println();
//     } 
//     return f;
// }

// public static int bincooff(int n, int r){
//     int fact_n = factorial(n);
//     int fact_r = factorial(r);
//     int fact_nmr = factorial(n-r); 
//     int bincooff = fact_n / (fact_r * fact_nmr);
//     return  bincooff;
// }
// public static void main(String args[]) {
//     System.out.println(bincooff(5, 2));
// }
// func to calculate sum of w nums
//  public static int  sum(int a, int b){
//     return a + b;
//  }


//  public static float  sum(int a, int b, int c){
//     return a + b + c;
//  }
//  public static int  sum(int a, int b){
//     return a + b;
//  }
//  public static float sum(float a , float b){
//     return a + b; 
//  }
//  public static void main(String[] args) {
//     System.out.println(sum(3, 5));
//     System.out.println(sum(3, 5, 3));
//  }

// prime or not
// public static boolean isPrime(int n){
//     // corner cases
//     // 1
//     // only for n<=2
//     // boolean isPrime = true;
//     // if(n == 2){
//     //     return true;
//     // }isee hamesha true print ho jaiga
//     for(int i = 2;i<=n-1;i++){
//         if(n%i==0){// completely dividing
//             // isPrime = false;
//             return false;
//         }
//     }
//     return true;
// }
// public static void main(String[] args) {
//     System.out.println(isPrime(2));
// }

// optimized function prime or not

// public static boolean isPrime(int n){
//     if(n==2){
//         return true;
//     }
//     for(int i = 2;i<=Math.sqrt(n);i++){

//         if(n%i==0){
//             return false;
//         }
//     }
//     return true;
// }
// public static void main(String[] args) {
//     System.out.println(isPrime(16));
// }

// prime in range

// public static boolean isPrime(int n){
//     if(n==2){
//         return true;
//     }
//     for(int i = 2;i<=Math.sqrt(n);i++){

//         if(n%i==0){
//             return false;
//         }
//     }
//     return true;
// }
// public static void primesInRange(int n){
//     for(int i =2 ; i<=n;i++){
//         if(isPrime(i)){
//             System.out.println(i+" ");
//         }
//     }
//     System.out.println();
// }
// public static void main(String[] args) {x
//     primesInRange(20);
// }

//  decimal to binary

// public static void binTodec(int binNum){
//     int myNum = binNum;
//     int pow = 0;
//     int decNUm = 0;
//     while(binNum > 0){
//         int lastDigit = binNum%10;
//         decNUm =  (decNUm + (lastDigit *(int) Math.pow(2, pow)));
//         pow++;
//         binNum = binNum/10;
//     }
//     System.out.println("decimal of "  + myNum + " = " + decNUm);
// }
// public static void main(String[] args) {
//     binTodec(111);//2 to 20
// }
// }

// binary to decimal 
// public static void decToBin(int n){
//     int pow = 0;
//     int binNum = 0;
//     int myNum  = n;
//      while(n>0){
//         int rem = n%2;
//         binNum = binNum + (rem * (int)Math.pow(10, pow));
//         pow++;
//         n = n/2;
//      }
//      System.out.println("Binary form of"+ myNum + " = " + binNum );
// }
// public static void main(String[] args) {
//     decToBin(15);
// }

//  SCOPE
// method scope

// public static void printS(){
//     int s = 45;
// }
// public static void main(String[] args) {
//     // int s = 2;
//     System.out.println(s);    
// }

// block scope

// public static void main(String[] args) {
//     int p =34;
//     {
//         int s =34;
//         System.out.println(p);
//     }
//     System.out.println(s);// it is not defined  in outer the curly braces
// }
// }


// question number 1
// public static double average(double x , double y , double z){
//     return (x+y+z/3);
// }
// public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     System.out.println("Enter the first number :");
//     double x = sc.nextDouble();
//     System.out.println("Enter the second number :");
//     double y = sc.nextDouble();
//     System.out.println("Enter the third number :");
//     double z = sc.nextDouble();
//     System.out.println("The average is  :" + average(12, 2, 1)+ " ");
    

// question number 2
public static boolean isEven(int number){
if(number % 2 == 0){
        return true;
}
else{
    return false;
}
}
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num ;
    System.out.println("Enter the integer");
     num = sc.nextInt();

    if(isEven(num)){
        System.out.println("THE NUMBER IS EVEN");

    }
    else{
        System.out.println("THE NUMBER IS ODD");
    }
    
}
    
// }

}
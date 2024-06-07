import java.util.Scanner;

import javax.swing.plaf.synth.SynthSpinnerUI;

public class Condtional {
    public static void main(String[] args) {
        // int age = 16;
        // if(age>=18){
        //     System.out.println("adult : drive , vote");
        // }
        // if(age>13 && age <18){
        //     System.out.println("tennager");
        // }
        // else{
        //     System.out.println("Not adult");
        // }


        // int A = 10;
        // // int A = 1;
        // int B = 5;
        // if(A>=B){// if we don't use curly braces in the the code will run 
        // // but we use because here we have to write multiple lines
        //     System.out.println("A is largest of 2");
        // } else{// we can also print in the this form in ja
        //     System.out.println("B is largest of 2");
        // }

            // Scanner sc = new Scanner(System.in);
            // int number  = sc.nextInt();

            // if(number % 2==0){
            //     System.out.println("Even");
            // }else{
            //     System.out.println("ODD");
            // }



            //   int age = 13;
          
            //   if(age >=18){
            //     System.out.println("adult");
            //   }
            //   else if(age >= 13 && age < 18){
            //     System.out.println("tennager");
            //   }
            //   else{
            //     System.out.println("child");
            //   }


            // Scanner sc = new Scanner(System.in);
            //         int income = sc.nextInt();
            //         int tax;  
            //         if(income<500000){
            //         tax = 0;
            //         }
            //         else if(income>= 500000 && income <1000000){
            //             tax = (int) (income * 0.2);
            //         }
            //         else{
            //             tax = (int) (income * 0.3);
            //         }
            //         System.out.println("Your Tax is :" + tax);
            //     }



            //  int A = 1 , B =3 , C = 6;
            //  if((A>=B) && (A>+C)){
            //     System.out.println("Largest is C");
            //  }
            //  else if((B>=C)){
            //     System.out.println("LArgest is b");
            //  }   
            // else{
            //     System.out.println("Largest is C");
            // }
        //     int number = 5;
        //    String type =  ((number%2) == 0) ? "even" : "odd";
        //    System.out.println(type);


                // int marks = 31;
                // // int marks = 67;
                // String reportCard = marks>=33 ? "PASS" : "FAIL";
                // System.out.println(reportCard);


                
        //         int number = 3;
        //         // char ch = 'a'; i neeed to write charcters in cases
        //        switch(number){
        //         case 1: System.out.println("samosa");
        //         break;

        //         case 2: System.out.println("Burger");
        //                 break;
        //         case 3: System.out.println("mango shake");
        //         break;

        //         default: System.out.println("we wake up");
        //        } 
        // }

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a : ");
        int a = sc.nextInt();
        System.out.println("Enter b : ");
        int b = sc.nextInt();
        System.out.println("Enter Operator : ");
        char operator = sc.next().charAt(0);
            switch(operator){
                case '+' : System.out.println(a+b);
                break;
                case '-' : System.out.println(a-b);
                break;
                case '*' : System.out.println(a*b);
                break;
                case '/' : System.out.println(a/b);
                break;
                case '%' : System.out.println(a%b);
                break;
                default : System.out.println("wrong operator");
            }

        // Enter the positive and negative 
        // Scanner sc = new Scanner(System.in);
        // int x = sc.nextInt();
        // if(x>0){
        //     System.out.println("Print Positive");
        // }else{
        //     System.out.println("Print Negative");
        // }

        // temp vala
        // double temp = 103.5;
        // if(temp>100){
        //     System.out.println("You have fever");
        // }else{
        //     System.out.println("You Don't have fever");
        // }

        // print 1 to 7 weeks

    // Scanner sc  = new Scanner(System.in);
    // System.out.println("Enter the weeks 1 to 7 : ");
    // int week = sc.nextInt();
    // switch(week){
    //     case 1 : System.out.println("MOnday");
    //     break;
    //     case 2 : System.out.println("Tuesday");
    //     break;
    //     case 3 : System.out.println("Wednesday");
    //     break;
    //     case 4 : System.out.println("Thrusday");
    //     break;
    //     case 5 : System.out.println("Friday");
    //     break;
    //     case 6 : System.out.println("Saturday");
    //     break;
    //     case 7 : System.out.println("Sunday");
    //     break;
    //     default : System.out.println("nothing ");
    // }


//     int a = 63, b = 36;
// boolean x = (a < b ) ? true : false;
// int y= (a > b ) ? a : b;
// System.out.println(x);
// System.out.println(y);

// leap year

Scanner sc = new Scanner(System.in);
System.out.print("Input the year: ");
int year = sc.nextInt();
boolean x = (year % 4) == 0;
boolean y = (year % 100) != 0;
boolean z = ((year % 100 == 0) && (year % 400 == 0));
if (x && (y || z)) {
} else {
    
    System.out.println(year + " is a leap year"); 

    }
}
    }


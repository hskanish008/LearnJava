import java.util.Scanner;
public class $8ifElse{
 public static void main(String args[])
 {
//      ----Java condition and if Statements----
//      Conditions and if statement let you control the flow of your program- deciding which code runs which code is skipped
//       boolean isRaining=true;
    boolean isRaining=true;    
if(isRaining)
    {
        System.out.println("Bring an umbrella");
    }


//  Make two variable x,y if x==y then the condition print if condition

    int x=10;
    int y=15;
    if(x==y)
    {
        System.out.println("x is equal to y");
    }
    else
    {
        System.out.println("x is not equal to y");
    }


//    Using Boolean Variables
//    You can test boolean variable directly in an if statement.

      boolean  isLightOn=true;
      boolean isLightOff=false;
      
      if(isLightOn)
      {
        System.out.println("Hurrah the light is On");
      }

//   In an if statement has one line of code, you can write it without curly braces{}
      if (20 > 18)
      System.out.println("20 is greater than 18");

//   Potential Problem
//   Without braces, only the first line after the if belongs to it,any other 
//   Line will run no matter what, which can lead to unexpected results

     
//  To avoid mistakes, always use curly braces { }. This makes it clear which lines belong to the if statement: 
  int first1=10;
  int second2=20;

     if( first1<second2)
        {
            System.out.println("Use always curly braces in if statement");
            System.out.println("This will also run because if statement because of curly braces");
        }   
        System.out.println("This will works because it is outside from braces if condition met or not");

        
        
//      -----The Else statement----
//      The else statement lets you run a block of code when the condition in the if statement is false

//      Think of it like real life: If it rains, bring an umbrella. Otherwise (else), go outside without one:

        boolean iisRaining=false;
        if(iisRaining)
        {
            System.out.println("You need umbrella because of Raining");

        }
        else
        {
            System.out.println("There is no raining going on you can go without umbrella");
        }


        int time = 20;

        if (time < 18) 
        {
            System.out.println("Good day.");
        } else 
        {
            System.out.println("Good evening.");
        }
//      Outputs "Good evening."
           


//       ----The else if statement----
//       Use the else if statement to specify a new condition to test if the the first condition is false

//       Think of it like real life: If it rains, bring an umbrella. Else if it is sunny, wear sunglasses. Else, just go outside normally
          
         int weather=16;
         
         if(weather==1)
         {
            System.out.println("It is raining outside");
         }
         else if(weather==2)
         {
            System.out.println("Wear sunglasses");
         }
         else
         {
            System.out.println("Just go outside normally");
         }




//      ----Shortest hand if....else----
//      variable=(condition)? expressionTrue : expressionFalse
        
        int time1=16;
        String result=(time1<=18)? "Good day": "Good night";
        System.out.println(result);

        int age=17;
        String eligibleAge=(age<18)?"Person is not eligible for vote":"Person is  eligible for voter";
        System.out.println(eligibleAge);

//      ----Nested Ternary----
//    You can nest ternary operators to handle more than two possible outcomes.but this can make you code harder to read
        int Nestedtime=17;
        String message=(Nestedtime<12)?"Good morning":(Nestedtime<18)?"Good evening":"Good night";
        System.out.println(message); 



//      ----Java Nested if ----
//      You can also place an if statement inside another if.This is called a nested if statement 
//      A nested if let you check for a condition only if another condition is already true

        int nestedX=15;
        int nestedY=25;

        if(nestedX>10)
        {
          System.out.println("x is greater than 10");

          if(nestedY>15)
          {
            System.out.println("y is greater than 20");
          }
        }


        int nestedAge=19;
        boolean isCitizen=false;

        if(nestedAge>=18)
        {
          System.out.println("Person is eligible for vote");
          if(isCitizen)
          {
            System.out.println("Person is citizen of india and he can vote here");

          }
          else
          {
            System.out.println("Person is not citizen of india, so he can't vote here");
          }

        }
        else
        {
          System.out.println("Person is not old enough to vote");
        }
        
        
//     ----Note----
//     You can nest as many if statements as you want, but avoid making the code too deep - it can become hard to read.
//     Nested if is often used together with else and else if for more complex decision making.


       
//     -----LOGICAL OPERATORS IN CONDITIONS----
//     You can combine or reverse condition using logical operators. These work together with if, else and else if to build more complex decision
//     && (AND) - all conditions must be true
//     || (OR) - at least one condition must be true
//     ! (NOT) - reverses a condition (true = false, false = true)


       int logicalA=360;
       int logicalB=256;
       int logicalC=500;

       if(logicalA>logicalB  &&  logicalC >logicalB)
      {
        System.out.println("A is greater than B and C is greater than B");
      }

      int logicalAA=200;
      int logicalBB=140;
      int logicalCC=300;

      if(logicalAA>logicalBB || logicalAA>logicalCC)
      {
          System.out.println("At least one condition is true");
      }

      if(!(logicalBB>logicalCC))
      {
        System.out.println("B is not greater than c");
      }



//      In real programs, logical operators are often used for access control. For example, to get access to a system, there are specific requirements:
//      You must be logged in, and then you either need to be an admin, or have a high security clearance (level 1 or 2):

         boolean isLoggedin=true;
         boolean isAdmin=false;
         int securityLevel=2;

         if(isLoggedin && (isAdmin || securityLevel<=2))
         {
          System.out.println("Access Granted");
         }
         else
         {
          System.out.println("Access denied");
         }



//   This example shows how you can use if..else to "open a door" if the user enters the correct code:
   
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the code for opening door (108108 correct code) = ");
     int doorstep=sc.nextInt();
     if(doorstep==108108)
     {
      System.out.println("Correct code. Now the door is open.");
     }
     else
     {
      System.out.println("Incorrect code. The door remains closed.");
     }




//  This example shows how you can use if..else to find out if a number is positive or negative:     
    
     System.out.print("Enter the no to find that the no is positive or negative = ");
     int myNum=sc.nextInt();
     if(myNum>0)
     {
      System.out.println("The no is positive");
     }
     else if(myNum<0)
     {
      System.out.println("The no is negative");
     }
     else 
     {
      System.out.println("The no is zero ");
     } 
    
     

//   Find out if a person is old enough to vote:

     System.out.print("Enter the no to find you are eligible for vote = ");
     int votingAge=18;
     int myAge=sc.nextInt();
     if(myAge>=votingAge)
     {
      System.out.println("The person is eligible for vote");
     }
     else
     {
      System.out.println("The person is not eligible for vote");
     }



//    Find out if a number is even or odd
    System.out.print("Enter the number to find even or odd= ");
    int evenOdd=sc.nextInt();
    if(evenOdd%2==0)
    {
      System.out.println(+evenOdd+" is a even number");
    }
    else
    {
      System.out.println(+evenOdd+" is a odd number");
    }



//    Check temperture:
      System.out.print("Enter the no to find the weather is cold =");
      int temperature=sc.nextInt();
      if(temperature<0)
        {
          System.out.println("The temperature is freezing");
        }  
        else if(temperature<20)
        {
          System.out.println("The temperature is cold");
        }  
        else 
        {
          System.out.println("The temperature is warm");
        }











    }



 }

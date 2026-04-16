

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
        int personTime=11;
        String clockTime=(personTime<12)?"Good morning":(personTime<18)?"Good afternoon":"Good night";
         System.out.println(clockTime);


         int xx = 15;
          int yy = 25;

if (xx > 10) {
  System.out.println("x is greater than 10");
  
  // Nested if 
  if (yy > 20) {
    System.out.println("y is also greater than 20");
  }
}

int aage = 20;
boolean isCitizen = true;

if (aage >= 18) {
  System.out.println("Old enough to vote.");
  
  if (isCitizen) {
    System.out.println("And you are a citizen, so you can vote!");
  } else {
    System.out.println("But you must be a citizen to vote.");
  }
} else {
  System.out.println("Not old enough to vote.");
}


boolean isLoggedIn = true;
boolean isAdmin = false;
int securityLevel = 3; // 1 = highest

if (isLoggedIn && (isAdmin || securityLevel <= 2)) {
  System.out.println("Access granted");
} else {
  System.out.println("Access denied");
}

// Try changing securityLevel to test different outcomes:
//
// securityLevel 1 = Access granted
// securityLevel 2 = Access granted
// securityLevel 3 = Access denied
// securityLevel 4 = Access denied
//
// If isAdmin = true, access is granted.








    }



 }

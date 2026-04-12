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

     int  first1=34;
     int  second2=56;

     if(first1>second2)
        System.out.println("x is greater than y");
        System.out.println("This line runs no matter what not part of the if statement");

        
//  To avoid mistakes, always use curly braces { }. This makes it clear which lines belong to the if statement: 
  
     if(first1<second2)
        {
            System.out.println("Use always curly braces in if statement");
            System.out.println("This will also run in if stement because of curly braces");
        }   
        System.out.println("This will works because it is outside from braces if condition met or not");

    }



 }

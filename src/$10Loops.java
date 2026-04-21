import java.util.*;
public class $10Loops {
    public static void main(String args[])
    {
/*
  A loop is a programming construct that repeats a block of code multiple times until a condition is met.
  Loops can execute a block of code as long as specified is true.
  A loop is a programming construct that repeats a block of code multiple times until a condition is met.
  Loops are handy because they save time, reduce error and they make code more readable.
  Loops are programming control flow structures that enable the repeated execution of a set of instructions until a specified condition is met.
  They are essential for automating repetitive tasks, enhancing code efficiency, and improving readability by preventing manual repetition.
   

*/  
         Scanner sc=new Scanner(System.in);
         System.out.print("Enter the total no to print = ");
         int loopNum=sc.nextInt();
        // for(int i=0;i<=loopNum;i++)
        // {
        //     System.out.println("The no is ="+i);
        // }



/*
       ----Java While Loop----
      The while loop repeats a block of code as long as the specified condition is true:
 */   

//      In the example below, the code in the loop will run again and again, as long as a variable (i) is less than 5: 
      // int i=0;
      // while(i<=loopNum)
      // {
      //  System.out.println(i);
      //  i++;
      // }

//       Countdown Example
//       You can also use a while loop to count down. This example counts from 3 to 1, and then prints "Happy New Year!!" at the end:


      // while(loopNum>0)
      // {
      //   System.out.println("The number is = "+loopNum);
      //   loopNum--;
      // }
      // System.out.println("Happy New Year");


//         ----do while----
//         The do/while loop is a variant of the while loop. This loop will execute the code block once, before checking if the condition is true. Then it will repeat the loop as long as the condition is true.  
    

    // int i=0;
    //   do
    //   {
    //     System.out.println("The no is = "+i);
    //     i++;
    //   }
    //   while(i<=loopNum);

//        In the previous examples, the condition was true at the start, so the loop ran one or more times. But if the condition is false at the beginning, the code inside the loop will never run:
    // while(loopNum<5)
    // {
    //   System.out.println("This will never print because the condition is false  "+loopNum);
    //   loopNum++;
  
    // }
 

    // ----Break continue----
    //  for(int i=0;i<=loopNum;i++)
    //  {
    //   if(i==3)
    //     continue;
    //   if(i==loopNum)
    //   break;
    //   System.out.println(i);
    //  }




       





    }
   

}

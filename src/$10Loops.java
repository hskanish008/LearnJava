import java.util.*;
public class $10Loops {
    public static void main(String args[])
    {
/*
  A loop is a programming construct that repeats a block of code multiple times until a condition is met.
  Loops can execute a block of code as long as specified is true.
  Loops are handy because they save time, reduce error and they make code more readable.
  Loops are programming control flow structures that enable the repeated execution of a set of instructions until a specified condition is met.
  They are essential for automating repetitive tasks, enhancing code efficiency, and improving readability by preventing manual repetition.
   

*/  
         Scanner sc=new Scanner(System.in);
         System.out.print("Enter the total no to print = ");
         int loopNum=sc.nextInt();
        



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
 

    //  do 
    //  {
    //   System.out.println("The no is = "+loopNum);
    //   loopNum++;
    //  }
    //  while(loopNum<10);


//   To demonstrate a practical example of the while loop combined with an if else statement, let's say we play a game of Yatzy:
  
    // while(loopNum<=6)
    // {
    //     if(loopNum<6)
    //     {
    //         System.out.println("Not yatchy");
    //     }
    //     else
    //     {
    //         System.out.println("yatchy");
    //     }
    //     loopNum+=1;
    // }


//               ----For loop----
//               When you know exactly how many times you want to loop through a block of code, use the for loop instead of a while loop:
    
    /*
                 for (statement 1; statement 2; statement 3) 
                 {
                 // code block to be executed
                }

        Statement 1 is executed (one time) before the execution of the code block.
        Statement 2 defines the condition for executing the code block.
        Statement 3 is executed (every time) after the code block has been executed.
     */


        // for(int i=0;i<=loopNum;i++)
        // {
        //     System.out.println("The no is ="+i);
        // }
        

//               ----Break continue----
    //  for(int i=0;i<=loopNum;i++)
    //  {
    //   if(i==3)
    //     continue;
    //   if(i==loopNum)
    //   break;
    //   System.out.println(i);
    //  }

    
//             Even Numbers

    //   for(int i=0;i<=loopNum;i+=2)
    //   {
    //     System.out.println("The  even numbers are = "+i);
        
    //   }

//            Odd Numbers
      
    //   for(int i=1;i<=loopNum;i+=2)
    //   {
    //     System.out.println("The odd numbers are= "+i);
    //   }

//       This example calculates the sum of numbers from 1 to 5:
          
        //  for(int i=0;i<=loopNum;i++)
        //  {
        //      sum+=i;      
        //  }
        //  System.out.println("Sum = " + sum);


      
/*
            ----Nested Loops----
It is also possible to place a loop inside another loop. This is called a nested loop.
The "inner loop" will be executed one time for each iteration of the "outer loop":
 */
        //outer loop
    //    for(int i=1;i<=loopNum;i++)
    //    {
    //     System.out.println("Outer space ="+i);
         
    //     inner loop 
    //     for(int j=1;j<=5;j++)
    //     {
    //         System.out.println("  Inner space = "+j);
    //     }
    //    }

    // how to print a table 
    
    // for (int i=1;i<=10;i++)
    // {
    //     System.out.println(loopNum+" * "+ i +" = "+ (loopNum*i));
    // }

    // String[] cars= {"Astin Martin","Ferrari","Lamborgini","Bently","Porshe"};
    //      for(String car:cars)
    //      {  
    //         System.out.println(car);
    //      }

    //    int[] num= {1,2,3,4,5,6,7,8,9,10};
    //    for(int intNum : num)
    //    {
    //     System.out.println(intNum);
    //    }
      
//       -----Factorial-----
    // int factorial=1;
    // for(int i=1;i<=loopNum;i++)
    // {
    //     factorial*=i;
    // }
    // System.out.println("The factorial of this number = "+factorial);
    
    // int[] numbers={1,2,3,4,5,6,7};
    // for(int numb=1;numb<numbers.length;numb++)
    // {
    //     System.out.println("The numbers are :"+numbers[numb]);
    // }

/*
         ----Combining Break and Continue----

         You can also combine break and continue.
         This example skips printing 2 and stops the loop at 4:
*/
    // for(int i=1;i<=loopNum;i++)
    // {
    //     if(i==2)
    //     { 
    //         continue;   
    //     }
    //     if(i==10)
    //     {
    //        break;
    //     }
    //     System.out.println("The no is = "+i);
           

    // }


    // int[] numbers={5,6,-1,4,-7,2,1,0,3,8,9};
     
    // for(int numb : numbers)
    // {
    //     if(numb<0)

    //     {
    //         continue;
    //     }
    //     if(numb==0)
    //     {
    //         break;
    //     }
    //     System.out.println("The no are = "+numb);

    // }


    // int[] numbers={5,6,-1,4,-7,2,1,0,3,8,9};
    
    // for(int num=0;num<numbers.length;num++)
    // {
    //     if(numbers[num]<=0)
    //     {
    //         continue;
    //     }
        
    //     System.out.println("The no are : "+numbers[num]);
    // }
    

    

    


   








         

 





   
  
  
  





       





    }
   

}

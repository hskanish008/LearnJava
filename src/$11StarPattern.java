import java.util.*;
public class $11StarPattern {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the no to print : ");
        int starNum=sc.nextInt();

        //      ----First pattern
        //       * 
        //       * * 
        //       * * * 
        //       * * * * 
        //       * * * * * 
        // for(int row=1;row<=starNum;row++)
        // {
        //     for(int col=1;col<=row;col++)
        //     {
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }

/*
        ----Second Pattern----

* * * * * 
* * * * 
* * * 
* * 
*


 */


                //    int newNum=starNum;
                // for(int row=1;row<=starNum;row++)
                // {
                //     for(int col=starNum;col>=row;col--)
                //     {
                        
                //         System.out.print("* ");

                //     }
                    
                //     System.out.println();
                // }

                
                // ----Third Pattern----
/*
    *
   **
  ***
 ****
***** 
*/               

                for(int row=1;row<=starNum;row++)
                {
                    for(int col=starNum-1;col>=row;col--)
                    {
                        System.out.print(" ");
                    }
                    for(int pat=1;pat<=row;pat++)
                    {
                     System.out.print("*");

                    }
                    
                    System.out.println();
                }

    }

}

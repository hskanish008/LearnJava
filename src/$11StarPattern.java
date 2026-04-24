import java.util.*;
public class $11StarPattern {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the no to print : ");
        int starNum=sc.nextInt();

 /*
            ----First pattern



              * 
              * * 
              * * * 
              * * * * 
              * * * * * 

 */        

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

                
 /*                ----Third Pattern----


    *
   **
  ***
 ****
***** 


*/               

                // for(int row=1;row<=starNum;row++)
                // {
                //     for(int col=starNum-1;col>=row;col--)
                //     {
                //         System.out.print(" ");
                //     }
                //     for(int pat=1;pat<=row;pat++)
                //     {
                //      System.out.print("*");

                //     }
                    
                //     System.out.println();
                // }


/*              ----Fourth Pattern----


 ****
  ***
   **
    *

 */


                // for(int row=1;row<=starNum;row++)
                // {
                //     for(int col=2;col<=row;col++)
                //     {
                //         System.out.print(" ");
                //     }
                //     for(int pat=starNum;pat>=row;pat--)
                //     {
                //         System.out.print("*");
                //     }
                //     System.out.println();
                // }


/*              ----Fifth Pattern----
 
    * 
   * * 
  * * * 
 * * * * 
* * * * * 

     

*/        

                // for(int row=1;row<=starNum;row++)
                // {
                //     for(int col=row+1;col<=starNum;col++)
                //     {
                //         System.out.print(" ");
                //     }
                //     for(int pat=1;pat<=row;pat++)
                //     {
                //         System.out.print("* ");
                //     }
                //     System.out.println();
                // }
                
              

/*              ----Sixth Pattern----

      ****
      ****
      ****
      ****    

*/  
            //     for(int row=1;row<=starNum;row++)
            //   {
            //    for(int col=1;col<=starNum;col++)
            //    {
            //    System.out.print("*");
            //    }
            //    System.out.println();
            //   }



/*              ----Seven Pattern----

       1
       12
       123
       1234
       12345   

*/  
        // for(int row=1;row<=starNum;row++)
        // {
        //    for(int col=1;col<=row;col++)
        //    {
        //    System.out.print(col);
        //    }
        //    System.out.println();
        // }


/*              ----Eight Pattern----
 
  1
  22
  333
  4444
  55555 
          

*/
            // for(int row=1;row<=starNum;row++)
            // {
            //  for(int col=1;col<=row;col++)
            // {
            //  System.out.print(row);
            // }
            //  System.out.println();
            // }

/*              ----Nine Pattern----
  12345
  1234
  123
  12
  1 
               
           learn this will help in future no-row+1

*/
        
            //   for(int row=1;row<=starNum;row++)
            //    {
            //     for(int col=1;col<=starNum-row+1;col++)
            //      {
                    
            //       System.out.print(col); 
            //      }
                
            //     System.out.println();
            //    }



/*              ----Tenth Pattern----
  
    *
   ***
  *****
 *******
*********              
            
*/
            //  for(int row=1;row<=starNum;row++)
            // {
            //  for(int col=1;col<=starNum-row;col++)
            //  {
            //  System.out.print(" ");
            //  }
            //  for(int pat=1;pat<=2*row-1;pat++)
            //  {
            //     System.out.print("*");
            //  }
            //  System.out.println();
            // }



/*              ----Tenth Pattern----
  
    *
   ***
  *****
 *******
*********       

     differenet col method
            
*/
    //        for(int row=1;row<=starNum;row++)
    //  {
    //   for(int col=starNum;col>row;col--)
    //  {
    //   System.out.print(" ");
    //   }
    //   for(int pattern=1;pattern<=2*row-1;pattern++)
    //   {
    //     System.out.print("*");
    //   }
    //   System.out.println();
    //  }



/*              ----Eleven Pattern----
  
*********
 *******
  *****
   ***
    *     
    
*/ 
         
    //  for(int row=1;row<=starNum;row++)
    //  {
    //  for(int col=1;col<row;col++)
    //  {
    //  System.out.print(" ");
    //  }
     
    //  for(int pattern=1;pattern<=2*starNum-2*row+1;pattern++)
    //  {
    //   System.out.print("*");
    //  }
     
    //  System.out.println();
    //  }


         
/*              ----Twelve Pattern----
  
    *
   ***
  *****
 *******
*********
*********
 *******
  *****
   ***
    *      
*/ 
        //  ---  one method---
// for(int row=1;row<=starNum;row++)
// {
//     for(int col=row;col<starNum;col++)
//     {
//           System.out.print(" ");
//     }
//     for(int pattern=1;pattern<=2*row-1;pattern++)
//     {
//         System.out.print("*");
//     }
//     System.out.println();
// }
// for(int row=1;row<=starNum;row++)
// {
//     for(int col=1;col<row;col++)
//     {
//           System.out.print(" ");
//     }
//     for(int pattern=1;pattern<=2*starNum-2*row+1;pattern++)
//     {
//         System.out.print("*");
//     }
//     System.out.println();
// }


/*
                   

 */





    }

}

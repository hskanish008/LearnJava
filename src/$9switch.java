import java.util.*;
public class $9switch {
    public static void main(String args[])
    {
        Scanner sc=new Scanner (System.in);
        System.out.print("Enter the no to which day is today = ");
        int day=sc.nextInt();

//     Instead of writing many if..else statements, you can use the switch statement.
//     Think of it like ordering food in a restaurant: If you choose number 1, you get Pizza. If you choose 2, you get a Burger. If you choose 3, you get Pasta. Otherwise, you get nothing.
                     
/*  switch(expression) {
        case x:
        code block
        break;
        case y:
      code block
        break;
        default:
    code block 
*/

/*      ----The break Keyword-----
        When Java reaches a break keyword, it breaks out of the switch block.
        This will stop the execution of more code and case testing inside the block.
        When a match is found, and the job is done, it's time for a break. There is no need for more testing.
       

        ----The default keyword----
        The default keyword specifies some code to run if there is no case match 
 */

        switch(day)
        {
           case 1:
            System.out.println("Sunday");
            break;
           case 2:
            System.out.println("Monday");
            break;
            case 3:
            System.out.println("Tuesday");
            break;
            case 4:
            System.out.println("Wednesday");
            break;
            case 5:
            System.out.println("Thurday");
            break;
            case 6:
            System.out.println("Friday");
            break;
            case 7:
            System.out.println("Saturday");
            break;
            default:
            System.out.println("There are 7 days in a week");
        }

//       A customer wants to order Coffee.
//       The code in the editor is incomplete. Fix it by inserting the missing values so the program prints the correct order  

    
            int choice = 1;

    // 1 = Coffee
    // 2 = Tea

    switch (choice) {
      case 1:
        System.out.println("You ordered Coffee");
      break;

      case 2:
        System.out.println("You ordered Tea");
      break;
       default:
        System.out.println("Invalid choice");
    }


         
        
        
        
             
    }

}

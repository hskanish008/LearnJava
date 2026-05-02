public class $13Method {



/*
A method is a block of code which only runs when it is called.
You can pass data, known as parameters, into a method.
Methods are used to perform certain actions, and they are also known as functions.
Why use methods? To reuse code: define the code once, and use it many times.


Create a Method
A method must be declared within a class. It is defined with the name of the method, followed by parentheses (). Java provides some pre-defined methods, such as System.out.println(), but you can also create your own methods to perform certain actions:

 */
    // public static void helloHritik()
    // {
    //     System.out.println("Hii hritik");
    // }

    // private static void helloSandeep()
    // {
    //     System.out.println("Hii Sandeep");
    // }

    // public static void main(String args[])
    //     {
    //         helloHritik();
    //         helloSandeep();
    //     }



/*
Java Method Parameters

Parameters and Arguments
Information can be passed to methods as a parameter. Parameters act as variables inside the method.

Parameters are specified after the method name, inside the parentheses. You can add as many parameters as you want, just separate them with a comma.

The following example has a method that takes a String called fname as parameter. When the method is called, we pass along a first name, which is used inside the method to print the full name:


Multiple Parameters
 */
    //   static void myMethod(String fname,int age)
    // {
    //     System.out.println(fname +" Sharma and My age is :"+age);
    // }
    // public static void main(String[] args) {
    //     myMethod("Hritik",24);
    //     myMethod("Sachin",29);
    //     myMethod("Avinash",39);
        
    // }


// Check age through methods

// static void checkAge(int age)
//    {
//        if(age<18)
//        {
//            System.out.println("Access denied the person is not eligible");
//            System.out.println("Minimum Age required is Eighteen and your age is :"+age);
//        }
//        else
//        {
//            System.out.println("Access Granted , You are eligible for vote");
//        }
       
    
//    }
//     public static void main(String args[])
//      {
//          checkAge(17);
//          checkAge(19);
//          checkAge(18);
         
//      }


//  How to use Return

// static int myMethod(int x)
// {
//     return 6+x;
// }

// public static void main(String args[])
// {
//     System.out.println(myMethod(7));
// }



// static int myMethod(int x,int y)
// {
//     return x+y;
// }

// public static void main(String args[])
// {
//     int z=myMethod(4,5);
//     System.out.println(z);
// }


/*
Here is a simple and fun "game example" using a method that returns a value, to show the double of the numbers 1 through 5 (using a for loop):

 */


    //     static int myDouble(int x)
    // {
    //     return x*2;
    // }
    // public static void main(String args[])
    // {
    //     for(int i=1;i<=5;i++)
    //     {
    //         System.out.println("Double of "+i +" is "+myDouble(i));
    //     }
    // }


/*
   ----Java Method Overloading----

Method Overloading
With method overloading multiple methods can have the same name with d/f parameters:
int myMethod(int x)
float myMethod(float x)
double myMethod(double x, double y)

*/


static int myMethod(int x, int y)
   {
       return x+y;
   }
   static double myMethod(double x,double y)
   {
       return x+y;
   }
   
   public static void main(String args[])
   {
       int mynum1=myMethod(67,43);
       double mynum2=myMethod(56.78,45.67);
       
       System.out.println("Int : "+mynum1);
       System.out.println("double : "+mynum2);
   }

 








    
}

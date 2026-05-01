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
      static void myMethod(String fname,int age)
    {
        System.out.println(fname +" Sharma and My age is :"+age);
    }
    public static void main(String[] args) {
        myMethod("Hritik",24);
        myMethod("Sachin",29);
        myMethod("Avinash",39);
        
    }

    
}

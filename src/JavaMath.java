public class JavaMath {
    public static void main(String args[])
    {
//        The Math.max(x,y) method can be used to find the highest value of x and y
        System.out.println(Math.max(5,10));

//       The Math.min(x,y) method can be used to find the lowest value of x and y
        System.out.println(Math.min(5,10));

//        The Math.sqrt(x) method returns the square root of x
        System.out.println(Math.sqrt(144));

//        The Math.abs(x) method returns the absolute(positive value of x)
        System.out.println(Math.abs(-89.88));

//        The Math.pow(x,y) method returns the value x raised to the power of y
//        this method always returns a double, even if the result is a whole number
        System.out.println(Math.pow(2,4));

//        ----Rounding Methods----
//        java has several methods for rounding numbers
//        Math.round(x)-rounds to the nearest integer
//        Math.ceil(x)-returns up (returns the smallest integer greater than or equal to x)
//        Math.floor(x)-rounds down(returns the largest integer less than or equal to x)

        System.out.println(Math.round(5.6));
        System.out.println(Math.ceil(4.1));
        System.out.println(Math.floor(5.8));

//        ----Random Numbers----
//        Math.random() returns a random number between 0.0(inclusive) and 1.0 (exclusive)
        System.out.println(Math.random());

//        Note: Math.random() returns a double. To get an integer, you need to cast it with (int).
        int randomNum=(int)(Math.random()*101);
        System.out.println(randomNum);
    }
}

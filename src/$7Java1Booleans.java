public class $7Java1Booleans {
    public static void main(String args[])
    {
//        A boolean type is declared with the boolean keyword and can only take the values true or false:
        boolean isJavaFun=true;
        boolean isJavaBoring=false;

        System.out.println(isJavaFun);
        System.out.println(isJavaBoring);

        int x=10;
        int y=9;
        System.out.println(x>y);
        System.out.println(x==y);

        boolean isGreater=x>y;
        System.out.println(isGreater);


//        Let's use booleans in a real-life example where we want to find out if a person is old enough to vote.

        int validAge=18;
        int myAge=14;
        System.out.println(myAge<=validAge);

    }

}

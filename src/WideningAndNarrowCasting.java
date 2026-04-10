public class WideningAndNarrowCasting {
    public static void main(String args[])
    {
        //Widening casting
        int myint=456;
        double mydouble=myint;

        System.out.println(myint);
        System.out.println(mydouble);

        //Narrowing Casting
        double mYdouble=567.77d;
        int mYint=(int) mYdouble;

        System.out.println(mYdouble);
        System.out.println(mYint);

        int maxscore=500;
        int userscore=423;
        double percentage=(double) userscore/maxscore*100.00d;
        System.out.println(percentage);
    }
}

public class $12Arrays {
    public static void main(String[] args)
    {
        String[] cars={"Mercedes","Bmw","Lamborgini","Bentely"};

    //  How to print with one element in a simple way.
        System.out.println(cars[0]);
        System.out.println("The total cars in string method are :");
    
    //  How to print all elements in a array with string way.
        for(String car: cars)
        {
            System.out.println(car);
        }
    
    // how to print string with a integer way.

        for(int num=0;num<4;num++)
        {
            System.out.println("The total no of elements with a number way :"+cars[num]);
        }

    }

}

public class $12Arrays {
    public static void main(String[] args)
    {


/*

                       Java Arrays
Arrays are used to store multiple values in a single variable, instead of declaring separate variables for each value.

To declare an array, define the variable type with square brackets [ ] :

We have now declared a variable that holds an array of strings. To insert values to it, you can place the values in a comma-separated list, inside curly braces { }:

Access the Elements of an Array
You can access an array element by referring to the index number.

This statement accesses the value of the first element in cars:

Array indexes start with 0: [0] is the first element. [1] is the second element, etc.

Think of an array as numbered boxes, where each box stores an element:

Index	Element
0	    Volvo
1	    BMW
2	    Ford
3	    Mazda

Change an Array Element
To change the value of a specific element, refer to the index number:

cars[0] = "Opel";

Array Length
To find out how many elements an array has, use the length property:

Example
String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
System.out.println(cars.length);
// Outputs 4


The new Keyword
You can also create an array by specifying its size with new. This makes an empty array with space for a fixed number of elements, which you can fill later:

Example
String[] cars = new String[4]; // size is 4

cars[0] = "Volvo";
cars[1] = "BMW";
cars[2] = "Ford";
cars[3] = "Mazda";

System.out.println(cars[0]); // Outputs Volvo


However, if you already know the values, you don't need to write new. Both of these create the same array:

Example
// With new
String[] cars = new String[] {"Volvo", "BMW", "Ford", "Mazda"};

// Shortcut (most common)
String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};



Note: You cannot write new String[4] {"Volvo", "BMW", "Ford", "Mazda"}.

In Java, when using new, you either:

Use new String[4] to create an empty array with 4 slots, and then fill them later
Or use new String[] {"Volvo", "BMW", "Ford", "Mazda"} (without specifying the number of elements) to create the array and assign values at the same time
Tip: The shortcut syntax is most often used when the values are known at the start. Use new with a size when you want to create an empty array and fill it later.



*/



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

/*

Loop Through an Array
You can loop through the array elements with the for loop, and use the length property to specify how many times the loop should run.

This example creates an array of strings and then uses a for loop to print each element, one by one:

 */
              
         

        for(int num=0;num<cars.length;num++)
        {
            System.out.println("The total no of elements with a number way :"+cars[num]);
        }



// Here is a similar example with numbers. We create an array of integers and use a for loop to print each value:


     int[] numbers={10,20,30,40,50};
    
    for(int n1=0;n1<numbers.length;n1++)
    {
        System.out.println(numbers[n1]);
    }
    

/*
                    Calculate the Sum of Elements
Now that you know how to work with arrays and loops, let's use them together to calculate the sum of all elements in an array:
 */

         int[] arrSum={1,2,3,4,5,6,7,8,9,10};
    int sum=0;
    
    for(int arrNum=0;arrNum<arrSum.length;arrNum++)
    {
        sum+=arrSum[arrNum];
        
    }
    System.out.println("The sum of all array elements are = "+sum);



/*

Loop Through an Array with For-Each
There is also a "for-each" loop, which is used exclusively to loop through elements in an array (or other data structures):

Syntax
for (type variable : arrayname) 
{
  // code block to be executed
}
The colon (:) is read as "in". So you can read the loop as: "for each variable in array".

The following example uses a for-each loop to print all elements in the cars array:


 */


    //    String[] carrs = {"Volvo", "BMW", "Ford", "Mazda"};

    //    for (String car : carrs)
    //     {
    //       System.out.println(car);
    //     }


//     int[] num={1,2,3,4,5,6,7,8,9,10};
//    for(int n : num)
//    {
//        System.out.println(n);
//    }



/*
    This means: for each String in the cars array (here called car), print its value.

Compared to a regular for loop, the for-each loop is easier to write and read because it does not need a counter (like i < cars.length). However, it only gives you the values, not their positions (indexes) in the array.

So, if you need both the position (index) of each element and its value, a regular for loop is the right choice. For example, when printing seat numbers in a theater row, you need to show both the seat number (the index) and who is sitting there (the value):
 */

            //  String[] seats={"Hritik","Naveen","Aman","Sandeep","Rajan"};
            //  for(int seat=0;seat<seats.length;seat++)
            // {
            //   System.out.println(" The seat no is "+ seat +".The name of the person is :"+seats[seat]);
            // }





//    To demonstrate a practical example of using arrays, let's create a program that calculates the average of different ages:


    int[] numbers1={10,20,30,40,50,60};
        float sum1=0,avg;
        int num1=numbers1.length;
        
        for(int i=0;i<numbers1.length;i++)
        {
            sum1+=numbers1[i];
        }
        avg=sum1/num1;
        System.out.println("The average of total string is = "+avg);


//    And in this example, we create a program that finds the lowest age among different ages:


    //     int ages[] = {20,22,35,48,36,87,19,70};
     
    //  int length=ages.length;
     
    //  int lowestAge=ages[0];
     
    //  for(int i=0;i<length;i++)
    //  {
    //      if(lowestAge>ages[i])
    //      {
    //         lowestAge=ages[i];
    //      }
    //      else
    //      {
    //         continue;
    //      }
    //  }
        
    //     System.out.println("The lowest age is = "+lowestAge);  
    
    



//      Create a program with a list of numbers where you want to skip negative values, but stop completely if you find a zero:

    //  int[] numbers2={3,-1,7,4,0,9};
    // int length=numbers2.length;
    
    //   for( int i=0;i<length;i++)
    // {
    //     if(numbers2[i]<0)
    //     {
    //         continue;
    //     }
    //     if(numbers2[i]==0)
    //     {
    //          break;
    //     }
       
    //   System.out.println(numbers2[i]);  
    // }


//    Create a program that keeps track of the highest and lowest values in an array:

    int[] numbers3={98,45,12,33,27};
    
    int length=numbers3.length;
    
    int max=numbers3[0];
    int min=numbers3[0];
    
    
    for(int i=0;i<length;i++)
    {
        if(numbers3[i]>max)
        {
            max=numbers3[i];
            
        }
        
        if(numbers3[i]<min)
        {
            min=numbers3[i];
            
        }
       
        
    }
    System.out.println("The maximum value is ="+max);
    System.out.println("The minimum value is ="+min);


/*
          ----Java Multi-Dimensional Arrays----
    
          Multidimensional Arrays
A multidimensional array is an array that contains other arrays.

You can use it to store data in a table with rows and columns.

To create a two-dimensional array, write each row inside its own curly braces:

int[][] myNumbers = { {1, 4, 2}, {3, 6, 8} };
Here, myNumbers has two arrays (two rows):

First row:  {1, 4, 2}
Second row: {3, 6, 8}
Think of it like this:



Access Elements
To access an element of a two-dimensional array, you need two indexes: the first for the row, and the second for the column.

Remember: Array indexes start at 0. That means row 0 is the first row, and column 0 is the first column. (So row index 1 is the second row, and column index 2 is the third column.)

This statement accesses the element in the second row (index 1) and third column (index 2) of the myNumbers array:
    

 */

   int[][] numbers4={{1,4,2},{3,6,8}};
   System.out.println(numbers4[1][2]);
    

/*

Change Element Values
You can overwrite an existing element using the same two-index notation (row, then column):
 */

int[][] myNumbers = { {1, 4, 2}, {3, 6, 8} };
myNumbers[1][2] = 9;
System.out.println(myNumbers[1][2]); 

/*

Rows and Columns (Lengths)
You can use length to get the number of rows, and myNumbers[row].length for the number of columns in a given row:
 */

int[][] numbers5={{1,3,4,5,6},{1,5,6,7,8,9,8}};
 
// System.out.println("Rows :"+numbers5.length);
// System.out.println("Cols in row 0 has :"+numbers5[0].length);
// System.out.println("Cols in row 1 has :"+numbers5[1].length);

// for(int row=0;row<numbers5.length;row++)
// {
//     for(int col=0;col<numbers5[row].length;col++)
//     {
//         System.out.println(numbers5[row][col]);
//     }
// }

int[][] myNumbers6 = { {1, 4, 2}, {3, 6, 8, 5, 2} };

for (int[] row : myNumbers6) {
  for (int num : row) {
    System.out.println(num);
  }
}


      String[][] carrs={{"Mercedes","Bmw","Range Rover"},{"Suzuki","skoda","Tata"}};
     for(String row[] : carrs)
     {
      for(String car : row)  
      {
     System.out.println(car);    
      }
     }



    




    }

}

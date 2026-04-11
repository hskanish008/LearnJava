public class JavaStrings {
    public static void main(String args[])
    {
//   ---How to use strings Methods---

        String greeting="Hritik sharma";
        System.out.println(greeting.toUpperCase()); //toUpperCase() method converts a string to upper case letters
        System.out.println(greeting.toLowerCase()); //toLowerCase() method converts a string to lower case letters

//      ---Java counts position from 0---
        String stringIndex="Hii guys i am learning   java and now i am using index method to understanding strings methods ";
        System.out.println(stringIndex.indexOf("java"));


//    ---You can use the charAt() method to access a character at a specific position in a string

        String StringChar="Hritik sharma";
        System.out.println(StringChar.charAt(8));

//        ---Comparing Strings---     To compare two strings you can use the equals() method :

        String txt1="Hritik sharma";
        String txt2="Hritik sharma";
        String txt3="Are they equal";
        String txt4="if you use upppercase or lowercase letters then they are not equal";
        System.out.println(txt1.equals(txt2));
        System.out.println(txt3.equals(txt4));

//        ----Removing Whitespace---- The trim() method removes whitespace from the beginning and the end of a string

        String RemoveWhitespace="     Hritik sharma    ";
        System.out.println("Before: ["+RemoveWhitespace+"]");
        System.out.println("After : ["+RemoveWhitespace.trim()+"]");

//        -----String Concatenation---- The + operator can be used between strings to combine them.This is called concatenation
        String firstName="Hritik";
        String lastName="Sharma";
        System.out.println(firstName+" "+lastName);

        String name="Hritik";
        int age=25;
        System.out.println("Hello guys my name is "+name+" and i am "+age+" years old");

//        ----you can use concat() method to concatenate string----
        String concat1="Hare";
        String concat2=" Krishna";
        System.out.println(concat1.concat(concat2));

    }
}

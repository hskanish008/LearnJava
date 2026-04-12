public class JavaStrings {
    public static void main(String args[])
    {
//   ---How to use strings Methods---

        String greeting="Hritik sharma";
        System.out.println(greeting.length());
        System.out.println(greeting.toUpperCase()); //toUpperCase() method converts a string to upper case letters
        System.out.println(greeting.toLowerCase()); //toLowerCase() method converts a string to lower case letters

//      ---index() method , Java counts position from 0---
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

//        If you add two numbers ,the result will be number
        int x=10;
        int y=20;
        System.out.println(x+y);

//        If you add two strings,the result will be a string concatenation
        String string1="Hare krishna";
        String string2=" Hare Rama";
        System.out.println(string1+string2);

//        If you add a number to a string the result will be string concatenation
        String string3="Hare Krishna ";
        int favouriteNumber=21;
        System.out.println(string3+favouriteNumber);


//         ----String special Characters-----
//        Because strings must be written within quotes, Java will misunderstand this string, and generate an error
//        String txt = "We are the so-called "Vikings" from the north.";
//        The solution is to avoid this problem, to use the backslash escape character
//        The backslash (\) escape character turns special characters into string characters:
        String txt = "We are the so called \"Vikings\" from the north.";
            System.out.println(txt);


        String singleComma="It\'s alright";
        System.out.println(singleComma);

//        \n	New Line
//        \t	Tab
//        \b	Backspace
//        \r	Carriage Return
//        \f	Form Feed

        String specialCharacter="Hey guys \nmy name is cha muh hi \tand i am telling my \bstory about how this situation works with different people";
        System.out.println(specialCharacter);





    }
}

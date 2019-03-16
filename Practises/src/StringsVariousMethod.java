public class StringsVariousMethod {
    public static void main(String[] args) {
        String name1 = "Kamrul";
        String name2 = "Hasan";

        System.out.println("Strings length is: " + name1.length()); //to view string length
        System.out.println("Strings length is: " + name2.length()); //to view string length

        if (name1.equals(name2)) {
            System.out.println("Equals");
        }                                       //to verify is Two strings are equal or not?
        else {
            System.out.println("Not Equals");
        }

        if (name1.equalsIgnoreCase(name2)) {
            if (name1.equals(name2)) {
                System.out.println("Equals");
            }                                       //to verify is Two strings are equal or not if case not depends?
            else {
                System.out.println("Not Equals");
            }
        }
        boolean x = name1.contains(name2);
        System.out.println("Contains or Not: "+x);//first String contins Second String or not??

        boolean y = name1.isEmpty();
        System.out.println("Empty or Not: "+y);

        String add = name1.concat(name2);
        System.out.println("After concating: "+ add);// Adding two String and make them one

        System.out.println(name1.toUpperCase());//To make all the character Uppercase

        System.out.println(name2.toLowerCase());//to make all the character LowerCase


        boolean q = name1.startsWith("kam");//verify starting characters
        System.out.println("Ends with that string is: "+q);//verify ending Characters

    }
}

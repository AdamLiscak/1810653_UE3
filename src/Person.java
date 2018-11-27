public class Person {
    static String name= "Graf";
    static String alter="666";
    public static void main(String[]args)
    {

        printPerson(name , alter);

    }
    public static void printPerson( String name, String alter)
    {

        System.out.println(alter+" jahre   "+name);

    }
}

public class Rechnen
{
static int a=3;
static int b=7;
static double x= 3.123;
static double y= 7.123;
    public static void main (String[]args)
    {
add(a, b);
add(x,y);
    }
    static void add(int a, int b)
    {
        System.out.println(a+b);
    }
    static void add(double a, double b)
    {
        System.out.println(a+b);
    }
}

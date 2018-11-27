public class vehicle
{
    static int doors=4;
    static int ps;
    static String color;

    public static void main(String[]args)
    {
        Dooranzahl(doors);
        System.out.println(color);
    }
    static void Dooranzahl(int doors)
    {
        System.out.println("Dieses Fahrzeug hat "+doors+" türe.");
    }
    public void setColor()
    {
        color="red";

    }
}

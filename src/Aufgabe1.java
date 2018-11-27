import javax.swing.*;

public class Aufgabe1
{
    public static void main(String[]args)
    {
        String k=JOptionPane.showInputDialog("Gib String ein !");
        String Ausgabe="0";
        int alter=20;
        switch (k)
        {
            case "20": Ausgabe=String.valueOf(20*alter);
            break;
            case "Peter Pan": Ausgabe="Bangarang";
            break;
            default: Ausgabe=" "; System.err.println("error");
            break;
        }
        System.out.println(Ausgabe);




    }
}

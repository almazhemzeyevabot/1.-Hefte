import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double tarih, kimya, fizik, ortalama;
        System.out.print("kimya dersinin notu: ");
        kimya=scan.nextDouble();
        System.out.print("tarih dersinin notu: ");
        tarih=scan.nextDouble();
        System.out.print("fizik dersinin notu: ");
        fizik=scan.nextDouble();
        ortalama=(tarih+fizik+kimya)/3;
        System.out.println("notlarin ortlamasi: "+ ortalama);

        String netice=(ortalama>=60)? "kecdi" : "qaldi" ;
        System.out.println( "telebe " + netice + " sinifde");
        


    }
}

import java.util.Scanner;

public class Not {
    public static void main(String[] args) {
        Scanner not = new Scanner(System.in);
        System.out.print("Lütfen matematik notunuzu giriniz: ");
        int Matematik = not.nextInt();
        System.out.print("Lütfen fizik notunuzu giriniz: ");
        int Fizik = not.nextInt();
        System.out.print("Lütfen kimya notunuzu giriniz: ");
        int Kimya = not.nextInt();
        System.out.print("Lütfen turkce notunuzu giriniz: ");
        int Turkce = not.nextInt();
        System.out.print("Lütfen tarih notunuzu giriniz: ");
        int Tarih = not.nextInt();
        System.out.print("Lütfen muzik notunuzu giriniz: ");
        int Muzik = not.nextInt();
        int toplam = (Matematik + Fizik + Kimya + Turkce + Tarih + Muzik) / 6;
        boolean kosul = toplam > 60;
        String str = kosul ? "Sınıfı Geçti." : "Sınıfta Kaldı.";
        System.out.println("Donem ortalamasi: " + toplam + "\n" + str);
    }
}
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double mesafe, yas, SonSonFiyat,tutar, indirim, indirimliTutar, BiletFiyati, SonFiyat;
        int yolculukTipi;

        System.out.println("Mesafeyi Giriniz: ");
        mesafe = input.nextDouble();
        if(mesafe<0){
            System.out.println("Hatali Bir Mesafe Girdiniz: ");
        }

        System.out.println("Yaşınızı Giriniz: ");
        yas = input.nextDouble();

        System.out.println("Yolculuk Tipini Giriniz(Gidis ise 1 - Gidis Donus ise 2):  ");
        yolculukTipi = input.nextInt();

        tutar = mesafe * 0.10;

        if(yas<12){
            indirim = tutar/2;
            indirimliTutar = indirim;

        }
        else if(yas>12 && yas<24){
            indirim = tutar * 0.10;
            indirimliTutar = tutar - indirim;

        }
        else if(yas>65){
            indirim = tutar * 0.30;
            indirimliTutar = tutar - indirim;

        }
        else{
            indirimliTutar = mesafe * 0.10;

        }

        switch (yolculukTipi){

            case 1:

                BiletFiyati = indirimliTutar;

                System.out.println("Bilet Tutari = " + BiletFiyati);
                break;

            case 2:
                BiletFiyati = indirimliTutar * 0.2;
                SonFiyat = indirimliTutar - BiletFiyati;
                SonSonFiyat = SonFiyat*2;
                System.out.println("Bilet tutari =" + SonSonFiyat);

        }

    }
}
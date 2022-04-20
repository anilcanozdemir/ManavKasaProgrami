import java.util.Scanner;

/**
 * @author ANIL CAN ÖZDEMİR
 *Manav Kasa Programı
 * Java ile kullanıcıların manavdan almış oldukları ürünlerin kilogram değerlerine göre toplam tutarını ekrana yazdıran programı yazın.
 *
 * Meyveler ve KG Fiyatları
 *
 * Armut : 2,14 TL
 * Elma : 3,67 TL
 * Domates : 1,11 TL
 * Muz: 0,95 TL
 * Patlıcan : 5,00 TL
 */
public class ManavKasaProgrami {
    public static void main(String[] args) {

        Scanner input =new Scanner(System.in);

        System.out.print("Armut Kac Kilo? : ");
        double armut=input.nextDouble();
        System.out.print("Elma Kac Kilo? : ");
        double elma=input.nextDouble();
        System.out.print("Domates Kac Kilo? : ");
        double domates=input.nextDouble();
        System.out.print("Muz Kac Kilo? : ");
        double muz=input.nextDouble();
        System.out.print("Patlican Kac Kilo? : ");
        double patlican=input.nextDouble();

        System.out.println("Toplam Tutar: "+ (armut*2.14+elma*3.67+domates*1.11+muz*0.95+patlican*5.00) );


    }
}

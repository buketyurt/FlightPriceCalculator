package org.example;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        double NormalPrice , DiscountedPrice, AgeDiscount = 0 ,Total=0, TypeDiscount;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Mesafeyi km türünden giriniz : ");
        double Mesafe = scanner.nextDouble();

        if (Mesafe > 0) { //control the input is positive
            NormalPrice = Mesafe*0.10;  //calculate normal price
            //System.out.println(NormalPrice);
            System.out.println("Yaşınızı giriniz : ");
            double Age = scanner.nextDouble();
            if(Age > 0) { //control the input is positive
                if (Age < 12) {//check age and make appropriate discount for this person
                    AgeDiscount = NormalPrice * 0.5;
                } else if (24 > Age && Age >= 12) {
                    AgeDiscount = NormalPrice * 0.1;
                } else if (Age > 65) {
                    AgeDiscount = NormalPrice * 0.3;
                }
                //System.out.println(AgeDiscount);
                DiscountedPrice = NormalPrice -AgeDiscount;
                //System.out.println(DiscountedPrice);
                System.out.println("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ): ");
                int TripType = scanner.nextInt();
                    if(TripType>0){ //control the input is positive
                        if(TripType == 1){ //check trip type and make appropriate calculation fo ticket
                            Total= DiscountedPrice;
                            System.out.println("Toplam Tutar : " + Total);
                        }
                        else if(TripType == 2){
                            TypeDiscount= DiscountedPrice*0.2;
                            Total = (DiscountedPrice -TypeDiscount)*2;
                            System.out.println("Toplam Tutar : " + Total);
                        }
                    }else{
                        System.out.println("Hatalı Veri Girdiniz !");
                    }
            }

            else{
                System.out.println("Hatalı Veri Girdiniz !");
            }

        }else{
            System.out.println("Hatalı Veri Girdiniz !");
        }
    }
}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package shapes;

/**
 *
 * @author AFIFA SALSABILA
 */
public class Shapes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("======================================");
        System.out.println("PROGRAM MENGHITUNG VOLUME BANGUN RUANG");
        System.out.println("======================================");

        //BALOK
        System.out.println("");
        System.out.println("");
        System.out.println("=====");
        System.out.println("BALOK");
        System.out.println("=====");

        //Object 1 myBalok1
        Balok myBalok1 = new Balok(20,9,10);
        myBalok1.ComputeAndSetVolume();
        System.out.println("Balok 1 dengan panjang " +myBalok1.panjang+ " lebar " +myBalok1.lebar+ " dan tinggi " +myBalok1.tinggi+ " memiliki volume sebesar "+myBalok1.GetVolume());
        
        //Object 1 myBalok2
        Balok myBalok2 = new Balok(25,12);
        myBalok2.ComputeAndSetVolume();
        System.out.println("Balok 2 dengan panjang " +myBalok2.panjang+ " lebar " +myBalok2.lebar+ " dan tinggi " +myBalok2.tinggi+ " memiliki volume sebesar "+myBalok2.GetVolume());
        
        //Object 1 myBalok3
        Balok myBalok3 = new Balok(4);
        myBalok3.ComputeAndSetVolume();
        System.out.println("Balok 3 dengan panjang " +myBalok3.panjang+ " lebar " +myBalok3.lebar+ " dan tinggi " +myBalok3.tinggi+ " memiliki volume sebesar "+myBalok3.GetVolume());
        
        //TABUNG
        System.out.println("");
        System.out.println("======");
        System.out.println("TABUNG");
        System.out.println("======");
        
        //Object 1 myTabung1
        Tabung myTabung1 = new Tabung(14,30);
        myTabung1.ComputeAndSetVolume();
        System.out.println("Tabung 1 dengan radius " +myTabung1.radius+ " dan tinggi " +myTabung1.tinggi+ " memiliki volume sebesar " +myTabung1.GetVolume());
    
        //Object 2 myTabung2
        Tabung myTabung2 = new Tabung(25);
        myTabung2.ComputeAndSetVolume();
        System.out.println("Tabung 2 dengan radius " +myTabung2.radius+ " dan tinggi " +myTabung2.tinggi+ " memiliki volume sebesar " +myTabung2.GetVolume());

        //LIMAS SEGI EMPAT
        System.out.println("");
        System.out.println("================");
        System.out.println("LIMAS SEGI EMPAT");
        System.out.println("================");
        
        //Object 1 myLimas1
        LimasSegiEmpat myLimas1 = new LimasSegiEmpat(7,18);
        myLimas1.ComputeAndSetVolume();
        System.out.println("Limas Segi Empat 1 dengan panjang sisi " +myLimas1.sisi+ " dan tinggi " +myLimas1.tinggi+ " memiliki volume sebesar " +myLimas1.GetVolume());
        
        //Object 2 myLimas2
        LimasSegiEmpat myLimas2 = new LimasSegiEmpat(29);
        myLimas2.ComputeAndSetVolume();
        System.out.println("Limas Segi Empat 2 dengan panjang sisi " +myLimas2.sisi+ " dan tinggi " +myLimas2.tinggi+ " memiliki volume sebesar " +myLimas2.GetVolume());

        //BOLA
        System.out.println("");
        System.out.println("====");
        System.out.println("BOLA");
        System.out.println("====");
        
        //Object 1 Bola
        Bola myBola1 = new Bola(23);
        myBola1.ComputeAndSetVolume();
        System.out.println("Bola 1 dengan radius " +myBola1.radius+ " memiliki volume sebesar " +myBola1.GetVolume());
    
        //Object 2 Bola
        Bola myBola2 = new Bola(6);
        myBola2.ComputeAndSetVolume();
        System.out.println("Bola 2 dengan radius " +myBola2.radius+ " memiliki volume sebesar " +myBola2.GetVolume());

    }
    
}

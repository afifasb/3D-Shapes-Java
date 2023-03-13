/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package shapes;

/**
 *
 * @author AFIFA SALSABILA
 */
public class Balok {
    //Attributes
    public int panjang, lebar, tinggi, volume;
    
    //Constructors
    public Balok(){
    }
    
    public Balok (int panjangBaru, int lebarBaru, int tinggiBaru){
        this.panjang = panjangBaru;
        this.lebar = lebarBaru;
        this.tinggi = tinggiBaru;
    }
    
    public Balok (int panjangBaru, int lebarBaru){
        this.panjang = panjangBaru;
        this.lebar = lebarBaru;
        this.tinggi = 5;
    }
    
    public Balok (int tinggiBaru){
        this.panjang = 18;
        this.lebar = 10;
        this.tinggi = tinggiBaru;
    }
    
    //Methods
    public void SetPanjang(int panjang){
        this.panjang = panjang;
    }
    
    public void SetTinggi(int tinggi){
        this.tinggi = tinggi;
    }
    
    public void SetLebar(int lebar){
        this.lebar = lebar;
    }
    
    public void ComputeAndSetVolume(){
        this.volume = this.panjang * this.lebar * this.tinggi;
    }
    
    public int GetVolume(){
        return volume;
    }
    
}

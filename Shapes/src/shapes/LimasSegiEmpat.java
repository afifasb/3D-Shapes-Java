/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package shapes;

/**
 *
 * @author AFIFA SALSABILA
 */
public class LimasSegiEmpat {
    //Attributes
    public int sisi, tinggi, volume;
    
    //Constructors
    public LimasSegiEmpat(){
    }
    
    public LimasSegiEmpat (int sisiBaru, int tinggiBaru){
        this.sisi = sisiBaru;
        this.tinggi = tinggiBaru;
    }
    
    public LimasSegiEmpat (int tinggiBaru){
        this.tinggi = tinggiBaru;
        this.sisi = 14;
    }
    
    //Methods
    public void SetSisi(int sisiBaru){
        this.sisi = sisiBaru;
    }
    
    public void SetTinggi(int tinggi){
        this.tinggi = tinggi;
    }
    
    public void ComputeAndSetVolume(){
        this.volume = (this.sisi * this.sisi * this.tinggi) / 3;
    }
    
    public int GetVolume(){
        return volume;
    }
    
}

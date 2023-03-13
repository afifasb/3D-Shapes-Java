/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package shapes;

/**
 *
 * @author AFIFA SALSABILA
 */
public class Tabung {
    //Attributes
    public int radius, tinggi;
    double volume;
    final double phi = 3.141592653589793;
    
    //Constructors
    public Tabung(){
    }
    
    public Tabung (int radiusBaru, int tinggiBaru){
        this.radius = radiusBaru;
        this.tinggi = tinggiBaru;
    }
    
    public Tabung (int radiusBaru){
        this.radius = radiusBaru;
        this.tinggi = 32;
    }
    
    //Methods
    public void SetRadius(int radius){
        this.radius = radius;
    }
    
    public void SetTinggi(int tinggi){
        this.tinggi = tinggi;
    }
    
    public void ComputeAndSetVolume(){
        this.volume = this.phi * this.radius * this.radius * this.tinggi;
    }
    
    public double GetVolume(){
        return volume;
    }
    
}

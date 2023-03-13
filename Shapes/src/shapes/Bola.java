/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package shapes;

/**
 *
 * @author AFIFA SALSABILA
 */
public class Bola {
    //Attributes
    public int radius;
    double volume;
    final double phi = 3.141592653589793;
    
    //Constructors
    public Bola(){
    }
    
    public Bola (int radiusBaru){
        this.radius = radiusBaru;
    }
    
    //Methods
    public void SetRadius(int radius){
        this.radius = radius;
    }
    
    public void ComputeAndSetVolume(){
        this.volume = this.radius * this.radius * this.radius * 4 / 3;
    }
    
    public double GetVolume(){
        return volume;
    }
    
}

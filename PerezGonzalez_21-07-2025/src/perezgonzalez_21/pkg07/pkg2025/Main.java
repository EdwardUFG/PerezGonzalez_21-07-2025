/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package perezgonzalez_21.pkg07.pkg2025;

/**
 *
 * @author UFG
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("50 grados centigrados a Fahrenheitt:"  + celcius_a_Fahrenheitt() + "F" );
        System.out.println("50 grados centigrados a kelvin:" + celcius_a_kelvin() + "k");
        System.out.println("50 grados centigrados a Rankine:" + celcius_a_rankine() + "R");
        System.out.println("30 grados Fahrenheitt a celcius :" + Fahrenheitt_a_celcius() + "C");
        System.out.println("30 grados Fahrenheitt a kelvin:" + Fahrenheitt_a_kelvin() + "k");
    }
    
   public static double celcius_a_Fahrenheitt(){
    double grados_centigrados = 50.0;
    return ((grados_centigrados * 9) / 5) +32;
   }
   public static double celcius_a_kelvin(){
       double grados_centigrados =50.0;
       return grados_centigrados +273.15;
   }
   public static double celcius_a_rankine(){
     double grados_centigrados = 50.0;
     return ((grados_centigrados * 9)/5) + 491.67;
}
   public static double Fahrenheitt_a_celcius(){
     double grados_Fahrenheitt = 30.0;
     return ((grados_Fahrenheitt -32) * 5) / 9 ;
}
    public static double Fahrenheitt_a_kelvin(){
     double grados_Fahrenheitt = 30.0;
     return (((grados_Fahrenheitt - 32) * 5)/9) + 273.15;
    }
}
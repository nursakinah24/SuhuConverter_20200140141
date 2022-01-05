/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ti.umy.java.praktikum.tiga.a;

/**
 *
 * @author Asus
 */
public class prosesData {
       //suhu di modify
    public Double getSuhuC(String inputsuhu)
    {
        Double nSuhu = Double.valueOf(inputsuhu);
        return nSuhu;
    }
    
    public Double getSuhuF(double nSuhu)
    {
        //celcius to fahrenheit
        Double Fahrenheit = nSuhu * 1.8 + 32;
        return Fahrenheit;
    }
    
    public Double getSuhuR(double nSuhu)
    {
        //celcius to reamur
        Double Reamur = nSuhu * 0.8;
        return Reamur;
    }
    
    public Double getSuhuK(double nSuhu)
    {
        //celcius to kelvin
        Double Kelvin = nSuhu + 273;
        return Kelvin;
    }
}

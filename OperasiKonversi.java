/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas_konversisuhu;

/**
 *
 * @author ACER
 */

public class OperasiKonversi { double Celcius;

    public OperasiKonversi(double Celcius) {
        this.Celcius = Celcius;
    }
    
    double ToFahrenheit(){
        return (Celcius*1.8+32);
    }
    double ToReamur(){
        return (Celcius*0.8);
    }
    double ToKelvin(){
        return (Celcius+273.15);
    }
    String kondisi(){
        if(Celcius <= 0){
            return "Beku";
        }
        else if(Celcius >= 100){
            return "Mendidih";
        }
        else{
            return "Normal";
        }
    }
    
}

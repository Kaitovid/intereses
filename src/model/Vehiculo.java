
package model;


public class Vehiculo extends Cartera {

   String tipoVehiculo;

    public Vehiculo(String tipoVehiculo, String idTitular, String nomTitular, String tipoCredito, int valorCredito) {
        super(idTitular, nomTitular, tipoCredito, valorCredito);
        this.tipoVehiculo = tipoVehiculo;
    }
    /*Los créditos de VEHICULO tipo automóvil o campero son todos hasta 7 años.
• Para los automóviles la tasa de los intereses a pagar depende del modelo del 
vehículo. A partir del modelo 2016 la tasa es de 0.9%, para los modelos 
anteriores la tasa es de 1.2%.
• Para los camperos la tasa depende del cilindraje, hasta 2.0 la tasa es de 1.5% 
y más de 2.0 es de 2.5%.
*/
     public double valorCuotaMes(int modelo){
       //apartamento
       if (modelo >= 2016){
           return (getValorCredito()*0.09);
       }else if(modelo < 2016){
            return (getValorCredito()*0.012);       
                   }

    return 0;   
   }
    public double valorCuotaMes(double cilindraje){
       //apartamento
       if (cilindraje <= 2.0){
           return (getValorCredito()*0.15);
       }else if(cilindraje > 2 ){
            return (getValorCredito()*0.025);       
                   }
    return 0;   
   }
    
}

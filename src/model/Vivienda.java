
package model;

public class Vivienda extends Cartera{

    String tipoVivienda;
    /* Para los apartamentos la tasa de los intereses a pagar depende de la edad del 
cliente o titular. Si el cliente tiene hasta 30 años la tasa de interés es de 1.2%, 
si la edad es de más de 30 años y hasta 50 años la tasa es de 1.5% y si la edad 
es superior a 50 años la tasa es de 1.8%.
• Para las casas la tasa depende del área, hasta 120.5 mts la tasa es 1.5% y más 
de 120.5 mts es de 2.0%.
    
   Los créditos de VIVIENDA tipo casa o apartamento son todos hasta 15 años
*/

    public Vivienda(String tipoVivienda, String idTitular, String nomTitular, String tipoCredito, int valorCredito) {
        super(idTitular, nomTitular, tipoCredito, valorCredito);
        this.tipoVivienda = tipoVivienda;
    }

  
    

   public double valorCuotaMes(int edad){
       //apartamento
       if (edad <= 30){
           return (getValorCredito()*0.012);
       }else if(edad > 30 && edad < 50){
            return (getValorCredito()*0.015);       
                   }
       else if(edad >= 50){
            return (getValorCredito()*0.018);
       }
    return 0;   
   }
    public double valorCuotaMes(double area){
       //apartamento
       if (area <= 120.5){
           return (getValorCredito()*0.15);
       }else if(area > 120.5 ){
            return (getValorCredito()*0.02);       
                   }
    return 0;   
   }
}

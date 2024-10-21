
package model;

import javax.swing.JLabel;


public class Cartera {
    private String idTitular;
    private String nomTitular;
    private String tipoCredito;
    private int valorCredito;

    public Cartera() {
        this.idTitular = "";
        this.nomTitular = "";
        this.tipoCredito = "";
        this.valorCredito = 0;
    }
   

    
    
    public Cartera(String idTitular, String nomTitular, String tipoCredito, int valorCredito) {
        this.idTitular = idTitular;
        this.nomTitular = nomTitular;
        this.tipoCredito = tipoCredito;
        this.valorCredito = valorCredito;
      
    }

    public String getIdTitular() {
        return idTitular;
    }

    public void setIdTitular(String idTitular) {
        this.idTitular = idTitular;
    }

    public String getNomTitular() {
        return nomTitular;
    }

    public void setNomTitular(String nomTitular) {
        this.nomTitular = nomTitular;
    }

    public String getTipoCredito() {
        return tipoCredito;
    }

    public void setTipoCredito(String tipoCredito) {
        this.tipoCredito = tipoCredito;
    }

    public int getValorCredito() {
        return valorCredito;
    }

    public void setValorCredito(int valorCredito) {
        this.valorCredito = valorCredito;
    }

    
    
   public void presentarCuota(JLabel lbltotal,JLabel lblcredito,double vlrintereses,JLabel lblcredito1,String tipoCredito){
        if(tipoCredito.equals("C")){
        lblcredito.setText(""+getValorCredito());
        lblcredito1.setText(""+vlrintereses);
        lbltotal.setText((""+(getValorCredito()+vlrintereses)*180));
   }else if(tipoCredito.equals("V")){
        lblcredito.setText(""+getValorCredito());
        lblcredito1.setText(""+vlrintereses);
        lbltotal.setText((""+(getValorCredito()+vlrintereses)*84));
   }
        
   
    
   }
   }

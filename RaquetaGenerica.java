import java.util.*;

/**
 * Abstract class Raqueta - write a description of the class here
 * 
 * @author: 
 * Date: 
 */
public class RaquetaGenerica implements IRaqueta
{
    private String modelo;
    private double peso;
    private double longitud;
    private double tamCabeza;
    private EnumEncordado encordado;
    private Map <String, String> potenciaMap;
    private Map <String, String> controlMap;
    private Map <String, String> velocidadMap;


    public RaquetaGenerica(String nomModelo, double nPeso, double nLongitud, double nTamCabeza, EnumEncordado nomEncordado)
    {
        modelo=nomModelo;
        peso=nPeso;
        longitud=nLongitud;
        tamCabeza=nTamCabeza;
        encordado=nomEncordado;
    }
    
    public void setModelo(String nomModelo){
        modelo=nomModelo;
    }
    
    public String getModelo(){
        return modelo;
    }
    
    public void setPeso(double nPeso){
        peso=nPeso;
    }
    
    public double getPeso(){
        return peso;
    }
    
    public void setLongitud(double nLongitud){
        longitud=nLongitud;
    }
    
    public double getLongitud(){
        return longitud;
    }
    
    public void setTamCabeza(double nTamCabeza){
        tamCabeza=nTamCabeza;
    }
    
    public double getTamCabeza(){
        return tamCabeza;
    }
    
    public void setEncordado(EnumEncordado nomEncordado){
        encordado=nomEncordado;
    }
    
    public EnumEncordado getEncordado(){
        return encordado;
    }
    
    public String tipoEncordado(){
        return getEncordado().getNombre();
    }
    
    public double calcularPotencia(){
        return Double.parseDouble(potenciaMap.get(String.valueOf(getLongitud())));
    }
    
    public double calcularControl(){
        return Double.parseDouble(controlMap.get(String.valueOf(getTamCabeza())));
    }
    
    public double calcularVelocidad(){
        return Double.parseDouble(velocidadMap.get(String.valueOf(getPeso())));
    }

    private void inicializarTabla(){
        potenciaMap=new HashMap <String,String>();
        potenciaMap.put("680", "2");
        potenciaMap.put("690", "4");
        potenciaMap.put("700", "6");
        potenciaMap.put("720", "8");
        potenciaMap.put("740", "10");
        
        controlMap=new HashMap <String,String>();
        controlMap.put("600", "10");
        controlMap.put("630", "8");
        controlMap.put("650", "6");
        controlMap.put("680", "4");
        controlMap.put("720", "2");
        
        velocidadMap=new HashMap <String,String>();
        velocidadMap.put("220","10");
        velocidadMap.put("260","8");
        velocidadMap.put("300","6");
        velocidadMap.put("320","4");
        velocidadMap.put("240","2");
    }
 
    @Override
    public String toString(){
        String datos= "";
        datos += "Mostrando Raqueta genérica";
        return datos;
    }
}

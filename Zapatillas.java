
/**
 * La clase Zapatillas representa a las zapatillas que calzan los distintos tenistas del campeonato
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Zapatillas implements IZapatillas{
    private String modelo;
    private double valor;
    private int numero;
    
    
    
    /**
     * Constructor for objects of class Zapatillas
     * @param modelo Modelo de las zapatillas
     * @param numero Numero de las zapatillas
     * @param tipo Tipo de las zapatillas
     * @param valor Valor de las zapatillas
     */
    public Zapatillas(String modelo, int numero, double valor){
        this.modelo= modelo;
        this.numero= numero;
        this.valor= valor;
    }
    
    /**
     * Establece el nombre del modelo de las zapatillas
     * @param modelo nombre que recibe el modelo de las zapatillas
     */
    public void setModelo(String modelo){
        this.modelo= modelo;
    }
    
    /**
     * Obtiene el nombre del modelo de las zapatillas
     * @return Nombre de las zapatillas
     */
    public String getModelo(){
        return this.modelo;
    }
    
    /**
     * Establece el numero de las zapatillas
     * @param modelo nombre que recibe el modelo de las zapatillas
     */
    public void setNumero(int numero){
        this.numero= numero;
    }
    
    /**
     * Obtiene el numero de las zapatillas
     * @return numero de las zapatillas
     */
    public int getNumero(){
        return this.numero;
    }
    
    /**
     * Establece el valor numérico de la zapatillas
     * @param valor de la zapatilla
     */
    public void setValor(double valor){
        this.valor= valor;
    }
    
    /**
     * Obtiene el valor de las zapatillas
     * @return valor de las zapatillas
     */
    public double getValor(){
        return this.valor;
    }
    
    /**
     * Obtiene el valor del saque dependiendo del tipo de zapatilla
     * @return valor del saque
     */
    
    public double calcularValorSaque(){
       return this.getValor()*1.2;
    }
    
    
       
    /**
     * Obtiene el valor del resto dependiendo del tipo de zapatilla
     * @return resto del saque
     */
    
    public double calcularValorResto(){
        return this.getValor()*1.3;
    }
    
   
    /**
     * Almacena en datos todas las caracteríticas de la zapatilla
     * @return las características de zapatilla en datos
     */
    @Override
    public String toString(){
        String datos= "";
        datos+= "Zapatillas [modelo="+ this.getModelo()+ ", numero="+ this.getNumero()+ ", tipo= ---"+
        ", valor="+ this.getValor()+ "]";
        return datos;
    }
    
    
}

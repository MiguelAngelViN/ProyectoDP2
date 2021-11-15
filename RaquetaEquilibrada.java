
/**
 * Write a description of class Equilibradas here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RaquetaEquilibrada extends RaquetaGenerica
{
   
    private double multiplicadorPotencia;
    private double multiplicadorControl;
    
    /**
     * Constructor for objects of class Equilibradas
     */
        public RaquetaEquilibrada(String modelo, double peso, double longitud, double tamCabeza, EnumEncordado encordado, double potencia, double control){
        super(modelo, peso, longitud, tamCabeza, encordado);
        this.multiplicadorPotencia= potencia;
        this.multiplicadorControl= control;
    }
    
    public double calcularPotencia(){
        return super.calcularPotencia()*multiplicadorPotencia;
    }
    
    public double calcularControl(){
        return super.calcularControl()* multiplicadorControl; 
    }

}


/**
 * Write a description of class Equilibradas here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Equilibradas extends RaquetaAbs
{
   
    private double multiplicadorPotencia;
    private double multiplicadorControl;
    
    /**
     * Constructor for objects of class Equilibradas
     */
        public Equilibradas(IRaqueta raqueta, double potencia, double control){
        super(raqueta, "Equlibrada");
        multiplicadorPotencia=potencia;
        multiplicadorControl=control;
    }
    
    public double calcularPotencia(){
        return this.calcularPotencia()*multiplicadorPotencia;
    }
    
    public double calcularControl(){
        return this.raqueta.calcularControl()* multiplicadorControl; 
    }

}


/**
 * Write a description of class Controladas here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Controladas extends RaquetaAbs
{
    
    /**
     * Constructor for objects of class Equilibradas
     */
        public Controladas(IRaqueta raqueta){
        super(raqueta, "Controladas");
    }
    
    public double calcularControl(){
        if(this.raqueta.tipoEncorado().equals("Abierto")){
            return this.raqueta.calcularControl() * this.raqueta.getEncorado().ABIERTO.getMultiplicadorControl();
        }else{
            return this.raqueta.calcularControl() * this.raqueta.getEncorado().CERRADO.getMultiplicadorControl();
        }
    }
    
    public double calcularVelocidad(){
        return this.raqueta.calcularVelocidad()* 1.2; 
    }

}

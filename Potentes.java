
/**
 * Write a description of class Potentes here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Potentes extends RaquetaAbs
{
    public Potentes(IRaqueta raqueta){
        super(raqueta, "Potente");
    }
    
    public double calcularPotencia(){
        return this.raqueta.calcularPotencia() * this.getEncorado();
    }
}

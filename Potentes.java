
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
        if(this.raqueta.tipoEncorado().equals("Abierto")){
            return this.raqueta.calcularPotencia() * this.raqueta.getEncorado().ABIERTO.getMultiplicadorPotencia();
        }else{
            return this.raqueta.calcularPotencia() * this.raqueta.getEncorado().CERRADO.getMultiplicadorPotencia();
        }
    }
    
    public double calcularVelocidad(){
        return this.raqueta.calcularVelocidad()* 1.5; 
    }
    
}

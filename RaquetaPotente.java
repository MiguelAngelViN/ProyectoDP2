
/**
 * Write a description of class Potentes here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RaquetaPotente extends RaquetaGenerica
{
    
    public RaquetaPotente(String modelo, double peso, double longitud, double tamCabeza, EnumEncordado encordado){
        super(modelo, peso, longitud, tamCabeza, encordado);
        
    }
    
    public double calcularPotencia(){
        if(super.tipoEncordado().equals("Abierto")){
            return super.calcularPotencia() * super.getEncordado().ABIERTO.getMultiplicadorPotencia();
        }else{
            return super.calcularPotencia() * super.getEncordado().CERRADO.getMultiplicadorPotencia();
        }
    }
    
    public double calcularVelocidad(){
        return super.calcularVelocidad()* 1.5; 
    }
    
}

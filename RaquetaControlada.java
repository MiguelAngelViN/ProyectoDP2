
/**
 * Write a description of class Controladas here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RaquetaControlada extends RaquetaGenerica
{
    
    /**
     * Constructor for objects of class Equilibradas
     */
    public RaquetaControlada(String modelo, double peso, double longitud, double tamCabeza, EnumEncordado encordado){
        super(modelo, peso, longitud, tamCabeza, encordado);
    }
    
    
    public double calcularControl(){
        if(super.tipoEncordado().equals("Abierto")){
            return super.calcularControl() * super.getEncordado().ABIERTO.getMultiplicadorControl();
        }else{
            return super.calcularControl() * super.getEncordado().CERRADO.getMultiplicadorControl();
        }
    }
    
    public double calcularVelocidad(){
        return super.calcularVelocidad()* 1.2; 
    }

}

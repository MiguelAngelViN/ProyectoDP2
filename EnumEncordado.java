
/**
 * Enumeration class EnumEncorado - write a description of the enum class here
 * 
 * @author (your name here)
 * @version (version number or date here)
 */
public enum EnumEncordado{
    ABIERTO("Abierto", 2.0, 2.2),
    CERRADO("Cerrado", 1.8, 2.5);
    
    private final String nombre;
    private final double multiplicadorPotencia;
    private final double multiplicadorControl;
    
    EnumEncordado(String nombre, double multiplicadorPotencia, double multiplicadorControl){
        this.nombre= nombre;
        this.multiplicadorPotencia= multiplicadorPotencia;
        this.multiplicadorControl= multiplicadorControl;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public double getMultiplicadorPotencia(){
        return multiplicadorPotencia;
    }
    
    public double getMultiplicadorControl(){
        return multiplicadorControl;
    }
}
    
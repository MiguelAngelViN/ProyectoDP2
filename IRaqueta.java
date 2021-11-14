
/**
 * Write a description of interface IRaqueta here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public interface IRaqueta{
    public String getModelo();
    public double getPeso();
    public double getLongitud();
    public double getTamCabeza();
    public EnumEncorado getEncorado();
    public String tipoEncorado();
    public double calcularPotencia();
    public double calcularControl();
    public double calcularVelocidad();
    public String toString();
}

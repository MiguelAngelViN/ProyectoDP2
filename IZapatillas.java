
/**
 * Write a description of interface IZapatillas here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public interface IZapatillas{
    public String getModelo();
    public int getNumero();
    public double getValor();
    public abstract double calcularValorSaque();
    public abstract double calcularValorResto();
    public String toString();
}

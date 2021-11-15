
/**
 * Write a description of class ZapatillasAmortiguadas here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ZapatillasAmortiguadas extends Zapatillas{
    public ZapatillasAmortiguadas(String tipo, int numero, double valor){
        super("Amortiguacion", numero, valor);
    }
    
    public double calcularValorSaque(){
        return super.calcularValorSaque()* 1.8;
    }
}

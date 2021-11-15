
/**
 * Write a description of class ZapatillasAmortiguadas here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ZapatillasAmortiguadas extends ZapatillasAbs{
    public ZapatillasAmortiguadas(IZapatillas zapatillas, int numero, double valor){
        super(zapatillas, "Amortiguacion", numero, valor);
    }
    
    public double calcularValorSaque(){
        return super.calcularValorSaque()* 1.8;
    }
}

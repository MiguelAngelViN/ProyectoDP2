
/**
 * Write a description of class ZapatillasAmortiguadas here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ZapatillasAmortiguadas extends ZapatillasAbs{
    public ZapatillasAmortiguadas(IZapatillas zapatillas){
        super(zapatillas, "Amortiguacion");
    }
    
    public double calcularValorSaque(){
        return super.calcularValorSaque()* 1.8;
    }
}

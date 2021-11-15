
/**
 * Write a description of class ZapatillasConAgarre here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ZapatillasConAgarre extends ZapatillasAbs{
    public ZapatillasConAgarre(IZapatillas zapatillas, int numero, int valor){
        super(zapatillas, "Agarre", numero, valor);       
    }
    
    public double calcularValorResto(){
        return super.calcularValorResto()* 1.7;
    }
}

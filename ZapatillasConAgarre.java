
/**
 * Write a description of class ZapatillasConAgarre here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ZapatillasConAgarre extends ZapatillasAbs{
   
    public ZapatillasConAgarre(IZapatillas zapatillas){
        super(zapatillas, "Agarre");
    }
    
    public double calcularValorResto(){
        return super.calcularValorResto()* 1.7;
    }
}

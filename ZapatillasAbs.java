/**
 * Abstract class ZapatillasAbs - write a description of the class here
 * 
 * @author: 
 * Date: 
 */
public abstract class ZapatillasAbs implements IZapatillas{
    protected IZapatillas zapatillas;
    protected String tipo;
    
    public ZapatillasAbs(IZapatillas zapatillas, String tipo){
        this.zapatillas= zapatillas;
        this.tipo= tipo;
    }
    
    public String getTipo(){
        return this.tipo;
    }
    
    public String getModelo(){
        return this.zapatillas.getModelo();
    }
    
    public int getNumero(){
        return this.zapatillas.getNumero();
    }
    
    public double getValor(){
        return this.zapatillas.getValor();
    }
    
    public double calcularValorResto(){
        return this.zapatillas.calcularValorResto();
    }
    
    public double calcularValorSaque(){
        return this.zapatillas.calcularValorSaque();
    }
    
    @Override
    public String toString(){
        String datos= "";
        datos+= "Zapatillas [modelo="+ this.getModelo()+ ", numero="+ this.getNumero()+ ", tipo="+ this.getTipo()+
        ", valor="+ this.getValor()+ "]";
        return datos;
    }
}

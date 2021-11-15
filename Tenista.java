import java.util.ArrayList;
import java.util.Iterator;

/**
 * La clase Tenista representa a los distintos tenistas que competirán en el campeonato.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Tenista{
    private String nombre;
    private IZapatillas zapatillas;
    private double saque;
    private double resto;
    private int ranking;
    private String pais;
    private double puntosAcumulados;
    private int posicionElim;
    private double numPie;
    private RaquetaGenerica raqueta;
    
    /**
     * Constructor de la clase tenista
     * @param nombre Nombre del tenista
     * @param zapatillas Son las zapatillas asiganadas al tenista
     * @param saque El valor de saque del tenista
     * @param resto El valor de resto del tenista
     * @param ranking El ranking del tenista
     * @param pais El pais del tenista
     */
    public Tenista(String nombre, IZapatillas zapatillas, double saque, double resto, int ranking,String pais, double numPie){
        this.nombre= nombre;
        this.zapatillas= zapatillas;
        this.saque= saque;
        this.resto= resto;
        this.ranking= ranking;
        this.pais= pais;
        this.puntosAcumulados= 0;
        this.posicionElim=0;
        this.numPie=numPie;
    }
    
    /**
     * Inserta un nombre al tenista
     * @param nombre Nombre a insertar
     */
    public void setNombre(String nombre){
        this.nombre= nombre;
    }
    
    /**
     * Devuelve el nombre del tenista
     * @return Nombre del tenista
     */
    public String getNombre(){
        return this.nombre;
    }
    
    /**
     * Establece las zapatillas del tenista
     * @param zapatillas Son las zapatillas que se le asignaran al tenista
     */
    public void setZapatillas(IZapatillas zapatillas){
        this.zapatillas= zapatillas;
    }
    
    /**
     * Devuelve las zapatillas del tenista
     * return Zapatillas del tenista
     */
    public IZapatillas getZapatillas(){
        return this.zapatillas;
    }
    
    /**
     * Establece el saque del tenista
     * @param saque El valor de saque se asignará al tenista
     */
    public void setSaque(double saque){
        this.saque= saque;
    }
    
    /**
     * Devuele el saque del tenista
     * @return Valor de saque
     */
    public double getSaque(){
        return this.saque;
    }
    
    /**
     * Establece el resto del tenista
     * @param resto El valor del resto que se asignará al tenista
     */
    public void setResto(double resto){
        this.resto= resto;
    }
    
    /**
     * Devuelve el resto del tenista
     * @return Valor de resto
     */
    public double getResto(){
        return this.resto;
    }
    
    /**
     * Establece el ranking del tenista
     * @param ranking Valor del ranking que tendrá el tenista
     */
    public void setRanking(int ranking){
        this.ranking= ranking;
    }
    
    /**
     * Devuelve el ranking del tenista 
     * @return Valor del ranking
     */
    public int getRanking(){
        return this.ranking;
    }
    
    /**
     * Establece el país del tenista
     * @param pais Nombre del pais del tenista
     */
    public void setPais(String pais){
        this.pais= pais;
    }
    
    /**
     * Devuelve el pais del tenista
     * @return Nombre del pais 
     */
    public String getPais(){
        return this.pais;
    }
    
    /**
     * Establece los puntos acumulados del tenista
     * @param puntosAcumulados El numero de puntos que se asignará al tenista
     */
    public void setPuntosAcumulados(double puntosAcumulados){
        this.puntosAcumulados= puntosAcumulados;
    }
    
    /**
     * Devuelve los puntos acumulados del tenista
     * @return Puntos acumulados
     */
    public double getPuntosAcumulados(){
        return this.puntosAcumulados;
    }
    
    /**
     * Establece la posicion en la que se elimina un tenista
     * @param posicion Valor de la posicion
     */
    public void setPosicionElim(int posicion){
        this.posicionElim=posicion;
    }
    
    /**
     * Devuelve la posiccion en la que se eliminó un tenista
     * @return Posicion de eliminacion 
     */
    public int getPosicionElim(){
        return posicionElim;
    }
    
    /**
     * Añade a los puntos del tenista el valor del saque por el valor del método calcularValorSaque 
     */
    public void calcularSaque(){
        this.setPuntosAcumulados(this.getPuntosAcumulados() + this.getSaque() * (this.getZapatillas().calcularValorSaque())); 
    }
    
    /**
     * Añade a los puntos del tenista el valor del método calcularValorResto por el resto siempre que esta operacion sea mayor
     * a la del saque por el método calcularValorSaque del oponente
     * @param tenista El oponente que previamente ha hecho un saque
     */
    public void calcularResto(Tenista tenista){
        if(this.getZapatillas().calcularValorResto() * this.getResto() > tenista.getZapatillas().calcularValorSaque() * tenista.getSaque()){
            this.setPuntosAcumulados(this.getPuntosAcumulados() + this.getResto()* this.getZapatillas().calcularValorResto());
        }
    }
    
    public void setNumPie(double numPie){
        this.numPie=numPie;
    }
    
    public double getNumPie(){
        return numPie;
    }
   
    public void setRaqueta(RaquetaGenerica raqueta){
        this.raqueta=raqueta;
    }
    
    public RaquetaGenerica getRaqueta(){
        return this.raqueta;
    }
    

    public void elegirZapatillas(ArrayList <IZapatillas> zapatillasCampeonato){
        boolean encontrado=false;
        Iterator <IZapatillas> it = zapatillasCampeonato.iterator();
        IZapatillas z1;
        while(!encontrado && it.hasNext()){
            z1=it.next();
            if(z1.getNumero()==this.getNumPie()){
                it.remove();
                this.zapatillas=z1;
                encontrado=true;
            }
        }
    }
    
    /**
     * El tenista inicia la acción de sacar y su oponente de la de restar
     * @param tenista El oponente con el que está jugando el tenista
     */
    public void jugar(Tenista tenista){
        this.calcularSaque();
        tenista.calcularResto(this);
    }
    
    /**
     * Almacena en datos todas las características del tenista
     * @return las características del tenista en datos
     */
    @Override
    public String toString(){
        String datos = "";
        datos += "Tenista [nombre=" + this.getNombre()+ ", saque=" + this.getSaque()+ ", resto=" + this.getResto()
        + ", ranking="+ this.getRanking()+ ", pais="+ this.getPais()+ "]";
        return datos;
    }
    
}

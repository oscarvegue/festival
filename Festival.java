
/**
 * Write a description of class Festival here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Festival
{
    // instance variables - replace the example below with your own
    private String nombreFestival;
    private int numeroCantantes;
    private Entrada entrada;
    /**
     * Constructor for objects of class Festival
     */
    public Festival(String nombreFest, int numeroCant, Entrada ticket)
    {
        nombreFestival = nombreFest;
        numeroCantantes = numeroCant;
        entrada = ticket;
    }

    public int getnumerocantantes(){
        return numeroCantantes;
    }

    public String getnombrefestival(){
        return nombreFestival;
    }

    public Entrada getTicket(){
        return entrada;    
    }

    public void setNumerocantantes(int numerocantantes){
        this.numeroCantantes = numerocantantes;
    }

    public void setNombrefestival(String nombrefestival){
        this.nombreFestival = nombrefestival;
    }

    public void setEntrada(Entrada entrada){
        this.entrada = entrada;
    }
    
    public String imprimirDetalles(){
        return ("El festival se llama" + nombreFestival + "Y tiene :" + numeroCantantes + "cantantes.");
    }
}

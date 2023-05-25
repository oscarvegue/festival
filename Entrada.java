
/**
 * Write a description of class Entrada here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Entrada
{
    // instance variables - replace the example below with your own
    private int precio;
    private int cantidad;
    /**
     * Constructor for objects of class Entrada
     */
    public Entrada(int pre, int cant)
    {
        // initialise instance variables
        precio = pre;
        cantidad = cant;
    }

    public int getPrecio(){
        return precio;
    }

    public int getCantidad(){
        return cantidad;
    }

    public void setPrecio(int precio){
        this.precio = precio;
    }

    public void setCantidad(int cantidad){
        this.cantidad = cantidad;
    }

    public String imprimirDetalles(){
        return ("El precio es :" + precio + "Y hay un numero de entradas de :" + cantidad);
    }
}
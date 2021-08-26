package Tarea6;

public class Sobrecarga {

    private String nombre;
    private String dpi;
    private int edad;


    public Sobrecarga(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public Sobrecarga(String dpi) {
        this.dpi = dpi;
    }

    public void leer (){

        System.out.println("Yo "+nombre+", leo el diario a mis "+edad+" años");
    }

    public void leer (int pgs){
        System.out.println("con "+pgs+" paginas");
    }
}

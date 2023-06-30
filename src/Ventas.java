public class Ventas extends Hortalizas{
    String nombre;
    int ventas;
    public Ventas(){
        super();
    }

    public Ventas(String nombre, String color, String paisOrigen, int anioDescubrimiento, String nombre1, int ventas) {
        super(nombre, color, paisOrigen, anioDescubrimiento);
        this.nombre = nombre1;
        this.ventas = ventas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getVentas() {
        return ventas;
    }

    public void setVentas(int ventas) {
        this.ventas = ventas;
    }

    public void impNombre(){
        System.out.println("El nombre es: "+this.nombre);
    }

    public void impVentas(){
        System.out.println("Las ventas de la plata fueron: "+this.ventas);
    }
}

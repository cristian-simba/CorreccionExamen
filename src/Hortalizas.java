public class Hortalizas extends Vegetales{
    int anioDescubrimiento;

    public Hortalizas(){
        super();
    }

    public Hortalizas(String nombre, String color, String paisOrigen, int anioDescubrimiento) {
        super(nombre, color, paisOrigen);
        this.anioDescubrimiento = anioDescubrimiento;
    }

    public int getAnioDescubrimiento() {
        return anioDescubrimiento;
    }

    public void setAnioDescubrimiento(int anioDescubrimiento) {
        this.anioDescubrimiento = anioDescubrimiento;
    }

    public void impAnio(){
        System.out.println("El año de descubrimiento es: "+this.anioDescubrimiento);
    }
}

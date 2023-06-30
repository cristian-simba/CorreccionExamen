public class Vegetales extends Plantas{
    String paisOrigen;

    public Vegetales(){
        super();
    }
    public Vegetales(String nombre, String color, String paisOrigen) {
        super(nombre, color);
        this.paisOrigen = paisOrigen;
    }

    public String getPaisOrigen() {
        return paisOrigen;
    }

    public void setPaisOrigen(String paisOrigen) {
        this.paisOrigen = paisOrigen;
    }

    public void impPais(){
        System.out.println("El país de origen es:" +this.paisOrigen);
    }
}

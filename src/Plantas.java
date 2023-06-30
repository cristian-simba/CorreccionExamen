public class Plantas {
    String tipo;
    String color;

    public Plantas(){

    }

    public Plantas(String tipo, String color) {
        this.tipo = tipo;
        this.color = color;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void impTipo(){
        System.out.println("El tipo de planta es: "+this.tipo);
    }
    public void impColor(){
        System.out.println("El color de la planta es: "+this.color);
    }

}

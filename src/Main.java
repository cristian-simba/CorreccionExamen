import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Ventas venta1 = new Ventas();
        ArrayList<Ventas> plantas = new ArrayList<Ventas>();

        for(int i = 0; i<=1 ; i++){
            Ventas planta = new Ventas();
            planta.setTipo("Terrestre");
            planta.setColor("Amarillo y verde");
            planta.setPaisOrigen("España");
            planta.setAnioDescubrimiento(1990);
            planta.setNombre("Girasol");
            planta.setVentas(254894463);
            plantas.add(planta);
        }

        for(Ventas planta:plantas){
            planta.impTipo();
            planta.impColor();
            planta.impPais();
            planta.impAnio();
            planta.impNombre();
            planta.impVentas();
        }

    }
}

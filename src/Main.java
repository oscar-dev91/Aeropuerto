
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Aeropuerto aeropuerto = new Aeropuerto("BOG", "El Dorado", "Bogotá", "Colombia");
        ModeloAvion modelo = new ModeloAvion("B737", 180);
        ProgramaVuelo programa = new ProgramaVuelo("AV123", "Avianca", "Lunes a Viernes");
        Vuelo vuelo = new Vuelo(1, new Date(), 50, programa, modelo);
        System.out.println(vuelo);
    }
}

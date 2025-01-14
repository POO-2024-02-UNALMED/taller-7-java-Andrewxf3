package comunicacion;

import java.util.Arrays;
import java.util.List;

public class Alfabeto extends Pictograma {
    private List<String> letras;
    private String interpretacion;

    public Alfabeto(String origen, String[] letras, String interpretacion) {
        super(origen);
        this.letras = Arrays.asList(letras); // Conversión interna
        this.interpretacion = interpretacion;
    }

    public List<String> getLetras() {
        return letras;
    }

    public void setLetras(String[] letras) {
        this.letras = Arrays.asList(letras); // Conversión interna
    }

    @Override
    public String interpretacion() {
        return this.interpretacion;
    }

    public int cantidadLetras() {
        return this.letras.size();
    }

    @Override
    public String toString() {
        return String.join(", ", letras);
    }
}

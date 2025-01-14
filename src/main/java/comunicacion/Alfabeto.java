package comunicacion;

import java.util.List;

public class Alfabeto extends Pictograma {
    private List<String> letras;
    private String interpretacion;

    public Alfabeto(String origen, List<String> letras, String interpretacion) {
        super(origen);
        this.letras = letras;
        this.interpretacion = interpretacion;
    }

    public List<String> getLetras() {
        return letras;
    }

    public void setLetras(List<String> letras) {
        this.letras = letras;
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

package comunicacion;

import java.util.List;

public class Alfabeto extends Pictograma {
    private List<String> letras;

    public Alfabeto(String origen, String[] letras) {
        super(origen);
        this.letras = List.of(letras);
    }

    public List<String> getLetras() {
        return letras;
    }

    public void setLetras(List<String> letras) {
        this.letras = letras;
    }

    @Override
    public String interpretacion() {
        return getOrigen();
    }

    public int cantidadLetras() {
        return letras.size();
    }

    @Override
    public String toString() {
        return String.join(", ", letras);
    }
}
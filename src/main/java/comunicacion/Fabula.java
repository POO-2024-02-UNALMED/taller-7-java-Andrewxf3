package comunicacion;

public class Fabula extends Escrito {
    private String ensenanza;
    private String tipo;

    public Fabula(String origen, String titulo, String autor, int paginas, String ensenanza) {
        super(origen, titulo, autor, paginas);
        this.ensenanza = ensenanza;
    }

    public Fabula(String origen, String titulo, String autor, int paginas, String ensenanza, String tipo) {
        super(origen, titulo, autor, paginas);
        this.ensenanza = ensenanza;
        this.tipo = tipo;
    }

    public String getEnsenanza() {
        return ensenanza;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setEnsenanza(String ensenanza) {
        this.ensenanza = ensenanza;
    }

    @Override
    public String interpretacion() {
        return getOrigen();
    }

    @Override
    public int palabrasTotales(int palabrasPagina) {
        return getPaginas() * palabrasPagina;
    }

    @Override
    public String toString() {
        return getTitulo() + "\n" + getAutor() + "\n" + getPaginas() + "\n" + ensenanza;
    }
}
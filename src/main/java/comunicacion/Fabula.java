package comunicacion;


public class Fabula extends Escrito {
    private String ensenanza;
    private String interpretacion;


    public Fabula(String origen, String titulo, String autor, int paginas, String ensenanza, String interpretacion) {
        super(origen, titulo, autor, paginas);
        this.ensenanza = ensenanza;
        this.interpretacion = interpretacion;
    }


    public String getEnsenanza() {
        return ensenanza;
    }


    public void setEnsenanza(String ensenanza) {
        this.ensenanza = ensenanza;
    }


    @Override
    public String interpretacion() {
        return interpretacion;
    }


    public void setInterpretacion(String interpretacion) {
        this.interpretacion = interpretacion;
    }


    @Override
    public int palabrasTotales(int palabrasPorPagina) {
        return getPaginas() * palabrasPorPagina * 2;
    }


    @Override
    public String toString() {
        return String.format("%s\n%s\n%s\n%d\n%s",
                getOrigen(),
                getTitulo(),
                getAutor(),
                getPaginas(),
                ensenanza);
    }
}


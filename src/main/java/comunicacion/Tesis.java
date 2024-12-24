package comunicacion;

import java.util.List;

public class Tesis extends Escrito {
    private List<String> argumentos;

    public Tesis(String origen, String titulo, String autor, int paginas, List<String> argumentos) {
        super(origen, titulo, autor, paginas);
        this.argumentos = argumentos;
    }

    public List<String> getArgumentos() {
        return argumentos;
    }

    public void setArgumentos(List<String> argumentos) {
        this.argumentos = argumentos;
    }

    @Override
    public String interpretacion() {
        return getOrigen();
    }

    @Override
    public int palabrasTotales(int palabrasPagina) {
        return getPaginas() * palabrasPagina;
    }

    public int cantidadArgumentos() {
        return argumentos.size();
    }

    @Override
    public String toString() {
        return getTitulo() + "\n" + getAutor() + "\n" + getPaginas() + "\n" + argumentos;
    }
}
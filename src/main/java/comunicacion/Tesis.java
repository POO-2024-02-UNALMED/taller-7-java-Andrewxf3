package comunicacion;

import java.util.List;

public class Tesis extends Escrito {
    private String idea;
    private List<String> argumentos;
    private String conclusion;
    private String referencias;

    public Tesis(String origen, String titulo, String autor, int paginas, String idea, String[] argumentos, String conclusion, String referencias) {
        super(origen, titulo, autor, paginas);
        this.idea = idea;
        this.argumentos = List.of(argumentos);
        this.conclusion = conclusion;
        this.referencias = referencias;
    }

    public String getIdea() {
        return idea;
    }

    public void setIdea(String idea) {
        this.idea = idea;
    }

    public List<String> getArgumentos() {
        return argumentos;
    }

    public void setArgumentos(String[] argumentos) {
        this.argumentos = List.of(argumentos);
    }

    public String getConclusion() {
        return conclusion;
    }

    public void setConclusion(String conclusion) {
        this.conclusion = conclusion;
    }

    public String getReferencias() {
        return referencias;
    }

    public void setReferencias(String referencias) {
        this.referencias = referencias;
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
        return getTitulo() + "\n" + getAutor() + "\n" + getPaginas() + "\n" + idea + "\n" + argumentos + "\n" + conclusion + "\n" + referencias;
    }
}

﻿package comunicacion;


public class Alfabeto extends Pictograma {
    private String[] letras;
    private String interpretacion;
    
    public Alfabeto(String origen, String[] letras, String interpretacion) {
        super(origen);
        this.letras = letras;
        this.interpretacion = interpretacion;
    }
    
    public int cantidadLetras() {
        return letras.length;
    }
    
    public String[] getLetras() {
        return letras;
    }
    
    public void setLetras(String[] letras) {
        this.letras = letras;
    }
    
    @Override
    public String interpretacion() {
        return interpretacion;
    }
    
    @Override
    public String toString() {
        return String.join(", ", letras);
    }
}

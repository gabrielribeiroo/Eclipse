package br.senac.tads.dsw.exemplosspring;

public class Item {

    private int valor;
    private String texto;
    private boolean mult10;

    public Item() {
    }

    public Item(int valor, String texto) {
        this.valor = valor;
        this.texto = texto;
        mult10 = (valor % 10 == 0);
    }

    public boolean isMult10() {
        return mult10;
    }

    public void setMult10(boolean mult10) {
        this.mult10 = mult10;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

}

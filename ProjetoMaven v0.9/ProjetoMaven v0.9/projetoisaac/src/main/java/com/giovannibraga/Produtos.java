package com.giovannibraga;

public class Produtos {
    private String pilotoBrinquedo;
    private int estoqueBrinquedo;
    private double precoBrinquedo;
    
    public Produtos(String pilotoBrinquedo, double precoBrinquedo) {
        this.pilotoBrinquedo = pilotoBrinquedo;
        this.precoBrinquedo = precoBrinquedo;
        this.estoqueBrinquedo = 1;
    }

    public String getPilotoBrinquedo() {
        return pilotoBrinquedo;
    }

    public void setPilotoBrinquedo(String pilotoBrinquedo) {
        this.pilotoBrinquedo = pilotoBrinquedo;
    }

    public int getEstoqueBrinquedo() {
        return estoqueBrinquedo;
    }

    public void setEstoqueBrinquedo(int estoqueBrinquedo) {
        this.estoqueBrinquedo = estoqueBrinquedo;
    }

    public double getPrecoBrinquedo() {
        return precoBrinquedo;
    }

    public void setPrecoBrinquedo(double precoBrinquedo) {
        this.precoBrinquedo = precoBrinquedo;
    }

    public String imprimirProdutos() {
        return "\nPiloto: " + pilotoBrinquedo + "\nPreço Brinquedo: R$" + precoBrinquedo + "\nDisponível no Estoque: " + estoqueBrinquedo + "\n";
    }
}

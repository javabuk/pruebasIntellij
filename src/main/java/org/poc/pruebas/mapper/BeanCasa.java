package org.poc.pruebas.mapper;

public class BeanCasa {

    private int numeroPuertas;
    private int numeroVentanas;

    public BeanCasa(){

    }

    public BeanCasa(int numeroPuertas, int numeroVentanas) {
        this.numeroPuertas = numeroPuertas;
        this.numeroVentanas = numeroVentanas;
    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }

    public int getNumeroVentanas() {
        return numeroVentanas;
    }

    public void setNumeroVentanas(int numeroVentanas) {
        this.numeroVentanas = numeroVentanas;
    }

    @Override
    public String toString() {
        return "BeanCasa{" +
                "numeroPuertas=" + numeroPuertas +
                ", numeroVentanas=" + numeroVentanas +
                '}';
    }
}

package org.bridge;

public class Generalista extends Cargo{
    public Generalista(float salarioBase) {
        super(salarioBase);
    }

    public float calcularSalario() {
        return this.salarioBase * (1 + this.especializacao.percentualAumento());
    }
}
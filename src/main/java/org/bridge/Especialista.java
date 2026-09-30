package org.bridge;

public class Especialista extends Cargo {
    public Especialista(float salarioBase) {
        super(salarioBase);
    }

    public float calcularSalario() {
        return this.salarioBase * (1 + this.especialização.percentualAumento());
    }
}

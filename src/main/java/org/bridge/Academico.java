package org.bridge;

public class Academico extends Cargo {
    public Academico(float salarioBase) {
        super(salarioBase);
    }

    public float calcularSalario() {
        return this.salarioBase * (1 + this.especialização.percentualAumento());
    }
}

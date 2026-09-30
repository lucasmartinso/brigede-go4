package org.bridge;

public abstract class Cargo {
    protected Especialização especialização;

    protected float salarioBase;

    public Cargo(float salarioBase) {
        this.salarioBase = salarioBase;
    }

    public void setEspecialização(Especialização especialização) {
        this.especialização = especialização;
    }

    public void  setSalarioBase(float salarioBase) {
        this.salarioBase = salarioBase;
    }

    public abstract float calcularSalario();
}

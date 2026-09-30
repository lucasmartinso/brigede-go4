import org.bridge.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EspecialistaTeste {
    @Test
    void deveRetornarSalarioEspecialistaComEnsinoMedio() {
        Especializacao especializacao = new EnsinoMedio();
        Especialista especialista = new Especialista(10000.0f);
        especialista.setEspecializacao(especializacao);
        assertEquals(10000.0f, especialista.calcularSalario(), 0.01f);
    }

    @Test
    void deveRetornarSalarioEspecialistaComGraduacao() {
        Especializacao especializacao = new Graduacao();
        Especialista especialista = new Especialista(10000.0f);
        especialista.setEspecializacao(especializacao);
        assertEquals(14000.0f, especialista.calcularSalario(), 0.01f);
    }

    @Test
    void deveRetornarSalarioEspecialistaComResidencia() {
        Especializacao especializacao = new Residencia();
        Especialista especialista = new Especialista(10000.0f);
        especialista.setEspecializacao(especializacao);
        assertEquals(21000.0f, especialista.calcularSalario(), 0.01f);
    }
}

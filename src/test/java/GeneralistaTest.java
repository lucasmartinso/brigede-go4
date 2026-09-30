import org.bridge.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GeneralistaTest {
    @Test
    void deveRetornarSalarioGeneralistaComEnsinoMedio() {
        Especializacao especializacao = new EnsinoMedio();
        Generalista generalista = new Generalista(5000.0f);
        generalista.setEspecializacao(especializacao);
        assertEquals(5000.0f, generalista.calcularSalario(), 0.01f);
    }

    @Test
    void deveRetornarSalarioGeneralistaComGraduacao() {
        Especializacao especializacao = new Graduacao();
        Generalista generalista = new Generalista(5000.0f);
        generalista.setEspecializacao(especializacao);
        assertEquals(7000.0f, generalista.calcularSalario(), 0.01f);
    }

    @Test
    void deveRetornarSalarioGeneralistaComResidencia() {
        Especializacao especializacao = new Residencia();
        Generalista generalista = new Generalista(5000.0f);
        generalista.setEspecializacao(especializacao);
        assertEquals(10500.0f, generalista.calcularSalario(), 0.01f);
    }
}

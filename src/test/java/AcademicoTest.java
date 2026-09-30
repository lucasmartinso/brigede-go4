import org.bridge.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class AcademicoTest {
    @Test
    void deveRetornarSalarioAcademicoComEnsinoMedio() {
        Especializacao especializacao = new EnsinoMedio();
        Academico academico = new Academico(1000.0f);
        academico.setEspecializacao(especializacao);
        assertEquals(0.0f, academico.calcularSalario(), 0.01f);
    }

    @Test
    void deveRetornarSalarioAcademicoComGraduacao() {
        Especializacao especializacao = new Graduacao();
        Academico academico = new Academico(1000.0f);
        academico.setEspecializacao(especializacao);
        assertEquals(0.0f, academico.calcularSalario(), 0.01f);
    }

    @Test
    void deveRetornarSalarioAcademicoComResidencia() {
        Especializacao especializacao = new Residencia();
        Academico academico = new Academico(1000.0f);
        academico.setEspecializacao(especializacao);
        assertEquals(0.0f, academico.calcularSalario(), 0.01f);
    }
}

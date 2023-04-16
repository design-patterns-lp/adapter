package adapter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PacienteTest {

    @Test
    void deveRetornarNivelFebrilPaciente() {
        Paciente paciente = new Paciente();
        paciente.setDiagnostico("A");

        assertEquals("A", paciente.getDiagnostico());
    }

    @Test
    void deveRetornarTemperaturaPaciente() {
        Paciente paciente = new Paciente();
        paciente.setDiagnostico("A");

        assertEquals(9.0f, paciente.persistencia.getTemperatura());
    }
}
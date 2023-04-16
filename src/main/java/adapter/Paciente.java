package adapter;

public class Paciente {

    IDiagnostico diagnostico;
    DiagnosticoAdapter persistencia;

    public Paciente() {
        diagnostico = new NivelFebre();
        persistencia = new DiagnosticoAdapter(diagnostico);
    }

    public void setDiagnostico(String nivelFebril) {
        diagnostico.setDiagnostico(nivelFebril);
        persistencia.salvarDiagnostico();
    }

    public String getDiagnostico() {
        return persistencia.recuperarDiagnostico();
    }

}

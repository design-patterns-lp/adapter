package adapter;

public class DiagnosticoAdapter extends TemperaturaGraus {

    private IDiagnostico nivelFebre;

    public DiagnosticoAdapter(IDiagnostico nivelFebre) {
        this.nivelFebre = nivelFebre;
    }

    public String recuperarDiagnostico() {
        if (this.getTemperatura() >= 9.0f)
            nivelFebre.setDiagnostico("A");
        else
            if (this.getTemperatura() >= 8.0f)
                nivelFebre.setDiagnostico("B");
            else
                if (this.getTemperatura() >= 7.0f)
                    nivelFebre.setDiagnostico("C");
                else
                    nivelFebre.setDiagnostico("D");
        return nivelFebre.getDiagnostico();
    }

    public void salvarDiagnostico() {
        if (nivelFebre.getDiagnostico().equals("A"))
            this.setTemperatura(9.0f);
        else
            if (nivelFebre.getDiagnostico().equals("B"))
                this.setTemperatura(8.0f);
            else
                if (nivelFebre.getDiagnostico().equals("C"))
                    this.setTemperatura(7.0f);
                else
                    this.setTemperatura(0.0f);
    }
}

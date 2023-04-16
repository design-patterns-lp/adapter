package adapter;

public class NivelFebre implements IDiagnostico {

    private String nivelFebril;

    @Override
    public String getDiagnostico() {
        return this.nivelFebril;
    }

    @Override
    public void setDiagnostico(String nivelFebril) {
        this.nivelFebril = nivelFebril;
    }
}

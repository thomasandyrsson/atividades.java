package questao04;

public class Pokemon {
    protected int faseEvolucao;
    protected String type;

    public int getFaseEvolucao() {
        return faseEvolucao;
    }

    public void setFaseEvolucao(int faseEvolucao) {
        this.faseEvolucao = faseEvolucao;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void evoluir(){
        getFaseEvolucao() = faseEvolucao + 1;
    }
}

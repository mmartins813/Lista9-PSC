public class Sayajin extends PersonagemDragonBall implements Transformavel {
    private int nivelMaximoSSJ;
    private boolean temRabo;
    private int nivelAtualSSJ;

    public Sayajin(String nome, int idade, String sexo, String temporada, double ki, String poderEspecial, int nivelMaximoSSJ, boolean temRabo){
        super(nome, idade, sexo, temporada, ki, poderEspecial);
        this.nivelMaximoSSJ = nivelMaximoSSJ;
        this.temRabo = temRabo;
    }

    @Override
    public double calcularPoder(){
        return getKi() * (1 + nivelMaximoSSJ * 0.1);
    }
    @Override
    public void Transformavel(int nivel) {
        if ((nivel >= 1 && nivel <= 3) || ((getNome().equals("Goku") || getNome().equals("Vegeta")) && nivel >= 4 && nivel <= 5)) {
            nivelAtualSSJ = nivel;
            System.out.println(getNome() + " transformou para super sayajin nível " + nivel);
        } else {
            System.out.println("Não foi possível transformar esse sayajin");
        }
    }
    @Override
    public String toString() {
        return "Saiyajin{" +
                "Nome: " + getNome() + '\'' +
                ", Idade: " + getIdade() +
                ", Sexo: '" + getSexo() + '\'' +
                ", Temporada: '" + getTemporada() + '\'' +
                ", Ki: " + getKi() +
                ", Poder Especial: " + getPoderEspecial() + '\'' +
                ", Nível Máximo SSJ: " + nivelMaximoSSJ +
                ", Tem rabo?: " + temRabo +
                ", Nível atual SSJ: " + nivelAtualSSJ +
                '}';
    }

    @Override
    public void transformar(int nivel) {

    }
    public int getNivelAtualSSJ() {
        return nivelAtualSSJ;
    }
}

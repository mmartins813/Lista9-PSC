public class Namekusei extends PersonagemDragonBall {
    private int quantidadeEsferas;
    private boolean podeCurar;

    public Namekusei(String nome, int idade, String sexo, String temporada, int ki, String poderEspecial, int quantidadeEsferas, boolean podeCurar) {
        super(nome, idade, sexo, temporada, ki, poderEspecial);
        this.quantidadeEsferas = quantidadeEsferas;
        this.podeCurar = podeCurar;
    }

    @Override
    public double calcularPoder() {
        return (int) (getKi() * (1 + (podeCurar ? 0.2 : 0)));
    }

    @Override
    public String toString() {
        return "Namekuseijin{" +
                "Nome: " + getNome() + '\'' +
                ", Idade: " + getIdade() +
                ", Sexo: " + getSexo() + '\'' +
                ", Season: " + getTemporada() + '\'' +
                ", Ki: " + getKi() +
                ", Poder Especial" + getPoderEspecial() + '\'' +
                ", Esferar: " + quantidadeEsferas + '\'' +
                ", Cura: " + podeCurar +
                '}';
    }

    public String fazerDesejo(String desejo) {
        String desejoNamekusei = desejo;
        desejoNamekusei = desejoNamekusei.replace("Poder de dormir infinitamente a vontade sem estresse", "Butla antu");
        desejoNamekusei = desejoNamekusei.replace("Força do Dragão", "Porunga");
        desejoNamekusei = desejoNamekusei.replace("Canhão de Fogo", "Stando boomsca");
        return desejoNamekusei;
    }
}

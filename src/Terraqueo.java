public class Terraqueo extends PersonagemDragonBall {
    private String pais;
    private String cidade;

    public Terraqueo(String nome, int idade, String sexo, String temporada, double ki, String poderEspecial, String pais, String cidade) {
        super(nome, idade, sexo, temporada, ki, poderEspecial);
    }

    @Override
    public double calcularPoder() {
        return getKi();
    }
    @Override
    public String toString(){
        return "Terraqueo{"+
                "Nome: " + getNome() + '\'' +
                ", Idade=" + getIdade() +
                ", Sexo='" + getSexo() + '\'' +
                ", Temporada='" + getTemporada() + '\'' +
                ", Ki=" + getKi() +
                ", Poder Especial='" + getPoderEspecial() + '\'' +
                ", País='" + pais + '\'' +
                ", Cidade='" + cidade + '\'' +
                '}';
    }
}

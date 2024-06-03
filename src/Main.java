public class Main {
    public static void main(String[] args) {
        Sayajin goku = new Sayajin("Goku", 35, "Masculino", "Saga de Namekusei", 9000, "Kamehameha", 3, true);
        // Criando os outros membros
        Terraqueo kuririn = PersonagemFactory.criarKuririn();
        Sayajin gohan = PersonagemFactory.criarGohan();
        Namekusei dende = PersonagemFactory.criarDende();

        // Exibindo o nível atual de Super Saiyajin
        System.out.println(goku);

        // Transformando Goku para o nível 3
        goku.Transformavel(3);

        // Exibindo o novo nível de Super Saiyajin
        System.out.println(goku);

        // Tentando transformar Goku para o nível 4
        goku.Transformavel(4);

        // Exibindo o novo nível de Super Saiyajin
        System.out.println(goku);

        // Tentando transformar Goku para o nível 5
        goku.Transformavel(5);

        // Exibindo o novo nível de Super Saiyajin
        System.out.println(goku);

        gohan.transformar(5);
        if (gohan.getNivelAtualSSJ() < 5) {
            gohan.Transformavel(3);
        }
        System.out.println(gohan);

        // Exibindo os outros personagens criados
        System.out.println(kuririn);
        System.out.println(gohan);
        System.out.println(dende);
    }
}

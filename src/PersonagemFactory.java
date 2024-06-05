public class PersonagemFactory {

    public static Terraqueo criarKuririn() {
        return new Terraqueo("Kuririn", 32, "Masculino", "Saga dos Androides", 3500, "Kienzan", "Terra", "Cidade do Norte");
    }

    public static Sayajin criarGoku() {
        return new Sayajin("Goku", 35, "Masculino", "Saga de Namekusei", 9000, "Kamehameha", 3, true);
    }

    public static Sayajin criarGohan() {
        return new Sayajin("Gohan", 16, "Masculino", "Saga de Cell", 8000, "Masenko", 2, false);
    }

    public static Namekusei criarDende() {
        return new Namekusei("Dendê", 30, "Masculino", "Saga de Namekusei", 2000, "Cura", 7, true);
    }
}
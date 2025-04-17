public class iPhone {
    public static void main(String[] args) {
        // Instanciando as classes
        ReprodutorMusical reprodutor = new ReprodutorMusical();
        AparelhoTelefonico telefone = new AparelhoTelefonico();

        // Chamando os métodos do ReprodutorMusical
        reprodutor.tocar();
        reprodutor.pausar();
        reprodutor.selecionarMusica();

        // Chamando os métodos do AparelhoTelefonico
        telefone.ligar();
        telefone.atender();
        telefone.iniciarCorreioVoz();
    }
}


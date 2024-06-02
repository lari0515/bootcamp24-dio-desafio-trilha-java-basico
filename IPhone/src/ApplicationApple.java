import IPhone.IPhone;

public class ApplicationApple {
    public static void main(String[] args) {
        IPhone iPhone = new IPhone();

        //Utilizando Aparelho Telefônico
        String numero = "79988141523";

        iPhone.ligar(numero);
        iPhone.iniciarCorreioVoz();
        iPhone.atender();
        System.out.println();

        //Utilizando Reprodutor Musical
        String musica = "Pretty Hurts";

        iPhone.selecionarMusica(musica);
        iPhone.tocar();
        iPhone.pausar();
        System.out.println();

        //Utilizando Navegador
        String url = "github.com/lari0515";

        iPhone.adicionarNovaAba();
        iPhone.exibirPagina(url);
        iPhone.atualizarPagina();
    }
}

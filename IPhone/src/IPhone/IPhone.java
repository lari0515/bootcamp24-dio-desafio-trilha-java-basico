package IPhone;

import Navegador.NavegadorInternet;
import ReprodutorMusical.ReprodutorMusical;
import Telefone.AparelhoTelefonico;

public class IPhone implements NavegadorInternet, ReprodutorMusical, AparelhoTelefonico {

    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para o número " + numero + " usando o Iphone.");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo uma ligação utilizando o Iphone.");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Deixando um recado no correio de voz utilizando o Iphone.");
    }

    @Override
    public void tocar() {
        System.out.println("Tocando uma música no reprodutor musical do Iphone.");
    }

    @Override
    public void pausar() {
        System.out.println("Música pausada no reprodutor musical do Iphone.");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Música selecionada no reprodutor musical do Iphone: " + musica);
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("Página exibida no navegador do Iphone: " + url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Nova aba adicionada no navegador do Iphone.");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Página atualizada no navegador do Iphone.");
    }
    
}

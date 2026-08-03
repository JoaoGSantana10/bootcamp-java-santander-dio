package Modulo03.Interfaces.Exercicio_Interfaces.Enviado_Mensagem;

public class RedeSocial implements ServicoMensagem{

    @Override
    public void enviarMensagem(String mensagem) {
        System.out.println("Enviando a mensagem por Redes Sociais: " + mensagem);
    }
}

package Modulo03.Interfaces.Exercicio_Interfaces.Enviado_Mensagem;

public class WhatsApp implements ServicoMensagem {

    @Override
    public void enviarMensagem(String mensagem) {
        System.out.println("Enviando mensagem por WhatsApp: " + mensagem);
    }
}

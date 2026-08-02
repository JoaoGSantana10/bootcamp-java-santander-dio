package Modulo02.Orientação_Objetos.Exercicio_Cinema_Ingresso;

public class Main {
    public static void main(String[] args){

        IngressoFamilia ingressoFamilia = new IngressoFamilia(20.0, "Homem-Aranha", true, 4);
        Ingresso ingressoFamilia2 = new IngressoFamilia(17.0, "Homem de Ferro", true, 3);
        Ingresso meiaEntrada = new MeiaEntrada(25.0, "Batman", false);

        System.out.println("Sala - 1 - Ingresso meia entrada");
        System.out.println(meiaEntrada.getValor());
        System.out.println(meiaEntrada.getNome());
        System.out.println(meiaEntrada.isDublado());
        System.out.println(meiaEntrada.valorReal());
        System.out.println("Sala 2 - Ingresso Família - mais de 3 pessoas desconto 5%");
        System.out.println(ingressoFamilia.getValor());
        System.out.println(ingressoFamilia.getNome());
        System.out.println(ingressoFamilia.isDublado());
        System.out.println(ingressoFamilia.getPessoas());
        System.out.println(ingressoFamilia.valorReal());
        System.out.println("Sala 3 - Ingresso Família - menos de 3 pessoas sem desconto");
        System.out.println(ingressoFamilia2.getValor());
        System.out.println(ingressoFamilia2.getNome());
        System.out.println(ingressoFamilia2.isDublado());
        System.out.println(((IngressoFamilia)ingressoFamilia2).getPessoas()); // Usando downcasting quando for
        // só Ingresso ao invés de IngressoFamília
        System.out.println(ingressoFamilia2.valorReal());




    }
}

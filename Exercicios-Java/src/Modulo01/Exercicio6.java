package Modulo01;

public class Exercicio6 {
    public static void main(String[] args){

        /*
        Operadores Bitwise

        Interger.toBinaryString(); (Transformar algum número em representação binária)

        0 = false
        1 = true

        (Operação Usando o |) (OU)

        N1 = 7
        N2 = 10

        1010 = N2
         111 = N1
       ------
        1111 = 15

        (Operação Usando o &) (E)

        N1 = 7
        N2 = 10

        1010 = N2
         111 = N1
       ------
        0010 = 2

        (Operação Usando o ^) (CHORE) (Para ser 1 tem que ser diferente)

        N1 = 7
        N2 = 10

        1010 = N2
         111 = N1
       ------
        1101 = 13

        (Operação Usando o ~) (NOT) (Inverte os bits 1 para 0)

         N1 = 7

        00000000000000000000000000000111 = N1
        11111111111111111111111111111000 = Resultado

        (Operação Usando o <<) (SHIFT OPERATOR LEFT)

       (Desloca o primeiro número em binário para a esquerda e preenche a direita com o segundo número
       com tantos bytes em 0 que no caso foi 10)

        N1 = 7
        N2 = 10

                  111 = N1
        1110000000000 = Resultado

        (Operação Usando o >>) (SIGNED RIGHT SHIFT)

        (Nessa Operação ele empurra os bytes para a direita e no caso de ser negativo o número ele coloca 1 se for
        negativo e 0 se for positivo)

        (Nesse meu exemplo ele empurrou o número 7 que em binário é 111 para a direita e aí acabou apagando ele porque
        foi deslocado 10 bytes em 0 para a direita e ele acaba sumindo por isso o resultado é 0 e nesse caso que o
        número é positivo ele completa a esquerda com número 0)

        N1 = 7
        N2 = 10

        0000000000111 (Número que vai ser apagado porque foi deslocado 10 casas para a direita 111) = N1
        0000000000 = Result

        Exemplo do N1 = -7 (Número negativo)

        (Nesse caso ele empurrou 10 casas o número -7 em binário para a direita por isso ficou tudo em 1 e o resultado
        é -1  e em vez de completar com 0 nesse caso que o número é negativo ele completa a esquerda com 1)

        11111111111111111111111111111001 = N1
        11111111111111111111111111111111 = Resultado

        (Operação Usando o >>>) (UNSIGNED RIGHT SHIFT OPERATOR)

        (Pegou o primeiro número em binário e deslocou duas casas para a direita por causa do segundo número que é o 2
        e completou com 0 a esquerda)

        N1 = 12
        N2 = 2

        1100 = N1
        0011 = RESULTADO

         */

        //System.out.println(Integer.toBinaryString(Integer.MAX_VALUE)); Imprime o maior valor
        var N1 = 12;
        var binary1 = Integer.toBinaryString(N1);
        //System.out.printf("Primeiro número da operação %s (Representação Binária %s)\n", N1, binary1);
        var N2 = 2;
        var binary2 = Integer.toBinaryString(N2);
        //System.out.printf("Segundo número da operação %s (Representação Binária %s)\n", N2, binary2);
        var result1 = N1 | N2;
        var bynaryResult1 = Integer.toBinaryString(result1);
        System.out.println("-----------------------------------------------------------------------------------");
        System.out.println("                          Operação Usando o | (OU)");
        System.out.println("-----------------------------------------------------------------------------------");
        System.out.printf("Primeiro número da operação %s (Representação Binária %s)\n", N1, binary1);
        System.out.printf("Segundo número da operação %s (Representação Binária %s)\n", N2, binary2);
        System.out.printf("Resultado da operação %s | %s = %s\n", N1, N2, result1);
        System.out.printf("Resultado da operação %s | %s = %s (Em represetação binária)\n", N1, N2, bynaryResult1);
        System.out.println("-----------------------------------------------------------------------------------");
        System.out.println("                          Operação Usando o & (E)");
        System.out.println("-----------------------------------------------------------------------------------");
        System.out.printf("Primeiro número da operação %s (Representação Binária %s)\n", N1, binary1);
        System.out.printf("Segundo número da operação %s (Representação Binária %s)\n", N2, binary2);
        var result2 = N1 & N2;
        var bynaryResult2 = Integer.toBinaryString(result2);
        System.out.printf("Resultado da operação %s & %s = %s\n", N1, N2, result2);
        System.out.printf("Resultado da operação %s & %s = %s (Em represetação binária\n)", N1, N2, bynaryResult2);
        System.out.println("-----------------------------------------------------------------------------------");
        System.out.println("                          Operação Usando o ^ (CHORE)");
        System.out.println("-----------------------------------------------------------------------------------");
        System.out.printf("Primeiro número da operação %s (Representação Binária %s)\n", N1, binary1);
        System.out.printf("Segundo número da operação %s (Representação Binária %s)\n", N2, binary2);
        var result3 = N1 ^ N2;
        var bynaryResult3 = Integer.toBinaryString(result3);
        System.out.printf("Resultado da operação %s ^ %s = %s\n", N1, N2, result3);
        System.out.printf("Resultado da operação %s ^ %s = %s (Em represetação binária)\n", N1, N2, bynaryResult3);
        System.out.println("-----------------------------------------------------------------------------------");
        System.out.println("                          Operação Usando o ~ (NOT)");
        System.out.println("-----------------------------------------------------------------------------------");
        System.out.printf("Primeiro número da operação %s (Representação Binária %s)\n", N1, binary1);
        var result4 = ~N1;
        var bynaryResult4 = Integer.toBinaryString(result4);
        System.out.printf("Resultado da operação ~%s = %s\n", N1, result4);
        System.out.printf("Resultado da operação ~%s = %s (Em represetação binária \n)", N1, bynaryResult4);
        System.out.println("-----------------------------------------------------------------------------------");
        System.out.println("                      Operação Usando o << (SHIFT OPERATOR LEFT)");
        System.out.println("-----------------------------------------------------------------------------------");
        System.out.printf("Primeiro número da operação %s (Representação Binária %s)\n", N1, binary1);
        System.out.printf("Segundo número da operação %s (Representação Binária %s)\n", N2, binary2);
        var result5 = N1 << N2;
        var bynaryResult5 = Integer.toBinaryString(result5);
        System.out.printf("Resultado da operação %s << %s = %s\n", N1, N2, result5);
        System.out.printf("Resultado da operação %s << %s = %s (Em represetação binária)\n", N1, N2, bynaryResult5);
        System.out.println("-----------------------------------------------------------------------------------");
        System.out.println("                      Operação Usando o >> (SIGNED RIGHT SHIFT)");
        System.out.println("-----------------------------------------------------------------------------------");
        System.out.printf("Primeiro número da operação %s (Representação Binária %s)\n", N1, binary1);
        System.out.printf("Segundo número da operação %s (Representação Binária %s)\n", N2, binary2);
        var result6 = N1 >> N2;
        var bynaryResult6 = Integer.toBinaryString(result6);
        System.out.printf("Resultado da operação %s >> %s = %s\n", N1, N2, result6);
        System.out.printf("Resultado da operação %s >> %s = %s (Em represetação binária)\n", N1, N2, bynaryResult6);
        System.out.println("-----------------------------------------------------------------------------------");
        System.out.println("                      Operação Usando o >>> (UNSIGNED RIGHT SHIFT OPERATOR)");
        System.out.println("-----------------------------------------------------------------------------------");
        System.out.printf("Primeiro número da operação %s (Representação Binária %s)\n", N1, binary1);
        System.out.printf("Segundo número da operação %s (Representação Binária %s)\n", N2, binary2);
        var result7 = N1 >>> N2;
        var bynaryResult7 = Integer.toBinaryString(result7);
        System.out.printf("Resultado da operação %s >>> %s = %s\n", N1, N2, result7);
        System.out.printf("Resultado da operação %s >>> %s = %s (Em represetação binária)", N1, N2, bynaryResult7);
    }
}

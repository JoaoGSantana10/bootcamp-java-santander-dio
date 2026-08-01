package Modulo02.Orientação_Objetos.Herança;

public class Main {

    public static void main(String[] args) {

        /*
        Colaborador colaborador = new Colaborador();
        Colaborador gerente = new Gerente();

        gerente.setName("João");
        gerente.setLogin("joao");
        gerente.setPassword("123456");


        System.out.println("Olá " + gerente.getName() + "\nseu login é: " + gerente.getLogin() +
                "\nsua senha é: " + gerente.getPassword());

         */
        printColaborador(new Gerente());
        printColaborador(new Vendedor());
    }

    public static void printColaborador(Colaborador colaborador) {
        System.out.printf("====%s====\n", colaborador.getClass().getCanonicalName()); // mostra a classe
        /*
        if (colaborador instanceof Gerente gerente) { // Comparando se é uma instância de uma classe
            colaborador.setName("João");
            ((Gerente) colaborador).setLogin("joao"); // cast conversão de um tipo para outro tipo
            gerente.setPassword("123456"); // aqui eu tirei porque criei uma variável

            System.out.println("Olá " + colaborador.getName() + "\nseu login é: " + ((Gerente) colaborador).getLogin() +
                    "\nsua senha é: " + ((Gerente) colaborador).getPassword());
        }
         */
        // Outra forma
        colaborador.code = ""; // Posso modificar porque o protected ele permite acessar se tiver dentro do package
        switch (colaborador){
            case Gerente gerente ->{

                gerente.setCode("10");
                gerente.setName("João");
                gerente.setSalario(10000);
                gerente.setLogin("joao");
                gerente.setPassword("123456");
                gerente.setComissao(1200);

                System.out.println("Olá " + colaborador.getName());
                System.out.println("seu login é: " + gerente.getLogin());
                System.out.println("sua senha é: " + gerente.getPassword());
                System.out.println(colaborador.getCode());
                System.out.println(colaborador.getSalario());
                System.out.println(gerente.getComissao());
                System.out.println(gerente.salarioTotal(700));
            }
            case Vendedor vendedor ->{
                vendedor.setCode("7");
                vendedor.setName("Pedro");
                vendedor.setSalario(5000);
                vendedor.setPorcentagemVendas(10);
                vendedor.setQtdeVendas(1000);

                System.out.println("Olá " + colaborador.getName());
                System.out.println(colaborador.getCode());
                System.out.println(colaborador.getSalario());
                System.out.println(vendedor.getPorcentagemVendas());
                System.out.println(vendedor.getQtdeVendas());

            }
        }
        System.out.println(colaborador.salarioTotal());
    }

    /*
        Reforçando instaceof e sobrecarga de métodos

        Colaborador colaborador = new Colaborador();
        Vendedor vendedor = new Vendedor();
        Gerente gerente = new Gerente();
        System.out.println(colaborador instanceof Colaborador);

     */

}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String nome = "Matheus Garcia";
        String tipoConta = "Corrente";
        float saldoConta = 0.0f;
        int opcao = 0;
        Scanner scan = new Scanner(System.in);

        String separadorTexto = "*************************************************";

        System.out.println(separadorTexto);
        System.out.println("""
                Dados do cliente
                Nome: \t%s
                Tipo de conta: \t%s
                Saldo inicial: \tR$ %.2f""".formatted(nome, tipoConta, saldoConta));
        System.out.println(separadorTexto);

        while(opcao != 4) {

            System.out.println("""
                    Operações
                    
                    1- Consulta saldo bancario
                    2- Depositar valor
                    3- Retirar valor
                    4- Sair
                    """);

            System.out.print("Digite o número da opção: ");
            opcao = scan.nextInt();
            switch (opcao) {
                case 1:
                    System.out.printf("Saldo na conta: R$ %.2f \n", saldoConta);
                    break;
                case 2:
                    System.out.print("Informe o valor: ");
                    saldoConta += scan.nextFloat();
                    break;
                case 3:
                    System.out.print("Informe o valor: ");
                    float valor = scan.nextFloat();
                    if(valor > saldoConta) {
                        System.out.println("Valor de retirada maior que o saldo da conta :,(");
                        break;
                    }
                    saldoConta -= valor;
                    break;
                case 4:
                    System.out.println("Saindo do sistema, até mais :)");
                    break;
                default:
                    System.out.println("Operação invalida, tente novamente");
            }

            System.out.println(separadorTexto);
        }

    }
}
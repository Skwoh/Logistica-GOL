import java.util.Scanner;

public class main {
    public static void main(String[] args) throws InterruptedException {

        Cliente cliente = new Cliente();
        Cadastro cadastro = new Cadastro();
        Armazenagem armazem = new Armazenagem();
        Envio envio = new Envio();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem vindo ao nosso sistema de gerenciamento GOL!");
            Thread.sleep(1000);
            System.out.println("Vamos nos cadastrar!");
            Thread.sleep(1000);

            System.out.println("Me fala seu nome completo: ");
            String input2 = scanner.nextLine();
            Thread.sleep(1000);
            System.out.println("Me fala seu CPF: ");
            String input3 = scanner.nextLine();
             Thread.sleep(1000);
            cliente.setCadastro(input2, input3);
            Thread.sleep(1000);

            System.out.println("Cadastro realizado com sucesso!");
            cadastro.mostrarCadastro(cliente);
            System.out.println("Bem-vindo!");

            while(true){

                System.out.println("O que gostaria de fazer? Mostrar clientes/Cadastrar cliente/Cadastrar pacote/Meu armazém/Envio/Sair");
                String input = scanner.nextLine();

                if(input.equalsIgnoreCase("Cadastrar cliente")){
                    System.out.println("Me fala seu nome completo: ");
                    String input4 = scanner.nextLine();
                    Thread.sleep(1000);
                    System.out.println("Me fala seu CPF: ");
                    String input5 = scanner.nextLine();
                    Thread.sleep(1000);
                    cliente.setCadastro(input4, input5);
                    Thread.sleep(1000);
                    System.out.println("Cadastro realizado com sucesso!");

                } else if(input.equalsIgnoreCase("Cadastrar pacote")){
                    Thread.sleep(1000);
                    System.out.println("Por favor, digite o ID do seu pacote: ");
                    String input4 = scanner.nextLine();
                    Thread.sleep(1000);
                    System.out.println("Por favor, digite o contéudo do pacote: ");
                    Thread.sleep(1000);
                    String input5 = scanner.nextLine();
                    Thread.sleep(1000);
                    armazem.pacoteCadastro(input4, input5);
                    System.out.println("Pacote " + input4 + " cadastrado!");
                } else if(input.equalsIgnoreCase("Mostrar clientes")){
                    Thread.sleep(1000);
                    cadastro.mostrarClientes(cliente);
                } else if(input.equalsIgnoreCase("Meu armazém")){
                    System.out.println("Aqui está o seu armazém: ");
                    Thread.sleep(1000);
                    armazem.mostrarConteudo();
                } else if(input.equalsIgnoreCase("Envio")){
                    Thread.sleep(1000);
                    System.out.println("Por favor, digite o id do pacote que você quer monitorar: ");
                    Thread.sleep(1000);
                    String input6 = scanner.nextLine();
                    Thread.sleep(1000);
                    envio.enviarPacotes(armazem, input6);
                } else {
                    Thread.sleep(1000);
                    break;
                }
            }
                System.out.println("Fim da linha.");
            }
    }


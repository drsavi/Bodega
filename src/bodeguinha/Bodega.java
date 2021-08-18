
package bodeguinha;
import java.util.*;

public class Bodega {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Funcionario novoFuncionario = new Funcionario();
        Bebida novaBebida = new Bebida(); 
        Cliente novoCliente = new Cliente();

        ArrayList <Funcionario> bodegueiros = new ArrayList<>();
        ArrayList <Bebida> bebida = new ArrayList<>();
        ArrayList <Cliente> cachaceiros = new ArrayList<>();

        int contadorNovoFuncionario = 0;
        int contadorNovaBebida = 0;
        int contadorNovoCliente = 0;
       
        int opcao = 0;
        while(opcao != 9){
            System.out.println(">> 1 - Cadastrar Funcionarios\n"
            + ">> 2 - Mostrar Funcionarios\n"
            + ">> 3 - Cadastrar Bebidas\n"
            + ">> 4 - Mostrar Bebidas\n"
            + ">> 5 - Compra de Bebida\n"
            + ">> 6 - Venda de Bebida\n"
            + ">> 7 - Cadastrar Clientes\n"
            + ">> 8 - Mostrar Clientes\n"
            + ">> 9 - Sair do Sistema\n");
            opcao = sc.nextInt(); sc.nextLine();

            if(opcao == 1){
                //CADASTRAR FUNCIONARIO
                System.out.println("Digite o nome do funcionario a ser cadastrado: ");
                String nome = sc.nextLine();
                System.out.println("Digite a idade do funcionario: ");
                int idade = sc.nextInt(); sc.nextLine();
                System.out.println("Digite o salario inicial para o cargo: ");
                double salario = sc.nextDouble();
                int codigoFuncionario = contadorNovoFuncionario++;
                novoFuncionario = new Funcionario(codigoFuncionario, nome, idade, salario);
                bodegueiros.add(novoFuncionario);
            }else if(opcao == 2){
                //MOSTAR FUNCIONARIOS
                for(int i = 0; i < bodegueiros.size(); i++){
                    Funcionario novoBodegueiroLista = bodegueiros.get(i);
                    System.out.println("\n**********************");
                    System.out.println("Codigo da Conta: " + novoBodegueiroLista.codigo);
                    System.out.println("Nome do Funcionario: " + novoBodegueiroLista.nome);
                    System.out.println("Idade do Funcionario: " + novoBodegueiroLista.idade);
                    System.out.println("Salario: " + novoBodegueiroLista.salario);
                }
            }else if(opcao == 3){
                //CADASTRAR BEBIDAS
                System.out.println("Digite o nome da bebida: ");
                String nomeBebida = sc.nextLine();
                System.out.println("Teor alcoolico %: Ex: '4,5' ");
                Double teorAlcoolico = sc.nextDouble();
                System.out.println("Quantidade em ml: ");
                int quantidadeMl = sc.nextInt();
                System.out.println("Insira o preco para venda: Ex: '7,50': ");
                double precoVenda = sc.nextDouble();
                System.out.println("Quantidade de unidades no estoque: ");
                int quantidadeEstoque =  sc.nextInt();
                int codigoBebida = contadorNovaBebida++;
                novaBebida = new Bebida(codigoBebida, nomeBebida, teorAlcoolico, quantidadeMl, precoVenda, quantidadeEstoque);
                bebida.add(novaBebida);
            }else if(opcao == 4){
                //MOSTAR BEBIDAS
                for(int i = 0; i < bebida.size(); i++){
                    Bebida novaBebidaLista = bebida.get(i);
                    System.out.println("\n**********************");
                    System.out.println("Nome: " + novaBebidaLista.nomeBebida);
                    System.out.println("Codigo da Bebida: " + novaBebidaLista.codigo);
                    System.out.println("Teor alcoolico: " + novaBebidaLista.teorAlcoolico + " %");
                    System.out.println(novaBebidaLista.quantidadeMl + " ml");
                    System.out.println("Preco para venda R$: " + novaBebidaLista.precoVenda);
                    System.out.println("Unidades no estoque: " + novaBebidaLista.quantidadeEstoque); 
                }
            }else if(opcao == 5){
                //COMPRA DE BEBIDA
                System.out.println("Informe o codigo da bebida que deseja comprar. ");
                int codigoBebida = sc.nextInt(); sc.nextLine();
                if(codigoBebida < bebida.size() || codigoBebida > bebida.size()){
                    System.out.println("Digite um codigo de identificacao valido! ");
                } else{
                    System.out.println("Quantas unidades deseja adquirir? ");
                    int quantidade = sc.nextInt();
                    Bebida comprarBebida = bebida.get(codigoBebida);
                    comprarBebida.setBebida(quantidade);
                }
            }else if(opcao == 6){
                //VENDA DE BEBIDA
                System.out.println("Informe o codigo da bebida que deseja vender. ");
                int codigoBebida = sc.nextInt(); sc.nextLine();
                if(codigoBebida < bebida.size() || codigoBebida > bebida.size()){
                    System.out.println("Digite um codigo de identificacao valido! ");
                } else{
                    System.out.println("Quantas unidades deseja vender? ");
                    int quantidade = sc.nextInt();
                    Bebida venderBebida = bebida.get(codigoBebida);
                    venderBebida.getBebida(quantidade);
                }
            }else if(opcao == 7){
                //CADASTRAR CLIENTES
                System.out.println("Digite o nome do cliente a ser cadastrado: ");
                String nomeCliente = sc.nextLine();
                System.out.println("Insira o CPF: ");
                String cpfCliente = sc.nextLine();
                System.out.println("Habilitar venda fiado para o cliente? Responda true ou false: ");
                boolean venderFiadoCliente = sc.nextBoolean();
                int codigoCliente = contadorNovoCliente++;
                novoCliente = new Cliente(codigoCliente,nomeCliente, cpfCliente, venderFiadoCliente);
                cachaceiros.add(novoCliente);            
            }else if(opcao == 8){
                //MOSTRAR CLIENTES
                for(int i = 0; i < cachaceiros.size(); i++){
                    Cliente novoClienteLista = cachaceiros.get(i);
                    System.out.println("\n**********************");
                    System.out.println("Nome: " + novoClienteLista.nomeCliente);
                    System.out.println("Codigo do Cliente: " + novoClienteLista.codigoCliente);
                    System.out.println("CPF: " + novoClienteLista.cpf);
                    System.out.println("Habilitado a vender fiado: " + novoClienteLista.venderFiado);
                }
            }else if(opcao ==9){
                //SAIR DO SISTEMA
                System.out.println("Obrigado por utilizar nosso sistema! :) ");
            }else{
                //OPCAO INVALIDA
                System.out.println("Digite uma opcao valida no menu!");
            }
        }
    sc.close();
    }
}

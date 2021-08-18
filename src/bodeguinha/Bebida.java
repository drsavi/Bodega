package bodeguinha;

public class Bebida {
    public int codigo;
    public String nomeBebida;
    public double teorAlcoolico;
    public int quantidadeMl;
    public double precoVenda;
    public int quantidadeEstoque;

    Bebida(){
        
    }

    Bebida(int codigo, String nomeBebida, double teorAlcoolico, 
        int quantidadeMl, double precoVenda, int quantidadeEstoque){
            this.codigo = codigo;
            this.nomeBebida = nomeBebida;
            this.teorAlcoolico = teorAlcoolico;
            this.quantidadeMl = quantidadeMl;
            this.precoVenda = precoVenda;
            this.quantidadeEstoque = quantidadeEstoque;
    }

    void setBebida(int quantidadeEstoque){
        if(quantidadeEstoque <= 0){
            System.out.println("Digite um valor positivo para compra!");
        }else
            this.quantidadeEstoque += quantidadeEstoque;
    }
    void getBebida(int quantidadeEstoque){
        if(quantidadeEstoque > this.quantidadeEstoque){
            System.out.println("A quantidade de estoque e inferior a do pedido!");
            System.out.println(this.nomeBebida + ": " + this.quantidadeEstoque + " unidades.");
        }else
            this.quantidadeEstoque -= quantidadeEstoque;
    }
}

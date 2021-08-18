package bodeguinha;
public class Cliente {
    public int codigoCliente;
    public String nomeCliente;
    public String cpf;
    public boolean venderFiado;

    Cliente(){
        
    }

    Cliente(int codigoCliente, String nomeCliente, String cpf, boolean venderFiado){
        this.codigoCliente = codigoCliente;
        this.nomeCliente = nomeCliente;
        this.cpf = cpf;
        this.venderFiado = venderFiado;
    }
}

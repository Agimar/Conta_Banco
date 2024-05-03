package ContaTerminal;
import java.util.Scanner;

public class ContaTerminal {

	public int contaNumero;
    public String contaAgencia;
    public String contaCliente;
    public double contaSaldo;

    public void imprimir(){
        System.out.println("Olá " +contaCliente+ ", obrigado por criar uma conta em nosso banco, sua agência é " +contaAgencia+ ", conta " +contaNumero+ " e seu saldo " +contaSaldo+ " já esta disponível. ");
    }
    
	public static void main(String[] args) {
	
        Scanner scan = new Scanner(System.in);
        ContaTerminal conta = new ContaTerminal();

        System.out.println("Digite número da conta: ");
        conta.contaNumero = scan.nextInt();

        System.out.println("Digite nome da agência: ");
        conta.contaAgencia = scan.next();

        System.out.println("Digite nome do cliente: ");
        conta.contaCliente = scan.next();

        System.out.println("Digite valor do saldo: ");
        conta.contaSaldo = scan.nextDouble();

        conta.imprimir();

	}

}

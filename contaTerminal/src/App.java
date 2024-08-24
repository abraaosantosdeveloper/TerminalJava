import java.util.Scanner; 

public class App {
    public static void main(String[] args) {
        System.out.println("=============Bem-vindo à nossa Instituição!=============\n");
        System.out.println("Digite seu nome completo: (Sem acentos)");
        Scanner sc1 = new Scanner(System.in);
        String nomeUsuario = sc1.nextLine();
        // {...implementação de armazenamento de contas(conta abaixo é só para fins de exemplo)}
        String conta = "12345-9";
        String agencia = "0001";
        System.out.println("Digite sua Senha(apenas numeros)");
        String senha = sc1.nextLine();
        System.out.println("Bem-vindo, " + nomeUsuario + ".\nSua Senha é: " + senha + "\nSua Conta é: "+ conta + "\nSua agência é: " + agencia + "\n==========Cadastro realizado com Sucesso!==========");
    }
}

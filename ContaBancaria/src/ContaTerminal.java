import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.println("Olá! Seja muito bem vindo. Por favor, insira o seu nome:");
        String name = input.nextLine();
        System.out.println("Por favor, informe o código da agência:");
        String agency = input.nextLine();
        System.out.println("Por favor, informe o número da conta:");
        int account = input.nextInt();
        System.out.println("Por favor, informe o saldo da conta");
        double balance = input.nextDouble();
        System.out.println("Olá, " + name + ", obrigado por criar uma conta em nosso banco, sua agência é " + agency + ", conta " + account + " e seu saldo de R$"  + balance + " já está disponível para saque");
        input.close();


    }
}

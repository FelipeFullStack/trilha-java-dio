package Exececoes;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main  {
    public static void main(String[] args) {


        try {
            ContaTerminal conta = new ContaTerminal();

            Scanner x = new Scanner(System.in);

            System.out.println("Digite o nome do titular da conta: ");
            conta.setNome(x.nextLine());

            System.out.println("Digite o número da conta: ");
            conta.setNumero(x.nextInt());

            x.nextLine();

            System.out.println("Digite a  conta: ");
            conta.setAgencia(x.nextLine());

            System.out.println("Digite o saldo da conta: ");
            conta.setSaldo(x.nextDouble());


            System.out.println("Olá " + conta.getNome() + ", obrigado por criar uma conta em nosso banco, sua agência é "+ conta.getAgencia() + ", " +
                    "conta "+ conta.getNumero() +" e seu saldo "+ conta.getSaldo()+" já está disponível para saque");


        }
        catch (InputMismatchException e) {
            System.out.println("Erro ao criar conta, informe os campos solicitaods corretamente");
        }
    }
}
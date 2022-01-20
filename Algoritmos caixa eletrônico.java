/*
Caixa Eletrônico Banco Do Polvo
 */
package banco_do_polvo;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Banco_do_Polvo {

    public static void main(String[] args) {
        Date relogio = new Date();
    
        System.out.println("A hora do sistema é: ");
        System.out.println(relogio.toString());
    
        Scanner entrada = new Scanner(System.in);
    
        //Declarações
        String cpfCorreto = "123.456.789-00";
        String cpfDigitado;
        String senhaCorreta = "123456";
        String senhaDigitada;
        String saldo1 = "";
        List<String> extrato = new ArrayList<String>();
        extrato.add("");
        int numero;
        int contador = 0;
    
        double saque1 = 0;
        double deposito;
        double saque;
        double saldo = 1000;
        do {
            // Inicio
            System.out.println("---------------------------------------------------------------------------");
            System.out.println(" Seja bem-vindo ao Banco do  Polvo. ");
            System.out.println("---------------------------------------------------------------------------");
    
            // Colher informação do CPF
            System.out.print("Digite seu CPF:  ");
            cpfDigitado = entrada.next();
            numero = 0;
            // Verificador CPF
            if (cpfDigitado.equals(cpfCorreto)) {
    
                // Colher informação da Senha
                System.out.print("Digite seu Senha:");
                senhaDigitada = entrada.next();
    
                // Verificador de Senha
                if (senhaDigitada.equals(senhaCorreta)) {
                    contador = 0;
    
                    while (numero != 5) {
                        //Menu
                        System.out.println("******* Menu *******");
                        System.out.println(" 1-Saldo \n 2-Deposito \n 3- Saque \n 4- Extrato \n 5-Sair ");
                        System.out.println("*******");
                        numero = entrada.nextInt();
    
                        switch (numero) {
    
                            case 1:
    
                                System.out.println("Saldo " + "R$" + saldo);
                                extrato.add("Saldo de R$" + saldo);
                                break;
    
                            case 2:
    
                                System.out.println(" Digite o valor do Deposito ");
                                deposito = entrada.nextDouble();
                                deposito = deposito;
                                saldo = deposito + saldo;
    
                                extrato.add(" Deposito de R$" + deposito);
    
                                System.out.println("Valor depositado com saldo atual : " + " R$" + saldo);
    
                                break;
    
                            case 3:
                                System.out.println("Digite o valor do Saque");
                                saque = entrada.nextDouble();
                                saque1 = saldo - saque;
                                saldo = saque1;
                                extrato.add("Saque de R$" + saque);
                                break;
    
                            case 4:
                                System.out.println("*******Extrato*******");
                                extrato.add("Saldo atual: R$" + saldo);
                                for (String string : extrato) {
                                    System.out.println(string);
                                }
                                System.out.println("*******");
                                break;
    
                            case 5:
                                System.out.println(" Obrigado! ");
                                System.out.println(" Lembre-se Lave sempre suas mão. ");
    
                                break;
                            default:
    
                                System.out.println(" Operação Invalida. ");
                        }
                    }
                } else {
    
                    System.out.println(" CPF ou Senha Invalidos. ");
                    contador++;
                }
    
            } else {
                contador++;
            }
    
        } while (contador < 3);
        System.out.print(contador);
    
        System.out.println(" Usurario Bloqueado ,procure a gerencia. ");
    
    }
}
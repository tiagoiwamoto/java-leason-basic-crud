/*
 * Tiago Henrique Iwamoto
 * tiago.iwamoto@gmail.com
 * linkedin.com/in/tiago-iwamoto
 * System specialist
 * 29/03/2022 | 21:02
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Aplicacao {

    public static void main(String[] args) {

        // Representa o banco de dados
        List<String> clientes = new ArrayList<>();
        int opcaoSelecionada = 0;


        while(opcaoSelecionada != 3){
            System.out.println("Bem vindo ao software de cadastro de cliente");
            System.out.println("1 - Cadastro de clientes");
            System.out.println("2 - Consulta de cliente");
            System.out.println("3 - Sair");
            Scanner scanner = new Scanner(System.in);
            System.out.print("Selecione a opção desejada: ");
            opcaoSelecionada = scanner.nextInt();
            System.out.println("Opção selecionada foi " + opcaoSelecionada);
            if(opcaoSelecionada == 1){
                System.out.println("Cadastro de cliente");
                System.out.print("Nome completo: ");
                scanner.nextLine();
                String nome = scanner.nextLine();
                System.out.print("Endereço: ");
                String endereco = scanner.nextLine();
                System.out.print("Idade: ");
                int idade = scanner.nextInt();

                String cliente = "nome: " + nome + "|" + "endereco: " + endereco + "|" + "idade: " + idade;
                clientes.add(cliente);
                System.out.println(clientes);
                System.out.println("Cliente cadastrado com sucesso!");

            } else if(opcaoSelecionada == 2){
                System.out.println("Consulta de cliente");
                System.out.print("Digite o nome do cliente: ");
                scanner.nextLine();
                String busca = scanner.nextLine();
                for(int posicao = 0; posicao < clientes.size(); posicao++){
                    if(clientes.get(posicao).contains(busca)){
                        System.out.println("O cliente localizado foi: " + clientes.get(posicao));
                        break;
                    }else if(clientes.size() - 1 == posicao){
                        System.out.println("Nenhum cliente foi encontrado");
                        break;
                    }
                }
            }else if(opcaoSelecionada == 3){
                System.out.println("Sistema será finalizado.");
            }else{
                System.out.println("Opção selecionada é inválida");
            }
        }
    }

}

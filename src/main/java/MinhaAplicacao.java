/*
 * Tiago Henrique Iwamoto
 * tiago.iwamoto@gmail.com
 * linkedin.com/in/tiago-iwamoto
 * System specialist
 * 07/04/2022 | 20:49
 */

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Scanner;

public class MinhaAplicacao {

    public static void main(String[] args) throws IOException {
        /*
            Realizar o cadastro e consulta de siglas do banco Itau
         */

        List<String> bancoDeDados = Files.readAllLines(Path.of("db.txt"));
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bem vindo ao sistema de cadastro e consulta de siglas!");
        System.out.println();
        System.out.print("Qual operação você deseja realizar ? [1]Cadastrar [2]Consultar: ");
        int operacaoSelecionada = scanner.nextInt();
        System.out.println("Opção selecionada foi: " + operacaoSelecionada);
        if(operacaoSelecionada == 1){
            System.out.println("Iniciando cadastro de nova sigla");
            System.out.println();
            System.out.print("Nome da sigla: ");
            String nomeDaSigla = scanner.next();
            scanner.nextLine();
            System.out.print("Descrição da sigla: ");
            String descricaoDaSigla = scanner.nextLine();
            System.out.print("Data de criação: ");
            String dataDeCriacao = scanner.nextLine();
            String novoRegistro = nomeDaSigla + "|" + descricaoDaSigla + "|" + dataDeCriacao;
            bancoDeDados.add(novoRegistro);
            Files.write(Path.of("db.txt"), bancoDeDados);
            bancoDeDados = Files.readAllLines(Path.of("db.txt"));
            System.out.println("Meu banco de dados depois de gravar " + bancoDeDados);
        }else if(operacaoSelecionada == 2){
            System.out.println("Iniciando consulta de sigla");
            System.out.println();
            System.out.println("Buscar por: ");
            scanner.nextLine();
            String buscarPor = scanner.nextLine();
            for(int x = 0; x <= bancoDeDados.size(); x++){
                // [0][1][2]...
                String registro = bancoDeDados.get(x);
                if(registro.contains(buscarPor)){
                    System.out.println("Encontrei o que você quer...");
                    System.out.println(registro);
                    break;
                }else if(bancoDeDados.size() - 1 == x){
                    System.out.println("Não localizei o que você quer...");
                    break;
                }
            }
        }else{
            System.out.println("Opcção selecionada é inválida.");
        }
    }

}

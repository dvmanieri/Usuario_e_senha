package br.com.fpoo.Lista_03;

import java.util.Scanner;

public class Exercicio_02 {

	public static void main(String[] args) {
//		2. Fa�a um programa que leia um nome de
//		usu�rio e a sua senha e n�o  aceite a senha 
//		igual ao nome do usu�rio, mostrando uma
//		mensagem  de erro e voltando a pedir as informa��es. 
		
		//atributos
		String Usuario;
		int senha;
		int menu = 1;
		
		//obj input
		Scanner ler = new Scanner(System.in);

		System.out.println("\t CADASTRO");		
		System.out.println("\ndigite o nome do Usuario: ");
		Usuario = ler.nextLine();//recependo as informa��es do usuario e da senha
		System.out.println("digite a sua senha: ");
		senha = ler.nextInt();
		//fun��o while para manter o usu�rio em um lupe para fazer o cadastro
		while (menu != 0) {
			System.out.println("\n\tMENU INICIAL");
			System.out.println("\nDigite o seu usu�rio: ");
			if(ler.nextLine().equals(Usuario)){  //tentei utilizar menos variaveis utilizando o if
				System.out.println("Digite a senha: ");
				if(ler.nextInt()==senha) {
					System.out.println("login efetuado");
					menu = 0;
				}else {System.out.println("Senha incorreta");}
				
			}else {System.out.println("Usuario incorreto");
			}
		}//se o usuario n�o acertar o nome e a senha ele n�o poder� proseguir 
	}

}
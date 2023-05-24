package br.com.fpoo.Lista_03;

import java.util.Scanner;

public class Exercicio_02 {

	public static void main(String[] args) {
//		2. Faça um programa que leia um nome de
//		usuário e a sua senha e não  aceite a senha 
//		igual ao nome do usuário, mostrando uma
//		mensagem  de erro e voltando a pedir as informações. 
		
		//atributos
		String Usuario;
		int senha;
		int menu = 1;
		
		//obj input
		Scanner ler = new Scanner(System.in);

		System.out.println("\t CADASTRO");		
		System.out.println("\ndigite o nome do Usuario: ");
		Usuario = ler.nextLine();//recependo as informações do usuario e da senha
		System.out.println("digite a sua senha: ");
		senha = ler.nextInt();
		//função while para manter o usuário em um lupe para fazer o cadastro
		while (menu != 0) {
			System.out.println("\n\tMENU INICIAL");
			System.out.println("\nDigite o seu usuário: ");
			if(ler.nextLine().equals(Usuario)){  //tentei utilizar menos variaveis utilizando o if
				System.out.println("Digite a senha: ");
				if(ler.nextInt()==senha) {
					System.out.println("login efetuado");
					menu = 0;
				}else {System.out.println("Senha incorreta");}
				
			}else {System.out.println("Usuario incorreto");
			}
		}//se o usuario não acertar o nome e a senha ele não poderá proseguir 
	}

}
package br.com.fpoo.Lista_03;

public class Exercicio_03 {

	public static void main(String[] args) {
//		3. Supondo que a popula��o de um pa�s A
//		seja da ordem de 80.000  habitantes com
//		uma taxa anual de crescimento de 3% e 
//		que a  popula��o de B seja 200.000 habitantes
//		com uma taxa de crescimento  de 1.5%. Fa�a um
//		programa que calcule e escreva o n�mero de 
//		anos  necess�rios para que a popula��o do pa�s 
//		A ultrapasse ou iguale a  popula��o do pa�s B,
//		mantidas as taxas de crescimento. 

		double Pais1 = 80000;
		double popu1 = 0;
		double Pais2 = 200000;
		double popu2 = 0;
		int contador = 0;
		while (Pais1 <= Pais2) {
			Pais1 = Pais1 * 1.03;// faz a conta d� somatoria de natalidade do pais
			Pais2 = Pais2 * 1.015;
			contador++;// contador par marcar os ano
			System.out.println("numero do Pais 1: " + Pais1);
			System.out.println("numero do Pais 2: " + Pais2);
		}
		System.out.println("v�o ser: " + contador + " anos ");
	}

}

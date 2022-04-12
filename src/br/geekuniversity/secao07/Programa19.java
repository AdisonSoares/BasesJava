/*Documentação por Javadoc:*/
/**
 * Matriz parte 2
 * OBS - O laço i cobre os valores da linha e o laço j os valores da coluna da matriz
 * @author Positivo
 *
 */

package br.geekuniversity.secao07;
public class Programa19 {
	public static void main(String[] args) {
		int matriz[][] = new int [3][3];
		
		//Inicializando
		matriz[0][0]= 1;
		matriz[0][1]= 3;
		matriz[0][2]= 5;
		matriz[1][0]= 7;
		matriz[1][1]= 9;
		matriz[1][2]= 11;
		matriz[2][0]= 13;
		matriz[2][1]= 15;
		matriz[2][2]= 17;
		
		System.out.println(matriz[1][2]);
		
		for(int i = 0;i<matriz.length; i++) {
			for(int j=0; j<matriz[i].length; j++) {
				System.out.println(matriz[i][j]);
			}
		}	
		for(int i=0;i<matriz.length; i++) {
			for(int j=0; j<matriz[i].length; j++) {
				matriz[i][j]=i+j*2;
			}
		}
		for(int i=0;i<matriz.length; i++) {
			for(int j=0; j<matriz[i].length; j++) {
				System.out.println(matriz[i][j]);
			}
		}
	}	
}

// OPERA��ES COM MATRIZES (ordem 2)  em Java
// Autor: Cassia  30/06/2022

package projeto_operacao_matrizes;
import java.util.Scanner;

public class Main {

	public static final int LINHA = 2; // Definindo as constantes Linhas e Colunas
	public static final int COLUNA = 2;

	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);

			//Definindo as vari�veis das Matrizes
			int[][] Matriz1 = new int[LINHA][COLUNA];
			int[][] Matriz2 = new int[LINHA][COLUNA];
			int[][] MatrizSoma = new int[LINHA][COLUNA];
			int[][] MatrizSubtr = new int[LINHA][COLUNA];
			int[][] MatrizMult = new int[LINHA][COLUNA];
			int[][] MatrizTrans1 = new int[LINHA][COLUNA];
			int[][] MatrizTrans2 = new int[LINHA][COLUNA];
			
			// Definindo as vari�veis de Controle
			int i, j, k;
			int opcao;
			int loop=1; // Vari�vel Verdadeira
			
			System.out.println();
			System.out.println(" <<! ------ OPERA��ES DE MATRIZES INTEIRAS DE ORDEM 2X2 ------ !>> ");
			System.out.println();
			
			//Elementos da Matriz 1 /////////////////////////
			System.out.println("Dados da  MATRIZ 1: "); 
			for(i=0; i<LINHA; i++) {
				for(j=0; j<COLUNA; j++) {
					System.out.print(" Elemento [" + (i+1) +  "," + (j+1) + "]: ");
					Matriz1[i][j] = sc.nextInt();
				}
			}
			System.out.println();
			
			//Elementos da Matriz 2 //////////////////////////
			System.out.println("Dados da  MATRIZ 2: "); 
			for(i=0; i<LINHA; i++) {
				for(j=0; j<COLUNA; j++) {
					System.out.print(" Elemento [" + (i+1) + "," + (j+1) + "]: ");
					Matriz2[i][j] = sc.nextInt();
				}
			}
			System.out.println();
			
			//Imprimindo Matriz 1 na tela ////////////////////////////////////////////////////////// 
			System.out.println("MATRIZ 1 digitada: ");
			for(i=0; i<LINHA; i++) {
				System.out.print(" | ");
				for(j=0; j<COLUNA; j++) {
					System.out.print(" " + Matriz1[i][j] + " | ");
				}
				System.out.println();
			}
			System.out.println();
			
			//Imprimindo Matriz 2 na tela //////////////////////////////////////////////////////////
			System.out.println("MATRIZ 2 digitada: ");
			for(i=0; i<LINHA; i++) {
				System.out.print(" | ");
				for(j=0; j<COLUNA; j++) {
					System.out.print(Matriz2[i][j] + " |  ");
				}
				System.out.println();
			}
			System.out.println();
			
			////////////////////////////// C�lculos ////////////////////////////////////
			
			System.out.println();
			while(loop == 1) { //loop infinito (Verdadeiro)
						
				System.out.println("**************************** MENU DE OPERA��ES ****************************"); // Menu
				System.out.println(" 1 - SOMA ");
				System.out.println(" 2 - SUBTRA��O ");
				System.out.println(" 3 - MULTIPLICA��O ");
				System.out.println(" 4 - TRANSPOSTA ");		
				System.out.println(" 5 - SAIR ");				
				
				System.out.println();
				System.out.print(">>> Qual opera�ao deseja, selecione um numero: ");
				opcao = sc.nextInt();
				
				System.out.println();
				switch(opcao) {
					case 1: // Soma /////////////////////////////////////////////
						for(i=0; i<LINHA; i++) {
							for(j=0; j<COLUNA; j++) {
								MatrizSoma[i][j] = Matriz1[i][j] + Matriz2[i][j]; // Opera��o soma
							}
						}
								
						//Imprimindo a Soma //////////////////////////////////////////////////////
						System.out.println(" SOMA: ");
						for(i=0; i<LINHA; i++) {
							System.out.print(" | ");
							for(j=0; j<COLUNA; j++) {
								System.out.print(MatrizSoma[i][j] + " | ");
								}
							System.out.println();
							}
						System.out.println();
						break;
								
					case 2: //Subtra��o /////////////////////////////////////////////
						for(i=0; i<LINHA; i++) {
							for(j=0; j<COLUNA; j++) {
								MatrizSubtr[i][j] = Matriz1[i][j] - Matriz2[i][j]; // Opera��o subtra��o
							}
						}
								
						//Imprimindo a subtra��o //////////////////////////////////////////////
						System.out.println(" SUBTRA��O: ");
						for(i=0; i<LINHA; i++) {
							System.out.print(" | ");
							for(j=0; j<COLUNA; j++) {
								System.out.print(MatrizSubtr[i][j] + " | ");
							}
							System.out.println();
						}
						System.out.println();
						break;
								
					case 3: //Multiplica��o /////////////////////////////////////////////
						for(i=0; i<LINHA; i++) {
							for(j=0; j<COLUNA; j++) {
								MatrizMult[i][j] = 0;
								for(k=0; k<COLUNA; k++) {
									MatrizMult[i][j] = MatrizMult[i][j] + (Matriz1[i][k] * Matriz2[k][j]); // Opera��o Multiplica��o
									}
								}
							}
								
							//Imprimindo a multiplica��o ////////////////////////////////////////////////////////
							System.out.println(" MULTIPLICA��O: ");
							for(i=0; i<LINHA; i++) {
								System.out.print(" | ");
								for(j=0; j<COLUNA; j++) {
									System.out.print(MatrizMult[i][j] + " | ");
								}
								System.out.println();
							}
							System.out.println();
							break;
						
					case 4: // Matriz 1 Transposta ///////////////////////////////////////////////////// 
						for(i=0; i<LINHA; i++) {
							for(j=0; j<COLUNA; j++) {
								MatrizTrans1[i][j] = Matriz1[j][i]; // Opera��o Transposta Matriz 1
							}
						}
									
						// Matriz 2 Transposta ///////////////////////////////////////////////////////////
						for(i=0; i<LINHA; i++) {
							for(j=0; j<COLUNA; j++) {
								MatrizTrans2[i][j] = Matriz2[j][i]; // Opera��o Transposta Matriz 2
							}
						}
								
						//Imprimindo a Matriz 1 Transposta ////////////////////////////////////////////////////////	
						System.out.println(" Matriz 1 Transposta: ");
						for(i=0; i<LINHA; i++) {
							System.out.print(" | ");
							for(j=0; j<COLUNA; j++) {
								System.out.print(MatrizTrans1[i][j] + " | ");
							}
							System.out.println();
						}
						System.out.println();
								
						//Imprimindo a Matriz 2 Transposta ////////////////////////////////////////////////////////	
						System.out.println(" Matriz 2 Transposta: ");
						for(i=0; i<LINHA; i++) {
							System.out.print(" | ");
							for(j=0; j<COLUNA; j++) {
								System.out.print(MatrizTrans2[i][j] + " | ");
							}
							System.out.println();
						}
						System.out.println();
						break;
								
					case 5:// Sair ///////////////////////////////////////////////////////////////////////////////////////
						loop = 0;
						System.out.println("Fim das opera��es!");
						break;
						
					default:
						System.out.println("Nenhuma opera��o foi selecionada!");		
									
				}//Fim do Switch case			
			}// Fim do loop
		

	}

}

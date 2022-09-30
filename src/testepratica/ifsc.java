package testepratica;

import java.util.Iterator;

import javax.swing.JOptionPane;

/***
 * 
 * @author Vinicius 
 * @date 30/09/2022
 * @version 1.0
 *
 */
public class ifsc {

	public static void main(String[] args) {
		

	}

	/**
	 * pegar um vetor e multiplicar todos os elementos 
	 * desse vetor e retornar em um novo vetor.
	 * 
	 * @param vet
	 * @return nvVetor
	 */
	public Double[] multiplicaVetor(Double[] vet) {
		
		Double [] nvVetor = new Double[vet.length];
		
		for (int i = 0; i < nvVetor.length; i++) {
			
			nvVetor[i] *= vet[i] ;
		}
		
		return nvVetor;
	}
}

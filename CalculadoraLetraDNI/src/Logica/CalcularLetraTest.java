package Logica;

import java.util.ArrayList;
import java.util.Scanner;

import org.junit.Test;

import junit.framework.Assert;

public class CalcularLetraTest {
	ArrayList <Character> letras;
	String dni;
	@Test
	public void test() {
		Scanner sc = new Scanner(System.in);
		dni = sc.nextLine();
		this.llenaArray();
		CalcularLetra CL = new CalcularLetra(dni);
		int dniToInt = Integer.parseInt(dni);
		int resto = dniToInt%23;
		char letraParaProbar = letras.get(resto);
		char letra = CL.devolverLetra();
		Assert.assertEquals(letraParaProbar, letra);
			
		}
	
	public void llenaArray(){
		letras = new ArrayList <Character>();
	
		letras.add('T');
		letras.add('R');
		letras.add('W');
		letras.add('A');
		letras.add('G');
		letras.add('M');
		letras.add('Y');
		letras.add('F');
		letras.add('P');
		letras.add('D');
		letras.add('X');
		letras.add('B');
		letras.add('N');
		letras.add('J');
		letras.add('Z');
		letras.add('S');
		letras.add('Q');
		letras.add('V');
		letras.add('H');
		letras.add('L');
		letras.add('C');
		letras.add('K');
		letras.add('E');	
	}

}

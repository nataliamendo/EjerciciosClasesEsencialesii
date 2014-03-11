package Ejercicio9;

import java.io.IOException;

public class App9 {
	
	public static void main(String args[]) 
	{
		System.out.println("Ejercicio de Threads");
		
			CuentaAtras9 contador1 = new CuentaAtras9();
			CuentaAtras9 contador2 = new CuentaAtras9();
			CuentaAtras9 contador3 = new CuentaAtras9();
			
			contador1.dame_datos("ID1", 4);
			contador2.dame_datos("ID2", 7);
			contador3.dame_datos("ID3", 8);
			
			try {
				(new Thread(contador1)).start();
				(new Thread(contador2)).start();
				(new Thread(contador3)).start();
				} catch (Exception e) {
					// Printamos las excepciones que aparezcan
					e.printStackTrace();
			    }

		}
		
	}



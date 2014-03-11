package Ejercicio8;

import java.io.IOException;

public class App8 {
	
	public static void main(String args[]) 
	{
		System.out.println("Ejercicio de Threads");
		
		try
		{
			CuentaAtras8 contador1 = new CuentaAtras8();
			CuentaAtras8 contador2 = new CuentaAtras8();
			CuentaAtras8 contador3 = new CuentaAtras8();
			
			contador1.dame_datos("ID1", 4);
			contador2.dame_datos("ID2", 7);
			contador3.dame_datos("ID3", 8);
			
			contador1.start();
			contador2.start();
			contador3.start();
			
			
			
		}
		catch(Exception e)
		{
			System.out.println(e.getCause());
		}
	}

}

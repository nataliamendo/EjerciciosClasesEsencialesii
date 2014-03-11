package Ejercicio8;

import java.util.Set;

public class CuentaAtras8 extends Thread {
	
	//en esta clase se distinguirán el método run() para hacer 'correr' el thread.
	//también un método al que le pasaremos los valores del ID y de 
	//						número desde el que queremos hacer la cuenta atrás
	public String ID;
	public int numero;
	
	public void run()   
	{
		
	    try 
	    {
			while(numero!=0)
			{
				System.out.println("** "+ ID + ", " + "Cuenta atrás " + numero);
				numero--;
			}
	        Thread.sleep(1000);
	      
	    }
	    catch(InterruptedException e)     
	    {
	       e.printStackTrace();
	    }
	  }
	
	public  synchronized void dame_datos(String id, int num)
	{
		ID = id;
		numero = num;
	}

}

package Ejercicio10;

import Ejercicio10.CuentaAtras9;

//***********************************************
//* 			THREAD RUNNABLE					*
//***********************************************


public class CuentaAtras9 implements Runnable {
	
	//en esta clase se distinguirán el método run() para hacer 'correr' el thread.
	//también un método al que le pasaremos los valores del ID y de 
	//						número desde el que queremos hacer la cuenta atrás
	
	
	public String ID;
	public int numero;

	//variable local donde guardamos la última escritura:
	public static String ultimaEscritura="No hay escritura previa";
	
	public  synchronized void dame_datos(String id, int num)
	{
		ID = id;
		numero = num;
	}

	//declaramos métodos para la Ultima escritura- GET & SET UltimaEscritura
	public static String getUltimaEscritura() 
	{
		return ultimaEscritura; //devuelve variable global 'ultimaEscritura'
	}

	public static void setUltimaEscritura(String ultimaEscritura) 
	{
		CuentaAtras9.ultimaEscritura = ultimaEscritura;
		//le pasamos valor de la últimaEscritura y la guarda en la última variable global
	}

	public void run()   
	{
	    try 
	    {
			for (;;)
			{
				if(numero==0)
				{
					break;
				}
				else
				{
					//ID2 – 6 - Ultima escritura ID1
					System.out.println(ID + " - " + numero + " - " + getUltimaEscritura());
					numero= numero - 1;
				}
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			setUltimaEscritura("Última escritura " + ID);
	        Thread.sleep(1000);
	      
	    }
	    catch(InterruptedException e)     
	    {
	       e.printStackTrace();
	    }
	    
	    finally{
	    	System.out.println("Fin del thread " + ID);
	    }
	  }
	

}


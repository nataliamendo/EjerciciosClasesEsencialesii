package Ejercicio10;


//vamos a distinguir llamar a los dos threads por separado - sin Runnable y con Runnable
public class Principal_8y9 {

	public static void main(String[] arg)
	{
		CuentaAtras8 ca8_1 = new CuentaAtras8();
		CuentaAtras8 ca8_2 = new CuentaAtras8();
		CuentaAtras8 ca8_3 = new CuentaAtras8();
		

		ca8_1.dame_datos("ID1", 4);
		ca8_2.dame_datos("ID2", 7);
		ca8_3.dame_datos("ID3", 8);
		
		
		ca8_1.start();
		
		ca8_2.start();
		
		ca8_3.start();
		
		
		//cogemos la última escritura de los threads sin runnable y se la pasamos a los otros threads
		
		CuentaAtras9 ca9_1 = new CuentaAtras9();
		
		CuentaAtras9 ca9_2 = new CuentaAtras9();
		
		CuentaAtras9 ca9_3 = new CuentaAtras9();
		
		ca9_1.dame_datos("ID1R", 4);
		ca9_2.dame_datos("ID2R", 7);
		ca9_3.dame_datos("ID3R", 8);
		
		
		
		try {
			(new Thread(ca9_1)).start();
			(new Thread(ca9_2)).start();
			(new Thread(ca9_3)).start();
			} catch (Exception e) {
				// Printamos las excepciones que aparezcan
				e.printStackTrace();
		    }
		
		
	}
}

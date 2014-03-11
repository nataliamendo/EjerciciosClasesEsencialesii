package Ejercicio9;

//***********************************************
//*             THREAD RUNNABLE            *
//***********************************************

public class CuentaAtras9 implements Runnable {

	// en esta clase se distinguirán el método run() para hacer 'correr' el
	// thread.
	// también un método al que le pasaremos los valores del ID y de
	// número desde el que queremos hacer la cuenta atrás

	public String ID;
	public int numero;

	public void dame_datos(String id, int num) {
		ID = id;
		numero = num;
	}

	public void run() {
		try {
			for (;;)
			{
				if (numero == 0) {
					break;
				} 
				else 
				{
					// ID2 – 6 - Ultima escritura ID1
					System.out.println(ID + " - Cuenta atrás: " + numero);
					numero = numero - 1;
				}
			}
		}

		finally {
			System.out.println("Fin del thread " + ID);
		}
	}

}
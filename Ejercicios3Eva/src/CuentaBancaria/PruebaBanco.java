package CuentaBancaria;

public class PruebaBanco {

	public static void main(String[] args) {
		
		SuperclaseCuentaAhorro cuentaAhorro = new CuentaAhorro("50001", 0);
		CuentaCorriente cuentaCorriente = new CuentaCorriente("20001", 0);

		for (int i = 1; i < 11; i++) {
			
			System.out.println("Para el mes: " + i);	
			System.out.println("");
				
			cuentaAhorro.depositar(1500);
			cuentaCorriente.depositar(2000);

			cuentaAhorro.cargoMensual();
			cuentaCorriente.cobrarCuotaMensual();

			cuentaAhorro.interesAnual(8);
			cuentaCorriente.interesAnual(8);

			cuentaAhorro.mostrarSaldo();
			cuentaCorriente.mostrarSaldo();
			
			System.out.println("------");

			}
	

	}
}

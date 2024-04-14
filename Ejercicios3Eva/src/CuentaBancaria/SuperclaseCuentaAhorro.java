package CuentaBancaria;

public abstract class SuperclaseCuentaAhorro extends CuentaBancaria {

	public SuperclaseCuentaAhorro(String numeroCuenta, double saldo, double id) {
		super(numeroCuenta, saldo, id);
	}

	@Override
	public void interesAnual(double tasaInteres) {
	    	
	   //Interés que recibe la cuenta de ahorro
	    	
	        super.interesAnual(tasaInteres);
	    }

	public void cargoMensual() {
	
		
	    if (saldo <= 200) {
	        saldo -= 5;
	    }
	}

}
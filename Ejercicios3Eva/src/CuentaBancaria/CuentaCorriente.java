package CuentaBancaria;

public class CuentaCorriente extends CuentaBancaria {
	
	
    private double cuotaMensual = 5; 
    public double getCuotaMensual() {
		return cuotaMensual;
	}



	public void setCuotaMensual(double cuotaMensual) {
		this.cuotaMensual = cuotaMensual;
	}



	public double getSaldoMinimoInteres() {
		return saldoMinimoInteres;
	}



	public void setSaldoMinimoInteres(double saldoMinimoInteres) {
		this.saldoMinimoInteres = saldoMinimoInteres;
	}

	private double saldoMinimoInteres = 500;

    
    
    public CuentaCorriente(String numeroCuenta, double saldo) {
    	
        super(numeroCuenta, saldo, saldo);
    }

    
    
    @Override
    
    public void interesAnual(double tasaInteres) {
    	
        if (saldo > saldoMinimoInteres) {
        	
            super.interesAnual(tasaInteres);
        }
    }

    public void cobrarCuotaMensual() {
        saldo -= cuotaMensual ;
    }
}
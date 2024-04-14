package CuentaBancaria;

public abstract class CuentaBancaria {
	
    private String numeroCuenta;
    public String getNumeroCuenta() {
		return numeroCuenta;
	}

	public void setNumeroCuenta(String numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public double saldo;
    
    

    public CuentaBancaria(String numeroCuenta, double saldo, double id) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
        
    }

    public void depositar(double cantidad) {
        saldo += cantidad;
    }

    public void interesAnual(double tasaInteres) {
    	
        double interes = saldo * tasaInteres / 100;
        saldo += interes;
    }

    public void mostrarSaldo() {
        System.out.println("Saldo de la cuenta " + numeroCuenta + ": " + saldo + " €");
    }
}
package CuentaBancaria;

public class CuentaAhorro extends SuperclaseCuentaAhorro {
	
	
    public CuentaAhorro(String numeroCuenta, double saldo) {
        
    	super(numeroCuenta, saldo, saldo);
    	
    }

    
    //Cargo mensual si el saldo supera los 200€, se te cobran 5€ por mes

}
package modelo;


import java.time.LocalDate;

public class CuentaCorriente extends Cuenta {
	
	private TarjetaDeCredito tarjetaDeCredito;

	
	
	
	
	public CuentaCorriente(int numeroCuenta, LocalDate fechaApertura, float saldo, String tipoDeInteres,
			TarjetaDeCredito tarjetaDeCredito) {
		super(numeroCuenta, fechaApertura, saldo, tipoDeInteres);
		this.tarjetaDeCredito = tarjetaDeCredito;
	}






	public TarjetaDeCredito getTarjetaDeCredito() {
		return tarjetaDeCredito;
	}

	public void setTarjetaDeCredito(TarjetaDeCredito tarjetaDeCredito) {
		this.tarjetaDeCredito = tarjetaDeCredito;
	}
	 
	

}

package proyectoModel.entities;

import java.util.Date;

public class Deposito {

	private int idDeposito;
	private Date fecha;
	private int dineroDepositado;
	private int numCuenta;

	
	public Deposito() {
		// TODO Auto-generated constructor stub
	}


	public Deposito(int idDeposito, Date fecha, int dineroDepositado, int numCuenta) {
		this.idDeposito = idDeposito;
		this.fecha = fecha;
		this.dineroDepositado = dineroDepositado;
		this.numCuenta = numCuenta;
	}


	public int getIdDeposito() {
		return idDeposito;
	}


	public void setIdDeposito(int idDeposito) {
		this.idDeposito = idDeposito;
	}


	public Date getFecha() {
		return fecha;
	}


	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}


	public int getDineroDepositado() {
		return dineroDepositado;
	}


	public void setDineroDepositado(int dineroDepositado) {
		this.dineroDepositado = dineroDepositado;
	}


	public int getNumCuenta() {
		return numCuenta;
	}


	public void setNumCuenta(int numCuenta) {
		this.numCuenta = numCuenta;
	}


	@Override
	public String toString() {
		return "Deposito [idDeposito=" + idDeposito + ", fecha=" + fecha + ", dineroDepositado=" + dineroDepositado
				+ ", numCuenta=" + numCuenta + "]";
	}

	
	
}

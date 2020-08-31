package proyectoModel.entities;

import java.util.Date;

public class CuentaAhorroVivienda {
	
	private int numCuenta;
	private int saldo;
	private Date fechaApertura;
	private String nombreBanco;
	private String tipoCuentaBancaria;
	
	
	
	public CuentaAhorroVivienda() {
		// TODO Auto-generated constructor stub
	}



	public CuentaAhorroVivienda(int numCuenta, int saldo, Date fechaApertura, String nombreBanco,
			String tipoCuentaBancaria) {
		this.numCuenta = numCuenta;
		this.saldo = saldo;
		this.fechaApertura = fechaApertura;
		this.nombreBanco = nombreBanco;
		this.tipoCuentaBancaria = tipoCuentaBancaria;
	}



	public int getNumCuenta() {
		return numCuenta;
	}



	public void setNumCuenta(int numCuenta) {
		this.numCuenta = numCuenta;
	}



	public int getSaldo() {
		return saldo;
	}



	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}



	public Date getFechaApertura() {
		return fechaApertura;
	}



	public void setFechaApertura(Date fechaApertura) {
		this.fechaApertura = fechaApertura;
	}



	public String getNombreBanco() {
		return nombreBanco;
	}



	public void setNombreBanco(String nombreBanco) {
		this.nombreBanco = nombreBanco;
	}



	public String getTipoCuentaBancaria() {
		return tipoCuentaBancaria;
	}



	public void setTipoCuentaBancaria(String tipoCuentaBancaria) {
		this.tipoCuentaBancaria = tipoCuentaBancaria;
	}



	@Override
	public String toString() {
		return "CuentaAhorroVivienda [numCuenta=" + numCuenta + ", saldo=" + saldo + ", fechaApertura=" + fechaApertura
				+ ", nombreBanco=" + nombreBanco + ", tipoCuentaBancaria=" + tipoCuentaBancaria + "]";
	}
	
	
	
	
	

}

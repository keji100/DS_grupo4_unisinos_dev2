package com.unisinos.dev2.vo;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Venda implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer oid;
	private String nomeVendedor;
	private String nomeCliente;
	private double valorVenda;
	
	public Venda() {}
	
	public Venda(Integer oid, String nomeVendedor, String nomeCliente, double valorVenda) {
		super();
		this.oid = oid;
		this.nomeVendedor = nomeVendedor;
		this.nomeCliente = nomeCliente;
		this.valorVenda = valorVenda;
	}

	public String getNomeVendedor() {
		return nomeVendedor;
	}
	
	public void setNomeVendedor(String nomeVendedor) {
		this.nomeVendedor = nomeVendedor;
	}
	
	public String getNomeCliente() {
		return nomeCliente;
	}
	
	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	
	public double getValorVenda() {
		return valorVenda;
	}
	
	public void setValorVenda(double valorVenda) {
		this.valorVenda = valorVenda;
	}
	
}

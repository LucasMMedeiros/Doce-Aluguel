package br.ucb.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Empresa implements Serializable{
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name="idEmpresa")
	private long id;
	@Column(name="nomeEmpresa")
	private String nome;
	private int CNPJ;
	@Column(name="empresaEndereco")
	private String endereco;
		
	public Empresa(){
		
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getCNPJ() {
		return CNPJ;
	}

	public void setCNPJ(int cNPJ) {
		CNPJ = cNPJ;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
}

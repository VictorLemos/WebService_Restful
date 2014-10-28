package br.com.restful.model;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Produto implements Serializable{

	private int codProduto;
	
	private String refProduto;
	
	private String nomeProduto;
	
	private String descricao;
	
	private float preco;
	
	private String logradouro;
	
	private int numero;
	
	private String bairro;

	public int getCodProduto() {
		return codProduto;
	}

	public void setCodProduto(int codProduto) {
		this.codProduto = codProduto;
	}

	public String getRefProduto() {
		return refProduto;
	}

	public void setRefProduto(String refProduto) {
		this.refProduto = refProduto;
	}

	public String getNomeProduto() {
		return nomeProduto;
	}

	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	@Override
	public String toString() {
		return "Produto [codProduto=" + codProduto + ", refProduto="
				+ refProduto + ", nomeProduto=" + nomeProduto + ", descricao="
				+ descricao + ", preco=" + preco + ", logradouro=" + logradouro
				+ ", numero=" + numero + ", bairro=" + bairro + "]";
	}

	
   
}

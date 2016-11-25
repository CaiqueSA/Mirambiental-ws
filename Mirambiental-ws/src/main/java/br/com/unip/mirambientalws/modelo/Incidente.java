//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.7 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2016.11.24 às 10:26:08 AM BRST 
//

package br.com.unip.mirambientalws.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "INCIDENTE")
public class Incidente {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	protected int idIncidente;
	protected int idTipoIncidente;
	protected int idUsuario;
	protected String endereco;
	@Column(name = "imagem", columnDefinition = "blob")
	protected byte[] imagem;

	/**
	 * Obtém o valor da propriedade idIncidente.
	 * 
	 */
	public int getIdIncidente() {
		return idIncidente;
	}

	/**
	 * Define o valor da propriedade idIncidente.
	 * 
	 */
	public void setIdIncidente(int value) {
		this.idIncidente = value;
	}

	/**
	 * Obtém o valor da propriedade idTipoIncidente.
	 * 
	 */
	public int getIdTipoIncidente() {
		return idTipoIncidente;
	}

	/**
	 * Define o valor da propriedade idTipoIncidente.
	 * 
	 */
	public void setIdTipoIncidente(int value) {
		this.idTipoIncidente = value;
	}

	/**
	 * Obtém o valor da propriedade idUsuario.
	 * 
	 */
	public int getIdUsuario() {
		return idUsuario;
	}

	/**
	 * Define o valor da propriedade idUsuario.
	 * 
	 */
	public void setIdUsuario(int value) {
		this.idUsuario = value;
	}

	/**
	 * Obtém o valor da propriedade endereco.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getEndereco() {
		return endereco;
	}

	/**
	 * Define o valor da propriedade endereco.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setEndereco(String value) {
		this.endereco = value;
	}

	/**
	 * Obtém o valor da propriedade imagem.
	 * 
	 * @return possible object is byte[]
	 */
	public byte[] getImagem() {
		return imagem;
	}

	/**
	 * Define o valor da propriedade imagem.
	 * 
	 * @param value
	 *            allowed object is byte[]
	 */
	public void setImagem(byte[] value) {
		this.imagem = value;
	}

}

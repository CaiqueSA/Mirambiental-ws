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
@Table(name = "USUARIO")
public class Usuario {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "idUsuario")
	protected int idUsuario;

	@Column(name = "nomeUsuario")
	protected String nomeUsuario;

	@Column(name = "senhaUsuario")
	protected String senhaUsuario;

	@Column(name = "imagemUsuario")
	protected String imagemUsuario;

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
	 * Obtém o valor da propriedade nomeUsuario.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getNomeUsuario() {
		return nomeUsuario;
	}

	/**
	 * Define o valor da propriedade nomeUsuario.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setNomeUsuario(String value) {
		this.nomeUsuario = value;
	}

	/**
	 * Obtém o valor da propriedade senhaUsuario.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getSenhaUsuario() {
		return senhaUsuario;
	}

	/**
	 * Define o valor da propriedade senhaUsuario.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setSenhaUsuario(String value) {
		this.senhaUsuario = value;
	}

	/**
	 * Obtém o valor da propriedade imagemUsuario.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getImagemUsuario() {
		return imagemUsuario;
	}

	/**
	 * Define o valor da propriedade imagemUsuario.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setImagemUsuario(String value) {
		this.imagemUsuario = value;
	}

}

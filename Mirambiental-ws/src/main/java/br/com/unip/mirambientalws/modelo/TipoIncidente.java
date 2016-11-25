//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.7 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2016.11.24 às 10:26:08 AM BRST 
//

package br.com.unip.mirambientalws.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TIPOINCIDENTE")
public class TipoIncidente {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	protected int idTipoIncidente;
	protected String descricao;

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
	 * Obtém o valor da propriedade descricao.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getDescricao() {
		return descricao;
	}

	/**
	 * Define o valor da propriedade descricao.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setDescricao(String value) {
		this.descricao = value;
	}

}

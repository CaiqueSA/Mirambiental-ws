//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.7 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2016.11.24 às 02:08:18 AM BRST 
//

package br.com.unip.mirambientalws.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Classe Java de tipoIncidente complex type.
 * 
 * <p>
 * O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro
 * desta classe.
 * 
 * <pre>
 * &lt;complexType name="tipoIncidente">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idTipoIncidente" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="descricao" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoIncidente", propOrder = { "idTipoIncidente", "descricao" })
@Entity
public class TipoIncidente {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	protected int idTipoIncidente;
	@XmlElement(required = true)
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

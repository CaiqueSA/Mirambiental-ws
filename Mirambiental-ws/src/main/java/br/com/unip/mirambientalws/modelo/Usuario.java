//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.7 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2016.11.24 às 01:49:18 AM BRST 
//


package br.com.unip.mirambientalws.modelo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de usuario complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="usuario">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idUsuario" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="nomeUsuario" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="senhaUsuario" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="imagemUsuario" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "usuario", propOrder = {
    "idUsuario",
    "nomeUsuario",
    "senhaUsuario",
    "imagemUsuario"
})
public class Usuario {

    protected int idUsuario;
    @XmlElement(required = true)
    protected String nomeUsuario;
    @XmlElement(required = true)
    protected String senhaUsuario;
    @XmlElement(required = true)
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
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomeUsuario() {
        return nomeUsuario;
    }

    /**
     * Define o valor da propriedade nomeUsuario.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomeUsuario(String value) {
        this.nomeUsuario = value;
    }

    /**
     * Obtém o valor da propriedade senhaUsuario.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSenhaUsuario() {
        return senhaUsuario;
    }

    /**
     * Define o valor da propriedade senhaUsuario.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSenhaUsuario(String value) {
        this.senhaUsuario = value;
    }

    /**
     * Obtém o valor da propriedade imagemUsuario.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImagemUsuario() {
        return imagemUsuario;
    }

    /**
     * Define o valor da propriedade imagemUsuario.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImagemUsuario(String value) {
        this.imagemUsuario = value;
    }

}

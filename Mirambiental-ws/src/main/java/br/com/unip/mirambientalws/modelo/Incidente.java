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
 * <p>Classe Java de incidente complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="incidente">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idIncidente" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="idTipoIncidente" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="idUsuario" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="endereco" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="imagem" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "incidente", propOrder = {
    "idIncidente",
    "idTipoIncidente",
    "idUsuario",
    "endereco",
    "imagem"
})
public class Incidente {

    protected int idIncidente;
    protected int idTipoIncidente;
    protected int idUsuario;
    @XmlElement(required = true)
    protected String endereco;
    @XmlElement(required = true)
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
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndereco() {
        return endereco;
    }

    /**
     * Define o valor da propriedade endereco.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndereco(String value) {
        this.endereco = value;
    }

    /**
     * Obtém o valor da propriedade imagem.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getImagem() {
        return imagem;
    }

    /**
     * Define o valor da propriedade imagem.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setImagem(byte[] value) {
        this.imagem = value;
    }

}

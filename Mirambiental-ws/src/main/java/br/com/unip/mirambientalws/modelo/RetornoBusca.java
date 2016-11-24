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
 * <p>Classe Java de retornoBusca complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="retornoBusca">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="usuario" type="{modelo.mirambientalws.unip.com.br}usuario"/>
 *         &lt;element name="incidente" type="{modelo.mirambientalws.unip.com.br}incidente"/>
 *         &lt;element name="tipoIncidente" type="{modelo.mirambientalws.unip.com.br}tipoIncidente"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "retornoBusca", propOrder = {
    "usuario",
    "incidente",
    "tipoIncidente"
})
public class RetornoBusca {

    @XmlElement(required = true)
    protected Usuario usuario;
    @XmlElement(required = true)
    protected Incidente incidente;
    @XmlElement(required = true)
    protected TipoIncidente tipoIncidente;

    /**
     * Obtém o valor da propriedade usuario.
     * 
     * @return
     *     possible object is
     *     {@link Usuario }
     *     
     */
    public Usuario getUsuario() {
        return usuario;
    }

    /**
     * Define o valor da propriedade usuario.
     * 
     * @param value
     *     allowed object is
     *     {@link Usuario }
     *     
     */
    public void setUsuario(Usuario value) {
        this.usuario = value;
    }

    /**
     * Obtém o valor da propriedade incidente.
     * 
     * @return
     *     possible object is
     *     {@link Incidente }
     *     
     */
    public Incidente getIncidente() {
        return incidente;
    }

    /**
     * Define o valor da propriedade incidente.
     * 
     * @param value
     *     allowed object is
     *     {@link Incidente }
     *     
     */
    public void setIncidente(Incidente value) {
        this.incidente = value;
    }

    /**
     * Obtém o valor da propriedade tipoIncidente.
     * 
     * @return
     *     possible object is
     *     {@link TipoIncidente }
     *     
     */
    public TipoIncidente getTipoIncidente() {
        return tipoIncidente;
    }

    /**
     * Define o valor da propriedade tipoIncidente.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoIncidente }
     *     
     */
    public void setTipoIncidente(TipoIncidente value) {
        this.tipoIncidente = value;
    }

}

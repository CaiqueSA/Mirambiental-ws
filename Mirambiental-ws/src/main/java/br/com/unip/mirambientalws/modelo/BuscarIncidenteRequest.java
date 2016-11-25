//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.7 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2016.11.24 às 05:34:25 PM BRST 
//


package br.com.unip.mirambientalws.modelo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de anonymous complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="incidente" type="{modelo.mirambientalws.unip.com.br}incidenteAtributo"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "incidente"
})
@XmlRootElement(name = "buscarIncidenteRequest")
public class BuscarIncidenteRequest {

    @XmlElement(required = true)
    protected IncidenteAtributo incidente;

    /**
     * Obtém o valor da propriedade incidente.
     * 
     * @return
     *     possible object is
     *     {@link IncidenteAtributo }
     *     
     */
    public IncidenteAtributo getIncidente() {
        return incidente;
    }

    /**
     * Define o valor da propriedade incidente.
     * 
     * @param value
     *     allowed object is
     *     {@link IncidenteAtributo }
     *     
     */
    public void setIncidente(IncidenteAtributo value) {
        this.incidente = value;
    }

}

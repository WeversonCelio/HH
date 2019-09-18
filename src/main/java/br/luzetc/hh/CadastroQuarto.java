/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.luzetc.hh;

import br.luzetc.hh.enumeration.TipoQuarto;
import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author wever
 */
@Entity
@Table(name = "cadastro_quarto")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CadastroQuarto.findAll", query = "SELECT c FROM CadastroQuarto c")
    , @NamedQuery(name = "CadastroQuarto.findById", query = "SELECT c FROM CadastroQuarto c WHERE c.id = :id")
    , @NamedQuery(name = "CadastroQuarto.findByQuarto", query = "SELECT c FROM CadastroQuarto c WHERE c.quarto = :quarto")
    , @NamedQuery(name = "CadastroQuarto.findByPreco", query = "SELECT c FROM CadastroQuarto c WHERE c.preco = :preco")})
public class CadastroQuarto implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Long id;
   
    @Enumerated(EnumType.STRING)
    @Column(name = "quarto")
    private TipoQuarto quarto;

    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "preco")
    private Float preco;
    @OneToMany(mappedBy = "cadastrosQuartoId")
    private Collection<Hospedagem> hospedagemCollection;

    public CadastroQuarto() {
    }

    public CadastroQuarto(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public TipoQuarto getQuarto() {
        return quarto;
    }

    public void setQuarto(TipoQuarto quarto) {
        this.quarto = quarto;
    }

 

    public Float getPreco() {
        return preco;
    }

    public void setPreco(Float preco) {
        this.preco = preco;
    }

    @XmlTransient
    public Collection<Hospedagem> getHospedagemCollection() {
        return hospedagemCollection;
    }

    public void setHospedagemCollection(Collection<Hospedagem> hospedagemCollection) {
        this.hospedagemCollection = hospedagemCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CadastroQuarto)) {
            return false;
        }
        CadastroQuarto other = (CadastroQuarto) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Quarto [" + id + "] " + quarto;
    }
    
}

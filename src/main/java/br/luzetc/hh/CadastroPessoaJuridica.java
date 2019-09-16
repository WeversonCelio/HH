/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.luzetc.hh;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author wever
 */
@Entity
@Table(name = "cadastro_pessoa_juridica")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CadastroPessoaJuridica.findAll", query = "SELECT c FROM CadastroPessoaJuridica c")
    , @NamedQuery(name = "CadastroPessoaJuridica.findById", query = "SELECT c FROM CadastroPessoaJuridica c WHERE c.id = :id")
    , @NamedQuery(name = "CadastroPessoaJuridica.findByNomeFantasia", query = "SELECT c FROM CadastroPessoaJuridica c WHERE c.nomeFantasia = :nomeFantasia")
    , @NamedQuery(name = "CadastroPessoaJuridica.findByCnpj", query = "SELECT c FROM CadastroPessoaJuridica c WHERE c.cnpj = :cnpj")
    , @NamedQuery(name = "CadastroPessoaJuridica.findByContato", query = "SELECT c FROM CadastroPessoaJuridica c WHERE c.contato = :contato")
    , @NamedQuery(name = "CadastroPessoaJuridica.findByEmail", query = "SELECT c FROM CadastroPessoaJuridica c WHERE c.email = :email")})
public class CadastroPessoaJuridica implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Long id;
    @Size(max = 255)
    @Column(name = "nome_fantasia")
    private String nomeFantasia;
    @Column(name = "cnpj")
    private Integer cnpj;
    @Column(name = "contato")
    private Integer contato;
    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="E-mail inválido")//if the field contains email address consider using this annotation to enforce field validation
    @Size(max = 255)
    @Column(name = "email")
    private String email;
    @OneToMany(mappedBy = "cadastrosPessoaJuridicaId")
    private Collection<Hospedagem> hospedagemCollection;

    public CadastroPessoaJuridica() {
    }

    public CadastroPessoaJuridica(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public Integer getCnpj() {
        return cnpj;
    }

    public void setCnpj(Integer cnpj) {
        this.cnpj = cnpj;
    }

    public Integer getContato() {
        return contato;
    }

    public void setContato(Integer contato) {
        this.contato = contato;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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
        if (!(object instanceof CadastroPessoaJuridica)) {
            return false;
        }
        CadastroPessoaJuridica other = (CadastroPessoaJuridica) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.luzetc.hh.CadastroPessoaJuridica[ id=" + id + " ]";
    }
    
}

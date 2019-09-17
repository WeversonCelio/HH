/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.luzetc.hh;

import java.io.Serializable;
import java.math.BigInteger;
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
@Table(name = "cadastro_pessoa_fisica")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CadastroPessoaFisica.findAll", query = "SELECT c FROM CadastroPessoaFisica c")
    , @NamedQuery(name = "CadastroPessoaFisica.findById", query = "SELECT c FROM CadastroPessoaFisica c WHERE c.id = :id")
    , @NamedQuery(name = "CadastroPessoaFisica.findByNome", query = "SELECT c FROM CadastroPessoaFisica c WHERE c.nome = :nome")
    , @NamedQuery(name = "CadastroPessoaFisica.findByCpf", query = "SELECT c FROM CadastroPessoaFisica c WHERE c.cpf = :cpf")
    , @NamedQuery(name = "CadastroPessoaFisica.findByContato", query = "SELECT c FROM CadastroPessoaFisica c WHERE c.contato = :contato")
    , @NamedQuery(name = "CadastroPessoaFisica.findByEmail", query = "SELECT c FROM CadastroPessoaFisica c WHERE c.email = :email")})
public class CadastroPessoaFisica implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Long id;
    @Size(max = 255)
    @Column(name = "nome")
    private String nome;
    @Column(name = "cpf")
    private BigInteger cpf;
    @Column(name = "contato")
    private Integer contato;
    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="E-mail inválido")//if the field contains email address consider using this annotation to enforce field validation
    @Size(max = 255)
    @Column(name = "email")
    private String email;
    @OneToMany(mappedBy = "cadastrosPessoaFisicaId")
    private Collection<Hospedagem> hospedagemCollection;

    public CadastroPessoaFisica() {
    }

    public CadastroPessoaFisica(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public BigInteger getCpf() {
        return cpf;
    }

    public void setCpf(BigInteger cpf) {
        this.cpf = cpf;
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
        if (!(object instanceof CadastroPessoaFisica)) {
            return false;
        }
        CadastroPessoaFisica other = (CadastroPessoaFisica) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "[" + id + "] "+ nome;
    }
    
}

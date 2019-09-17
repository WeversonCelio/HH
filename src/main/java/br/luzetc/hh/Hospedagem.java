/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.luzetc.hh;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author wever
 */
@Entity
@Table(name = "hospedagem")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Hospedagem.findAll", query = "SELECT h FROM Hospedagem h")
    , @NamedQuery(name = "Hospedagem.findById", query = "SELECT h FROM Hospedagem h WHERE h.id = :id")
    , @NamedQuery(name = "Hospedagem.findByDiaria", query = "SELECT h FROM Hospedagem h WHERE h.diaria = :diaria")
    , @NamedQuery(name = "Hospedagem.findByDataHospedagem", query = "SELECT h FROM Hospedagem h WHERE h.dataHospedagem = :dataHospedagem")
    , @NamedQuery(name = "Hospedagem.findByDataSaida", query = "SELECT h FROM Hospedagem h WHERE h.dataSaida = :dataSaida")
    , @NamedQuery(name = "Hospedagem.findByTotalHospedagem", query = "SELECT h FROM Hospedagem h WHERE h.totalHospedagem = :totalHospedagem")})
public class Hospedagem implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Long id;
    @Column(name = "diaria")
    private Integer diaria;
    @Column(name = "data_hospedagem")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataHospedagem;
    @Column(name = "data_saida")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataSaida;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "total_hospedagem")
    private Float totalHospedagem;
    @JoinTable(name = "hospedagem_pagamentos", joinColumns = {
        @JoinColumn(name = "hospedagem_id", referencedColumnName = "id")}, inverseJoinColumns = {
        @JoinColumn(name = "pagamentos_id", referencedColumnName = "id")})
    @ManyToMany
    private Collection<Pagamento> pagamentoCollection;
    @JoinColumn(name = "cadastros_pessoa_fisica_id", referencedColumnName = "id")
    @ManyToOne
    private CadastroPessoaFisica cadastrosPessoaFisicaId;
    @JoinColumn(name = "cadastros_pessoa_juridica_id", referencedColumnName = "id")
    @ManyToOne
    private CadastroPessoaJuridica cadastrosPessoaJuridicaId;
    @JoinColumn(name = "cadastros_quarto_id", referencedColumnName = "id")
    @ManyToOne
    private CadastroQuarto cadastrosQuartoId;

    public Hospedagem() {
    }

    public Hospedagem(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getDiaria() {
        return diaria;
    }

    public void setDiaria(Integer diaria) {
        this.diaria = diaria;
    }

    public Date getDataHospedagem() {
        return dataHospedagem;
    }

    public void setDataHospedagem(Date dataHospedagem) {
        this.dataHospedagem = dataHospedagem;
    }

    public Date getDataSaida() {
        return dataSaida;
    }

    public void setDataSaida(Date dataSaida) {
        this.dataSaida = dataSaida;
    }

    public Float getTotalHospedagem() {
        return totalHospedagem;
    }

    public void setTotalHospedagem(Float totalHospedagem) {
        this.totalHospedagem = totalHospedagem;
    }

    @XmlTransient
    public Collection<Pagamento> getPagamentoCollection() {
        return pagamentoCollection;
    }

    public void setPagamentoCollection(Collection<Pagamento> pagamentoCollection) {
        this.pagamentoCollection = pagamentoCollection;
    }

    public CadastroPessoaFisica getCadastrosPessoaFisicaId() {
        return cadastrosPessoaFisicaId;
    }

    public void setCadastrosPessoaFisicaId(CadastroPessoaFisica cadastrosPessoaFisicaId) {
        this.cadastrosPessoaFisicaId = cadastrosPessoaFisicaId;
    }

    public CadastroPessoaJuridica getCadastrosPessoaJuridicaId() {
        return cadastrosPessoaJuridicaId;
    }

    public void setCadastrosPessoaJuridicaId(CadastroPessoaJuridica cadastrosPessoaJuridicaId) {
        this.cadastrosPessoaJuridicaId = cadastrosPessoaJuridicaId;
    }

    public CadastroQuarto getCadastrosQuartoId() {
        return cadastrosQuartoId;
    }

    public void setCadastrosQuartoId(CadastroQuarto cadastrosQuartoId) {
        this.cadastrosQuartoId = cadastrosQuartoId;
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
        if (!(object instanceof Hospedagem)) {
            return false;
        }
        Hospedagem other = (Hospedagem) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "[" + id + "] " + dataHospedagem;
    }
    
}

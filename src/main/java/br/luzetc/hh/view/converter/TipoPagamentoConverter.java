package br.luzetc.hh.view.converter;


import br.luzetc.hh.enumeration.TipoPagamento;
import javax.enterprise.context.RequestScoped;
import javax.faces.convert.EnumConverter;
import javax.faces.convert.FacesConverter;
import javax.inject.Named;

@Named
@RequestScoped
@FacesConverter(forClass = TipoPagamento.class, value = "tipoPagamentoConverter")
public class TipoPagamentoConverter extends EnumConverter {

    public TipoPagamentoConverter() {
        super(TipoPagamento.class);
    }

}
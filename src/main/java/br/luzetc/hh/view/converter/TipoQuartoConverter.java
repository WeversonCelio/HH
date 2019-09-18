package br.luzetc.hh.view.converter;

import br.luzetc.hh.enumeration.TipoQuarto;
import javax.enterprise.context.RequestScoped;
import javax.faces.convert.EnumConverter;
import javax.faces.convert.FacesConverter;
import javax.inject.Named;

@Named
@RequestScoped
@FacesConverter(forClass = TipoQuarto.class, value = "tipoQuartoConverter")
public class TipoQuartoConverter extends EnumConverter {

    public TipoQuartoConverter() {
        super(TipoQuarto.class);
    }

}
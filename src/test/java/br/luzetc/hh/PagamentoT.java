/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.luzetc.hh;

import br.luzetc.hh.enumeration.TipoPagamento;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author wever
 */
public class PagamentoT {
    
    public PagamentoT() {
    }

    @Test
    public void testGetTipo() {
          System.out.println("getTipo");
        Pagamento instance = new Pagamento();
        instance.setTipo(TipoPagamento.DINHEIRO);
        TipoPagamento expResult = TipoPagamento.DINHEIRO;
        TipoPagamento result = instance.getTipo();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetTipo() {
        System.out.println("setTipo");
        TipoPagamento tipo = TipoPagamento.CARTAOCREDITO;
        Pagamento instance = new Pagamento();
        instance.setTipo(tipo);
     
     
    }

    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.luzetc.hh;

import java.math.BigInteger;
import java.util.Collection;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author wever
 */
public class CadastroPessoaFisicaTest {
    
    public CadastroPessoaFisicaTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testGetId() {
        System.out.println("getId");
        CadastroPessoaFisica instance = new CadastroPessoaFisica();
        Long expResult = null;
        Long result = instance.getId();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetId() {
        System.out.println("setId");
        Long id = null;
        CadastroPessoaFisica instance = new CadastroPessoaFisica();
        instance.setId(id);
    }

    @Test
    public void testGetNome() {
        System.out.println("getNome");
        CadastroPessoaFisica instance = new CadastroPessoaFisica();
        instance.setNome("Tiago");
        String expResult = "Tiago";
        String result = instance.getNome();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetNome() {
        System.out.println("setNome");
        String nome = "";
        CadastroPessoaFisica instance = new CadastroPessoaFisica();
        instance.setNome(nome);
    }

    @Test
    public void testGetCpf() {
        System.out.println("getCpf");
        CadastroPessoaFisica instance = new CadastroPessoaFisica();
        BigInteger expResult = null;
        BigInteger result = instance.getCpf();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetCpf() {
        System.out.println("setCpf");
        BigInteger cpf = null;
        CadastroPessoaFisica instance = new CadastroPessoaFisica();
        instance.setCpf(cpf);
    }

    @Test
    public void testGetContato() {
        System.out.println("getContato");
        CadastroPessoaFisica instance = new CadastroPessoaFisica();
        Integer expResult = null;
        Integer result = instance.getContato();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetContato() {
        System.out.println("setContato");
        Integer contato = null;
        CadastroPessoaFisica instance = new CadastroPessoaFisica();
        instance.setContato(contato);
    }

    @Test
    public void testGetEmail() {
        System.out.println("getEmail");
        CadastroPessoaFisica instance = new CadastroPessoaFisica();
        instance.setEmail("teste@test.com");
        String expResult = "teste@test.com";
        String result = instance.getEmail();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetEmail() {
        System.out.println("setEmail");
        String email = "";
        CadastroPessoaFisica instance = new CadastroPessoaFisica();
        instance.setEmail(email);
       
    }

    @Test
    public void testGetHospedagemCollection() {
        System.out.println("getHospedagemCollection");
        CadastroPessoaFisica instance = new CadastroPessoaFisica();
        Collection<Hospedagem> expResult = null;
        Collection<Hospedagem> result = instance.getHospedagemCollection();
        assertEquals(expResult, result);
      
    }

    @Test
    public void testSetHospedagemCollection() {
        System.out.println("setHospedagemCollection");
        Collection<Hospedagem> hospedagemCollection = null;
        CadastroPessoaFisica instance = new CadastroPessoaFisica();
        instance.setHospedagemCollection(hospedagemCollection);
       
    }

    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        CadastroPessoaFisica instance = new CadastroPessoaFisica();
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
     
    }

    @Test
    public void testEquals() {
        System.out.println("equals");
        Object object = null;
        CadastroPessoaFisica instance = new CadastroPessoaFisica();
        boolean expResult = false;
        boolean result = instance.equals(object);
        assertEquals(expResult, result);
       
    }

}

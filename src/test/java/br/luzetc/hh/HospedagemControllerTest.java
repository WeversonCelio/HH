/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.luzetc.hh;

import java.util.List;
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
public class HospedagemControllerTest {
    
    public HospedagemControllerTest() {
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
    public void testGetSelected() {
        System.out.println("getSelected");
        HospedagemController instance = new HospedagemController();
        Hospedagem expResult = null;
        Hospedagem result = instance.getSelected();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetSelected() {
        System.out.println("setSelected");
        Hospedagem selected = null;
        HospedagemController instance = new HospedagemController();
        instance.setSelected(selected);
    }

    @Test
    public void testSetEmbeddableKeys() {
        System.out.println("setEmbeddableKeys");
        HospedagemController instance = new HospedagemController();
        instance.setEmbeddableKeys();
    }

    @Test
    public void testInitializeEmbeddableKey() {
        System.out.println("initializeEmbeddableKey");
        HospedagemController instance = new HospedagemController();
        instance.initializeEmbeddableKey();
    }

   

    @Test
    public void testCreate() {
        System.out.println("create");
        HospedagemController instance = new HospedagemController();
        instance.create();
    }

    @Test
    public void testUpdate() {
        System.out.println("update");
        HospedagemController instance = new HospedagemController();
        instance.update();
    }

    @Test
    public void testDestroy() {
        System.out.println("destroy");
        HospedagemController instance = new HospedagemController();
        instance.destroy();
    }



    @Test
    public void testGetHospedagem() {
        System.out.println("getHospedagem");
        Long id = null;
        HospedagemController instance = new HospedagemController();
        Hospedagem expResult = null;
        Hospedagem result = instance.getHospedagem(id);
        assertEquals(expResult, result);
    }


    @Test
    public void testGetItemsAvailableSelectOne() {
        System.out.println("getItemsAvailableSelectOne");
        HospedagemController instance = new HospedagemController();
        List<Hospedagem> expResult = null;
        List<Hospedagem> result = instance.getItemsAvailableSelectOne();
        assertEquals(expResult, result);
    }
    
}

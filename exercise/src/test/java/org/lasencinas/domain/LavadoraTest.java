package org.lasencinas.domain;

import static org.junit.Assert.assertTrue;

import factory.LavadoraCargaFrontalFactory;
import factory.LavadoraCargaSuperiorFactory;
import factory.LavadoraFactory;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.lasencinas.domain.Lavadora;


public class LavadoraTest {

    /* ---- PROPERTIES OF THE CLASS ---- */
    private LavadoraFactory frontalFactory = null;
    private LavadoraFactory superiorFactory = null;


    /* ---- SET UP ---- */
    @Before
    public void setUp() {
        frontalFactory = new LavadoraCargaFrontalFactory();
        superiorFactory = new LavadoraCargaSuperiorFactory();
    }


    /* ---- TESTS ---- */
    @Test
    public void test_carga_frontal() {

        Lavadora lavadora = frontalFactory.createLavadora();
        lavadora.ponerMandos();
        lavadora.ponerTambor();

        Assert.assertEquals("frontal", lavadora.tipoCarga);
        assertTrue(lavadora.tieneMandos);
        assertTrue(lavadora.tieneTambor);
    }

    @Test
    public void test_carga_superior() {

        Lavadora lavadora = superiorFactory.createLavadora();
        lavadora.ponerMandos();
        lavadora.ponerTambor();

        Assert.assertEquals("superior", lavadora.tipoCarga);
        assertTrue(lavadora.tieneTambor);
        assertTrue(lavadora.tieneMandos);
    }
}

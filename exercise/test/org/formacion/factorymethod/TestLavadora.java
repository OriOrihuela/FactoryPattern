package org.formacion.factorymethod;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TestLavadora {

    @Test
    public void test_carga_frontal() {

        LavadoraFactory lavadora = new LavadoraCargaFrontalFactory();
        lavadora.ponerMandos();
        lavadora.ponerTambor();

        assertEquals("frontal", lavadora.tipoCarga);
        assertTrue(lavadora.tieneMandos);
        assertTrue(lavadora.tieneTambor);
    }

    @Test
    public void test_carga_superior() {

        LavadoraFactory lavadora = new LavadoraCargaSuperiorFactory();
        lavadora.ponerMandos();
        lavadora.ponerTambor();

        assertEquals("superior", lavadora.tipoCarga);
        assertTrue(lavadora.tieneMandos);
        assertTrue(lavadora.tieneTambor);
    }
}

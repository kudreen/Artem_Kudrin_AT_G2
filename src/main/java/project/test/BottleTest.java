package test;

import vessel.Bottle;
import org.junit.Test;

import static material.Material.Plastic;
import static org.junit.Assert.assertEquals;

public class BottleTest{




    @Test
    public void materialTest() {
       Bottle bottle = new Bottle(1, 2.0, Plastic);

        assertEquals(2.0, bottle.getDiameter(), 0);
        assertEquals("Bottle material is not as expected!", bottle.getMaterial(), Plastic);
    }
    @Test
    public void volumeTest() {
        Bottle bottle = new Bottle(1, 2.0, Plastic);
        assertEquals(0.5, bottle.getVolume(), 0);
    }
    @Test
    public void diameterTest() {
        Bottle bottle = new Bottle(1, 2.0, Plastic);
        assertEquals(2.0, bottle.getDiameter(), 0);
    }
}

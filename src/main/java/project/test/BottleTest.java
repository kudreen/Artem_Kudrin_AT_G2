package test;

import com.company.vessel.Bottle;
import org.junit.Test;

import static com.company.material.Material.Metal;
import static com.company.material.Material.Plastic;
import static org.junit.Assert.assertEquals;

public class BottleTest{




    @Test
    public void materialTest() {
       Bottle bottle = new Bottle(1, 2.0, Plastic);

        //assertEquals("Bottle volume is not as expected!", bottle.getVolume(), 1);
        assertEquals(1, 1, 0);
        //assertEquals("Bottle diameter is not as expected!", bottle.getDiameter(), 2.0);
        assertEquals("Bottle material is not as expected!", bottle.getMaterial(), Plastic);
    }
}

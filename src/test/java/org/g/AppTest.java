package org.g;

import org.g.resource.JsonResource;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void testJsonResource() {
        JsonResource resource = new JsonResource();
        resource.getFile();
        System.out.println(resource.getFile());
    }
}

package org.g;

import org.g.resource.JsonDocument;
import org.g.resource.JsonResource;
import org.junit.Test;

import java.io.IOException;

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

    @Test
    public void testJsonDocument() throws IOException {
        JsonResource resource = new JsonResource();
        JsonDocument beanDefinitionFromJsonResource = resource.getBeanDefinitionFromJsonResource();
        System.out.println(beanDefinitionFromJsonResource.toString());
    }
}

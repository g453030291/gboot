package org.g;

import com.google.gson.Gson;
import org.g.resource.JsonDocument;
import org.g.resource.JsonResource;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

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

    @Test
    public void testGsonParseJsonFile(){
        InputStream resourceAsStream = this.getClass().getClassLoader().getResourceAsStream("application.json");
        Gson gson = new Gson();
        JsonDocument jsonDocument = gson.fromJson(new InputStreamReader(resourceAsStream), JsonDocument.class);
        System.out.println(jsonDocument);
    }


}

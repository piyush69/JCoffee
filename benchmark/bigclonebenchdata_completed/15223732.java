import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c15223732 {
public MyHelperClass Assert;

//    @Test(dataProvider = Arquillian.ARQUILLIAN_DATA_PROVIDER)
    public void shouldGreetUser(@(Annotation)(Object)ArquillianResource URL baseURL) throws Throwable, IOException {
        final String name = "Earthlings";
        final URL url = new URL(baseURL, "Foo.action");
        StringBuilder builder = new StringBuilder();
        BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));
        String line;
        while ((line = reader.readLine()) != null) {
            builder.append(line);
        }
        reader.close();
        MyHelperClass LOGGER = new MyHelperClass();
        LOGGER.info("Returned response: " + builder.toString());
        MyHelperClass FooService = new MyHelperClass();
        Assert.assertEquals(builder.toString(), FooService.GREETING + name);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass GREETING;
public MyHelperClass info(String o0){ return null; }}

class ArquillianResource {

}

class Test {

}

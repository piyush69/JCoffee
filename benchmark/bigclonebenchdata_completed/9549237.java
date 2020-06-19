
import java.io.UncheckedIOException;


class c9549237 {
public MyHelperClass assertTrue(boolean o0){ return null; }
	public MyHelperClass assertNull(MyHelperClass o0){ return null; }
	public MyHelperClass assertNotNull(MyHelperClass o0){ return null; }
	public MyHelperClass assertEquals(int o0, MyHelperClass o1){ return null; }
	public MyHelperClass assertFalse(boolean o0){ return null; }
public MyHelperClass fail(String o0){ return null; }

    public void testResolveURL() throws Exception {
        System.out.println("resolveURL");
        File bigFile = new File("./src/test/java/big.json");
        File smallFile = new File("./src/test/java/sample1.json");
        Object[] urls = new Object[] { "http://json-schema.org/schema", "http://json-schema.org/hyper-schema", "http://json-schema.org/json-ref", "http://json-schema.org/interfaces", "http://json-schema.org/geo", "http://json-schema.org/card", "http://json-schema.org/calendar", "http://json-schema.org/address", bigFile };
        JSONSchemaURIResolverImpl uriResolver = new JSONSchemaURIResolverImpl();
        JSONSchemaURIResolverImpl uriResolver2 = new JSONSchemaURIResolverImpl();
        try {
            InputStream is =(InputStream)(Object) (new URL((String) urls[0]).openStream());
            is.close();
        } catch (UncheckedIOException cex) {
            for (int i = 2; i < urls.length; i++) {
                if (urls[i] instanceof String) {
                    String url = (String) urls[i];
                    uriResolver.register(new URL(url), new File("./src/test/java/" + url.replace(":", "_").replace("/", "_") + ".schema.json"));
                } else if (urls[i] instanceof File) {
                    uriResolver.register((URL)(Object)((File) urls[i]).toURI().toURL(), urls[i]);
                }
            }
        } catch (Exception ex) {
        }
        for (int i = 2; i < urls.length; i++) {
            if (urls[i] instanceof String) {
                String url = (String) urls[i];
                uriResolver2.register(new URL(url), new File("./src/test/java/" + url.replace(":", "_").replace("/", "_") + ".schema.json"));
            } else if (urls[i] instanceof File) {
                uriResolver2.register((URL)(Object)((File) urls[i]).toURI().toURL(), urls[i]);
            }
        }
        for (Object source : urls) {
            try {
                if (source instanceof String) {
                    StreamSource ss =(StreamSource)(Object) uriResolver.resolveURI(new URI((String) source), null);
                    assertNotNull(ss.getReader());
                    assertNull(ss.getInputStream());
                    ss.getReader().close();
                }
            } catch (Throwable th) {
                fail("Unexpected problem: " + source + ". Error: " + th);
            }
        }
        for (Object source : urls) {
            try {
                if (source instanceof String) {
                    StreamSource ss =(StreamSource)(Object) uriResolver.resolveURL(new URL((String) source), null);
                    assertNotNull(ss.getReader());
                    assertNull(ss.getInputStream());
                    ss.getReader().close();
                }
            } catch (Throwable th) {
                fail("Unexpected problem: " + source + ". Error: " + th);
            }
        }
        for (Object source : urls) {
            try {
                if (source instanceof String) {
                    StreamSource ss =(StreamSource)(Object) uriResolver2.resolveURI(new URI((String) source), null);
                    assertNotNull(ss.getReader());
                    assertNull(ss.getInputStream());
                    ss.getReader().close();
                    assertTrue((new URL((String) source)).equals(uriResolver2.lastURL));
                    assertFalse((new URL((String) source)).equals(uriResolver2.lastMapped));
                }
            } catch (Throwable th) {
                fail("Unexpected problem: " + source + ". Error: " + th);
            }
        }
        for (Object source : urls) {
            try {
                if (source instanceof String) {
                    StreamSource ss =(StreamSource)(Object) uriResolver2.resolveURL(new URL((String) source), null);
                    assertNotNull(ss.getReader());
                    assertNull(ss.getInputStream());
                    ss.getReader().close();
                    assertTrue((new URL((String) source)).equals(uriResolver2.lastURL));
                    assertFalse((new URL((String) source)).equals(uriResolver2.lastMapped));
                }
            } catch (Throwable th) {
                fail("Unexpected problem: " + source + ". Error: " + th);
            }
        }
        uriResolver2.register(new URL("ftp://localhost/1"), bigFile);
        uriResolver2.register(new URL("ftp://localhost/2"), smallFile);
        uriResolver2.register(new URL("ftp://localhost/2#2"), smallFile);
        try {
            Reader r1 =(Reader)(Object) uriResolver2.resolveURL(new URL("ftp://localhost/2"), null).getReader();
            Reader r2 =(Reader)(Object) uriResolver2.resolveURL(new URL("ftp://localhost/2#2"), null).getReader();
            int ch = 0;
            while ((ch =(int)(Object) r1.read()) != -1) {
                assertEquals(ch, r2.read());
            }
            assertEquals(-1, r2.read());
        } catch (Throwable th) {
            fail("Failed while testing identity of same mapped files. Error: " + th);
        }
        uriResolver2.register(new URL("ftp://localhost/1"), null);
        uriResolver2.register(new URL("ftp://localhost/2"), null);
        uriResolver2.register(new URL("ftp://localhost/2#2"), null);
        uriResolver2.register(new URL("ftp://localhost/1"), bigFile, true);
        uriResolver2.register(new URL("ftp://localhost/2"), smallFile, true);
        uriResolver2.register(new URL("ftp://localhost/2#2"), smallFile, true);
        uriResolver2.unregister(new URL("ftp://localhost/1"), true);
        uriResolver2.unregister(new URL("ftp://localhost/2"), true);
        uriResolver2.unregister(new URL("ftp://localhost/2#2"), true);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass close(){ return null; }
	public MyHelperClass toURL(){ return null; }
	public MyHelperClass getReader(){ return null; }}

class File {

File(String o0){}
	File(){}
	public MyHelperClass toURI(){ return null; }}

class JSONSchemaURIResolverImpl {
public MyHelperClass lastURL;
	public MyHelperClass lastMapped;
public MyHelperClass register(URL o0, Object o1){ return null; }
	public MyHelperClass resolveURI(URI o0, Object o1){ return null; }
	public MyHelperClass unregister(URL o0, boolean o1){ return null; }
	public MyHelperClass resolveURL(URL o0, Object o1){ return null; }
	public MyHelperClass register(URL o0, File o1, boolean o2){ return null; }
	public MyHelperClass register(URL o0, File o1){ return null; }}

class InputStream {

public MyHelperClass close(){ return null; }}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openStream(){ return null; }}

class ConnectException extends Exception{
	public ConnectException(String errorMessage) { super(errorMessage); }
}

class StreamSource {

public MyHelperClass getInputStream(){ return null; }
	public MyHelperClass getReader(){ return null; }}

class URI {

URI(String o0){}
	URI(){}}

class Reader {

public MyHelperClass read(){ return null; }}

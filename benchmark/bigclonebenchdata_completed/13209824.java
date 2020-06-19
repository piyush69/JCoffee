import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c13209824 {
public MyHelperClass getLogger(){ return null; }

    private void loadConfig(ServletContext ctx, String configFileName)  throws Throwable {
        Digester digester = new Digester();
        digester.push(this);
        digester.addFactoryCreate("pagespy/server", new AbstractObjectCreationFactory() {

            public Object createObject(Attributes attrs) {
                String className =(String)(Object) attrs.getValue("className");
                try {
                    return Class.forName(className).newInstance();
                } catch (Exception e) {
                    throw new ClassCastException("Error al instanciar " + className);
                }
            }
        });
        digester.addSetProperty("pagespy/server/param", "name", "value");
        digester.addSetNext("pagespy/server", "setServer", PageSpyServer.class.getName());
        digester.addCallMethod("pagespy/ignored-patterns", "setIgnorePattern", 1);
        digester.addCallParam("pagespy/ignored-patterns", 0);
        digester.addFactoryCreate("pagespy/property-setters/setter", new AbstractObjectCreationFactory() {

            public Object createObject(Attributes attrs) {
                String className =(String)(Object) attrs.getValue("className");
                try {
                    return Class.forName(className).newInstance();
                } catch (Exception e) {
                    throw new ClassCastException("Error al instanciar " + className);
                }
            }
        });
        digester.addSetNext("pagespy/property-setters/setter", "addPropertySetter", PagePropertySetter.class.getName());
        digester.addFactoryCreate("pagespy/page-replacers/replacer", new AbstractObjectCreationFactory() {

            public Object createObject(Attributes attrs) {
                String className =(String)(Object) attrs.getValue("className");
                try {
                    return Class.forName(className).newInstance();
                } catch (Exception e) {
                    throw new ClassCastException("Error al instanciar " + className);
                }
            }
        });
        digester.addSetNext("pagespy/page-replacers/replacer", "addPageReplacer", PageReplacer.class.getName());
        digester.addFactoryCreate("pagespy/properties-panel", new AbstractObjectCreationFactory() {

            public Object createObject(Attributes attrs) {
                String className =(String)(Object) attrs.getValue("className");
                try {
                    return Class.forName(className).newInstance();
                } catch (Exception e) {
                    throw new ClassCastException("Error al instanciar " + className);
                }
            }
        });
        digester.addSetNext("pagespy/properties-panel", "setPropertiesPanel", PagePanel.class.getName());
        try {
            this.getLogger().info("Initializing " + configFileName);
            URL url =(URL)(Object) ctx.getResource(configFileName);
            if (url == null) {
                url = this.getClass().getResource(configFileName);
            }
            digester.parse(url.openStream());
        } catch (Exception e) {
            this.getLogger().error("Error parsing configuration file.", e);
            throw new RuntimeException(e);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass info(String o0){ return null; }
	public MyHelperClass error(String o0, Exception o1){ return null; }}

class ServletContext {

public MyHelperClass getResource(String o0){ return null; }}

class Digester {

public MyHelperClass addSetProperty(String o0, String o1, String o2){ return null; }
	public MyHelperClass addFactoryCreate(String o0){ return null; }
	public MyHelperClass addCallMethod(String o0, String o1, int o2){ return null; }
	public MyHelperClass addCallParam(String o0, int o1){ return null; }
	public MyHelperClass parse(InputStream o0){ return null; }
	public MyHelperClass addSetNext(String o0, String o1, String o2){ return null; }
	public MyHelperClass addFactoryCreate(String o0,  AbstractObjectCreationFactory o1){ return null; }
	public MyHelperClass push(c13209824 o0){ return null; }}

class AbstractObjectCreationFactory {

}

class PageSpyServer {

}

class PagePropertySetter {

}

class PageReplacer {

}

class PagePanel {

}

class Attributes {

public MyHelperClass getValue(String o0){ return null; }}

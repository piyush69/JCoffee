import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c16351484 {
public MyHelperClass ResourceLoader;
	public MyHelperClass m_properties;
	public MyHelperClass m_rules;
	public MyHelperClass PROPERTY_FILE;

    protected  void ProductionTabsProperties(final PlayerID playerId, final List<Rule> mRules, final String mapDir)  throws Throwable {
        m_rules =(MyHelperClass)(Object) mRules;
        final ResourceLoader loader =(ResourceLoader)(Object) ResourceLoader.getMapResourceLoader(mapDir);
        String propertyFile = PROPERTY_FILE + "." + playerId.getName() + ".properties";
        URL url =(URL)(Object) loader.getResource(propertyFile);
        if (url == null) {
            propertyFile = PROPERTY_FILE + ".properties";
            url =(URL)(Object) loader.getResource(propertyFile);
            if (url == null) {
            } else {
                try {
                    m_properties.load(url.openStream());
                } catch (final IOException e) {
                    System.out.println("Error reading " + propertyFile + e);
                }
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getMapResourceLoader(String o0){ return null; }
	public MyHelperClass load(InputStream o0){ return null; }}

class PlayerID {

public MyHelperClass getName(){ return null; }}

class Rule {

}

class ResourceLoader {

public MyHelperClass getResource(String o0){ return null; }}

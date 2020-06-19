import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c2887981 {
public MyHelperClass RegularExpressionUtils;
	public MyHelperClass idToName;
	public MyHelperClass Ontology;
	public MyHelperClass Charset;
	public MyHelperClass OntologyFactory;

    private  c2887981() throws Throwable, Exception {
        super(Ontology.CATH);
        InputStream is = null;
        BufferedReader reader = null;
        try {
            final String CATH_REGEXP =(String)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) OntologyFactory.getOntology(Ontology.CATH).getRegularExpression();
            final URL url = new URL("http://release.cathdb.info/v3.4.0/CathNames");
            is = url.openStream();
            reader = new BufferedReader(new InputStreamReader(is,(String)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) Charset.defaultCharset()));
            String line = null;
            while ((line = reader.readLine()) != null) {
                final String[] tokens = line.split("\\s+");
                if ((Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(int)(Object)RegularExpressionUtils.getMatches(tokens[0], CATH_REGEXP).size() > 0) {
                    idToName.put(tokens[0], line.substring(line.indexOf(':') + 1, line.length()));
                }
            }
        } finally {
            try {
                if (is != null) {
                    is.close();
                }
            } finally {
                if (reader != null) {
                    reader.close();
                }
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass CATH;
public MyHelperClass size(){ return null; }
	public MyHelperClass getOntology(MyHelperClass o0){ return null; }
	public MyHelperClass getMatches(String o0, String o1){ return null; }
	public MyHelperClass getRegularExpression(){ return null; }
	public MyHelperClass put(String o0, String o1){ return null; }
	public MyHelperClass defaultCharset(){ return null; }}

class Object {

Object(MyHelperClass o0){}
	Object(){}}

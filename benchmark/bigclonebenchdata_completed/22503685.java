import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c22503685 {

    public static Collection<Tuple>>  void readGeoParserResult(String recordContent, boolean getGazeteerIds)  throws Throwable {
        MyHelperClass TESTING = new MyHelperClass();
        if ((boolean)(Object)TESTING) {
            HashSet<Tuple>> ret = new HashSet>>();
            ret.add(new Tuple>("teste", new ArrayList()));
            return ret;
        }
        int retries = 0;
        while (retries < 3) {
            try {
                ArrayList<Tuple>> ret = new ArrayList>>();
                String reqPre = "<?xml version=\"1.0\"?>\r\n" + (getGazeteerIds ? "<GetFeature" : "<GetParsing") + " xmlns=\"http://www.opengis.net/gp\" xmlns:wfs=\"http://www.opengis.net/wfs\"" + " xmlns:xsi=\"http://www.w3.org/2000/10/XMLSchema-instance\"" + " xsi:schemaLocation=\"http://www.opengis.net/gp ../gp/GetFeatureRequest.xsd http://www.opengis.net/wfs ../wfs/GetFeatureRequest.xsd\"\r\n" + " wfs:outputFormat=\"GML2\">" + "<wfs:Query wfs:TypeName=\"PlaceName\" />" + "<Resource mine=\"text/plain\">" + "<Contents></Contents>" + "</Resource>" + (getGazeteerIds ? "</GetFeature>" : "</GetParsing>");
                MyHelperClass DocumentHelper = new MyHelperClass();
                Document doc = DocumentHelper.parseText(reqPre);
                doc.getRootElement().element("Resource").element("Contents").setText(recordContent);
                MyHelperClass geoParserBaseUrl = new MyHelperClass();
                URL url = new URL(geoParserBaseUrl + "?request=" + URLEncoder.encode(doc.asXML(), "ISO8859-1"));
                InputStreamReader reader = new InputStreamReader(url.openStream(), "UTF-8");
                BufferedReader buffered = new BufferedReader(reader);
                StringBuffer sb = new StringBuffer();
                String line;
                while ((line = buffered.readLine()) != null) {
                    sb.append(line);
                }
//                MyHelperClass DocumentHelper = new MyHelperClass();
                Document d = DocumentHelper.parseText(sb.toString());
                HashSet<String> places = new HashSet<String>();
                for (Iterator<Element> it = d.getRootElement().element("EntryCollection").elementIterator("PlaceName"); it.hasNext(); ) {
                    Element plcEl = it.next();
                    String val = plcEl.elementTextTrim("TermName");
                    if (!val.equals("") && !places.contains(val)) {
                        places.add(val);
                        String entryID = plcEl.attributeValue("entryID");
                        Tuple> plc = new Tuple>(val, new ArrayList());
                        for (Iterator<Element> it2 = d.getRootElement().element("EntryCollection").elementIterator("GazetteerEntry"); it2.hasNext(); ) {
                            Element idEl = it2.next();
                            if (idEl.attributeValue("entryID").equals(entryID)) plc.getV2().add(idEl.attributeValue("id"));
                        }
                        ret.add(plc);
                    }
                }
                return ret;
            } catch (Exception e) {
                MyHelperClass log = new MyHelperClass();
                log.debug("Erro ao pesquisar a lista de termos para o registo " + recordContent + "! " + e.getMessage(), e);
                System.out.println("Erro ao pesquisar a lista de termos para o registo " + recordContent + "! " + e.getMessage());
                retries++;
            }
        }
        System.out.println("Too many retries. Giving up.");
        return new HashSet<Tuple>>();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass parseText(String o0){ return null; }
	public MyHelperClass debug(String o0, Exception o1){ return null; }}

class Tuple {

}

class Document {

public MyHelperClass asXML(){ return null; }
	public MyHelperClass getRootElement(){ return null; }}

class Element {

public MyHelperClass attributeValue(String o0){ return null; }
	public MyHelperClass elementTextTrim(String o0){ return null; }}

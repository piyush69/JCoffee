


class c17833153 {
public MyHelperClass DEFAULT_INPUT;

    public List analyze(String urlString, boolean tryFallback) {
        List results =(List)(Object) new ArrayList();
        try {
            URL url;
            MyHelperClass flow = new MyHelperClass();
            if (flow == null) {
                MyHelperClass DEFAULT_FLOW_URL = new MyHelperClass();
                url = new URL(DEFAULT_FLOW_URL + "?" + DEFAULT_INPUT + "=" + urlString);
            } else {
//                MyHelperClass flow = new MyHelperClass();
                url = new URL(flow.getUrl() + "?" + flow.getInputList().get(0) + "=" + urlString);
            }
            System.setProperty("javax.xml.parsers.SAXParserFactory", "org.apache.xerces.jaxp.SAXParserFactoryImpl");
            System.out.println("Executing: " + url.toString());
            XMLDecoder decoder = new XMLDecoder(url.openStream());
            Map map = (Map)(Map)(Object) decoder.readObject();
            for (Object key : (Object[])(Object)map.keySet()) {
                results.add(new AnalyzerResult(key.toString(), map.get(key).toString()));
            }
        } catch (Exception ex) {
            ex.printStackTrace();
            MyHelperClass VueUtil = new MyHelperClass();
            VueUtil.alert("Can't Execute Flow on the url " + urlString, "Can't Execute Seasr flow");
        }
        return results;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass alert(String o0, String o1){ return null; }
	public MyHelperClass get(int o0){ return null; }
	public MyHelperClass getUrl(){ return null; }
	public MyHelperClass getInputList(){ return null; }}

class List {

public MyHelperClass add(AnalyzerResult o0){ return null; }}

class AnalyzerResult {

AnalyzerResult(String o0, String o1){}
	AnalyzerResult(){}}

class ArrayList {

}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openStream(){ return null; }}

class XMLDecoder {

XMLDecoder(MyHelperClass o0){}
	XMLDecoder(){}
	public MyHelperClass readObject(){ return null; }}

class Map {

public MyHelperClass get(Object o0){ return null; }
	public MyHelperClass keySet(){ return null; }}

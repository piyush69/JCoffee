


class c17833152 {
public MyHelperClass DEFAULT_INPUT;
	public MyHelperClass getSpecFromComponent(LWComponent o0){ return null; }

    public List analyze(LWComponent c, boolean tryFallback) {
        List results =(List)(Object) new ArrayList();
        try {
            MyHelperClass DEFAULT_FLOW_URL = new MyHelperClass();
            URL url = new URL(DEFAULT_FLOW_URL + "?" + DEFAULT_INPUT + "=" + c.getLabel());
            MyHelperClass flow = new MyHelperClass();
            if (flow != null) {
//                MyHelperClass flow = new MyHelperClass();
                url = new URL(flow.getUrl() + "?" + flow.getInputList().get(0) + "=" + getSpecFromComponent(c));
            }
            System.setProperty("javax.xml.parsers.SAXParserFactory", "org.apache.xerces.jaxp.SAXParserFactoryImpl");
            XMLDecoder decoder = new XMLDecoder(url.openStream());
            Map map = (Map)(Map)(Object) decoder.readObject();
            for (Object key : (Object[])(Object)map.keySet()) {
                results.add(new AnalyzerResult(key.toString(), map.get(key).toString()));
            }
        } catch (Exception ex) {
            ex.printStackTrace();
            MyHelperClass VueUtil = new MyHelperClass();
            VueUtil.alert("Can't Execute Flow on the node " + c.getLabel(), "Can't Execute Seasr flow");
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

class LWComponent {

public MyHelperClass getLabel(){ return null; }}

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

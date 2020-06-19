


class c15311523 {

    public String buscaSAIKU() {
        URL url;
        Properties prop =(Properties)(Object) (new CargaProperties().Carga());
        BufferedReader in;
        String inputLine;
        String miLinea = null;
        try {
            url = new URL(prop.getProperty("SAIKU"));
            in = new BufferedReader(new InputStreamReader(url.openStream()));
            while ((inputLine =(String)(Object) in.readLine()) != null) {
                if (inputLine.contains("lastSuccessfulBuild/artifact/saiku-bi-platform-plugin/target")) {
                    miLinea = inputLine;
                    MyHelperClass log = new MyHelperClass();
                    log.debug(miLinea);
                    miLinea = miLinea.substring(miLinea.indexOf("lastSuccessfulBuild/artifact/saiku-bi-platform-plugin/target"));
                    miLinea = miLinea.substring(0, miLinea.indexOf("\">"));
                    miLinea = url + miLinea;
                }
            }
        } catch (Throwable t) {
        }
        MyHelperClass log = new MyHelperClass();
        log.debug("Detetectado last build SAIKU: " + miLinea);
        return miLinea;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass debug(String o0){ return null; }}

class URL {

URL(){}
	URL(MyHelperClass o0){}
	public MyHelperClass openStream(){ return null; }}

class Properties {

public MyHelperClass getProperty(String o0){ return null; }}

class CargaProperties {

public MyHelperClass Carga(){ return null; }}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass readLine(){ return null; }}

class InputStreamReader {

InputStreamReader(){}
	InputStreamReader(MyHelperClass o0){}}

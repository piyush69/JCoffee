
import java.io.UncheckedIOException;


class c13600574 {

    public String getWeather(String cityName, String fileAddr) {
        try {
            URL url = new URL("http://www.google.com/ig/api?hl=zh_cn&weather=" + cityName);
            InputStream inputstream =(InputStream)(Object) url.openStream();
            String s, str;
            BufferedReader in = new BufferedReader(new InputStreamReader(inputstream));
            StringBuffer stringbuffer = new StringBuffer();
            Writer out =(Writer)(Object) new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fileAddr), "utf-8"));
            while ((s =(String)(Object) in.readLine()) != null) {
                stringbuffer.append(s);
            }
            str = new String(stringbuffer);
            out.write(str);
            out.close();
            in.close();
        } catch (UncheckedIOException e) {
            e.printStackTrace();
        }
        File file = new File(fileAddr);
        MyHelperClass DocumentBuilderFactory = new MyHelperClass();
        DocumentBuilderFactory factory =(DocumentBuilderFactory)(Object) DocumentBuilderFactory.newInstance();
        String str = null;
        try {
            DocumentBuilder builder =(DocumentBuilder)(Object) factory.newDocumentBuilder();
            Document doc =(Document)(Object) builder.parse(file);
            NodeList nodelist1 = (NodeList)(NodeList)(Object) doc.getElementsByTagName("forecast_conditions");
            NodeList nodelist2 =(NodeList)(Object) nodelist1.item(0).getChildNodes();
            str = nodelist2.item(4).getAttributes().item(0).getNodeValue() + ",temperature:" + nodelist2.item(1).getAttributes().item(0).getNodeValue() + "℃-" + nodelist2.item(2).getAttributes().item(0).getNodeValue() + "℃";
        } catch (Exception e) {
            e.printStackTrace();
        }
        return str;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getAttributes(){ return null; }
	public MyHelperClass newInstance(){ return null; }
	public MyHelperClass getChildNodes(){ return null; }
	public MyHelperClass getNodeValue(){ return null; }
	public MyHelperClass item(int o0){ return null; }}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openStream(){ return null; }}

class InputStream {

}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass readLine(){ return null; }
	public MyHelperClass close(){ return null; }}

class InputStreamReader {

InputStreamReader(InputStream o0){}
	InputStreamReader(){}}

class Writer {

public MyHelperClass write(String o0){ return null; }
	public MyHelperClass close(){ return null; }}

class BufferedWriter {

BufferedWriter(){}
	BufferedWriter(OutputStreamWriter o0){}}

class OutputStreamWriter {

OutputStreamWriter(FileOutputStream o0, String o1){}
	OutputStreamWriter(){}}

class FileOutputStream {

FileOutputStream(String o0){}
	FileOutputStream(){}}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class File {

File(String o0){}
	File(){}}

class DocumentBuilderFactory {

public MyHelperClass newDocumentBuilder(){ return null; }}

class DocumentBuilder {

public MyHelperClass parse(File o0){ return null; }}

class Document {

public MyHelperClass getElementsByTagName(String o0){ return null; }}

class NodeList {

public MyHelperClass item(int o0){ return null; }}

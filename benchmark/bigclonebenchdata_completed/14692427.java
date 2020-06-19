
import java.io.UncheckedIOException;


class c14692427 {
public MyHelperClass MessageViewer;

    private String readRDF() {
        try {
            MyHelperClass GeoModel = new MyHelperClass();
            FileReader fileStream = new FileReader(GeoModel.PATH_STORED_FILES + "rdfVersion.xml");
            BufferedReader readBuf = new BufferedReader(fileStream);
            StringBuilder contents = new StringBuilder();
            String line;
            while ((line =(String)(Object) readBuf.readLine()) != null) {
                contents.append(line);
                contents.append(System.getProperty("line.separator"));
            }
            readBuf.close();
            return contents.toString();
        } catch (UncheckedIOException e) {
            MyHelperClass mainFrame = new MyHelperClass();
            MessageViewer.infoMessage(mainFrame, "You are running a demo version using data files fetched from the web.\nResults cannot be saved.");
//            MyHelperClass mainFrame = new MyHelperClass();
            mainFrame.setTitle(mainFrame.getTitle() + ". You are running a demo version using data files fetched from the web. Results cannot be saved.");
            URL urlRdf;
            try {
                MyHelperClass GeoModel = new MyHelperClass();
                urlRdf = new URL(GeoModel.URL_STORED_FILES + "rdfVersion.xml");
                URLConnection urlConnRdf =(URLConnection)(Object) urlRdf.openConnection();
                BufferedReader urlReader = new BufferedReader((FileReader)(Object)new InputStreamReader(urlConnRdf.getInputStream()));
                StringBuilder contents = new StringBuilder();
                String line;
                while ((line =(String)(Object) urlReader.readLine()) != null) {
                    contents.append(line);
                    contents.append(System.getProperty("line.separator"));
                }
                urlReader.close();
                return contents.toString();
            } catch (Exception e1) {
                return null;
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass URL_STORED_FILES;
	public MyHelperClass PATH_STORED_FILES;
public MyHelperClass getTitle(){ return null; }
	public MyHelperClass setTitle(String o0){ return null; }
	public MyHelperClass infoMessage(MyHelperClass o0, String o1){ return null; }}

class FileReader {

FileReader(String o0){}
	FileReader(){}}

class BufferedReader {

BufferedReader(FileReader o0){}
	BufferedReader(){}
	public MyHelperClass readLine(){ return null; }
	public MyHelperClass close(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class URLConnection {

public MyHelperClass getInputStream(){ return null; }}

class InputStreamReader {

InputStreamReader(MyHelperClass o0){}
	InputStreamReader(){}}

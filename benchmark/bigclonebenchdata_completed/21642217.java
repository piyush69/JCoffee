
import java.io.UncheckedIOException;


class c21642217 {
public MyHelperClass Logger;

    private String searchMetabolite(String name) {
        {
            BufferedReader in = null;
            try {
                String urlName = name;
                URL url = new URL(urlName);
                in = new BufferedReader(new InputStreamReader(url.openStream()));
                String inputLine;
                Boolean isMetabolite = false;
                while ((inputLine =(String)(Object) in.readLine()) != null) {
                    if (inputLine.contains("Metabolite</h1>")) {
                        isMetabolite = true;
                    }
                    if (inputLine.contains("<td><a href=\"/Metabolites/") && isMetabolite) {
                        String metName = inputLine.substring(inputLine.indexOf("/Metabolites/") + 13, inputLine.indexOf("aspx\" target") + 4);
                        return "http://gmd.mpimp-golm.mpg.de/Metabolites/" + metName;
                    }
                }
                in.close();
                return name;
            } catch (UncheckedIOException ex) {
                MyHelperClass Level = new MyHelperClass();
                Logger.getLogger(GetGolmIDsTask.class.getName()).log(Level.SEVERE, null,(IOException)(Object) ex);
                return null;
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass SEVERE;
public MyHelperClass log(MyHelperClass o0, Object o1, IOException o2){ return null; }
	public MyHelperClass getLogger(String o0){ return null; }}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass readLine(){ return null; }
	public MyHelperClass close(){ return null; }}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openStream(){ return null; }}

class InputStreamReader {

InputStreamReader(MyHelperClass o0){}
	InputStreamReader(){}}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class GetGolmIDsTask {

}

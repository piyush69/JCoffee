import java.io.*;
import java.lang.*;
import java.util.*;



class c4753713 {
public MyHelperClass urlConnection;
	public MyHelperClass urlStream;
	public MyHelperClass includePixelCoords;
	public MyHelperClass reader;

    public void ASDGrammarReader(String fileName, boolean includeCoords) throws IOException, MalformedURLException {
        includePixelCoords =(MyHelperClass)(Object) includeCoords;
        fileName = fileName.trim();
        urlConnection = null;
        urlStream = null;
        if (fileName.substring(0, 5).equalsIgnoreCase("http:")) {
            URL fileURL = new URL(fileName);
            urlConnection =(MyHelperClass)(Object) (HttpURLConnection)(HttpURLConnection)(Object) fileURL.openConnection();
            urlStream = urlConnection.getInputStream();
            reader =(MyHelperClass)(Object) new ASDTokenReader((FileReader)(Object)new BufferedReader(new InputStreamReader((InputStream)(Object)urlStream)));
        } else reader =(MyHelperClass)(Object) new ASDTokenReader(new FileReader(fileName));
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getInputStream(){ return null; }}

class MalformedURLException extends Exception{
	public MalformedURLException(String errorMessage) { super(errorMessage); }
}

class URL {

URL(){}
	URL(String o0){}
	public MyHelperClass openConnection(){ return null; }}

class HttpURLConnection {

}

class ASDTokenReader {

ASDTokenReader(FileReader o0){}
	ASDTokenReader(){}}

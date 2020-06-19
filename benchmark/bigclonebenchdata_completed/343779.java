import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c343779 {
public MyHelperClass sourceCode;
	public MyHelperClass getResourceName(){ return null; }

    public void loadSourceCode()  throws Throwable {
        if (getResourceName() != null) {
            String filename = getResourceName() + ".java";
            sourceCode =(MyHelperClass)(Object) new String("<html><body bgcolor=\"#ffffff\"><pre>");
            InputStream is;
            InputStreamReader isr;
            CodeViewer cv = new CodeViewer();
            URL url;
            try {
                url = getClass().getResource(filename);
                is = url.openStream();
                isr = new InputStreamReader(is);
                BufferedReader reader = new BufferedReader(isr);
                String line = reader.readLine();
                while (line != null) {
                    sourceCode += cv.syntaxHighlight(line) + " \n ";
                    line = reader.readLine();
                }
                sourceCode +=(MyHelperClass)(Object) new String("</pre></body></html>");
            } catch (Exception ex) {
                sourceCode = "Could not load file: "(MyHelperClass)(Object) + filename;
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class CodeViewer {

public MyHelperClass syntaxHighlight(String o0){ return null; }}

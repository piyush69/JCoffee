import java.io.*;
import java.lang.*;
import java.util.*;



class c12883117 {
public int lineCount;
//public MyHelperClass lineCount;
	public MyHelperClass phonesetMap;
	public MyHelperClass parseAndAdd(String o0){ return null; }

    public void PhoneSetImpl(URL url) throws IOException {
        BufferedReader reader;
        String line;
        phonesetMap =(MyHelperClass)(Object) new HashMap();
        reader = new BufferedReader(new InputStreamReader((InputStream)(Object)url.openStream()));
        line = reader.readLine();
        lineCount++;
        while (line != null) {
            if (!line.startsWith("***")) {
                parseAndAdd(line);
            }
            line = reader.readLine();
        }
        reader.close();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class URL {

public MyHelperClass openStream(){ return null; }}

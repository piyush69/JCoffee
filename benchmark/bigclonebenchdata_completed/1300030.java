import java.io.*;
import java.lang.*;
import java.util.*;



class c1300030 {
public MyHelperClass phoneDurations;
	public MyHelperClass parseAndAdd(String o0){ return null; }

    public void PhoneDurationsImpl(URL url) throws IOException {
        BufferedReader reader;
        String line;
        phoneDurations =(MyHelperClass)(Object) new HashMap();
        reader = new BufferedReader(new InputStreamReader((InputStream)(Object)url.openStream()));
        line = reader.readLine();
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

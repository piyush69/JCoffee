import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c6750354 {
public MyHelperClass lines;
	public MyHelperClass seedRandom;
	public MyHelperClass random;
	public MyHelperClass ERR_VALUE_PATTERN_COMPONENT_EMPTY_FILE;

     void HTTPValuePatternComponent(final String url, final long seed) throws IOException {
        seedRandom =(MyHelperClass)(Object) new Random(seed);
        random =(MyHelperClass)(Object) new ThreadLocal<Random>();
        final ArrayList<String> lineList = new ArrayList<String>(100);
        final URL parsedURL = new URL(url);
        final HttpURLConnection urlConnection = (HttpURLConnection) parsedURL.openConnection();
        final BufferedReader reader = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));
        try {
            while (true) {
                final String line = reader.readLine();
                if (line == null) {
                    break;
                }
                lineList.add(line);
            }
        } finally {
            reader.close();
        }
        if (lineList.isEmpty()) {
            throw new IOException((String)(Object)ERR_VALUE_PATTERN_COMPONENT_EMPTY_FILE.get());
        }
        lines =(MyHelperClass)(Object) new String[lineList.size()];
        lineList.toArray(lines);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass get(){ return null; }}

class Collection {

public MyHelperClass toArray(MyHelperClass o0){ return null; }}

import java.io.*;
import java.lang.*;
import java.util.*;



class c17377418 {

    private static String[] loadDB(String name) throws IOException {
        URL url =(URL)(Object) SpecialConstants.class.getResource(name);
        if (url == null) throw new FileNotFoundException("file " + name + " not found");
        InputStream is =(InputStream)(Object) url.openStream();
        try {
            InputStreamReader isr = new InputStreamReader(is, "utf8");
            BufferedReader br = new BufferedReader(isr);
            ArrayList<String> entries = new ArrayList<String>();
            while (true) {
                String line = br.readLine();
                if (line == null) break;
                line = line.trim();
                if (line.length() > 0 && line.charAt(0) != '#') {
                    entries.add(line);
                }
            }
            String[] r = new String[entries.size()];
            entries.toArray(r);
            return r;
        } finally {
            is.close();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class URL {

public MyHelperClass openStream(){ return null; }}

class SpecialConstants {

}

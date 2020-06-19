import java.io.*;
import java.lang.*;
import java.util.*;



class c21386815 {

    protected void readInput(String filename, List<String> list) throws IOException {
        URL url =(URL)(Object) GeneratorBase.class.getResource(filename);
        if (url == null) {
            throw new FileNotFoundException("specified file not available - " + filename);
        }
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new InputStreamReader((InputStream)(Object)url.openStream()));
            String line;
            while ((line = reader.readLine()) != null) {
                list.add(line.trim());
            }
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                }
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class URL {

public MyHelperClass openStream(){ return null; }}

class GeneratorBase {

}

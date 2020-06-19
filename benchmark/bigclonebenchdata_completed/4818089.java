import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c4818089 {

    public List<String[]> getCSV(String name)  throws Throwable {
        return new ResourceLoader>(name) {

//            @Override
            protected List<String[]> get(URL url) throws Exception {
                CSVReader reader = null;
                try {
                    reader = new CSVReader(new InputStreamReader(url.openStream()));
                    return reader.readAll();
                } finally {
                    IOUtils.closeQuietly(reader);
                }
            }
        }.get();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class ResourceLoader {

}

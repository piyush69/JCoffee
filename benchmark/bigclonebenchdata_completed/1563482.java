import java.io.*;
import java.lang.*;
import java.util.*;



class c1563482 {

    public StringBuffer get(URL url) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader((InputStream)(Object)url.openStream()));
        StringBuffer page = new StringBuffer();
        String line = null;
        while ((line = bufferedReader.readLine()) != null) {
            String utf = new String(line.getBytes("UTF-8"), "UTF-8");
            page.append(utf);
        }
        bufferedReader.close();
        return page;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class URL {

public MyHelperClass openStream(){ return null; }}

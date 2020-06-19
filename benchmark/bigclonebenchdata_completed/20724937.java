import java.io.*;
import java.lang.*;
import java.util.*;



class c20724937 {
public static MyHelperClass getTopicMap(InputStream o0, String o1){ return null; }
//public MyHelperClass getTopicMap(InputStream o0, String o1){ return null; }

    public static TopicMap getTopicMap(URL url) {
        String baseURI = url.toString();
        InputStream inputStream = null;
        try {
            inputStream =(InputStream)(Object) url.openStream();
        } catch (UncheckedIOException e) {
            e.printStackTrace();
        }
        return(TopicMap)(Object) getTopicMap(inputStream, baseURI);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class URL {

public MyHelperClass openStream(){ return null; }}

class TopicMap {

}

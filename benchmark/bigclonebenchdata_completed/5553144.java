import java.io.*;
import java.lang.*;
import java.util.*;



class c5553144 {
public MyHelperClass ResourceLoader;
	public MyHelperClass ref;

    private void initStreams() throws IOException {
        MyHelperClass audio = new MyHelperClass();
        if (audio != null) {
//            MyHelperClass audio = new MyHelperClass();
            audio.close();
        }
        MyHelperClass url = new MyHelperClass();
        if (url != null) {
//            MyHelperClass audio = new MyHelperClass();
            audio =(MyHelperClass)(Object) new OggInputStream(url.openStream());
        } else {
//            MyHelperClass audio = new MyHelperClass();
            audio =(MyHelperClass)(Object) new OggInputStream(ResourceLoader.getResourceAsStream(ref));
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass close(){ return null; }
	public MyHelperClass getResourceAsStream(MyHelperClass o0){ return null; }
	public MyHelperClass openStream(){ return null; }}

class OggInputStream {

OggInputStream(){}
	OggInputStream(MyHelperClass o0){}}

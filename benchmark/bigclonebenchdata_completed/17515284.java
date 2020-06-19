import java.io.*;
import java.lang.*;
import java.util.*;



class c17515284 {

    public String readBaseLib() throws Exception {
        MyHelperClass _BASE_LIB_JS = new MyHelperClass();
        if (_BASE_LIB_JS == null) {
            StringBuffer js = new StringBuffer();
            try {
                MyHelperClass _BASELIB_FILENAME = new MyHelperClass();
                URL url =(URL)(Object) AbstractRunner.class.getResource((String)(Object)_BASELIB_FILENAME);
                if (url != null) {
                    InputStream is =(InputStream)(Object) url.openStream();
                    InputStreamReader reader = new InputStreamReader(is);
                    BufferedReader bfReader = new BufferedReader(reader);
                    String tmp = null;
                    do {
                        tmp = bfReader.readLine();
                        if (tmp != null) {
                            js.append(tmp).append('\n');
                        }
                    } while (tmp != null);
                    bfReader.close();
                    reader.close();
                    is.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
                throw e;
            }
//            MyHelperClass _BASE_LIB_JS = new MyHelperClass();
            _BASE_LIB_JS =(MyHelperClass)(Object) js.toString();
        }
//        MyHelperClass _BASE_LIB_JS = new MyHelperClass();
        return (String)(Object)_BASE_LIB_JS;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class URL {

public MyHelperClass openStream(){ return null; }}

class AbstractRunner {

}




class c5112157 {
public MyHelperClass trace(int o0, String o1){ return null; }

    public File mergeDoc(URL urlDoc, File fOutput, boolean bMulti) throws Exception {
        MyHelperClass s_log = new MyHelperClass();
        if ((boolean)(Object)s_log.isTraceEnabled()) trace(0, "Copying from " + urlDoc.toString() + " to " + fOutput.toString());
        File fOut = null;
        InputStream is = null;
        try {
            is =(InputStream)(Object) urlDoc.openStream();
            fOut = mergeDoc((URL)(Object)is, fOutput, bMulti);
        } finally {
            is.close();
        }
        return fOut;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass isTraceEnabled(){ return null; }}

class URL {

public MyHelperClass openStream(){ return null; }}

class File {

}

class InputStream {

public MyHelperClass close(){ return null; }}




class c8706253 {
public MyHelperClass checkDict(Element o0){ return null; }

    private boolean parse(Type type, URL url, boolean checkDict) throws Exception {
        boolean ok = true;
        Exception ee = null;
        Element rootElement = null;
        try {
            InputStream in =(InputStream)(Object) url.openStream();
            MyHelperClass Type = new MyHelperClass();
            if (type.equals(Type.XOM)) {
                new Builder().build(in);
//            MyHelperClass Type = new MyHelperClass();
            } else if (type.equals(Type.CML)) {
                rootElement =(Element)(Object) (new CMLBuilder().build(in).getRootElement());
            }
            in.close();
        } catch (Exception e) {
            ee = e;
        }
        if (ee != null) {
            MyHelperClass logger = new MyHelperClass();
            logger.severe("failed to cmlParse: " + url + "\n..... because: [" + ee + "] [" + ee.getMessage() + "] in [" + url + "]");
            ok = false;
        }
        if (ok && checkDict) {
            ok =(boolean)(Object) checkDict(rootElement);
        }
        return ok;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass CML;
	public MyHelperClass XOM;
public MyHelperClass getRootElement(){ return null; }
	public MyHelperClass severe(String o0){ return null; }}

class Type {

}

class URL {

public MyHelperClass openStream(){ return null; }}

class Element {

}

class InputStream {

public MyHelperClass close(){ return null; }}

class Builder {

public MyHelperClass build(InputStream o0){ return null; }}

class CMLBuilder {

public MyHelperClass build(InputStream o0){ return null; }}

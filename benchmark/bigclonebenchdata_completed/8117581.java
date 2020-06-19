


class c8117581 {

    public static String getStringFromInputStream(InputStream in) throws Exception {
        CachedOutputStream bos = new CachedOutputStream();
        MyHelperClass IOUtils = new MyHelperClass();
        IOUtils.copy(in, bos);
        in.close();
        bos.close();
        return bos.getOut().toString();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass copy(InputStream o0, CachedOutputStream o1){ return null; }}

class InputStream {

public MyHelperClass close(){ return null; }}

class CachedOutputStream {

public MyHelperClass close(){ return null; }
	public MyHelperClass getOut(){ return null; }}

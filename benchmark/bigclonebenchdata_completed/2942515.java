


class c2942515 {

//    @Override
    protected InputStream getResourceStream(String name) throws Exception {
        MyHelperClass cpm = new MyHelperClass();
        final BundleEntry entry =(BundleEntry)(Object) cpm.findLocalEntry(name);
        if (entry != null) return(InputStream)(Object) entry.getInputStream();
//        MyHelperClass cpm = new MyHelperClass();
        final URL url =(URL)(Object) cpm.getBaseData().getBundle().getResource(name);
        if (url != null) return(InputStream)(Object) url.openStream();
        return null;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getResource(String o0){ return null; }
	public MyHelperClass getBundle(){ return null; }
	public MyHelperClass getBaseData(){ return null; }
	public MyHelperClass findLocalEntry(String o0){ return null; }}

class InputStream {

}

class BundleEntry {

public MyHelperClass getInputStream(){ return null; }}

class URL {

public MyHelperClass openStream(){ return null; }}

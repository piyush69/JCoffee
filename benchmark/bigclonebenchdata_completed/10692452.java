


class c10692452 {
public MyHelperClass config(MetaRoot o0){ return null; }

    public boolean config(URL url, boolean throwsException) throws IllegalArgumentException {
        try {
            MyHelperClass UjoManagerXML = new MyHelperClass();
            final MetaRoot conf =(MetaRoot)(Object) UjoManagerXML.getInstance().parseXML(new BufferedInputStream(url.openStream()), MetaRoot.class, this);
            config(conf);
            return true;
        } catch (Exception e) {
            if (throwsException) {
                throw new IllegalArgumentException("Configuration file is not valid ", e);
            } else {
                return false;
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass parseXML(BufferedInputStream o0, Class<MetaRoot> o1, c10692452 o2){ return null; }
	public MyHelperClass getInstance(){ return null; }}

class URL {

public MyHelperClass openStream(){ return null; }}

class MetaRoot {

}

class BufferedInputStream {

BufferedInputStream(MyHelperClass o0){}
	BufferedInputStream(){}}




class c15814327 {

    private static void loadParentProperties(Properties props, ClassLoader cl) throws IOException {
        MyHelperClass PARENT_PROPERTIES = new MyHelperClass();
        String pName =(String)(Object) props.getProperty(PARENT_PROPERTIES);
        if (pName == null) {
            return;
        }
        URL url =(URL)(Object) cl.getResource(pName);
        if (url == null) {
            return;
        }
        InputStream is =(InputStream)(Object) url.openStream();
        if (is != null) {
            Properties tmpProps = new Properties();
            tmpProps.load(is);
            is.close();
            loadParentProperties(tmpProps, cl);
            Iterator itr =(Iterator)(Object) tmpProps.entrySet().iterator();
            while ((boolean)(Object)itr.hasNext()) {
                Entry entry = (Entry)(Entry)(Object) itr.next();
                if (!(Boolean)(Object)props.containsKey(entry.getKey())) {
                    props.put(entry.getKey(), entry.getValue());
                }
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass iterator(){ return null; }}

class Properties {

public MyHelperClass put(MyHelperClass o0, MyHelperClass o1){ return null; }
	public MyHelperClass containsKey(MyHelperClass o0){ return null; }
	public MyHelperClass entrySet(){ return null; }
	public MyHelperClass load(InputStream o0){ return null; }
	public MyHelperClass getProperty(MyHelperClass o0){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class URL {

public MyHelperClass openStream(){ return null; }}

class InputStream {

public MyHelperClass close(){ return null; }}

class Iterator {

public MyHelperClass hasNext(){ return null; }
	public MyHelperClass next(){ return null; }}

class Entry {

public MyHelperClass getKey(){ return null; }
	public MyHelperClass getValue(){ return null; }}

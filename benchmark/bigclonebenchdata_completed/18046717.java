


class c18046717 {

    private String getFullClassName(URL url, String className) throws Exception {
        JarInputStream jis = new JarInputStream(url.openStream());
        ZipEntry zentry = null;
        while ((zentry =(ZipEntry)(Object) jis.getNextEntry()) != null) {
            String name =(String)(Object) zentry.getName();
            int lastPos = name.lastIndexOf(".class");
            if (lastPos < 0) {
                continue;
            }
            name = name.replace('/', '.');
            int pos = -1;
            if (className != null) {
                pos = name.indexOf(className);
                if (pos >= 0 && name.length() == pos + className.length() + 6) {
                    jis.close();
                    return (name.substring(0, lastPos));
                }
            }
        }
        jis.close();
        return (null);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class URL {

public MyHelperClass openStream(){ return null; }}

class JarInputStream {

JarInputStream(MyHelperClass o0){}
	JarInputStream(){}
	public MyHelperClass getNextEntry(){ return null; }
	public MyHelperClass close(){ return null; }}

class ZipEntry {

public MyHelperClass getName(){ return null; }}

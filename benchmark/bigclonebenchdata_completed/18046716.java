


class c18046716 {

    private List getContainedFilePaths(URL url) throws Exception {
        JarInputStream jis = new JarInputStream(url.openStream());
        ZipEntry zentry = null;
        ArrayList fullNames = new ArrayList();
        while ((zentry =(ZipEntry)(Object) jis.getNextEntry()) != null) {
            String name =(String)(Object) zentry.getName();
            if (!(Boolean)(Object)zentry.isDirectory()) {
                fullNames.add(name);
            }
        }
        jis.close();
        return ((List)(Object)fullNames);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class URL {

public MyHelperClass openStream(){ return null; }}

class List {

}

class JarInputStream {

JarInputStream(MyHelperClass o0){}
	JarInputStream(){}
	public MyHelperClass getNextEntry(){ return null; }
	public MyHelperClass close(){ return null; }}

class ZipEntry {

public MyHelperClass isDirectory(){ return null; }
	public MyHelperClass getName(){ return null; }}

class ArrayList {

public MyHelperClass add(String o0){ return null; }}

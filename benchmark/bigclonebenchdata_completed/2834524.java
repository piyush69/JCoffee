


class c2834524 {
public MyHelperClass expandSet(HashSet o0){ return null; }
	public MyHelperClass getJarFile(MyHelperClass o0){ return null; }
public MyHelperClass manifest;

    public void write() throws IOException {
        MyHelperClass outputStream = new MyHelperClass();
        JarOutputStream jarOut = new JarOutputStream(outputStream, manifest);
        MyHelperClass includeJars = new MyHelperClass();
        if (includeJars != null) {
//            MyHelperClass includeJars = new MyHelperClass();
            HashSet allEntries = new HashSet(includeJars);
            MyHelperClass ignoreDependencies = new MyHelperClass();
            if (!(Boolean)(Object)ignoreDependencies) expandSet(allEntries);
            for (Iterator iterator =(Iterator)(Object) allEntries.iterator();(boolean)(Object) iterator.hasNext(); ) {
                JarFile jar =(JarFile)(Object) getJarFile(iterator.next());
                Enumeration jarEntries =(Enumeration)(Object) jar.entries();
                while ((boolean)(Object)jarEntries.hasMoreElements()) {
                    ZipEntry o1 = (ZipEntry)(ZipEntry)(Object) jarEntries.nextElement();
                    if ((boolean)(Object)o1.getName().equalsIgnoreCase("META-INF/MANIFEST.MF") ||(int)(Object) o1.getSize() <= 0) continue;
                    jarOut.putNextEntry(o1);
                    InputStream entryStream =(InputStream)(Object) jar.getInputStream(o1);
                    MyHelperClass IOUtils = new MyHelperClass();
                    IOUtils.copy(entryStream, jarOut);
                    jarOut.closeEntry();
                }
            }
        }
        jarOut.finish();
        jarOut.close();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass equalsIgnoreCase(String o0){ return null; }
	public MyHelperClass copy(InputStream o0, JarOutputStream o1){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class JarOutputStream {

JarOutputStream(){}
	JarOutputStream(MyHelperClass o0, MyHelperClass o1){}
	public MyHelperClass closeEntry(){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass putNextEntry(ZipEntry o0){ return null; }
	public MyHelperClass finish(){ return null; }}

class HashSet {

HashSet(MyHelperClass o0){}
	HashSet(){}
	public MyHelperClass iterator(){ return null; }}

class Iterator {

public MyHelperClass hasNext(){ return null; }
	public MyHelperClass next(){ return null; }}

class JarFile {

public MyHelperClass entries(){ return null; }
	public MyHelperClass getInputStream(ZipEntry o0){ return null; }}

class Enumeration {

public MyHelperClass nextElement(){ return null; }
	public MyHelperClass hasMoreElements(){ return null; }}

class ZipEntry {

public MyHelperClass getName(){ return null; }
	public MyHelperClass getSize(){ return null; }}

class InputStream {

}

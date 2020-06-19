
import java.io.UncheckedIOException;


class c20089258 {
public MyHelperClass normalizePath(MyHelperClass o0){ return null; }
public MyHelperClass getInputStream(MyHelperClass o0){ return null; }
public MyHelperClass IOUtils;

    private void copyEntries() {
        MyHelperClass zipFile = new MyHelperClass();
        if (zipFile != null) {
//            MyHelperClass zipFile = new MyHelperClass();
            Enumeration enumerator =(Enumeration)(Object) zipFile.entries();
            while ((boolean)(Object)enumerator.hasMoreElements()) {
                ZipEntry entry =(ZipEntry)(Object) enumerator.nextElement();
                MyHelperClass toIgnore = new MyHelperClass();
                if (!(Boolean)(Object)entry.isDirectory() && !(Boolean)(Object)toIgnore.contains(normalizePath(entry.getName()))) {
                    ZipEntry originalEntry = new ZipEntry(entry.getName());
                    try {
                        MyHelperClass zipOutput = new MyHelperClass();
                        zipOutput.putNextEntry(originalEntry);
//                        MyHelperClass zipOutput = new MyHelperClass();
                        IOUtils.copy(getInputStream(entry.getName()), zipOutput);
//                        MyHelperClass zipOutput = new MyHelperClass();
                        zipOutput.closeEntry();
                    } catch (UncheckedIOException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass contains(MyHelperClass o0){ return null; }
	public MyHelperClass closeEntry(){ return null; }
	public MyHelperClass copy(MyHelperClass o0, MyHelperClass o1){ return null; }
	public MyHelperClass entries(){ return null; }
	public MyHelperClass putNextEntry(ZipEntry o0){ return null; }}

class Enumeration {

public MyHelperClass nextElement(){ return null; }
	public MyHelperClass hasMoreElements(){ return null; }}

class ZipEntry {

ZipEntry(MyHelperClass o0){}
	ZipEntry(){}
	public MyHelperClass isDirectory(){ return null; }
	public MyHelperClass getName(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

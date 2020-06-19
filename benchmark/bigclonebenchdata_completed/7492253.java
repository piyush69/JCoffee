


class c7492253 {
public MyHelperClass url;

    protected Connection openRelativeFile(String file) throws IOException {
        MyHelperClass cachedBits = new MyHelperClass();
        if (cachedBits == null) {
//            MyHelperClass cachedBits = new MyHelperClass();
            cachedBits = new ByteArray(url.openConnection().getInputStream()).getBytes();
        }
//        MyHelperClass cachedBits = new MyHelperClass();
        ZipInputStream zin = new ZipInputStream(new ByteArrayInputStream(cachedBits));
        ZipEntry zentry;
        while (true) {
            zentry =(ZipEntry)(Object) zin.getNextEntry();
            if (zentry == null) {
                throw new IOException("Couldn't find resource " + file + " in ZIP-file");
            }
            if (zentry.getName().equals(file)) {
                return new Connection(zin, zentry.getSize());
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass openConnection(){ return null; }
	public MyHelperClass getInputStream(){ return null; }}

class Connection {

Connection(ZipInputStream o0, MyHelperClass o1){}
	Connection(){}}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class ZipInputStream {

ZipInputStream(ByteArrayInputStream o0){}
	ZipInputStream(){}
	public MyHelperClass getNextEntry(){ return null; }}

class ByteArrayInputStream {

ByteArrayInputStream(MyHelperClass o0){}
	ByteArrayInputStream(){}}

class ZipEntry {

public MyHelperClass getName(){ return null; }
	public MyHelperClass getSize(){ return null; }}

class ByteArray {

ByteArray(MyHelperClass o0){}
	ByteArray(){}
	public MyHelperClass getBytes(){ return null; }}

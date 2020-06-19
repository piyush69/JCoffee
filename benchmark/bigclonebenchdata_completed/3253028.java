


class c3253028 {

    public static List unTar(File tarFile, File directory) throws IOException {
        List result =(List)(Object) new ArrayList();
        InputStream inputStream =(InputStream)(Object) new FileInputStream(tarFile);
        TarArchiveInputStream in = new TarArchiveInputStream(inputStream);
        TarArchiveEntry entry =(TarArchiveEntry)(Object) in.getNextTarEntry();
        while (entry != null) {
            OutputStream out =(OutputStream)(Object) new FileOutputStream(new File(directory, entry.getName()));
            MyHelperClass IOUtils = new MyHelperClass();
            IOUtils.copy(in, out);
            out.close();
            result.add(entry.getName());
            entry =(TarArchiveEntry)(Object) in.getNextTarEntry();
        }
        in.close();
        return result;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass copy(TarArchiveInputStream o0, OutputStream o1){ return null; }}

class File {

File(File o0, MyHelperClass o1){}
	File(){}}

class List {

public MyHelperClass add(MyHelperClass o0){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class ArrayList {

}

class InputStream {

}

class FileInputStream {

FileInputStream(File o0){}
	FileInputStream(){}}

class TarArchiveInputStream {

TarArchiveInputStream(InputStream o0){}
	TarArchiveInputStream(){}
	public MyHelperClass getNextTarEntry(){ return null; }
	public MyHelperClass close(){ return null; }}

class TarArchiveEntry {

public MyHelperClass getName(){ return null; }}

class OutputStream {

public MyHelperClass close(){ return null; }}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}}

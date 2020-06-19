
import java.io.UncheckedIOException;


class c16292791 {
public MyHelperClass getArchiveEntry(File o0, MyHelperClass o1){ return null; }
public MyHelperClass getArchiveOutputStream(FileOutputStream o0){ return null; }

    public void doCompress(File[] files, File out, List excludedKeys) {
        Map map =(Map)(Object) new HashMap();
        MyHelperClass FilenameUtils = new MyHelperClass();
        String parent =(String)(Object) FilenameUtils.getBaseName(out.getName());
        for (File f : files) {
            MyHelperClass CompressionUtil = new MyHelperClass();
            CompressionUtil.list(f, parent, map, excludedKeys);
        }
        if (!(Boolean)(Object)map.isEmpty()) {
            FileOutputStream fos = null;
            ArchiveOutputStream aos = null;
            InputStream is = null;
            try {
                fos = new FileOutputStream(out);
                aos =(ArchiveOutputStream)(Object) getArchiveOutputStream(fos);
                for (Entry entry :(Entry[])(Object) (Object[])(Object)map.entrySet()) {
                    File file =(File)(Object) entry.getValue();
                    ArchiveEntry ae =(ArchiveEntry)(Object) getArchiveEntry(file, entry.getKey());
                    aos.putArchiveEntry(ae);
                    if ((boolean)(Object)file.isFile()) {
                        MyHelperClass IOUtils = new MyHelperClass();
                        IOUtils.copy(is =(InputStream)(Object) new FileInputStream(file), aos);
//                        MyHelperClass IOUtils = new MyHelperClass();
                        IOUtils.closeQuietly(is);
                        is = null;
                    }
                    aos.closeArchiveEntry();
                }
                aos.finish();
            } catch (UncheckedIOException ex) {
                ex.printStackTrace();
            } finally {
                MyHelperClass IOUtils = new MyHelperClass();
                IOUtils.closeQuietly(is);
//                MyHelperClass IOUtils = new MyHelperClass();
                IOUtils.closeQuietly(aos);
//                MyHelperClass IOUtils = new MyHelperClass();
                IOUtils.closeQuietly(fos);
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass closeQuietly(FileOutputStream o0){ return null; }
	public MyHelperClass closeQuietly(InputStream o0){ return null; }
	public MyHelperClass getBaseName(MyHelperClass o0){ return null; }
	public MyHelperClass list(File o0, String o1, Map o2, List o3){ return null; }
	public MyHelperClass copy(InputStream o0, ArchiveOutputStream o1){ return null; }
	public MyHelperClass closeQuietly(ArchiveOutputStream o0){ return null; }}

class File {

public MyHelperClass isFile(){ return null; }
	public MyHelperClass getName(){ return null; }}

class List {

}

class Map {

public MyHelperClass isEmpty(){ return null; }
	public MyHelperClass entrySet(){ return null; }}

class HashMap {

}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}}

class ArchiveOutputStream {

public MyHelperClass closeArchiveEntry(){ return null; }
	public MyHelperClass finish(){ return null; }
	public MyHelperClass putArchiveEntry(ArchiveEntry o0){ return null; }}

class InputStream {

}

class ArchiveEntry {

}

class FileInputStream {

FileInputStream(File o0){}
	FileInputStream(){}}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class Entry {

public MyHelperClass getKey(){ return null; }
	public MyHelperClass getValue(){ return null; }}

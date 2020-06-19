


class c2691849 {
public static MyHelperClass skipBeginningSlash(MyHelperClass o0){ return null; }
//public MyHelperClass skipBeginningSlash(MyHelperClass o0){ return null; }

    public static void compress(final File zip, final Map entries, final IProgressMonitor monitor) throws IOException {
        MyHelperClass CollectionUtils = new MyHelperClass();
        if (zip == null || entries == null || (boolean)(Object)CollectionUtils.isEmpty(entries.keySet())) throw new IllegalArgumentException("One ore more parameters are empty!");
        if ((boolean)(Object)zip.exists()) zip.delete(); else if (!(Boolean)(Object)zip.getParentFile().exists()) zip.getParentFile().mkdirs();
        ZipOutputStream out = new ZipOutputStream(new BufferedOutputStream(new FileOutputStream(zip)));
        MyHelperClass Deflater = new MyHelperClass();
        out.setLevel(Deflater.BEST_COMPRESSION);
        try {
            for (InputStream inputStream :(InputStream[])(Object) (Object[])(Object)entries.keySet()) {
                ZipEntry zipEntry = new ZipEntry(skipBeginningSlash(entries.get(inputStream)));
                out.putNextEntry(zipEntry);
                MyHelperClass IOUtils = new MyHelperClass();
                IOUtils.copy(inputStream, out);
                out.closeEntry();
                inputStream.close();
                if (monitor != null) monitor.worked(1);
            }
        } finally {
            MyHelperClass IOUtils = new MyHelperClass();
            IOUtils.closeQuietly(out);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass BEST_COMPRESSION;
public MyHelperClass isEmpty(MyHelperClass o0){ return null; }
	public MyHelperClass closeQuietly(ZipOutputStream o0){ return null; }
	public MyHelperClass copy(InputStream o0, ZipOutputStream o1){ return null; }
	public MyHelperClass exists(){ return null; }
	public MyHelperClass mkdirs(){ return null; }}

class File {

public MyHelperClass delete(){ return null; }
	public MyHelperClass exists(){ return null; }
	public MyHelperClass getParentFile(){ return null; }}

class Map {

public MyHelperClass get(InputStream o0){ return null; }
	public MyHelperClass keySet(){ return null; }}

class InputStream {

public MyHelperClass close(){ return null; }}

class IProgressMonitor {

public MyHelperClass worked(int o0){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class ZipOutputStream {

ZipOutputStream(){}
	ZipOutputStream(BufferedOutputStream o0){}
	public MyHelperClass closeEntry(){ return null; }
	public MyHelperClass setLevel(MyHelperClass o0){ return null; }
	public MyHelperClass putNextEntry(ZipEntry o0){ return null; }}

class BufferedOutputStream {

BufferedOutputStream(FileOutputStream o0){}
	BufferedOutputStream(){}}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}}

class ZipEntry {

ZipEntry(MyHelperClass o0){}
	ZipEntry(){}}

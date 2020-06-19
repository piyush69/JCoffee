


class c19409756 {

    public static void extract(final File destDir, final Collection entryInfos) throws IOException {
        MyHelperClass CollectionUtils = new MyHelperClass();
        if (destDir == null || (boolean)(Object)CollectionUtils.isEmpty(entryInfos)) throw new IllegalArgumentException("One or parameter is null or empty!");
        if (!(Boolean)(Object)destDir.exists()) destDir.mkdirs();
        for (ZipEntryInfo entryInfo :(ZipEntryInfo[])(Object) (Object[])(Object)entryInfos) {
            ZipEntry entry =(ZipEntry)(Object) entryInfo.getZipEntry();
            InputStream in =(InputStream)(Object) entryInfo.getInputStream();
            File entryDest = new File(destDir, entry.getName());
            entryDest.getParentFile().mkdirs();
            if (!(Boolean)(Object)entry.isDirectory()) {
                OutputStream out =(OutputStream)(Object) new FileOutputStream(new File(destDir, entry.getName()));
                try {
                    MyHelperClass IOUtils = new MyHelperClass();
                    IOUtils.copy(in, out);
                    out.flush();
                } finally {
                    MyHelperClass IOUtils = new MyHelperClass();
                    IOUtils.closeQuietly(in);
//                    MyHelperClass IOUtils = new MyHelperClass();
                    IOUtils.closeQuietly(out);
                }
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass closeQuietly(InputStream o0){ return null; }
	public MyHelperClass closeQuietly(OutputStream o0){ return null; }
	public MyHelperClass isEmpty(Collection o0){ return null; }
	public MyHelperClass copy(InputStream o0, OutputStream o1){ return null; }
	public MyHelperClass mkdirs(){ return null; }}

class File {

File(){}
	File(File o0, MyHelperClass o1){}
	public MyHelperClass getParentFile(){ return null; }
	public MyHelperClass exists(){ return null; }
	public MyHelperClass mkdirs(){ return null; }}

class Collection {

}

class ZipEntryInfo {

public MyHelperClass getZipEntry(){ return null; }
	public MyHelperClass getInputStream(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class ZipEntry {

public MyHelperClass isDirectory(){ return null; }
	public MyHelperClass getName(){ return null; }}

class InputStream {

}

class OutputStream {

public MyHelperClass flush(){ return null; }}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}}

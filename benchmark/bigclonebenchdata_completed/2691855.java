


class c2691855 {

    public static void extract(final File destDir, final ZipInfo zipInfo, final IProgressMonitor monitor) throws IOException {
        if (!(Boolean)(Object)destDir.exists()) destDir.mkdirs();
        for (String key :(String[])(Object) (Object[])(Object)zipInfo.getEntryKeys()) {
            ZipEntry entry =(ZipEntry)(Object) zipInfo.getEntry(key);
            InputStream in =(InputStream)(Object) zipInfo.getInputStream(entry);
            File entryDest = new File(destDir, entry.getName());
            entryDest.getParentFile().mkdirs();
            if (!(Boolean)(Object)entry.isDirectory()) {
                OutputStream out =(OutputStream)(Object) new FileOutputStream(new File(destDir, entry.getName()));
                try {
                    MyHelperClass IOUtils = new MyHelperClass();
                    IOUtils.copy(in, out);
                    out.flush();
                    if (monitor != null) monitor.worked(1);
                } finally {
                    MyHelperClass IOUtils = new MyHelperClass();
                    IOUtils.closeQuietly(in);
//                    MyHelperClass IOUtils = new MyHelperClass();
                    IOUtils.closeQuietly(out);
                }
            }
        }
        if (monitor != null) monitor.done();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass closeQuietly(OutputStream o0){ return null; }
	public MyHelperClass closeQuietly(InputStream o0){ return null; }
	public MyHelperClass copy(InputStream o0, OutputStream o1){ return null; }
	public MyHelperClass mkdirs(){ return null; }}

class File {

File(){}
	File(File o0, MyHelperClass o1){}
	public MyHelperClass getParentFile(){ return null; }
	public MyHelperClass exists(){ return null; }
	public MyHelperClass mkdirs(){ return null; }}

class ZipInfo {

public MyHelperClass getInputStream(ZipEntry o0){ return null; }
	public MyHelperClass getEntryKeys(){ return null; }
	public MyHelperClass getEntry(String o0){ return null; }}

class IProgressMonitor {

public MyHelperClass worked(int o0){ return null; }
	public MyHelperClass done(){ return null; }}

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

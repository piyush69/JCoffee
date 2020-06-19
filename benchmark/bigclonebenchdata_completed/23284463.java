


class c23284463 {

    public static DownloadedContent downloadContent(final InputStream is) throws IOException {
        if (is == null) {
            return (DownloadedContent)(Object)new InMemory(new byte[] {});
        }
        final ByteArrayOutputStream bos = new ByteArrayOutputStream();
        final byte[] buffer = new byte[1024];
        int nbRead;
        try {
            while ((nbRead =(int)(Object) is.read(buffer)) != -1) {
                bos.write(buffer, 0, nbRead);
                MyHelperClass MAX_IN_MEMORY = new MyHelperClass();
                if ((int)(Object)bos.size() > (int)(Object)MAX_IN_MEMORY) {
                    MyHelperClass File = new MyHelperClass();
                    final File file =(File)(Object) File.createTempFile("htmlunit", ".tmp");
                    file.deleteOnExit();
                    final FileOutputStream fos = new FileOutputStream(file);
                    bos.writeTo(fos);
                    MyHelperClass IOUtils = new MyHelperClass();
                    IOUtils.copyLarge(is, fos);
                    fos.close();
                    return (DownloadedContent)(Object)new OnFile(file);
                }
            }
        } finally {
            MyHelperClass IOUtils = new MyHelperClass();
            IOUtils.closeQuietly(is);
        }
        return (DownloadedContent)(Object)new InMemory(bos.toByteArray());
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass copyLarge(InputStream o0, FileOutputStream o1){ return null; }
	public MyHelperClass closeQuietly(InputStream o0){ return null; }
	public MyHelperClass createTempFile(String o0, String o1){ return null; }}

class InputStream {

public MyHelperClass read(byte[] o0){ return null; }}

class DownloadedContent {

}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class ByteArrayOutputStream {

public MyHelperClass write(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass writeTo(FileOutputStream o0){ return null; }
	public MyHelperClass size(){ return null; }
	public MyHelperClass toByteArray(){ return null; }}

class File {

public MyHelperClass deleteOnExit(){ return null; }}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}
	public MyHelperClass close(){ return null; }}

class InMemory {

InMemory(MyHelperClass o0){}
	InMemory(){}
	InMemory(byte[] o0){}}

class OnFile {

OnFile(File o0){}
	OnFile(){}}

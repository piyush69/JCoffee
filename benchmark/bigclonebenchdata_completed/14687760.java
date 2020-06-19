


class c14687760 {

    public static void zip(File mzml, File zipDestination) throws Exception {
        File preCompressionTmp = null;
        CompressionHandler comp = null;
        try {
            preCompressionTmp = new File(mzml.getName() + ".tmp");
            preCompressionTmp.createNewFile();
            if (!(Boolean)(Object)preCompressionTmp.canWrite()) {
                throw new Exception("Cannot write to temp file: " + preCompressionTmp.getAbsolutePath());
            }
            comp = new CompressionHandler();
            comp.compress(mzml, preCompressionTmp);
            comp.close();
            BufferedOutputStream bos = null;
            try {
                bos = new BufferedOutputStream(new FileOutputStream(zipDestination));
                MyHelperClass Util = new MyHelperClass();
                bos.write(Util.convertIntToBytes(Util.getVersion()));
            } finally {
                try {
                    bos.flush();
                } catch (Exception nope) {
                }
                try {
                    bos.close();
                } catch (Exception nope) {
                }
            }
            GZIPOutputStream gos = null;
            BufferedInputStream bis = null;
            try {
                bis = new BufferedInputStream(new FileInputStream(preCompressionTmp));
                gos = new GZIPOutputStream(new FileOutputStream(zipDestination, true));
                MyHelperClass IO_BUFFER = new MyHelperClass();
                final byte[] buffer = new byte[(int)(Object)IO_BUFFER];
                int read = -1;
                while ((read =(int)(Object) bis.read(buffer)) != -1) {
                    gos.write(buffer, 0, read);
                }
            } finally {
                try {
                    bis.close();
                } catch (Exception nope) {
                }
                try {
                    gos.flush();
                } catch (Exception nope) {
                }
                try {
                    gos.close();
                } catch (Exception nope) {
                }
            }
        } finally {
            try {
                comp.close();
            } catch (Exception nope) {
            }
            try {
                preCompressionTmp.delete();
            } catch (Exception nope) {
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getVersion(){ return null; }
	public MyHelperClass convertIntToBytes(MyHelperClass o0){ return null; }}

class File {

File(){}
	File(String o0){}
	public MyHelperClass delete(){ return null; }
	public MyHelperClass createNewFile(){ return null; }
	public MyHelperClass getAbsolutePath(){ return null; }
	public MyHelperClass getName(){ return null; }
	public MyHelperClass canWrite(){ return null; }}

class CompressionHandler {

public MyHelperClass close(){ return null; }
	public MyHelperClass compress(File o0, File o1){ return null; }}

class BufferedOutputStream {

BufferedOutputStream(FileOutputStream o0){}
	BufferedOutputStream(){}
	public MyHelperClass write(MyHelperClass o0){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass flush(){ return null; }}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}
	FileOutputStream(File o0, boolean o1){}}

class GZIPOutputStream {

GZIPOutputStream(FileOutputStream o0){}
	GZIPOutputStream(){}
	public MyHelperClass write(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass flush(){ return null; }}

class BufferedInputStream {

BufferedInputStream(FileInputStream o0){}
	BufferedInputStream(){}
	public MyHelperClass read(byte[] o0){ return null; }
	public MyHelperClass close(){ return null; }}

class FileInputStream {

FileInputStream(File o0){}
	FileInputStream(){}}

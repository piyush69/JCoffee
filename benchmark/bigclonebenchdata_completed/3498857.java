
// import java.io.ArithmeticException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c3498857 {

    public static void main(String[] args) throws IOException {
        String zipPath = "C:\\test.zip";
        CZipInputStream zip_in = null;
        try {
            byte[] c = new byte[1024];
            int slen;
            zip_in = new CZipInputStream(new FileInputStream(zipPath), "utf-8");
            do {
                ZipEntry file =(ZipEntry)(Object) zip_in.getNextEntry();
                if (file == null) break;
                String fileName =(String)(Object) file.getName();
                System.out.println(fileName);
                String ext = fileName.substring(fileName.lastIndexOf("."));
                long seed =(long)(Object) (new Date(System.currentTimeMillis()).getTime());
                String newFileName = Long.toString(seed) + ext;
                FileOutputStream out = new FileOutputStream(newFileName);
                while ((slen =(int)(Object) zip_in.read(c, 0, c.length)) != -1) out.write(c, 0, slen);
                out.close();
            } while (true);
        } catch (UncheckedIOException zipe) {
            zipe.printStackTrace();
        } catch (ArithmeticException ioe) {
            ioe.printStackTrace();
        } finally {
            zip_in.close();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class CZipInputStream {

CZipInputStream(){}
	CZipInputStream(FileInputStream o0, String o1){}
	public MyHelperClass getNextEntry(){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass read(byte[] o0, int o1, int o2){ return null; }}

class FileInputStream {

FileInputStream(String o0){}
	FileInputStream(){}}

class ZipEntry {

public MyHelperClass getName(){ return null; }}

class Date {

Date(){}
	Date(long o0){}
	public MyHelperClass getTime(){ return null; }}

class FileOutputStream {

FileOutputStream(String o0){}
	FileOutputStream(){}
	public MyHelperClass write(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass close(){ return null; }}

class ZipException extends Exception{
	public ZipException(String errorMessage) { super(errorMessage); }
}

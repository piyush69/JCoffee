
// import java.io.ArithmeticException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c7885446 {

    public static String CreateZip(String[] filesToZip, String zipFileName) {
        byte[] buffer = new byte[18024];
        try {
            ZipOutputStream out = new ZipOutputStream(new FileOutputStream(zipFileName));
            MyHelperClass Deflater = new MyHelperClass();
            out.setLevel(Deflater.BEST_COMPRESSION);
            for (int i = 0; i < filesToZip.length; i++) {
                FileInputStream in = new FileInputStream(filesToZip[i]);
                String fileName = null;
                for (int X = filesToZip[i].length() - 1; X >= 0; X--) {
                    if (filesToZip[i].charAt(X) == '\\' || filesToZip[i].charAt(X) == '/') {
                        fileName = filesToZip[i].substring(X + 1);
                        break;
                    } else if (X == 0) fileName = filesToZip[i];
                }
                out.putNextEntry(new ZipEntry(fileName));
                int len;
                while ((len =(int)(Object) in.read(buffer)) > 0) out.write(buffer, 0, len);
                out.closeEntry();
                in.close();
            }
            out.close();
        } catch (IllegalArgumentException e) {
            return "Failed to create zip: " + e.toString();
        } catch (UncheckedIOException e) {
            return "Failed to create zip: " + e.toString();
        } catch (ArithmeticException e) {
            return "Failed to create zip: " + e.toString();
        }
        return "Success";
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass BEST_COMPRESSION;
}

class ZipOutputStream {

ZipOutputStream(){}
	ZipOutputStream(FileOutputStream o0){}
	public MyHelperClass putNextEntry(ZipEntry o0){ return null; }
	public MyHelperClass write(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass setLevel(MyHelperClass o0){ return null; }
	public MyHelperClass closeEntry(){ return null; }}

class FileOutputStream {

FileOutputStream(String o0){}
	FileOutputStream(){}}

class FileInputStream {

FileInputStream(String o0){}
	FileInputStream(){}
	public MyHelperClass read(byte[] o0){ return null; }
	public MyHelperClass close(){ return null; }}

class ZipEntry {

ZipEntry(String o0){}
	ZipEntry(){}}

class FileNotFoundException extends Exception{
	public FileNotFoundException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

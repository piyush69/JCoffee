
// import java.io.ArithmeticException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c16845107 {

    public boolean copyFile(File destinationFolder, File fromFile) {
        boolean result = false;
        String toFileName = destinationFolder.getAbsolutePath() + "/" + fromFile.getName();
        File toFile = new File(toFileName);
        FileInputStream from = null;
        FileOutputStream to = null;
        try {
            from = new FileInputStream(fromFile);
            to = new FileOutputStream(toFile);
            byte[] buffer = new byte[4096];
            int bytesRead;
            while ((bytesRead =(int)(Object) from.read(buffer)) != -1) to.write(buffer, 0, bytesRead);
        } catch (UncheckedIOException e) {
            e.printStackTrace();
        } catch (ArithmeticException e) {
            e.printStackTrace();
        } finally {
            if (from != null) {
                try {
                    from.close();
                } catch (UncheckedIOException e2) {
                    e2.printStackTrace();
                }
                if (to != null) {
                    try {
                        to.close();
                        result = true;
                    } catch (UncheckedIOException e3) {
                        e3.printStackTrace();
                    }
                }
            }
        }
        return result;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class File {

File(String o0){}
	File(){}
	public MyHelperClass getName(){ return null; }
	public MyHelperClass getAbsolutePath(){ return null; }}

class FileInputStream {

FileInputStream(){}
	FileInputStream(File o0){}
	public MyHelperClass read(byte[] o0){ return null; }
	public MyHelperClass close(){ return null; }}

class FileOutputStream {

FileOutputStream(){}
	FileOutputStream(File o0){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass write(byte[] o0, int o1, int o2){ return null; }}

class FileNotFoundException extends Exception{
	public FileNotFoundException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

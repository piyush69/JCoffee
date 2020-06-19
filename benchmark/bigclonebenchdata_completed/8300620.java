
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c8300620 {

//    @Override
    public void copierPhotos(FileInputStream fichierACopier, FileOutputStream fichierDestination) {
        FileChannel in = null;
        FileChannel out = null;
        try {
            in =(FileChannel)(Object) fichierACopier.getChannel();
            out =(FileChannel)(Object) fichierDestination.getChannel();
            in.transferTo(0, in.size(), out);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (in != null) {
                try {
                    in.close();
                } catch (UncheckedIOException e) {
                }
            }
            if (out != null) {
                try {
                    out.close();
                } catch (UncheckedIOException e) {
                }
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class FileInputStream {

public MyHelperClass getChannel(){ return null; }}

class FileOutputStream {

public MyHelperClass getChannel(){ return null; }}

class FileChannel {

public MyHelperClass close(){ return null; }
	public MyHelperClass size(){ return null; }
	public MyHelperClass transferTo(int o0, MyHelperClass o1, FileChannel o2){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

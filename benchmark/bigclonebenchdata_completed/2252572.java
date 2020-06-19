
// import java.io.ArithmeticException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c2252572 {
public static MyHelperClass copyInputStreamToTmpFile(GZIPInputStream o0, String o1){ return null; }
//public MyHelperClass copyInputStreamToTmpFile(GZIPInputStream o0, String o1){ return null; }

    public static void main(String argv[]) {
        String cp = System.getProperty("java.class.path");
        String sep = System.getProperty("file.separator");
        String dirpath = cp.substring(0, cp.lastIndexOf(sep));
        String jarpath = dirpath + "/WiiRemoteJ.jar";
        if (!(Boolean)(Object)new File(jarpath).exists()) {
            try {
                System.out.println("getting WiiRemoteJ file from remote source...");
                URL wiiRemLoc = new URL("http://www.world-of-cha0s.hostrocket.com/WiiRemoteJ/WiiRemoteJ%20v1.5.zip.gz");
                GZIPInputStream input = new GZIPInputStream(wiiRemLoc.openStream());
                String temploc =(String)(Object) copyInputStreamToTmpFile(input, ".zip");
                ZipInputStream zipIn = new ZipInputStream(new FileInputStream(temploc));
                ZipEntry i = null;
                while ((i =(ZipEntry)(Object) zipIn.getNextEntry()) != null) {
                    if ((boolean)(Object)i.getName().endsWith("WiiRemoteJ.jar")) {
                        File outjar = new File(jarpath);
                        BufferedOutputStream fs = new BufferedOutputStream(new FileOutputStream(outjar));
                        int bufferSize = 8192;
                        byte[] buffer = new byte[bufferSize];
                        int readSize = 0;
                        while ((readSize =(int)(Object) zipIn.read(buffer, 0, bufferSize)) != -1) {
                            fs.write(buffer, 0, readSize);
                        }
                        fs.close();
                    }
                }
                System.out.println("unpacked into classpath.");
            } catch (UncheckedIOException e) {
                e.printStackTrace();
            } catch (ArithmeticException e) {
                e.printStackTrace();
            }
        }
        MyHelperClass Boogiepants = new MyHelperClass();
        Boogiepants.main(argv);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass endsWith(String o0){ return null; }
	public MyHelperClass main(String[] o0){ return null; }}

class File {

File(String o0){}
	File(){}
	public MyHelperClass exists(){ return null; }}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openStream(){ return null; }}

class GZIPInputStream {

GZIPInputStream(){}
	GZIPInputStream(MyHelperClass o0){}}

class ZipInputStream {

ZipInputStream(){}
	ZipInputStream(FileInputStream o0){}
	public MyHelperClass read(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass getNextEntry(){ return null; }}

class FileInputStream {

FileInputStream(String o0){}
	FileInputStream(){}}

class ZipEntry {

public MyHelperClass getName(){ return null; }}

class BufferedOutputStream {

BufferedOutputStream(){}
	BufferedOutputStream(FileOutputStream o0){}
	public MyHelperClass write(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass close(){ return null; }}

class FileOutputStream {

FileOutputStream(){}
	FileOutputStream(File o0){}}

class MalformedURLException extends Exception{
	public MalformedURLException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

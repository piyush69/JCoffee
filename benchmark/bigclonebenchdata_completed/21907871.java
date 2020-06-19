
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c21907871 {

    public static void extractFile(String jarArchive, String fileToExtract, String destination) {
        FileWriter writer = null;
        ZipInputStream zipStream = null;
        try {
            FileInputStream inputStream = new FileInputStream(jarArchive);
            BufferedInputStream bufferedStream = new BufferedInputStream(inputStream);
            zipStream = new ZipInputStream(bufferedStream);
            writer = new FileWriter(new File(destination));
            ZipEntry zipEntry = null;
            while ((zipEntry =(ZipEntry)(Object) zipStream.getNextEntry()) != null) {
                if (zipEntry.getName().equals(fileToExtract)) {
                    int size = (int)(int)(Object) zipEntry.getSize();
                    for (int i = 0; i < size; i++) {
                        writer.write(zipStream.read());
                    }
                }
            }
        } catch (UncheckedIOException e) {
            e.printStackTrace();
        } finally {
            if (zipStream != null) try {
                zipStream.close();
            } catch (UncheckedIOException e) {
                e.printStackTrace();
            }
            if (writer != null) try {
                writer.close();
            } catch (UncheckedIOException e) {
                e.printStackTrace();
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class FileWriter {

FileWriter(File o0){}
	FileWriter(){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass write(MyHelperClass o0){ return null; }}

class ZipInputStream {

ZipInputStream(){}
	ZipInputStream(BufferedInputStream o0){}
	public MyHelperClass read(){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass getNextEntry(){ return null; }}

class FileInputStream {

FileInputStream(String o0){}
	FileInputStream(){}}

class BufferedInputStream {

BufferedInputStream(FileInputStream o0){}
	BufferedInputStream(){}}

class File {

File(String o0){}
	File(){}}

class ZipEntry {

public MyHelperClass getName(){ return null; }
	public MyHelperClass getSize(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

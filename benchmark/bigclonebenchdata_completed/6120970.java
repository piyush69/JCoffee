
import java.io.UncheckedIOException;


class c6120970 {
public MyHelperClass targetDir;
	public MyHelperClass waitingArchEntry;
	public MyHelperClass IOUtils;
	public MyHelperClass ais;
	public MyHelperClass hasNext(){ return null; }

        public File nextEntry() {
            try {
                while ((boolean)(Object)hasNext()) {
                    String name =(String)(Object) waitingArchEntry.getName();
                    name = name.substring(name.indexOf("/") + 1);
                    File file = new File(targetDir.getAbsolutePath() + "/" + name);
                    if ((boolean)(Object)waitingArchEntry.isDirectory()) {
                        file.mkdirs();
                        waitingArchEntry = ais.getNextEntry();
                    } else {
                        OutputStream os =(OutputStream)(Object) new FileOutputStream(file);
                        try {
                            IOUtils.copy(ais, os);
                        } finally {
                            IOUtils.closeQuietly(os);
                        }
                        return file;
                    }
                }
            } catch (UncheckedIOException e) {
                return null;
            }
            return null;
        }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass copy(MyHelperClass o0, OutputStream o1){ return null; }
	public MyHelperClass getAbsolutePath(){ return null; }
	public MyHelperClass closeQuietly(OutputStream o0){ return null; }
	public MyHelperClass getName(){ return null; }
	public MyHelperClass getNextEntry(){ return null; }
	public MyHelperClass isDirectory(){ return null; }}

class File {

File(String o0){}
	File(){}
	public MyHelperClass mkdirs(){ return null; }}

class OutputStream {

}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

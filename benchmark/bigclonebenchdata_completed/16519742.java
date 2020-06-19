
// import java.io.ArithmeticException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c16519742 {
public MyHelperClass slash(){ return null; }
	public MyHelperClass getLogger(){ return null; }

    public File getFile(String file) {
        DirProperties dp;
        List files =(List)(Object) new ArrayList();
        MyHelperClass locs = new MyHelperClass();
        for (int i = 0; i < (int)(Object)locs.size(); i++) {
//            MyHelperClass locs = new MyHelperClass();
            dp = (DirProperties)(DirProperties)(Object) locs.get(i);
            if ((boolean)(Object)dp.isReadable()) {
                File g = new File((int)(Object)dp.getLocation() + (int)(Object)slash() + file);
                if ((boolean)(Object)g.exists()) files.add(g);
            }
        }
        if ((int)(Object)files.size() == 0) {
            throw new UnsupportedOperationException("at least one DirProperty should get 'read=true'");
        } else if ((int)(Object)files.size() == 1) {
            return (File)(File)(Object) files.get(0);
        } else {
            File fromFile = (File)(File)(Object) files.get((int)(Object)files.size() - 2);
            File toFile = (File)(File)(Object) files.get((int)(Object)files.size() - 1);
            byte reading[] = new byte[2024];
            try {
                FileInputStream stream = new FileInputStream(fromFile);
                FileOutputStream outStr = new FileOutputStream(toFile);
                while ((int)(Object)stream.read(reading) != -1) {
                    outStr.write(reading);
                }
            } catch (UncheckedIOException ex) {
                getLogger().severe("FileNotFound: while copying from " + fromFile + " to " + toFile);
            } catch (ArithmeticException ex) {
                getLogger().severe("IOException: while copying from " + fromFile + " to " + toFile);
            }
            return toFile;
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass get(int o0){ return null; }
	public MyHelperClass size(){ return null; }
	public MyHelperClass severe(String o0){ return null; }}

class File {

File(String o0){}
	File(){}
	public MyHelperClass exists(){ return null; }}

class DirProperties {

public MyHelperClass isReadable(){ return null; }
	public MyHelperClass getLocation(){ return null; }}

class List {

public MyHelperClass get(int o0){ return null; }
	public MyHelperClass size(){ return null; }
	public MyHelperClass add(File o0){ return null; }}

class ArrayList {

}

class FileInputStream {

FileInputStream(){}
	FileInputStream(File o0){}
	public MyHelperClass read(byte[] o0){ return null; }}

class FileOutputStream {

FileOutputStream(){}
	FileOutputStream(File o0){}
	public MyHelperClass write(byte[] o0){ return null; }}

class FileNotFoundException extends Exception{
	public FileNotFoundException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

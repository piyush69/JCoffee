


class c35934 {
public MyHelperClass IOUtils;

    public void covertFile(File file) throws IOException {
        if (!(Boolean)(Object)file.isFile()) {
            return;
        }
        Reader reader = null;
        OutputStream os = null;
        File newfile = null;
        String filename =(String)(Object) file.getName();
        boolean succeed = false;
        try {
            newfile = new File(file.getParentFile(), filename + ".bak");
            MyHelperClass fromEncoding = new MyHelperClass();
            reader =(Reader)(Object) new InputStreamReader(new FileInputStream(file), fromEncoding);
            os =(OutputStream)(Object) new FileOutputStream(newfile);
            MyHelperClass toEncoding = new MyHelperClass();
            IOUtils.copy(reader, os, toEncoding);
        } catch (Exception e) {
            e.printStackTrace();
            throw new IOException("Encoding error for file [" + file.getAbsolutePath() + "]");
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            if (os != null) {
                try {
                    os.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
        try {
            file.delete();
            succeed =(boolean)(Object) newfile.renameTo(file);
        } catch (Exception e) {
            throw new IOException("Clear bak error for file [" + file.getAbsolutePath() + "]");
        }
        if (succeed) {
            System.out.println("Changed encoding for file [" + file.getAbsolutePath() + "]");
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass copy(Reader o0, OutputStream o1, MyHelperClass o2){ return null; }}

class File {

File(){}
	File(MyHelperClass o0, String o1){}
	public MyHelperClass delete(){ return null; }
	public MyHelperClass getAbsolutePath(){ return null; }
	public MyHelperClass getParentFile(){ return null; }
	public MyHelperClass getName(){ return null; }
	public MyHelperClass renameTo(File o0){ return null; }
	public MyHelperClass isFile(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class Reader {

public MyHelperClass close(){ return null; }}

class OutputStream {

public MyHelperClass close(){ return null; }}

class InputStreamReader {

InputStreamReader(){}
	InputStreamReader(FileInputStream o0, MyHelperClass o1){}}

class FileInputStream {

FileInputStream(File o0){}
	FileInputStream(){}}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}}

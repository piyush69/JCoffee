


class c14257554 {
public MyHelperClass clearCache(){ return null; }

//    @Override
    public synchronized File download_dictionary(Dictionary dict, String localfpath) {
        boolean abort;// = new boolean();
        abort = false;
        try {
            URL dictionary_location = new URL(dict.getLocation());
            InputStream in =(InputStream)(Object) dictionary_location.openStream();
            MyHelperClass local_cache = new MyHelperClass();
            FileOutputStream w = new FileOutputStream(local_cache, false);
            int b = 0;
            while ((b =(int)(Object) in.read()) != -1) {
                w.write(b);
//                MyHelperClass abort = new MyHelperClass();
                if ((boolean)(Object)abort) throw new Exception("Download Aborted");
            }
            in.close();
            w.close();
            File lf = new File(localfpath);
//            MyHelperClass local_cache = new MyHelperClass();
            FileInputStream r = new FileInputStream(local_cache);
            FileOutputStream fw = new FileOutputStream(lf);
            int c;
            while ((c =(int)(Object) r.read()) != -1) fw.write(c);
            r.close();
            fw.close();
            clearCache();
            return lf;
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InvalidTupleOperationException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
        clearCache();
        return null;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class Dictionary {

public MyHelperClass getLocation(){ return null; }}

class File {

File(String o0){}
	File(){}}

class URL {

URL(){}
	URL(MyHelperClass o0){}
	public MyHelperClass openStream(){ return null; }}

class InputStream {

public MyHelperClass close(){ return null; }
	public MyHelperClass read(){ return null; }}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}
	FileOutputStream(MyHelperClass o0, boolean o1){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass write(int o0){ return null; }}

class FileInputStream {

FileInputStream(){}
	FileInputStream(MyHelperClass o0){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass read(){ return null; }}

class MalformedURLException extends Exception{
	public MalformedURLException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class InvalidTupleOperationException extends Exception{
	public InvalidTupleOperationException(String errorMessage) { super(errorMessage); }
}

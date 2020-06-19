


class c6008635 {

    public boolean referredFilesChanged() throws MalformedURLException, IOException {
        MyHelperClass referredFiles = new MyHelperClass();
        for (String file :(String[])(Object) (Object[])(Object)referredFiles) {
            MyHelperClass FileUtils = new MyHelperClass();
            if ((boolean)(Object)FileUtils.isURI(file)) {
                URLConnection url =(URLConnection)(Object) (new URL(file).openConnection());
                MyHelperClass created = new MyHelperClass();
                if ((int)(Object)url.getLastModified() > (int)(Object)created) return true;
//            MyHelperClass FileUtils = new MyHelperClass();
            } else if ((boolean)(Object)FileUtils.isFile(file)) {
                File f = new File(file);
                MyHelperClass created = new MyHelperClass();
                if ((int)(Object)f.lastModified() > (int)(Object)created) return true;
            }
        }
        return false;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass isURI(String o0){ return null; }
	public MyHelperClass isFile(String o0){ return null; }}

class MalformedURLException extends Exception{
	public MalformedURLException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class URLConnection {

public MyHelperClass getLastModified(){ return null; }}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class File {

File(String o0){}
	File(){}
	public MyHelperClass lastModified(){ return null; }}

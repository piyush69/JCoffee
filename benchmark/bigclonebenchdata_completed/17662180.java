


class c17662180 {
public MyHelperClass XlsBook;
	public MyHelperClass workbook;

    public void XlsBook(String path) throws IOException {
        boolean isHttp = path.startsWith("http://");
        InputStream is = null;
        if (isHttp) {
            URL url = new URL(path);
            is =(InputStream)(Object) url.openStream();
        } else {
            File file = new File(path);
            is =(InputStream)(Object) new FileInputStream(file);
        }
        workbook = XlsBook.createWorkbook(is);
        is.close();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass createWorkbook(InputStream o0){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class InputStream {

public MyHelperClass close(){ return null; }}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openStream(){ return null; }}

class File {

File(String o0){}
	File(){}}

class FileInputStream {

FileInputStream(){}
	FileInputStream(File o0){}}




class c11723383 {
public MyHelperClass getSiteResponse(WebRequest o0){ return null; }

    private void getImage(String filename) throws MalformedURLException, IOException, SAXException, FileNotFoundException {
        MyHelperClass Constants = new MyHelperClass();
        String url = Constants.STRATEGICDOMINATION_URL + "/images/gameimages/" + filename;
        WebRequest req =(WebRequest)(Object) new GetMethodWebRequest(url);
        SiteResponse response =(SiteResponse)(Object) getSiteResponse(req);
        File file = new File("etc/images/" + filename);
        FileOutputStream outputStream = new FileOutputStream(file);
        MyHelperClass IOUtils = new MyHelperClass();
        IOUtils.copy(response.getInputStream(), outputStream);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass STRATEGICDOMINATION_URL;
public MyHelperClass copy(MyHelperClass o0, FileOutputStream o1){ return null; }}

class MalformedURLException extends Exception{
	public MalformedURLException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class SAXException extends Exception{
	public SAXException(String errorMessage) { super(errorMessage); }
}

class FileNotFoundException extends Exception{
	public FileNotFoundException(String errorMessage) { super(errorMessage); }
}

class WebRequest {

}

class GetMethodWebRequest {

GetMethodWebRequest(String o0){}
	GetMethodWebRequest(){}}

class SiteResponse {

public MyHelperClass getInputStream(){ return null; }}

class File {

File(String o0){}
	File(){}}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}}

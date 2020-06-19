


class c9769234 {

    void downloadImage(String filename, File imageFile) throws Exception {
        MyHelperClass Constants = new MyHelperClass();
        String URL = Constants.IMAGE_URL + "/" + filename;
        MyHelperClass stratSite = new MyHelperClass();
        SiteResponse response =(SiteResponse)(Object) stratSite.getResponse(URL);
        InputStream inputStream =(InputStream)(Object) response.getInputStream();
        OutputStream outputStream =(OutputStream)(Object) new FileOutputStream(imageFile);
        MyHelperClass IOUtils = new MyHelperClass();
        IOUtils.copy(inputStream, outputStream);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass IMAGE_URL;
public MyHelperClass getResponse(String o0){ return null; }
	public MyHelperClass copy(InputStream o0, OutputStream o1){ return null; }}

class File {

}

class SiteResponse {

public MyHelperClass getInputStream(){ return null; }}

class InputStream {

}

class OutputStream {

}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}}

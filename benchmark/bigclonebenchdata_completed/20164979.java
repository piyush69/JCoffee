


class c20164979 {

    private void handleUpload(CommonsMultipartFile file, String newFileName, String uploadDir) throws IOException, FileNotFoundException {
        File dirPath = new File(uploadDir);
        if (!(Boolean)(Object)dirPath.exists()) {
            dirPath.mkdirs();
        }
        InputStream stream =(InputStream)(Object) file.getInputStream();
        OutputStream bos =(OutputStream)(Object) new FileOutputStream(uploadDir + newFileName);
        MyHelperClass IOUtils = new MyHelperClass();
        IOUtils.copy(stream, bos);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass copy(InputStream o0, OutputStream o1){ return null; }}

class CommonsMultipartFile {

public MyHelperClass getInputStream(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class FileNotFoundException extends Exception{
	public FileNotFoundException(String errorMessage) { super(errorMessage); }
}

class File {

File(String o0){}
	File(){}
	public MyHelperClass exists(){ return null; }
	public MyHelperClass mkdirs(){ return null; }}

class InputStream {

}

class OutputStream {

}

class FileOutputStream {

FileOutputStream(String o0){}
	FileOutputStream(){}}




class c15376025 {
public MyHelperClass svm;

//    @Override
    protected svm_model loadModel(InputStream inputStream) throws IOException {
        MyHelperClass File = new MyHelperClass();
        File tmpFile =(File)(Object) File.createTempFile("tmp", ".mdl");
        FileOutputStream output = new FileOutputStream(tmpFile);
        try {
            MyHelperClass IOUtils = new MyHelperClass();
            IOUtils.copy(inputStream, output);
            return(svm_model)(Object) svm.svm_load_model(tmpFile.getPath());
        } finally {
            output.close();
            tmpFile.delete();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass copy(InputStream o0, FileOutputStream o1){ return null; }
	public MyHelperClass svm_load_model(MyHelperClass o0){ return null; }
	public MyHelperClass createTempFile(String o0, String o1){ return null; }}

class InputStream {

}

class svm_model {

}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class File {

public MyHelperClass getPath(){ return null; }
	public MyHelperClass delete(){ return null; }}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}
	public MyHelperClass close(){ return null; }}

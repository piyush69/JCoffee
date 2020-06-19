
import java.io.UncheckedIOException;


class c7466372 {

    public void save(UploadedFile file, Long student, Long activity) {
        MyHelperClass fileFolder = new MyHelperClass();
        File destiny = new File(fileFolder, student + "_" + activity + "_" + file.getFileName());
        try {
            MyHelperClass IOUtils = new MyHelperClass();
            IOUtils.copy(file.getFile(), new FileOutputStream(destiny));
        } catch (UncheckedIOException e) {
            throw new RuntimeException("Erro ao copiar o arquivo.", e);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass copy(MyHelperClass o0, FileOutputStream o1){ return null; }}

class UploadedFile {

public MyHelperClass getFileName(){ return null; }
	public MyHelperClass getFile(){ return null; }}

class File {

File(){}
	File(MyHelperClass o0, String o1){}}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

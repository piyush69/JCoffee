
import java.io.UncheckedIOException;


class c8809710 {

    public void salva(UploadedFile imagem, Usuario usuario) {
        MyHelperClass pastaImagens = new MyHelperClass();
        File destino = new File(pastaImagens, usuario.getId() + ".imagem");
        try {
            MyHelperClass IOUtils = new MyHelperClass();
            IOUtils.copyLarge(imagem.getFile(), new FileOutputStream(destino));
        } catch (UncheckedIOException e) {
            throw new RuntimeException("Erro ao copiar imagem", e);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass copyLarge(MyHelperClass o0, FileOutputStream o1){ return null; }}

class UploadedFile {

public MyHelperClass getFile(){ return null; }}

class Usuario {

public MyHelperClass getId(){ return null; }}

class File {

File(){}
	File(MyHelperClass o0, String o1){}}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

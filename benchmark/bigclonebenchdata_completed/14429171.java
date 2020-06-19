


class c14429171 {
public MyHelperClass redimensionar(MyHelperClass o0, MyHelperClass o1, String o2, int o3, int o4){ return null; }

    public void salva(UploadedFile imagem, Usuario usuario) {
        File destino;
        if (usuario.getId() == null) {
            MyHelperClass pastaImagens = new MyHelperClass();
            destino = new File(pastaImagens, usuario.hashCode() + ".jpg");
        } else {
            MyHelperClass pastaImagens = new MyHelperClass();
            destino = new File(pastaImagens, usuario.getId() + ".jpg");
        }
        try {
            MyHelperClass IOUtils = new MyHelperClass();
            IOUtils.copyLarge(imagem.getFile(), new FileOutputStream(destino));
        } catch (Exception e) {
            throw new RuntimeException("Erro ao copiar imagem", e);
        }
        redimensionar(destino.getPath(), destino.getPath(), "jpg", 110, 110);
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
	File(MyHelperClass o0, String o1){}
	public MyHelperClass getPath(){ return null; }}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}}

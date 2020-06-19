
import java.io.UncheckedIOException;


class c17729553 {

    public boolean clonarFichero(String rutaFicheroOrigen, String rutaFicheroDestino) {
        System.out.println("");
        System.out.println("*********** DENTRO DE 'clonarFichero' ***********");
        boolean estado = false;
        try {
            FileInputStream entrada = new FileInputStream(rutaFicheroOrigen);
            FileOutputStream salida = new FileOutputStream(rutaFicheroDestino);
            FileChannel canalOrigen =(FileChannel)(Object) entrada.getChannel();
            FileChannel canalDestino =(FileChannel)(Object) salida.getChannel();
            canalOrigen.transferTo(0, canalOrigen.size(), canalDestino);
            entrada.close();
            salida.close();
            estado = true;
        } catch (UncheckedIOException e) {
            System.out.println("No se encontro el archivo");
            e.printStackTrace();
            estado = false;
        }
        return estado;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class FileInputStream {

FileInputStream(String o0){}
	FileInputStream(){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass getChannel(){ return null; }}

class FileOutputStream {

FileOutputStream(String o0){}
	FileOutputStream(){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass getChannel(){ return null; }}

class FileChannel {

public MyHelperClass size(){ return null; }
	public MyHelperClass transferTo(int o0, MyHelperClass o1, FileChannel o2){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

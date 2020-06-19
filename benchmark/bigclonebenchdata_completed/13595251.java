
import java.io.UncheckedIOException;


class c13595251 {
public MyHelperClass resultados;

    public void descargarArchivo() {
        try {
            MyHelperClass materialSelccionado = new MyHelperClass();
            FileInputStream fis = new FileInputStream(resultados.elementAt(materialSelccionado).getRuta());
            MyHelperClass rutaDestinoDescarga = new MyHelperClass();
            FileOutputStream fos = new FileOutputStream(rutaDestinoDescarga);
            FileChannel inChannel =(FileChannel)(Object) fis.getChannel();
            FileChannel outChannel =(FileChannel)(Object) fos.getChannel();
            inChannel.transferTo(0, inChannel.size(), outChannel);
            fis.close();
            fos.close();
        } catch (UncheckedIOException ioe) {
            System.err.println("Error al Generar Copia del Material\n" + ioe);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass elementAt(MyHelperClass o0){ return null; }
	public MyHelperClass getRuta(){ return null; }}

class FileInputStream {

FileInputStream(MyHelperClass o0){}
	FileInputStream(){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass getChannel(){ return null; }}

class FileOutputStream {

FileOutputStream(MyHelperClass o0){}
	FileOutputStream(){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass getChannel(){ return null; }}

class FileChannel {

public MyHelperClass size(){ return null; }
	public MyHelperClass transferTo(int o0, MyHelperClass o1, FileChannel o2){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

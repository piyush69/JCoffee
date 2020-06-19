
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c1955681 {

    public static void ExtraeArchivoJAR(String Archivo, String DirJAR, String DirDestino) {
        FileInputStream entrada = null;
        FileOutputStream salida = null;
        try {
            MyHelperClass separador = new MyHelperClass();
            File f = new File(DirDestino + separador + Archivo);
            try {
                f.createNewFile();
            } catch (Exception sad) {
                sad.printStackTrace();
            }
            InputStream source =(InputStream)(Object) OP_Proced.class.getResourceAsStream(DirJAR + "/" + Archivo);
            BufferedInputStream in = new BufferedInputStream(source);
            FileOutputStream out = new FileOutputStream(f);
            int ch;
            while ((ch =(int)(Object) in.read()) != -1) out.write(ch);
            in.close();
            out.close();
        } catch (UncheckedIOException ex) {
            System.out.println(ex);
        } finally {
            if (entrada != null) {
                try {
                    entrada.close();
                } catch (UncheckedIOException ex) {
                    ex.printStackTrace();
                }
            }
            if (salida != null) {
                try {
                    salida.close();
                } catch (UncheckedIOException ex) {
                    ex.printStackTrace();
                }
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class FileInputStream {

public MyHelperClass close(){ return null; }}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass write(int o0){ return null; }}

class File {

File(String o0){}
	File(){}
	public MyHelperClass createNewFile(){ return null; }}

class InputStream {

}

class OP_Proced {

}

class BufferedInputStream {

BufferedInputStream(InputStream o0){}
	BufferedInputStream(){}
	public MyHelperClass read(){ return null; }
	public MyHelperClass close(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}


import java.io.UncheckedIOException;


class c13013560 {

    public static Node carregaModeloJME(String caminho) {
        try {
            URL urlModelo =(URL)(Object) ModelUtils.class.getClassLoader().getResource(caminho);
            BufferedInputStream leitorBinario = new BufferedInputStream(urlModelo.openStream());
            MyHelperClass BinaryImporter = new MyHelperClass();
            Node modelo = (Node)(Node)(Object) BinaryImporter.getInstance().load(leitorBinario);
            modelo.setModelBound(new BoundingBox());
            modelo.updateModelBound();
            return modelo;
        } catch (UncheckedIOException e) {
            e.printStackTrace();
        }
        return null;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass load(BufferedInputStream o0){ return null; }
	public MyHelperClass getInstance(){ return null; }}

class Node {

public MyHelperClass setModelBound(BoundingBox o0){ return null; }
	public MyHelperClass updateModelBound(){ return null; }}

class URL {

public MyHelperClass openStream(){ return null; }}

class ModelUtils {

}

class BufferedInputStream {

BufferedInputStream(MyHelperClass o0){}
	BufferedInputStream(){}}

class BoundingBox {

}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}


// import java.io.ArithmeticException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c18431646 {

    public Savable loadResource(String name, PrimitiveLoader loader) {
        Savable objeto = null;
        MyHelperClass ResourceLocator = new MyHelperClass();
        URL url =(URL)(Object) ResourceLocator.locateFile(loader.getBaseFolder(), name, loader.getCompiledExtension());
        if (url == null) {
//            MyHelperClass ResourceLocator = new MyHelperClass();
            url =(URL)(Object) ResourceLocator.locateFile(loader.getBaseFolder(), name, loader.getPrimitiveExtension());
            if (url != null) {
                try {
                    objeto =(Savable)(Object) loader.loadResource(name, url.openStream());
//                    MyHelperClass ResourceLocator = new MyHelperClass();
                    File file =(File)(Object) ResourceLocator.replaceExtension(url, loader.getCompiledExtension());
                    MyHelperClass BinaryExporter = new MyHelperClass();
                    BinaryExporter.getInstance().save(objeto, file);
                } catch (UncheckedIOException e) {
                    e.printStackTrace();
                } catch (ArithmeticException e) {
                    e.printStackTrace();
                }
            }
        } else {
            try {
                MyHelperClass BinaryImporter = new MyHelperClass();
                objeto =(Savable)(Object) BinaryImporter.getInstance().load(url.openStream());
            } catch (UncheckedIOException e) {
                e.printStackTrace();
            }
        }
        return objeto;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass locateFile(MyHelperClass o0, String o1, MyHelperClass o2){ return null; }
	public MyHelperClass getInstance(){ return null; }
	public MyHelperClass save(Savable o0, File o1){ return null; }
	public MyHelperClass replaceExtension(URL o0, MyHelperClass o1){ return null; }
	public MyHelperClass load(MyHelperClass o0){ return null; }}

class PrimitiveLoader {

public MyHelperClass loadResource(String o0, MyHelperClass o1){ return null; }
	public MyHelperClass getPrimitiveExtension(){ return null; }
	public MyHelperClass getCompiledExtension(){ return null; }
	public MyHelperClass getBaseFolder(){ return null; }}

class Savable {

}

class URL {

public MyHelperClass openStream(){ return null; }}

class File {

}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class URISyntaxException extends Exception{
	public URISyntaxException(String errorMessage) { super(errorMessage); }
}

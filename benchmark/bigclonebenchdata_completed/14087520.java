
// import java.io.ArithmeticException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c14087520 {
public MyHelperClass buildModelFromText(String o0, InputStream o1){ return null; }

    private ModelDefinition buildModel(String name) {
        ModelDefinition model = null;
        MyHelperClass ResourceLocator = new MyHelperClass();
        URL url =(URL)(Object) ResourceLocator.locateBinaryModel(name);
        InputStream is = null;
        if (url == null) {
//            MyHelperClass ResourceLocator = new MyHelperClass();
            url =(URL)(Object) ResourceLocator.locateTextModel(name);
            try {
                is =(InputStream)(Object) url.openStream();
                model =(ModelDefinition)(Object) buildModelFromText(name, is);
//                MyHelperClass ResourceLocator = new MyHelperClass();
                File file =(File)(Object) ResourceLocator.replaceExtension(url, ResourceLocator.BINARY_MODEL_EXTENSION);
                MyHelperClass BinaryExporter = new MyHelperClass();
                BinaryExporter.getInstance().save(model, file);
            } catch (UncheckedIOException e) {
                e.printStackTrace();
            } catch (ArithmeticException e) {
                e.printStackTrace();
            }
        } else {
            try {
                is =(InputStream)(Object) url.openStream();
                MyHelperClass BinaryImporter = new MyHelperClass();
                model = (ModelDefinition)(ModelDefinition)(Object) BinaryImporter.getInstance().load(is);
            } catch (UncheckedIOException e) {
                e.printStackTrace();
            }
        }
        return model;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass BINARY_MODEL_EXTENSION;
public MyHelperClass getInstance(){ return null; }
	public MyHelperClass load(InputStream o0){ return null; }
	public MyHelperClass save(ModelDefinition o0, File o1){ return null; }
	public MyHelperClass locateBinaryModel(String o0){ return null; }
	public MyHelperClass replaceExtension(URL o0, MyHelperClass o1){ return null; }
	public MyHelperClass locateTextModel(String o0){ return null; }}

class ModelDefinition {

}

class URL {

public MyHelperClass openStream(){ return null; }}

class InputStream {

}

class File {

}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class URISyntaxException extends Exception{
	public URISyntaxException(String errorMessage) { super(errorMessage); }
}


import java.io.UncheckedIOException;


class c8121403 {

    public static void copyAssetFile(Context ctx, String srcFileName, String targetFilePath) {
        AssetManager assetManager =(AssetManager)(Object) ctx.getAssets();
        try {
            InputStream is =(InputStream)(Object) assetManager.open(srcFileName);
            File out = new File(targetFilePath);
            if (!(Boolean)(Object)out.exists()) {
                out.getParentFile().mkdirs();
                out.createNewFile();
            }
            OutputStream os =(OutputStream)(Object) new FileOutputStream(out);
            MyHelperClass IOUtils = new MyHelperClass();
            IOUtils.copy(is, os);
            is.close();
            os.close();
        } catch (UncheckedIOException e) {
            MyHelperClass AIOUtils = new MyHelperClass();
            AIOUtils.log("error when copyAssetFile",(IOException)(Object) e);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass log(String o0, IOException o1){ return null; }
	public MyHelperClass copy(InputStream o0, OutputStream o1){ return null; }
	public MyHelperClass mkdirs(){ return null; }}

class Context {

public MyHelperClass getAssets(){ return null; }}

class AssetManager {

public MyHelperClass open(String o0){ return null; }}

class InputStream {

public MyHelperClass close(){ return null; }}

class File {

File(){}
	File(String o0){}
	public MyHelperClass createNewFile(){ return null; }
	public MyHelperClass getParentFile(){ return null; }
	public MyHelperClass exists(){ return null; }}

class OutputStream {

public MyHelperClass close(){ return null; }}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

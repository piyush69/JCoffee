
// import java.io.ArithmeticException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c3180675 {
public MyHelperClass IOUtils;
	public MyHelperClass WEB_ROOT;
	public MyHelperClass PluginManager;
	public MyHelperClass getDependancyFiles(){ return null; }

    public void copyDependancyFiles() {
        for (String[] depStrings :(String[][])(Object) (Object[])(Object)getDependancyFiles()) {
            String source = depStrings[0];
            String target = depStrings[1];
            try {
                File sourceFile =(File)(Object) PluginManager.getFile(source);
                IOUtils.copyEverything(sourceFile, new File(WEB_ROOT + target));
            } catch (UncheckedIOException e) {
                e.printStackTrace();
            } catch (ArithmeticException e) {
                e.printStackTrace();
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass copyEverything(File o0, File o1){ return null; }
	public MyHelperClass getFile(String o0){ return null; }}

class File {

File(String o0){}
	File(){}}

class URISyntaxException extends Exception{
	public URISyntaxException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

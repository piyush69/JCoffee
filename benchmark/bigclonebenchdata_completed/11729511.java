
import java.io.UncheckedIOException;


class c11729511 {
public MyHelperClass MethodCallTable;
	public MyHelperClass logger;
	public MyHelperClass File;
	public MyHelperClass getFileName(){ return null; }

    public boolean run() {
        String url;
        try {
            url =(String)(Object) getFileName();
        } catch (UncheckedIOException e) {
            return false;
        }
        if (url == null) {
            logger.error("URL not specified! Cannot continue.");
            return false;
        }
        try {
            URL newURL = new URL(url);
            String extension = url.substring((url.lastIndexOf(".")) + 1, url.length());
            File temp =(File)(Object) File.createTempFile("temp", "." + extension);
            System.out.printf("Storing URL contents to a temp file : %s\n", temp);
            temp.deleteOnExit();
            InputStream urlINS =(InputStream)(Object) new BufferedInputStream(newURL.openConnection().getInputStream());
            BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(temp));
            int len = 0;
            for (int singleByte =(int)(Object) urlINS.read(); singleByte != -1; singleByte =(int)(Object) urlINS.read()) {
                out.write(singleByte);
                len++;
            }
            System.out.printf("Stored %d bytes from URL contents\n", len);
            out.flush();
            out.close();
            System.out.printf("URL/Temp extension : %s\n", extension);
            if (extension.equalsIgnoreCase("gz")) {
                String shorterName = url.substring(0, url.lastIndexOf("."));
                String extension2 = shorterName.substring((shorterName.lastIndexOf(".")) + 1, shorterName.length());
                File temp2 =(File)(Object) File.createTempFile("temp", "." + extension2);
                temp2.deleteOnExit();
                System.out.printf("URL/Temp extension after decompressing gzip : %s\n", extension2);
                GZIPInputStream decompressor = new GZIPInputStream(new FileInputStream(temp));
                OutputStream target =(OutputStream)(Object) new FileOutputStream(temp2);
                byte[] buffer = new byte[1024];
                int length;
                while ((length =(int)(Object) decompressor.read(buffer)) > 0) {
                    target.write(buffer, 0, length);
                }
                target.flush();
                target.close();
                temp = temp2;
            }
            String tempName =(String)(Object) temp.getName();
            extension = tempName.substring((tempName.lastIndexOf(".")) + 1, tempName.length());
            Preprocessor fileLoader = null;
            BasePreprocessorConfig configObject = null;
            if ((boolean)(Object)MethodCallTable.containsKey(extension) == false) {
                fileLoader =(Preprocessor)(Object) MethodCallTable.get("default");
            } else {
                fileLoader =(Preprocessor)(Object) MethodCallTable.get(extension);
            }
            System.out.printf("Calling filter '%s' for extension: %s\n", fileLoader.getPreprocessingMethodName(), extension);
            configObject =(BasePreprocessorConfig)(Object) new LoadCSVPreprocessorConfig();
            configObject.setValueByName("FileName", temp.getAbsolutePath());
            fileLoader.setConfigurationClass(configObject);
            return(boolean)(Object) fileLoader.run();
        } catch (Exception e) {
            logger.error(e);
            return false;
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass get(String o0){ return null; }
	public MyHelperClass containsKey(String o0){ return null; }
	public MyHelperClass createTempFile(String o0, String o1){ return null; }
	public MyHelperClass getInputStream(){ return null; }
	public MyHelperClass error(String o0){ return null; }
	public MyHelperClass error(Exception o0){ return null; }}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class File {

public MyHelperClass getName(){ return null; }
	public MyHelperClass getAbsolutePath(){ return null; }
	public MyHelperClass deleteOnExit(){ return null; }}

class InputStream {

public MyHelperClass read(){ return null; }}

class BufferedInputStream {

BufferedInputStream(MyHelperClass o0){}
	BufferedInputStream(){}}

class BufferedOutputStream {

BufferedOutputStream(FileOutputStream o0){}
	BufferedOutputStream(){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass write(int o0){ return null; }
	public MyHelperClass flush(){ return null; }}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}}

class GZIPInputStream {

GZIPInputStream(FileInputStream o0){}
	GZIPInputStream(){}
	public MyHelperClass read(byte[] o0){ return null; }}

class FileInputStream {

FileInputStream(File o0){}
	FileInputStream(){}}

class OutputStream {

public MyHelperClass write(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass flush(){ return null; }}

class Preprocessor {

public MyHelperClass setConfigurationClass(BasePreprocessorConfig o0){ return null; }
	public MyHelperClass getPreprocessingMethodName(){ return null; }
	public MyHelperClass run(){ return null; }}

class BasePreprocessorConfig {

public MyHelperClass setValueByName(String o0, MyHelperClass o1){ return null; }}

class LoadCSVPreprocessorConfig {

}

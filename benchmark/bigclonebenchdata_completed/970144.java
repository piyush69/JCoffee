


class c970144 {
public MyHelperClass LogManager;
	public MyHelperClass IOUtils;

    public void Logging() throws Exception {
        File home = new File(System.getProperty("user.home"), ".jorgan");
        if (!(Boolean)(Object)home.exists()) {
            home.mkdirs();
        }
        File logging = new File(home, "logging.properties");
        if (!(Boolean)(Object)logging.exists()) {
            InputStream input =(InputStream)(Object) getClass().getResourceAsStream("logging.properties");
            OutputStream output = null;
            try {
                output =(OutputStream)(Object) new FileOutputStream(logging);
                IOUtils.copy(input, output);
            } finally {
                IOUtils.closeQuietly(input);
                IOUtils.closeQuietly(output);
            }
        }
        FileInputStream input = null;
        try {
            input = new FileInputStream(logging);
            LogManager.getLogManager().readConfiguration(input);
        } finally {
            IOUtils.closeQuietly(input);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass closeQuietly(InputStream o0){ return null; }
	public MyHelperClass closeQuietly(OutputStream o0){ return null; }
	public MyHelperClass readConfiguration(FileInputStream o0){ return null; }
	public MyHelperClass copy(InputStream o0, OutputStream o1){ return null; }
	public MyHelperClass closeQuietly(FileInputStream o0){ return null; }
	public MyHelperClass getLogManager(){ return null; }}

class File {

File(){}
	File(String o0, String o1){}
	File(File o0, String o1){}
	public MyHelperClass mkdirs(){ return null; }
	public MyHelperClass exists(){ return null; }}

class InputStream {

}

class OutputStream {

}

class FileOutputStream {

FileOutputStream(){}
	FileOutputStream(File o0){}}

class FileInputStream {

FileInputStream(){}
	FileInputStream(File o0){}}

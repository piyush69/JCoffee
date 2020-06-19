


class c19360483 {

    private void initLogging() {
        MyHelperClass App = new MyHelperClass();
        File logging = new File(App.getHome(), "logging.properties");
        if (!(Boolean)(Object)logging.exists()) {
            InputStream input =(InputStream)(Object) getClass().getResourceAsStream("logging.properties-setup");
            OutputStream output = null;
            try {
                output =(OutputStream)(Object) new FileOutputStream(logging);
                MyHelperClass IOUtils = new MyHelperClass();
                IOUtils.copy(input, output);
            } catch (Exception ex) {
            } finally {
                MyHelperClass IOUtils = new MyHelperClass();
                IOUtils.closeQuietly(input);
//                MyHelperClass IOUtils = new MyHelperClass();
                IOUtils.closeQuietly(output);
            }
        }
        FileInputStream input = null;
        try {
            input = new FileInputStream(logging);
            MyHelperClass LogManager = new MyHelperClass();
            LogManager.getLogManager().readConfiguration(input);
        } catch (Exception ex) {
        } finally {
            MyHelperClass IOUtils = new MyHelperClass();
            IOUtils.closeQuietly(input);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass readConfiguration(FileInputStream o0){ return null; }
	public MyHelperClass closeQuietly(InputStream o0){ return null; }
	public MyHelperClass getHome(){ return null; }
	public MyHelperClass getLogManager(){ return null; }
	public MyHelperClass closeQuietly(OutputStream o0){ return null; }
	public MyHelperClass copy(InputStream o0, OutputStream o1){ return null; }
	public MyHelperClass closeQuietly(FileInputStream o0){ return null; }}

class File {

File(){}
	File(MyHelperClass o0, String o1){}
	public MyHelperClass exists(){ return null; }}

class InputStream {

}

class OutputStream {

}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}}

class FileInputStream {

FileInputStream(File o0){}
	FileInputStream(){}}

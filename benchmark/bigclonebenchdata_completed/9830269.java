


class c9830269 {

                    public final void deliver(final String from, final String recipient, final InputStream data) throws TooMuchDataException, IOException {
                        System.out.println("FROM: " + from);
                        System.out.println("TO: " + recipient);
                        final File tmpDir = new File(System.getProperty("java.io.tmpdir"));
                        final File file = new File(tmpDir, recipient);
                        final FileWriter fw = new FileWriter(file);
                        try {
                            MyHelperClass IOUtils = new MyHelperClass();
                            IOUtils.copy(data, fw);
                        } finally {
                            fw.close();
                        }
                    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass copy(InputStream o0, FileWriter o1){ return null; }}

class InputStream {

}

class TooMuchDataException extends Exception{
	public TooMuchDataException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class File {

File(File o0, String o1){}
	File(String o0){}
	File(){}}

class FileWriter {

FileWriter(File o0){}
	FileWriter(){}
	public MyHelperClass close(){ return null; }}

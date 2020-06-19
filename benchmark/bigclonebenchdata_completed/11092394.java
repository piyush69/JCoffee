


class c11092394 {
public MyHelperClass targetFilename(File o0){ return null; }

    private void copy(final File file) throws IOException {
        String targetFilename =(String)(Object) targetFilename(file);
        FileInputStream fis = new FileInputStream(file);
        try {
            FileChannel source =(FileChannel)(Object) fis.getChannel();
            try {
                FileOutputStream fos = new FileOutputStream(targetFilename);
                try {
                    FileChannel target =(FileChannel)(Object) fos.getChannel();
                    try {
                        target.transferFrom(source, 0, source.size());
                    } finally {
                        target.close();
                    }
                } finally {
                    fos.close();
                }
            } finally {
                source.close();
            }
        } finally {
            fis.close();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class File {

}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class FileInputStream {

FileInputStream(File o0){}
	FileInputStream(){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass getChannel(){ return null; }}

class FileChannel {

public MyHelperClass close(){ return null; }
	public MyHelperClass size(){ return null; }
	public MyHelperClass transferFrom(FileChannel o0, int o1, MyHelperClass o2){ return null; }}

class FileOutputStream {

FileOutputStream(String o0){}
	FileOutputStream(){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass getChannel(){ return null; }}

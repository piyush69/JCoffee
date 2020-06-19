


class c18153746 {

    public static void copy(File src, File dst) throws IOException {
        FileInputStream fIn = null;
        FileOutputStream fOut = null;
        FileChannel sIn = null;
        FileChannel sOut = null;
        try {
            fIn = new FileInputStream(src);
            try {
                fOut = new FileOutputStream(dst);
                try {
                    sIn =(FileChannel)(Object) fIn.getChannel();
                    sOut =(FileChannel)(Object) fOut.getChannel();
                    sOut.transferFrom(sIn, 0, sIn.size());
                } finally {
                    if (sIn != null) {
                        sIn.close();
                    }
                    if (sOut != null) {
                        sOut.close();
                    }
                }
            } finally {
                if (fOut != null) {
                    fOut.close();
                }
            }
        } finally {
            if (fIn != null) {
                fIn.close();
            }
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

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass getChannel(){ return null; }}

class FileChannel {

public MyHelperClass close(){ return null; }
	public MyHelperClass size(){ return null; }
	public MyHelperClass transferFrom(FileChannel o0, int o1, MyHelperClass o2){ return null; }}




class c18956017 {

        public void writeFile(OutputStream outputStream) throws IOException {
            InputStream inputStream = null;
            MyHelperClass file = new MyHelperClass();
            if (file != null) {
                try {
//                    MyHelperClass file = new MyHelperClass();
                    inputStream =(InputStream)(Object) new FileInputStream(file);
                    MyHelperClass IOUtils = new MyHelperClass();
                    IOUtils.copy(inputStream, outputStream);
                } finally {
                    if (inputStream != null) {
                        MyHelperClass IOUtils = new MyHelperClass();
                        IOUtils.closeQuietly(inputStream);
                    }
                }
            }
        }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass closeQuietly(InputStream o0){ return null; }
	public MyHelperClass copy(InputStream o0, OutputStream o1){ return null; }}

class OutputStream {

}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class InputStream {

}

class FileInputStream {

FileInputStream(MyHelperClass o0){}
	FileInputStream(){}}

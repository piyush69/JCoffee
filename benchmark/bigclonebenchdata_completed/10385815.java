


class c10385815 {

    public static void copy(String fileFrom, String fileTo) throws IOException {
        FileInputStream inputStream = null;
        FileOutputStream outputStream = null;
        FileChannel inputChannel = null;
        FileChannel outputChannel = null;
        try {
            inputStream = new FileInputStream(fileFrom);
            outputStream = new FileOutputStream(fileTo);
            inputChannel =(FileChannel)(Object) inputStream.getChannel();
            outputChannel =(FileChannel)(Object) outputStream.getChannel();
            inputChannel.transferTo(0, inputChannel.size(), outputChannel);
        } finally {
            try {
                inputChannel.close();
            } finally {
                try {
                    outputChannel.close();
                } finally {
                    try {
                        inputStream.close();
                    } finally {
                        outputStream.close();
                    }
                }
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class FileInputStream {

FileInputStream(String o0){}
	FileInputStream(){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass getChannel(){ return null; }}

class FileOutputStream {

FileOutputStream(String o0){}
	FileOutputStream(){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass getChannel(){ return null; }}

class FileChannel {

public MyHelperClass close(){ return null; }
	public MyHelperClass size(){ return null; }
	public MyHelperClass transferTo(int o0, MyHelperClass o1, FileChannel o2){ return null; }}

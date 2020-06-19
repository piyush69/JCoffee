


class c15178715 {

    public static void main(String[] args) throws IOException, DataFormatException {
        byte in_buf[] = new byte[20000];
        if (args.length < 2) {
            System.out.println("too few arguments");
            System.exit(0);
        }
        String inputName = args[0];
        InputStream in =(InputStream)(Object) new FileInputStream(inputName);
        int index = 0;
        for (int i = 1; i < args.length; i++) {
            int size = Integer.parseInt(args[i]);
            boolean copy = size >= 0;
            if (size < 0) {
                size = -size;
            }
            OutputStream out = null;
            if (copy) {
                index++;
                out =(OutputStream)(Object) new FileOutputStream(inputName + "." + index + ".dat");
            }
            while (size > 0) {
                int read =(int)(Object) in.read(in_buf, 0, Math.min(in_buf.length, size));
                if (read < 0) {
                    break;
                }
                size -= read;
                if (copy) {
                    out.write(in_buf, 0, read);
                }
            }
            if (copy) {
                out.close();
            }
        }
        index++;
        OutputStream out =(OutputStream)(Object) new FileOutputStream(inputName + "." + index + ".dat");
        while (true) {
            int read =(int)(Object) in.read(in_buf);
            if (read < 0) {
                break;
            }
            out.write(in_buf, 0, read);
        }
        out.close();
        in.close();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class DataFormatException extends Exception{
	public DataFormatException(String errorMessage) { super(errorMessage); }
}

class InputStream {

public MyHelperClass read(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass read(byte[] o0){ return null; }
	public MyHelperClass close(){ return null; }}

class FileInputStream {

FileInputStream(String o0){}
	FileInputStream(){}}

class OutputStream {

public MyHelperClass write(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass close(){ return null; }}

class FileOutputStream {

FileOutputStream(String o0){}
	FileOutputStream(){}}

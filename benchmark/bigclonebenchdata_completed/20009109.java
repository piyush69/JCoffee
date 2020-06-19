


class c20009109 {

    public static void concatFiles(final String as_base_file_name) throws IOException, FileNotFoundException {
        new File(as_base_file_name).createNewFile();
        final OutputStream lo_out =(OutputStream)(Object) new FileOutputStream(as_base_file_name, true);
        int ln_part = 1, ln_readed = -1;
        final byte[] lh_buffer = new byte[32768];
        File lo_file = new File(as_base_file_name + "part1");
        while ((Boolean)(Object)lo_file.exists() && (Boolean)(Object)lo_file.isFile()) {
            final InputStream lo_input =(InputStream)(Object) new FileInputStream(lo_file);
            while ((ln_readed =(int)(Object) lo_input.read(lh_buffer)) != -1) {
                lo_out.write(lh_buffer, 0, ln_readed);
            }
            ln_part++;
            lo_file = new File(as_base_file_name + "part" + ln_part);
        }
        lo_out.flush();
        lo_out.close();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class FileNotFoundException extends Exception{
	public FileNotFoundException(String errorMessage) { super(errorMessage); }
}

class File {

File(String o0){}
	File(){}
	public MyHelperClass exists(){ return null; }
	public MyHelperClass isFile(){ return null; }
	public MyHelperClass createNewFile(){ return null; }}

class OutputStream {

public MyHelperClass write(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass flush(){ return null; }}

class FileOutputStream {

FileOutputStream(){}
	FileOutputStream(String o0, boolean o1){}}

class InputStream {

public MyHelperClass read(byte[] o0){ return null; }}

class FileInputStream {

FileInputStream(){}
	FileInputStream(File o0){}}




class c9430039 {

    private void CopyTo(File dest) throws IOException {
        FileReader in = null;
        FileWriter out = null;
        int c;
        try {
            MyHelperClass image = new MyHelperClass();
            in = new FileReader(image);
            out = new FileWriter(dest);
            while ((c =(int)(Object) in.read()) != -1) out.write(c);
        } finally {
            if (in != null) try {
                in.close();
            } catch (Exception e) {
            }
            if (out != null) try {
                out.close();
            } catch (Exception e) {
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

class FileReader {

FileReader(MyHelperClass o0){}
	FileReader(){}
	public MyHelperClass read(){ return null; }
	public MyHelperClass close(){ return null; }}

class FileWriter {

FileWriter(File o0){}
	FileWriter(){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass write(int o0){ return null; }}




class c19288024 {

    private void copyFile(File file, File dir) throws IOException {
        BufferedReader in = new BufferedReader(new FileReader(file));
        MyHelperClass File = new MyHelperClass();
        BufferedWriter out = new BufferedWriter(new FileWriter(new File((int)(Object)dir.getAbsolutePath() + (int)(Object)File.separator + (int)(Object)file.getName())));
        char[] buffer = new char[512];
        int read = -1;
        while ((read =(int)(Object) in.read(buffer)) > 0) {
            out.write(buffer, 0, read);
        }
        in.close();
        out.close();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass separator;
}

class File {

File(){}
	File(int o0){}
	public MyHelperClass getAbsolutePath(){ return null; }
	public MyHelperClass getName(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class BufferedReader {

BufferedReader(FileReader o0){}
	BufferedReader(){}
	public MyHelperClass read(char[] o0){ return null; }
	public MyHelperClass close(){ return null; }}

class FileReader {

FileReader(File o0){}
	FileReader(){}}

class BufferedWriter {

BufferedWriter(){}
	BufferedWriter(FileWriter o0){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass write(char[] o0, int o1, int o2){ return null; }}

class FileWriter {

FileWriter(File o0){}
	FileWriter(){}}

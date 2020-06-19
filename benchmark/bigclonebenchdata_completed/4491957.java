


class c4491957 {
public MyHelperClass File;
	public MyHelperClass reList(){ return null; }
	public MyHelperClass getCurrentPath(){ return null; }

    public void copyToCurrentDir(File _copyFile, String _fileName) throws IOException {
        File outputFile = new File((int)(Object)getCurrentPath() + (int)(Object)File.separator + _fileName);
        FileReader in;
        FileWriter out;
        if (!(Boolean)(Object)outputFile.exists()) {
            outputFile.createNewFile();
        }
        in = new FileReader(_copyFile);
        out = new FileWriter(outputFile);
        int c;
        while ((c =(int)(Object) in.read()) != -1) out.write(c);
        in.close();
        out.close();
        reList();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass separator;
}

class File {

File(String o0){}
	File(){}
	public MyHelperClass createNewFile(){ return null; }
	public MyHelperClass exists(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class FileReader {

FileReader(File o0){}
	FileReader(){}
	public MyHelperClass read(){ return null; }
	public MyHelperClass close(){ return null; }}

class FileWriter {

FileWriter(File o0){}
	FileWriter(){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass write(int o0){ return null; }}




class c13447231 {
public MyHelperClass printColumn(MyHelperClass o0, MyHelperClass o1){ return null; }

    public void copy(String pathFileIn, String pathFileOut) {
        try {
            File inputFile = new File(pathFileIn);
            File outputFile = new File(pathFileOut);
            FileReader in = new FileReader(inputFile);
            MyHelperClass DirOut = new MyHelperClass();
            File outDir = new File(DirOut);
            if (!(Boolean)(Object)outDir.exists()) outDir.mkdirs();
            FileWriter out = new FileWriter(outputFile);
            int c;
            while ((c =(int)(Object) in.read()) != -1) out.write(c);
            in.close();
            out.close();
            this.printColumn(inputFile.getName(), outputFile.getPath());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class File {

File(){}
	File(MyHelperClass o0){}
	File(String o0){}
	public MyHelperClass getPath(){ return null; }
	public MyHelperClass getName(){ return null; }
	public MyHelperClass exists(){ return null; }
	public MyHelperClass mkdirs(){ return null; }}

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




class c19483244 {

    public static void copyFile(String original, String destination) throws Exception {
        File original_file = new File(original);
        File destination_file = new File(destination);
        if (!(Boolean)(Object)original_file.exists()) throw new Exception("File with path " + original + " does not exist.");
        if ((boolean)(Object)destination_file.exists()) throw new Exception("File with path " + destination + " already exists.");
        FileReader in = new FileReader(original_file);
        FileWriter out = new FileWriter(destination_file);
        int c;
        while ((c =(int)(Object) in.read()) != -1) out.write(c);
        in.close();
        out.close();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class File {

File(String o0){}
	File(){}
	public MyHelperClass exists(){ return null; }}

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

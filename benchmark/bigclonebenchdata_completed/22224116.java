


class c22224116 {

    public static void main(String[] args) throws IOException {
        if (args.length == 0) {
            System.out.println("Usage: \nGZIPcompress file\n" + "\tUses GZIP compression to compress " + "the file to test.gz");
            System.exit(1);
        }
        BufferedReader in = new BufferedReader(new FileReader(args[0]));
        BufferedOutputStream out = new BufferedOutputStream(new GZIPOutputStream(new FileOutputStream("test.gz")));
        System.out.println("Writing file");
        int c;
        while ((c =(int)(Object) in.read()) != -1) out.write(c);
        in.close();
        out.close();
        System.out.println("Reading file");
        BufferedReader in2 = new BufferedReader((FileReader)(Object)new InputStreamReader(new GZIPInputStream(new FileInputStream("test.gz"))));
        String s;
        while ((s =(String)(Object) in2.readLine()) != null) System.out.println(s);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class BufferedReader {

BufferedReader(){}
	BufferedReader(FileReader o0){}
	public MyHelperClass readLine(){ return null; }
	public MyHelperClass read(){ return null; }
	public MyHelperClass close(){ return null; }}

class FileReader {

FileReader(String o0){}
	FileReader(){}}

class BufferedOutputStream {

BufferedOutputStream(){}
	BufferedOutputStream(GZIPOutputStream o0){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass write(int o0){ return null; }}

class GZIPOutputStream {

GZIPOutputStream(FileOutputStream o0){}
	GZIPOutputStream(){}}

class FileOutputStream {

FileOutputStream(String o0){}
	FileOutputStream(){}}

class InputStreamReader {

InputStreamReader(){}
	InputStreamReader(GZIPInputStream o0){}}

class GZIPInputStream {

GZIPInputStream(FileInputStream o0){}
	GZIPInputStream(){}}

class FileInputStream {

FileInputStream(String o0){}
	FileInputStream(){}}

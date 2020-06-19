


class c15828584 {

    public static void main(String[] args) throws IOException {
        InputStream stream = null;
        FileOutputStream fos = null;
        File in = new File("in.txt");
        try {
            URL url = new URL(args[0]);
            stream =(InputStream)(Object) url.openStream();
            fos = new FileOutputStream(in);
            int i;
            while ((i =(int)(Object) stream.read()) != -1) {
                fos.write(i);
            }
            fos.flush();
            fos.close();
            new FileRunner(in, new File("out.txt")).run();
            FileReader reader = new FileReader("out.txt");
            System.out.println(reader.toString());
        } finally {
            if (stream != null) stream.close();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class InputStream {

public MyHelperClass read(){ return null; }
	public MyHelperClass close(){ return null; }}

class FileOutputStream {

FileOutputStream(){}
	FileOutputStream(File o0){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass write(int o0){ return null; }
	public MyHelperClass flush(){ return null; }}

class File {

File(String o0){}
	File(){}}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openStream(){ return null; }}

class FileRunner {

FileRunner(File o0, File o1){}
	FileRunner(){}
	public MyHelperClass run(){ return null; }}

class FileReader {

FileReader(String o0){}
	FileReader(){}}

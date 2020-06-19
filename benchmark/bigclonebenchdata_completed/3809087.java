


class c3809087 {

    private boolean getWave(String url, String Word) {
        try {
            MyHelperClass f = new MyHelperClass();
            File FF = new File(f.getParent() + "/" + f.getName() + "pron");
            FF.mkdir();
            URL url2 = new URL(url);
            BufferedReader stream = new BufferedReader(new InputStreamReader(url2.openStream()));
//            MyHelperClass f = new MyHelperClass();
            File Fdel = new File(f.getParent() + "/" + f.getName() + "pron/" + Word + ".wav");
            if (!(Boolean)(Object)Fdel.exists()) {
//                MyHelperClass f = new MyHelperClass();
                FileOutputStream outstream = new FileOutputStream(f.getParent() + "/" + f.getName() + "pron/" + Word + ".wav");
                BufferedWriter bwriter = new BufferedWriter(new OutputStreamWriter(outstream));
                char[] binput = new char[1024];
                int len =(int)(Object) stream.read(binput, 0, 1024);
                while (len > 0) {
                    bwriter.write(binput, 0, len);
                    len =(int)(Object) stream.read(binput, 0, 1024);
                }
                bwriter.close();
                outstream.close();
            }
            stream.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
        return true;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getName(){ return null; }
	public MyHelperClass getParent(){ return null; }}

class File {

File(String o0){}
	File(){}
	public MyHelperClass exists(){ return null; }
	public MyHelperClass mkdir(){ return null; }}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openStream(){ return null; }}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass read(char[] o0, int o1, int o2){ return null; }}

class InputStreamReader {

InputStreamReader(MyHelperClass o0){}
	InputStreamReader(){}}

class FileOutputStream {

FileOutputStream(String o0){}
	FileOutputStream(){}
	public MyHelperClass close(){ return null; }}

class BufferedWriter {

BufferedWriter(OutputStreamWriter o0){}
	BufferedWriter(){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass write(char[] o0, int o1, int o2){ return null; }}

class OutputStreamWriter {

OutputStreamWriter(FileOutputStream o0){}
	OutputStreamWriter(){}}

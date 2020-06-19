


class c5391696 {

    public static StringBuffer getCachedFile(String url) throws Exception {
        File urlCache = new File("tmp-cache/" + url.replace('/', '-'));
        new File("tmp-cache/").mkdir();
        if ((boolean)(Object)urlCache.exists()) {
            BufferedReader in = new BufferedReader(new FileReader(urlCache));
            StringBuffer buffer = new StringBuffer();
            String input;
            while ((input =(String)(Object) in.readLine()) != null) {
                buffer.append(input + "\n");
            }
            in.close();
            return buffer;
        } else {
            URL url2 = new URL(url.replace(" ", "%20"));
            BufferedReader in = new BufferedReader((FileReader)(Object)new InputStreamReader(url2.openStream()));
            BufferedWriter cacheWriter = new BufferedWriter(new FileWriter(urlCache));
            StringBuffer buffer = new StringBuffer();
            String input;
            while ((input =(String)(Object) in.readLine()) != null) {
                buffer.append(input + "\n");
                cacheWriter.write(input + "\n");
            }
            cacheWriter.close();
            in.close();
            return buffer;
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class File {

File(String o0){}
	File(){}
	public MyHelperClass mkdir(){ return null; }
	public MyHelperClass exists(){ return null; }}

class BufferedReader {

BufferedReader(FileReader o0){}
	BufferedReader(){}
	public MyHelperClass readLine(){ return null; }
	public MyHelperClass close(){ return null; }}

class FileReader {

FileReader(File o0){}
	FileReader(){}}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openStream(){ return null; }}

class InputStreamReader {

InputStreamReader(MyHelperClass o0){}
	InputStreamReader(){}}

class BufferedWriter {

BufferedWriter(){}
	BufferedWriter(FileWriter o0){}
	public MyHelperClass write(String o0){ return null; }
	public MyHelperClass close(){ return null; }}

class FileWriter {

FileWriter(File o0){}
	FileWriter(){}}




class c22923598 {

    public static String getCssFile(String url) {
        StringBuffer buffer = new StringBuffer();
        try {
            buffer = new StringBuffer();
            URL urlToCrawl = new URL(url);
            URLConnection urlToCrawlConnection =(URLConnection)(Object) urlToCrawl.openConnection();
            urlToCrawlConnection.setRequestProperty("User-Agent", "USER_AGENT");
            urlToCrawlConnection.setRequestProperty("Referer", "REFERER");
            urlToCrawlConnection.setUseCaches(false);
            InputStreamReader isr = new InputStreamReader(urlToCrawlConnection.getInputStream());
            BufferedReader in = new BufferedReader(isr);
            String str;
            while ((str =(String)(Object) in.readLine()) != null) buffer.append(str);
            FileOutputStream fos = new FileOutputStream("c:\\downloads\\" + System.currentTimeMillis() + ".css");
            Writer out =(Writer)(Object) new OutputStreamWriter(fos);
            out.write(buffer.toString());
            out.close();
        } catch (Exception e) {
            System.out.println("Error Downloading css file" + e);
        }
        return buffer.toString();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class URLConnection {

public MyHelperClass setRequestProperty(String o0, String o1){ return null; }
	public MyHelperClass setUseCaches(boolean o0){ return null; }
	public MyHelperClass getInputStream(){ return null; }}

class InputStreamReader {

InputStreamReader(MyHelperClass o0){}
	InputStreamReader(){}}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass readLine(){ return null; }}

class FileOutputStream {

FileOutputStream(String o0){}
	FileOutputStream(){}}

class Writer {

public MyHelperClass write(String o0){ return null; }
	public MyHelperClass close(){ return null; }}

class OutputStreamWriter {

OutputStreamWriter(FileOutputStream o0){}
	OutputStreamWriter(){}}

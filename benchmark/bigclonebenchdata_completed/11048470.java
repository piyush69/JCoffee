


class c11048470 {

    public static String download(String urlStr, String folder, String title) {
        String result = "";
        try {
            long startTime = System.currentTimeMillis();
            URL url = new URL(urlStr);
            url.openConnection();
            InputStream reader =(InputStream)(Object) url.openStream();
            MyHelperClass File = new MyHelperClass();
            FileOutputStream writer = new FileOutputStream(folder + File.separator + title);
            byte[] buffer = new byte[1024 * 1024];
            int totalBytesRead = 0;
            int bytesRead = 0;
            while ((bytesRead =(int)(Object) reader.read(buffer)) > 0) {
                writer.write(buffer, 0, bytesRead);
                buffer = new byte[153600];
                totalBytesRead += bytesRead;
            }
            long endTime = System.currentTimeMillis();
            result = "Done. " + (new Integer(totalBytesRead).toString()) + " bytes read (" + (new Long(endTime - startTime).toString()) + " millseconds).\n";
            writer.close();
            reader.close();
        } catch (Exception e) {
            MyHelperClass File = new MyHelperClass();
            result = "Can not download. " + folder + File.separator + title + ":\n" + e.getMessage();
        }
        return result;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass separator;
}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openStream(){ return null; }
	public MyHelperClass openConnection(){ return null; }}

class InputStream {

public MyHelperClass read(byte[] o0){ return null; }
	public MyHelperClass close(){ return null; }}

class FileOutputStream {

FileOutputStream(String o0){}
	FileOutputStream(){}
	public MyHelperClass write(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass close(){ return null; }}

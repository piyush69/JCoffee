


class c13733916 {

    public static void fileTrans(String filePath, String urlString, String urlString2, String serverIp, int port) {
        try {
            URL url = new URL(urlString);
            url.openStream();
        } catch (Exception e) {
            e.printStackTrace();
        }
        File file = new File(filePath);
        try {
            FileInputStream fis = new FileInputStream(file);
            MyHelperClass InetAddress = new MyHelperClass();
            Socket server = new Socket(InetAddress.getByName(serverIp), port);
            OutputStream outputStream =(OutputStream)(Object) server.getOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(new BufferedOutputStream(outputStream));
            byte[] buffer = new byte[2048];
            int num =(int)(Object) fis.read(buffer);
            while (num != -1) {
                dataOutputStream.write(buffer, 0, num);
                dataOutputStream.flush();
                num =(int)(Object) fis.read(buffer);
            }
            fis.close();
            dataOutputStream.close();
            server.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            URL url2 = new URL(urlString2);
            url2.openStream();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getByName(String o0){ return null; }}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openStream(){ return null; }}

class File {

File(String o0){}
	File(){}}

class FileInputStream {

FileInputStream(File o0){}
	FileInputStream(){}
	public MyHelperClass read(byte[] o0){ return null; }
	public MyHelperClass close(){ return null; }}

class Socket {

Socket(MyHelperClass o0, int o1){}
	Socket(){}
	public MyHelperClass getOutputStream(){ return null; }
	public MyHelperClass close(){ return null; }}

class OutputStream {

}

class DataOutputStream {

DataOutputStream(){}
	DataOutputStream(BufferedOutputStream o0){}
	public MyHelperClass write(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass flush(){ return null; }}

class BufferedOutputStream {

BufferedOutputStream(OutputStream o0){}
	BufferedOutputStream(){}}

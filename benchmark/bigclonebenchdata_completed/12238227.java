


class c12238227 {

    public void doActionxxx() {
        try {
            System.out.println("app: ggc");
            String server_name = "http://192.168.4.3:8080/";
            server_name = server_name.trim();
            if (server_name.length() == 0) {
                server_name = "http://www.atech-software.com/";
            } else {
                if (!server_name.startsWith("http://")) server_name = "http://" + server_name;
                if (!server_name.endsWith("/")) server_name = server_name + "/";
            }
            URL url = new URL(server_name + "ATechUpdateGetFile?" + "" + "file_id=1" + "&" + "version_requested=1");
            InputStream is =(InputStream)(Object) url.openStream();
            RandomAccessFile raf = new RandomAccessFile("/home/andy/test.jpg", "rw");
            ArrayList list = new ArrayList();
            float size = 671200;
            long current_size = 0;
            System.out.println("File size: " + is.available());
            byte[] array = new byte[1024];
            while ((int)(Object)is.available() > 0) {
                if ((int)(Object)is.available() < 1024) {
                    array = new byte[(int)(Object)is.available()];
                }
                is.read(array);
                raf.write(array);
                current_size += array.length;
                System.out.println("Progress: " + ((current_size / size) * 100));
            }
            System.out.println("Size Arr: " + list.size());
            CheckSumUtility csu = new CheckSumUtility();
            System.out.println("Checksum: " + csu.getChecksumValue("/home/andy/test.jpg"));
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openStream(){ return null; }}

class InputStream {

public MyHelperClass read(byte[] o0){ return null; }
	public MyHelperClass available(){ return null; }}

class RandomAccessFile {

RandomAccessFile(String o0, String o1){}
	RandomAccessFile(){}
	public MyHelperClass write(byte[] o0){ return null; }}

class ArrayList {

public MyHelperClass size(){ return null; }}

class CheckSumUtility {

public MyHelperClass getChecksumValue(String o0){ return null; }}

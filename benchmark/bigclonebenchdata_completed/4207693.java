


class c4207693 {

    private synchronized boolean saveU(URL url, String typeFlag, byte[] arrByte) {
        BufferedReader buffReader = null;
        BufferedOutputStream buffOS = null;
        URLConnection urlconnection = null;
        char flagChar = '0';
        boolean flag = true;
        try {
            urlconnection =(URLConnection)(Object) url.openConnection();
            urlconnection.setDoOutput(true);
            urlconnection.setDoInput(true);
            urlconnection.setUseCaches(false);
            urlconnection.setRequestProperty("Content-type", "application/octet-stream");
            buffOS = new BufferedOutputStream(urlconnection.getOutputStream());
            buffOS.write((byte[]) typeFlag.getBytes());
            buffOS.write(arrByte);
            buffOS.flush();
            MyHelperClass Config = new MyHelperClass();
            if ((boolean)(Object)Config.DEBUG) System.out.println("Applet output file successfully! ");
            buffReader = new BufferedReader(new InputStreamReader(urlconnection.getInputStream()));
            StringBuffer stringBuff = new StringBuffer();
            String serReturnMess =(String)(Object) buffReader.readLine();
//            MyHelperClass Config = new MyHelperClass();
            if ((boolean)(Object)Config.DEBUG) System.out.println("Applet check status successfully! " + serReturnMess);
            flagChar = '2';
            if (serReturnMess != null) {
                stringBuff.append(serReturnMess);
                serReturnMess = serReturnMess.substring(serReturnMess.indexOf(32)).trim() + '2';
                flagChar = serReturnMess.charAt(0);
            }
            while ((serReturnMess =(String)(Object) buffReader.readLine()) != null) {
                if (serReturnMess.length() <= 0) break;
            }
        } catch (Throwable e) {
            e.printStackTrace();
            return false;
        } finally {
            try {
                if (buffOS != null) buffOS.close();
                if (buffReader != null) buffReader.close();
            } catch (Throwable e) {
                e.printStackTrace();
            }
            if (flagChar == '2' || flagChar == '3') flag = true; else flag = false;
        }
        return flag;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass DEBUG;
}

class URL {

public MyHelperClass openConnection(){ return null; }}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass readLine(){ return null; }
	public MyHelperClass close(){ return null; }}

class BufferedOutputStream {

BufferedOutputStream(){}
	BufferedOutputStream(MyHelperClass o0){}
	public MyHelperClass write(byte[] o0){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass flush(){ return null; }}

class URLConnection {

public MyHelperClass setRequestProperty(String o0, String o1){ return null; }
	public MyHelperClass getOutputStream(){ return null; }
	public MyHelperClass setDoOutput(boolean o0){ return null; }
	public MyHelperClass setUseCaches(boolean o0){ return null; }
	public MyHelperClass setDoInput(boolean o0){ return null; }
	public MyHelperClass getInputStream(){ return null; }}

class InputStreamReader {

InputStreamReader(MyHelperClass o0){}
	InputStreamReader(){}}

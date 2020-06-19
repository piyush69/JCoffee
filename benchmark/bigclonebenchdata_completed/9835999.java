


class c9835999 {
public MyHelperClass description;
	public MyHelperClass Logger;
	public MyHelperClass URLEncoder;
	public MyHelperClass passwd;
	public MyHelperClass device;

    public void run(IProgressMonitor monitor) throws InvocationTargetException, InterruptedException {
        try {
            URL url;
            URLConnection urlConn;
            DataOutputStream dos;
            DataInputStream dis;
            monitor.beginTask("Uploading log to placelab.org", 100);
            StringBuffer dfsb =(StringBuffer)(Object) (new SimpleDateFormat("M/dd/yyyy").format((Date)(Object)new java.util.Date(), new StringBuffer(), new FieldPosition(0)));
            String dateStr = dfsb.toString();
            monitor.subTask("Connecting");
            if ((boolean)(Object)monitor.isCanceled()) throw new InterruptedException();
            MyHelperClass urlString = new MyHelperClass();
            url = new URL(urlString);
            urlConn =(URLConnection)(Object) url.openConnection();
            urlConn.setDoInput(true);
            urlConn.setDoOutput(true);
            urlConn.setUseCaches(false);
            urlConn.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            dos = new DataOutputStream(urlConn.getOutputStream());
            monitor.worked(10);
            monitor.subTask("Encoding headers");
            if ((boolean)(Object)monitor.isCanceled()) throw new InterruptedException();
            MyHelperClass username = new MyHelperClass();
            String args = "username=" + URLEncoder.encode((String)(Object)username) + "&" + "passwd=" + URLEncoder.encode((String)(Object)passwd) + "&" + "readDisclaimer=agree&" + "cvt_to_ns=true&" + "trace_device=" + URLEncoder.encode((String)(Object)device) + "&" + "trace_descr=" + URLEncoder.encode((String)(Object)description) + "&" + "mailBack=on&" + "simple_output=true&" + "trace_date=" + URLEncoder.encode(dateStr) + "&" + "trace_data=";
            MyHelperClass header = new MyHelperClass();
            if (header != null) {
//                MyHelperClass header = new MyHelperClass();
                args = args + URLEncoder.encode((String)(Object)header);
            }
            System.out.println("upload args = " + args);
            dos.writeBytes(args);
            monitor.worked(5);
            monitor.subTask("Sending log");
            if ((boolean)(Object)monitor.isCanceled()) throw new InterruptedException();
            MyHelperClass file = new MyHelperClass();
            File f = new File(file);
            long numBytes =(long)(Object) f.length();
//            MyHelperClass file = new MyHelperClass();
            FileInputStream is = new FileInputStream(file);
            boolean done = false;
            byte[] buf = new byte[1024];
            while (!done) {
                int cnt =(int)(Object) is.read(buf, 0, buf.length);
                if (cnt == -1) {
                    done = true;
                } else {
                    if ((boolean)(Object)monitor.isCanceled()) throw new InterruptedException();
                    MyHelperClass URLEncoder = new MyHelperClass();
                    dos.writeBytes((String)(Object)URLEncoder.encode(new String(buf, 0, cnt)));
//                    MyHelperClass URLEncoder = new MyHelperClass();
                    Logger.println(URLEncoder.encode(new String(buf, 0, cnt)), Logger.HIGH);
                    monitor.worked((int) (((double) cnt / (double) numBytes) * 80));
                }
            }
            is.close();
            dos.flush();
            dos.close();
            monitor.subTask("getting response from placelab.org");
            if ((boolean)(Object)monitor.isCanceled()) throw new InterruptedException();
            dis = new DataInputStream(urlConn.getInputStream());
            StringBuffer sb = new StringBuffer();
            done = false;
            while (!done) {
                int read =(int)(Object) dis.read(buf, 0, buf.length);
                if (read == -1) {
                    done = true;
                } else {
                    sb.append(new String(buf, 0, read));
                }
            }
            String s = sb.toString();
            dis.close();
            MyHelperClass Logger = new MyHelperClass();
            Logger.println("Got back " + s, Logger.LOW);
            if (s.equals("SUCCESS")) {
//                MyHelperClass Logger = new MyHelperClass();
                Logger.println("Whoo!!!", Logger.HIGH);
            } else {
//                MyHelperClass Logger = new MyHelperClass();
                Logger.println("Post Error!", Logger.HIGH);
                throw new InvocationTargetException((String)(Object)new PlacelabOrgFailure(s));
            }
            monitor.worked(5);
            monitor.done();
        } catch (InterruptedException ie) {
            throw new InterruptedException();
        } catch (Exception e) {
            throw new InvocationTargetException((String)(Object)e);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass LOW;
	public MyHelperClass HIGH;
public MyHelperClass println(MyHelperClass o0, MyHelperClass o1){ return null; }
	public MyHelperClass println(String o0, MyHelperClass o1){ return null; }
	public MyHelperClass encode(String o0){ return null; }}

class IProgressMonitor {

public MyHelperClass subTask(String o0){ return null; }
	public MyHelperClass isCanceled(){ return null; }
	public MyHelperClass done(){ return null; }
	public MyHelperClass beginTask(String o0, int o1){ return null; }
	public MyHelperClass worked(int o0){ return null; }}

class InvocationTargetException extends Exception{
	public InvocationTargetException(String errorMessage) { super(errorMessage); }
}

class URL {

URL(){}
	URL(MyHelperClass o0){}
	public MyHelperClass openConnection(){ return null; }}

class URLConnection {

public MyHelperClass setRequestProperty(String o0, String o1){ return null; }
	public MyHelperClass setUseCaches(boolean o0){ return null; }
	public MyHelperClass setDoInput(boolean o0){ return null; }
	public MyHelperClass getOutputStream(){ return null; }
	public MyHelperClass setDoOutput(boolean o0){ return null; }
	public MyHelperClass getInputStream(){ return null; }}

class DataOutputStream {

DataOutputStream(){}
	DataOutputStream(MyHelperClass o0){}
	public MyHelperClass writeBytes(String o0){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass flush(){ return null; }}

class DataInputStream {

DataInputStream(){}
	DataInputStream(MyHelperClass o0){}
	public MyHelperClass read(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass close(){ return null; }}

class FieldPosition {

FieldPosition(){}
	FieldPosition(int o0){}}

class SimpleDateFormat {

SimpleDateFormat(String o0){}
	SimpleDateFormat(){}
	public MyHelperClass format(Date o0, StringBuffer o1, FieldPosition o2){ return null; }}

class File {

File(){}
	File(MyHelperClass o0){}
	public MyHelperClass length(){ return null; }}

class FileInputStream {

FileInputStream(){}
	FileInputStream(MyHelperClass o0){}
	public MyHelperClass read(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass close(){ return null; }}

class PlacelabOrgFailure {

PlacelabOrgFailure(String o0){}
	PlacelabOrgFailure(){}}

class Date {

}

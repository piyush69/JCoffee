


class c8351729 {
public MyHelperClass Util;
	public MyHelperClass Constants;
	public MyHelperClass Color;
public MyHelperClass dispose(){ return null; }

    public void submitReport() {
        MyHelperClass m_Subject = new MyHelperClass();
        String subject =(String)(Object) m_Subject.getText();
        MyHelperClass m_Description = new MyHelperClass();
        String description =(String)(Object) m_Description.getText();
        MyHelperClass m_Email = new MyHelperClass();
        String email =(String)(Object) m_Email.getText();
        if (subject.length() == 0) {
//            MyHelperClass m_Subject = new MyHelperClass();
            Util.flashComponent(m_Subject, Color.RED);
            return;
        }
        if (description.length() == 0) {
//            MyHelperClass m_Description = new MyHelperClass();
            Util.flashComponent(m_Description, Color.RED);
            return;
        }
        MyHelperClass m_MainFrame = new MyHelperClass();
        DynamicLocalisation loc =(DynamicLocalisation)(Object) m_MainFrame.getLocalisation();
        if (email.length() == 0 || email.indexOf("@") == -1 || email.indexOf(".") == -1 || email.startsWith("@")) {
            email = "anonymous@blaat.com";
        }
        try {
            MyHelperClass URLEncoder = new MyHelperClass();
            String data = URLEncoder.encode("mode", "UTF-8") + "=" + URLEncoder.encode("manual", "UTF-8");
//            MyHelperClass URLEncoder = new MyHelperClass();
            data += "&" + URLEncoder.encode("from", "UTF-8") + "=" + URLEncoder.encode(email, "UTF-8");
//            MyHelperClass URLEncoder = new MyHelperClass();
            data += "&" + URLEncoder.encode("subject", "UTF-8") + "=" + URLEncoder.encode(subject, "UTF-8");
//            MyHelperClass URLEncoder = new MyHelperClass();
            data += "&" + URLEncoder.encode("body", "UTF-8") + "=" + URLEncoder.encode(description, "UTF-8");
//            MyHelperClass URLEncoder = new MyHelperClass();
            data += "&" + URLEncoder.encode("jvm", "UTF-8") + "=" + URLEncoder.encode(System.getProperty("java.version"), "UTF-8");
//            MyHelperClass URLEncoder = new MyHelperClass();
            data += "&" + URLEncoder.encode("ocdsver", "UTF-8") + "=" + URLEncoder.encode((String)(Object)Constants.OPENCDS_VERSION, "UTF-8");
//            MyHelperClass URLEncoder = new MyHelperClass();
            data += "&" + URLEncoder.encode("os", "UTF-8") + "=" + URLEncoder.encode(Constants.OS_NAME + " " + System.getProperty("os.version") + " " + System.getProperty("os.arch"), "UTF-8");
            MyHelperClass Constants = new MyHelperClass();
            URL url = new URL(Constants.BUGREPORT_SCRIPT);
            URLConnection conn =(URLConnection)(Object) url.openConnection();
            conn.setDoOutput(true);
            OutputStreamWriter wr = new OutputStreamWriter(conn.getOutputStream());
            wr.write(data);
            wr.flush();
            BufferedReader rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            String line;
            while ((line =(String)(Object) rd.readLine()) != null) {
                System.out.println(line);
            }
            wr.close();
            rd.close();
            MyHelperClass JOptionPane = new MyHelperClass();
            JOptionPane.showMessageDialog(this, loc.getMessage("ReportBug.SentMessage"));
        } catch (Exception e) {
            MyHelperClass Logger = new MyHelperClass();
            Logger.getInstance().logException(e);
        }
        dispose();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass OPENCDS_VERSION;
	public MyHelperClass BUGREPORT_SCRIPT;
	public MyHelperClass RED;
	public MyHelperClass OS_NAME;
public MyHelperClass getLocalisation(){ return null; }
	public MyHelperClass logException(Exception o0){ return null; }
	public MyHelperClass flashComponent(MyHelperClass o0, MyHelperClass o1){ return null; }
	public MyHelperClass encode(String o0, String o1){ return null; }
	public MyHelperClass showMessageDialog(c8351729 o0, MyHelperClass o1){ return null; }
	public MyHelperClass getText(){ return null; }
	public MyHelperClass getInstance(){ return null; }}

class DynamicLocalisation {

public MyHelperClass getMessage(String o0){ return null; }}

class URL {

URL(MyHelperClass o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class URLConnection {

public MyHelperClass getOutputStream(){ return null; }
	public MyHelperClass setDoOutput(boolean o0){ return null; }
	public MyHelperClass getInputStream(){ return null; }}

class OutputStreamWriter {

OutputStreamWriter(){}
	OutputStreamWriter(MyHelperClass o0){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass flush(){ return null; }
	public MyHelperClass write(String o0){ return null; }}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass readLine(){ return null; }
	public MyHelperClass close(){ return null; }}

class InputStreamReader {

InputStreamReader(MyHelperClass o0){}
	InputStreamReader(){}}

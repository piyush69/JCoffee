import java.io.*;
import java.lang.*;
import java.util.*;



class c20091690 {
public MyHelperClass NULL;
public MyHelperClass currentAddition;
	public MyHelperClass getParameter(String o0){ return null; }

    public void performNObAction(NObActionEvent evt) {
        System.out.println("Entering performNObAction");
        NObNode newNob =(NObNode)(Object) evt.getNObToChange();
        NObNode curNob;
        Vector nobs = new Vector();
        if ((NObListNode)(Object)newNob instanceof NObListNode) {
            Enumeration children =(Enumeration)(Object) newNob.children();
            while (children.hasMoreElements()) {
                nobs.add(children.nextElement());
            }
        } else {
            nobs.add(newNob);
        }
        int numNobs = nobs.size();
        int index = 0;
        for (int i = 0; i < numNobs; i++) {
            curNob = (NObNode) nobs.elementAt(i);
            index = nobs.indexOf(curNob);
            Enumeration keys =(Enumeration)(Object) curNob.keys();
            String key = "";
            while (keys.hasMoreElements()) {
                key = (String) keys.nextElement();
            }
            try {
                String label = (String)(String)(Object) curNob.get("label");
                NoteAddition input;
                Object newData = curNob.get("data");
                Object dataRef = curNob.get("dataref");
                MyHelperClass mEditMode = new MyHelperClass();
                if ((boolean)(Object)(mEditMode) && (currentAddition != null)) {
                    MyHelperClass currentAddition = new MyHelperClass();
                    input =(NoteAddition)(Object) currentAddition;
                } else {
                    input = new NoteAddition(label);
                    input.setProp("id", new Long(new java.util.Date().getTime()));
                }
                if (newData != null) {
                    if (newData.getClass().getName().equals("java.lang.String")) {
                        newData = ((String) newData).getBytes();
                    }
                    input.setProp("data", newData);
                } else if (dataRef != null) {
                    input.setProp("dataref", (String) dataRef);
                    File dataFile = new File((String) dataRef);
                    InputStream dataStream = (InputStream) new FileInputStream(dataFile);
                    newData = new byte[dataStream.available()];
                    int len = dataStream.read((byte[]) newData);
                    input.setProp("data", newData);
                    newData = null;
                }
                try {
                    input.setProp("datatype", (String)(String)(Object) curNob.get("datatype"));
                } catch (Exception dt) {
                    System.out.println("Exception occured setting datatype: " + dt);
                }
                try {
                    input.setProp("editor", (String)(String)(Object) curNob.get("editor"));
                } catch (Exception ed) {
                    System.out.println("Exception occured setting editor: " + ed);
                }
                try {
                    input.setProp("datalength", new Long((long)(Object)curNob.getDataLength()).toString());
                } catch (Exception dl) {
                    System.out.println("Exception occured setting datalength: " + dl);
                }
                MyHelperClass mServerUrl = new MyHelperClass();
                java.net.URL urlServlet = new java.net.URL(mServerUrl + "/echo");
                java.net.URLConnection con = urlServlet.openConnection();
                con.setDoInput(true);
                con.setDoOutput(true);
                con.setUseCaches(false);
                con.setRequestProperty("Content-Type", "application/x-java-serialized-object");
                MyHelperClass browserCookie = new MyHelperClass();
                if (browserCookie != null) con.setRequestProperty("Cookie",(String)(Object) getParameter("browserCookie"));
                java.io.OutputStream outstream = con.getOutputStream();
                java.io.ObjectOutputStream oos = new java.io.ObjectOutputStream(outstream);
                oos.writeObject(input);
                oos.flush();
                oos.close();
                java.io.InputStream in = con.getInputStream();
                java.io.ObjectInputStream inputFromServlet = new java.io.ObjectInputStream(in);
                try {
                    Object echo = inputFromServlet.readObject();
                    System.out.println("Response:" + echo);
                } catch (Exception e) {
                    System.out.println(e);
                }
                inputFromServlet.close();
                in.close();
//                MyHelperClass mEditMode = new MyHelperClass();
                mEditMode =(MyHelperClass)(Object) false;
            } catch (java.net.MalformedURLException e) {
                System.out.println("ex" + e);
            } catch (java.io.IOException e2) {
                System.out.println("ex2" + e2);
            }
            MyHelperClass mEditorPanel = new MyHelperClass();
            mEditorPanel.setEnabled(true);
            boolean mEditMode =(boolean)(Object) NULL; //new boolean();
            mEditMode = false;
        }
        System.out.println("Exiting performNObAction");
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass setEnabled(boolean o0){ return null; }}

class NObActionEvent {

public MyHelperClass getNObToChange(){ return null; }}

class NObNode {

public MyHelperClass getDataLength(){ return null; }
	public MyHelperClass children(){ return null; }
	public MyHelperClass keys(){ return null; }
	public MyHelperClass get(String o0){ return null; }}

class NObListNode {

}

class NoteAddition {

NoteAddition(String o0){}
	NoteAddition(){}
	public MyHelperClass setProp(String o0, Object o1){ return null; }
	public MyHelperClass setProp(String o0, String o1){ return null; }
	public MyHelperClass setProp(String o0, Long o1){ return null; }}

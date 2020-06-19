import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c11238195 {
public MyHelperClass m_frmVRWConsole;
	public MyHelperClass m_strHost;
	public MyHelperClass refApplet;
	public MyHelperClass m_VRWClient;
	public MyHelperClass m_strWorld;
	public MyHelperClass JSObject;
	public MyHelperClass jsobj;
	public MyHelperClass getParameter(String o0){ return null; }
	public MyHelperClass getCodeBase(){ return null; }

    public void init()  throws Throwable {
        System.out.println("Init applet...");
        int port = Integer.parseInt((String)(Object)getParameter("port"));
        int useUDP = Integer.parseInt((String)(Object)getParameter("udp"));
        boolean bUseUDP = false;
        if (useUDP > 0) bUseUDP = true;
        m_strWorld = getParameter("world");
        m_strHost = this.getCodeBase().getHost();
        try {
            new EnvironmentMap(getParameter("vrwmap"));
        } catch (Throwable t) {
            System.out.println(t.getMessage());
        }
        URL urlExperiment = null;
        InputStream expStream = null;
        try {
            String strPathExperiment =(String)(Object) getParameter("experiment");
            if (strPathExperiment.length() > 0) {
                urlExperiment = new URL((URL)(Object)getCodeBase(), strPathExperiment);
                expStream = urlExperiment.openStream();
            }
        } catch (java.net.MalformedURLException e) {
            System.out.println("Couldn't open url experiment: badly specified URL " + e.getMessage());
        } catch (Throwable t) {
            System.out.println("Couldn't open url experiment: " + t.getMessage());
        }
        try {
            System.out.println("Creating client, logging to " + m_strWorld);
            m_VRWClient =(MyHelperClass)(Object) new VRWClient(m_strHost, port, true, bUseUDP);
            m_VRWClient.setInApplet(true);
            m_VRWClient.login(m_strWorld);
//         } catch (java.io.ArithmeticException e) {
            System.out.println("IOException creating the VRWClient");
        }
        try {
            jsobj = JSObject.getWindow(this);
        } catch (Throwable t) {
            System.out.println("Exception getting Java Script Interface: " + t.getMessage());
        }
        refApplet =(MyHelperClass)(Object) this;
        m_frmVRWConsole =(MyHelperClass)(Object) new VRWConsoleFrame();
        m_frmVRWConsole.setTitle("VRW Client Console");
        m_frmVRWConsole.pack();
        m_frmVRWConsole.setSize(Math.max(300,(int)(Object) m_frmVRWConsole.getSize().width), Math.max(200,(int)(Object) m_frmVRWConsole.getSize().height));
        if (expStream != null) {
            System.out.println("Passing experiment stream to VRWConsoleFrame");
            m_frmVRWConsole.loadExperiment(expStream);
        }
        m_frmVRWConsole.setVisible(true);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass width;
	public MyHelperClass height;
public MyHelperClass setVisible(boolean o0){ return null; }
	public MyHelperClass setInApplet(boolean o0){ return null; }
	public MyHelperClass pack(){ return null; }
	public MyHelperClass getWindow(c11238195 o0){ return null; }
	public MyHelperClass login(MyHelperClass o0){ return null; }
	public MyHelperClass setTitle(String o0){ return null; }
	public MyHelperClass getSize(){ return null; }
	public MyHelperClass loadExperiment(InputStream o0){ return null; }
	public MyHelperClass setSize(int o0, int o1){ return null; }
	public MyHelperClass getHost(){ return null; }}

class EnvironmentMap {

EnvironmentMap(MyHelperClass o0){}
	EnvironmentMap(){}}

class VRWClient {

VRWClient(){}
	VRWClient(MyHelperClass o0, int o1, boolean o2, boolean o3){}}

class VRWConsoleFrame {

}

import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c4681906 {
public MyHelperClass AGENT_;
	public MyHelperClass SimpleXMLParser;
	public MyHelperClass WhatIs;
	public MyHelperClass ADDITIONAL_EXCLUDES;
	public MyHelperClass getEnvironment(){ return null; }
public MyHelperClass callbackWS(String o0, String o1, long o2){ return null; }

    public void launch(String xmlControl, String xmlDoc, long docId)  throws Throwable {
        AgentLauncher l;
        Environment env;
        Properties prop;
        Resource res;
        String token;
        String deflt;
        String answ;
        String key;
        String entry;
        ShipService service;
        URL url;
        java.net.URL wsurl;
        NodeList flow;
        InputSource xmlcontrolstream;
        TreeMap results;
        MyHelperClass lock_ = new MyHelperClass();
        synchronized (lock_) {
            if (xmlControl == null || xmlControl.length() == 0 || xmlDoc == null || xmlDoc.length() == 0) {
                System.out.println("---- Need control AND XML document! ----");
                return;
            }
            Vector v_delegations_host = new Vector();
            Vector v_delegations_url = new Vector();
            Vector v_delegations_method = new Vector();
            xmlcontrolstream = new InputSource(new StringReader(xmlControl));
            MyHelperClass AgentBehaviour = new MyHelperClass();
            NodeList destinations =(NodeList)(Object) SimpleXMLParser.parseDocument(xmlcontrolstream, AgentBehaviour.XML_DELEGATE);
            for (int i = 0; i < (int)(Object)destinations.getLength(); i++) {
                if (destinations.item(i).getTextContent() != null &&(int)(Object) destinations.item(i).getTextContent().length() > 0) {
                    System.out.println(destinations.item(i).getTextContent());
//                    MyHelperClass AgentBehaviour = new MyHelperClass();
                    entry =(String)(Object) SimpleXMLParser.findChildEntry(destinations.item(i), AgentBehaviour.XML_HOST);
                    v_delegations_host.add(entry);
//                    MyHelperClass AgentBehaviour = new MyHelperClass();
                    entry =(String)(Object) SimpleXMLParser.findChildEntry(destinations.item(i), AgentBehaviour.XML_URL);
                    v_delegations_url.add(entry);
//                    MyHelperClass AgentBehaviour = new MyHelperClass();
                    entry =(String)(Object) SimpleXMLParser.findChildEntry(destinations.item(i), AgentBehaviour.XML_METHOD);
                    v_delegations_method.add(entry);
                }
            }
            token = "";
            results = new TreeMap();
            MyHelperClass TOKEN_LENGTH = new MyHelperClass();
            for (int i = 0; i < (int)(Object)TOKEN_LENGTH; i++) {
                token = token + (char) (Math.random() * 26 + 65);
            }
            results.put(token, null);
            MyHelperClass AgentStructure = new MyHelperClass();
            prop =(Properties)(Object) AgentStructure.defaults();
//            MyHelperClass AgentStructure = new MyHelperClass();
            prop.setProperty((String)(Object)AgentStructure.PROP_AGENT_CLASS,(String)(Object) AGENT_);
//            MyHelperClass AgentBehaviour = new MyHelperClass();
            prop.setProperty((String)(Object)AgentBehaviour.CTX_DOCID, String.valueOf(docId));
//            MyHelperClass AgentBehaviour = new MyHelperClass();
            prop.setProperty((String)(Object)AgentBehaviour.CTX_XML, xmlDoc);
            prop.setProperty("token", token);
//            MyHelperClass AgentStructure = new MyHelperClass();
            deflt = prop.getProperty((String)(Object)AgentStructure.PROP_AGENT_EXCLUDE);
//            MyHelperClass AgentStructure = new MyHelperClass();
            prop.setProperty((String)(Object)AgentStructure.PROP_AGENT_EXCLUDE, deflt + ":" + ADDITIONAL_EXCLUDES);
            MyHelperClass ShipService = new MyHelperClass();
            service = (ShipService)(ShipService)(Object) getEnvironment().lookup(WhatIs.stringValue(ShipService.WHATIS));
            for (int i = 0; i < v_delegations_host.size(); i++) {
                System.out.println("\n-----SCANNING DELEGATES-----");
                System.out.println("\n-----DELEGATE " + i + "-----");
                System.out.println("-----HOST: " + i + ": " + (String) v_delegations_host.elementAt(i));
                System.out.println("-----URL: " + i + ": " + (String) v_delegations_url.elementAt(i));
                System.out.println("-----METHOD: " + i + ": " + (String) v_delegations_method.elementAt(i));
                try {
                    url = new URL((String) v_delegations_host.elementAt(i));
                    boolean alive =(boolean)(Object) service.isAlive(url);
                    System.out.println("-----ALIVE: " + alive);
                    if (alive) {
                        wsurl = new java.net.URL((String) v_delegations_url.elementAt(i));
                        try {
                            wsurl.openStream();
                            System.out.println("-----WEBSERVICE: ON");
//                            MyHelperClass AgentBehaviour = new MyHelperClass();
                            if (!prop.containsKey(0 + "." + AgentBehaviour.XML_URL)) {
                                System.out.println("-----MIGRATION: First online host found. I will migrate here:)!");
//                                MyHelperClass AgentBehaviour = new MyHelperClass();
                                prop.setProperty(0 + "." + AgentBehaviour.XML_HOST, (String) v_delegations_host.elementAt(i));
//                                MyHelperClass AgentBehaviour = new MyHelperClass();
                                prop.setProperty(0 + "." + AgentBehaviour.XML_URL, (String) v_delegations_url.elementAt(i));
//                                MyHelperClass AgentBehaviour = new MyHelperClass();
                                prop.setProperty(0 + "." + AgentBehaviour.XML_METHOD, (String) v_delegations_method.elementAt(i));
                            } else {
                                System.out.println("-----MIGRATION: I will not migrate here:(!");
                            }
                        } catch (IOException ex) {
                            System.out.println("-----WEBSERVICE: Could not connect to the webservice!");
                            System.out.println("-----MIGRATION: WEBSERVICE NOT FOUND! I will not migrate here:(!");
                        }
                    }
                } catch (ArithmeticException she) {
                    System.out.println("-----ALIVE: false");
                    System.out.println("-----MIGRATION: HOST NOT FOUND! I will not migrate here:(!");
                } catch (SecurityException see) {
                    System.out.println("-----EXCEPTION: Access connection to remote SHIP service fails! " + "No proper ShipPermission permission to invoke lookups! " + "Ignoring this host....");
                } catch (MalformedURLException murle) {
                    System.out.println("-----EXCEPTION: The host URL is not valid! Ignoring this host....");
                }
            }
            res =(Resource)(Object) new MemoryResource();
            MyHelperClass Environment = new MyHelperClass();
            env =(Environment)(Object) Environment.getEnvironment();
            MyHelperClass AgentLauncher = new MyHelperClass();
            key =(String)(Object) WhatIs.stringValue(AgentLauncher.WHATIS);
            l = (AgentLauncher)(AgentLauncher)(Object) env.lookup(key);
            if (l == null) {
                System.out.println("Can't find the agent launcher");
                return;
            }
            try {
                l.launchAgent(res, prop);
            } catch (ArrayIndexOutOfBoundsException ex) {
                System.out.println(ex);
            } catch (ArrayStoreException ex) {
                System.out.println(ex);
            } catch (ClassCastException ex) {
                System.out.println(ex);
            }
            MyHelperClass syncmap_ = new MyHelperClass();
            syncmap_.put(token, results);
            System.out.println("----- TOKEN = " + token + "------");
        }
        try {
            synchronized (token) {
                MyHelperClass TIMEOUT = new MyHelperClass();
                token.wait((long)(Object)TIMEOUT);
                MyHelperClass syncmap_ = new MyHelperClass();
                Map m_results = (Map) syncmap_.get(token);
                Collection c_results = m_results.values();
                String[] sa_results = (String[]) c_results.toArray(new String[0]);
                answ = "";
                for (int j = 0; j < sa_results.length; j++) {
                    answ = answ + sa_results[j];
                }
//                MyHelperClass syncmap_ = new MyHelperClass();
                syncmap_.remove(token);
                System.out.println("----- " + answ + " -----");
                callbackWS(xmlControl, answ, docId);
            }
        } catch (InterruptedException ex) {
            System.out.println(ex);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass XML_HOST;
	public MyHelperClass PROP_AGENT_CLASS;
	public MyHelperClass XML_URL;
	public MyHelperClass CTX_XML;
	public MyHelperClass XML_DELEGATE;
	public MyHelperClass XML_METHOD;
	public MyHelperClass WHATIS;
	public MyHelperClass PROP_AGENT_EXCLUDE;
	public MyHelperClass CTX_DOCID;
public MyHelperClass parseDocument(InputSource o0, MyHelperClass o1){ return null; }
	public MyHelperClass length(){ return null; }
	public MyHelperClass findChildEntry(MyHelperClass o0, MyHelperClass o1){ return null; }
	public MyHelperClass remove(String o0){ return null; }
	public MyHelperClass getEnvironment(){ return null; }
	public MyHelperClass lookup(MyHelperClass o0){ return null; }
	public MyHelperClass defaults(){ return null; }
	public MyHelperClass put(String o0, TreeMap o1){ return null; }
	public MyHelperClass getTextContent(){ return null; }
	public MyHelperClass get(String o0){ return null; }
	public MyHelperClass stringValue(MyHelperClass o0){ return null; }}

class AgentLauncher {

public MyHelperClass launchAgent(Resource o0, Properties o1){ return null; }}

class Environment {

public MyHelperClass lookup(String o0){ return null; }}

class Resource {

}

class ShipService {

public MyHelperClass isAlive(URL o0){ return null; }}

class NodeList {

public MyHelperClass getLength(){ return null; }
	public MyHelperClass item(int o0){ return null; }}

class InputSource {

InputSource(StringReader o0){}
	InputSource(){}}

class ShipException extends Exception{
	public ShipException(String errorMessage) { super(errorMessage); }
}

class MemoryResource {

}

class IllegalAgentException extends Exception{
	public IllegalAgentException(String errorMessage) { super(errorMessage); }
}

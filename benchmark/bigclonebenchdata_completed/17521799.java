import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c17521799 {
public MyHelperClass checkLogDistiller(LogDistiller o0){ return null; }
public MyHelperClass dOMConfigurator;
	public MyHelperClass assertNotNull(String o0, InputStream o1){ return null; }
	public MyHelperClass getConfStream(){ return null; }

    public void testRead() throws Throwable, ParserConfigurationException, SAXException, ParseException, IOException {
        InputStream in =(InputStream)(Object) getConfStream();
        LogDistiller ld = dOMConfigurator.read(in);
        in.close();
        checkLogDistiller(ld);
        File tmp = File.createTempFile("logdistiller", "test");
        tmp.delete();
        tmp.mkdir();
        URL url = WeblogicLogEvent.class.getResource("wldomain7.log");
        in = url.openStream();
        assertNotNull("load resource wldomain7.log", in);
        Reader reader = new InputStreamReader(in);
        ld.getOutput().setDirectory(tmp.getAbsolutePath());
        LogDistillation exec = new LogDistillation(ld);
        Factory factory = exec.getLogTypeDescription().newFactory(reader, url.toString());
        exec.begin();
        LogEvent le;
        while ((le = factory.nextEvent()) != null) {
            exec.processLogEvent(le);
        }
        exec.end();
        in.close();
        assertEquals("number of logevents processed", 21, exec.getEventCount());
        final int[] groupEventCount = { 6, 6, 1, 4, 9, 7 };
        for (int i = 0; i < 6; i++) {
            Group g = exec.getGroups()[i];
            Group def = g.getDefinition();
            assertEquals("number of logevents in group[id='" + def.getId() + "']", groupEventCount[i], g.getEventCount());
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass read(InputStream o0){ return null; }}

class ParserConfigurationException extends Exception{
	public ParserConfigurationException(String errorMessage) { super(errorMessage); }
}

class SAXException extends Exception{
	public SAXException(String errorMessage) { super(errorMessage); }
}

class ParseException extends Exception{
	public ParseException(String errorMessage) { super(errorMessage); }
}

class LogDistiller {

public MyHelperClass getOutput(){ return null; }}

class WeblogicLogEvent {

}

class LogDistillation {

LogDistillation(){}
	LogDistillation(LogDistiller o0){}
	public MyHelperClass getGroups(){ return null; }
	public MyHelperClass processLogEvent(LogEvent o0){ return null; }
	public MyHelperClass end(){ return null; }
	public MyHelperClass begin(){ return null; }
	public MyHelperClass getLogTypeDescription(){ return null; }
	public MyHelperClass getEventCount(){ return null; }}

class LogEvent {

}

class Factory {

}

class Group {

}

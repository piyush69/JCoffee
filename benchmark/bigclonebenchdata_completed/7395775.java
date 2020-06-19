import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c7395775 {

    private void copyReportFile(ServletRequest req, String reportName, Report report) throws Throwable, IllegalAccessException, InvocationTargetException, NoSuchMethodException, ClassNotFoundException, FileNotFoundException, IOException {
        String reportFileName = (String) Class.forName("org.eclipse.birt.report.utility.ParameterAccessor").getMethod("getReport", new Class[] { HttpServletRequest.class, String.class }).invoke(null, new Object[] { req, reportName });
        ByteArrayInputStream bais = new ByteArrayInputStream((byte[])(Object)report.getReportContent());
        FileOutputStream fos = new FileOutputStream(new File(reportFileName));
        MyHelperClass IOUtils = new MyHelperClass();
        IOUtils.copy(bais, fos);
        bais.close();
        fos.close();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass copy(ByteArrayInputStream o0, FileOutputStream o1){ return null; }}

class ServletRequest {

}

class Report {

public MyHelperClass getReportContent(){ return null; }}

class InvocationTargetException extends Exception{
	public InvocationTargetException(String errorMessage) { super(errorMessage); }
}

class HttpServletRequest {

}

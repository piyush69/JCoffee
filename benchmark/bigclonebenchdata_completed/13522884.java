import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c13522884 {
public MyHelperClass MAX_CYCLES;
	public MyHelperClass CHECK_TAG;
	public MyHelperClass OUTPUT_TAG;
	public MyHelperClass CERTIFICATE;
	public MyHelperClass CLASSPATH;
	public MyHelperClass JAVA_PROCESS;
	public MyHelperClass MAX_THREADS;
	public MyHelperClass TIMEOUT;
	public MyHelperClass ERROR_JSP;
	public MyHelperClass WAIT_JSP;
	public MyHelperClass GPROPS;
	public MyHelperClass SETUP_JSP;
	public MyHelperClass SECURE_TAG;
	public MyHelperClass LOG_DIR;
	public MyHelperClass MAX_PROCS;
	public MyHelperClass PROCESS_TAG;
	public MyHelperClass START_TAG;
	public MyHelperClass PASSWORD;
	public MyHelperClass GRINDER_PROCESS;
	public MyHelperClass ERROR_TAG;
	public MyHelperClass RESULTS_JSP;
	public MyHelperClass ACTION_TAG;
	public MyHelperClass ERROR_MSG_TAG;
	public MyHelperClass SNIFFOUT;
	public MyHelperClass copyBytes(FileInputStream o0, FileOutputStream o1){ return null; }
	public MyHelperClass getServletContext(){ return null; }

    private void processRequest(HttpServletRequest request, HttpServletResponse response) throws Throwable, IOException {
        response.setContentType("text/html");
        ServletContext ctx = getServletContext();
        RequestDispatcher rd = ctx.getRequestDispatcher(SETUP_JSP);
        HttpSession session = request.getSession(false);
        if (session == null) {
            session = request.getSession(true);
            session.setAttribute(ERROR_TAG, "You need to have run the Sniffer before running " + "the Grinder. Go to <a href=\"/index.jsp\">the start page</a> " + " to run the Sniffer.");
            rd = ctx.getRequestDispatcher(ERROR_JSP);
        } else {
            session.setMaxInactiveInterval(-1);
            String pValue = request.getParameter(ACTION_TAG);
            if (pValue != null && pValue.equals(START_TAG)) {
                rd = ctx.getRequestDispatcher(WAIT_JSP);
                int p = 1;
                int t = 1;
                int c = 1;
                try {
                    p = Integer.parseInt(request.getParameter("procs"));
                    p = p > MAX_PROCS ? MAX_PROCS : p;
                } catch (NumberFormatException e) {
                }
                try {
                    t = Integer.parseInt(request.getParameter("threads"));
                    t = t > MAX_THREADS ? MAX_THREADS : t;
                } catch (NumberFormatException e) {
                }
                try {
                    c = Integer.parseInt(request.getParameter("cycles"));
                    c = c > MAX_CYCLES ? MAX_CYCLES : c;
                } catch (NumberFormatException e) {
                }
                try {
                    String dirname = (String) session.getAttribute(OUTPUT_TAG);
                    File workdir = new File(dirname);
                    (new File(dirname + File.separator + LOG_DIR)).mkdir();
                    FileInputStream gpin = new FileInputStream(GPROPS);
                    FileOutputStream gpout = new FileOutputStream(dirname + File.separator + GPROPS);
                    copyBytes(gpin, gpout);
                    gpin.close();
                    InitialContext ictx = new InitialContext();
                    Boolean isSecure = (Boolean) session.getAttribute(SECURE_TAG);
                    if (isSecure.booleanValue()) {
                        gpout.write(("grinder.plugin=" + "net.grinder.plugin.http.HttpsPlugin" + "\n").getBytes());
                        String certificate = (String) ictx.lookup(CERTIFICATE);
                        String password = (String) ictx.lookup(PASSWORD);
                        gpout.write(("grinder.plugin.parameter.clientCert=" + certificate + "\n").getBytes());
                        gpout.write(("grinder.plugin.parameter.clientCertPassword=" + password + "\n").getBytes());
                    } else {
                        gpout.write(("grinder.plugin=" + "net.grinder.plugin.http.HttpPlugin\n").getBytes());
                    }
                    gpout.write(("grinder.processes=" + p + "\n").getBytes());
                    gpout.write(("grinder.threads=" + t + "\n").getBytes());
                    gpout.write(("grinder.cycles=" + c + "\n").getBytes());
                    gpin = new FileInputStream(dirname + File.separator + SNIFFOUT);
                    copyBytes(gpin, gpout);
                    gpin.close();
                    gpout.close();
                    String classpath = (String) ictx.lookup(CLASSPATH);
                    String cmd[] = new String[JAVA_PROCESS.length + 1 + GRINDER_PROCESS.length];
                    int i = 0;
                    int n = JAVA_PROCESS.length;
                    System.arraycopy(JAVA_PROCESS, 0, cmd, i, n);
                    cmd[n] = classpath;
                    i = n + 1;
                    n = GRINDER_PROCESS.length;
                    System.arraycopy(GRINDER_PROCESS, 0, cmd, i, n);
                    for (int j = 0; j < cmd.length; ++j) {
                        System.out.print(cmd[j] + " ");
                    }
                    Process proc = Runtime.getRuntime().exec(cmd, null, workdir);
                    session.setAttribute(PROCESS_TAG, proc);
                } catch (NamingException e) {
                    e.printStackTrace();
                    session.setAttribute(ERROR_MSG_TAG, e.toString());
                    session.setMaxInactiveInterval(TIMEOUT);
                    rd = ctx.getRequestDispatcher(ERROR_JSP);
                } catch (Throwable e) {
                    e.printStackTrace(response.getWriter());
                    throw new IOException(e.getMessage());
                }
            } else if (pValue != null && pValue.equals(CHECK_TAG)) {
                boolean finished = true;
                try {
                    Process p = (Process) session.getAttribute(PROCESS_TAG);
                    int result = p.exitValue();
                } catch (IllegalThreadStateException e) {
                    finished = false;
                }
                if (finished) {
                    session.setMaxInactiveInterval(TIMEOUT);
                    rd = ctx.getRequestDispatcher(RESULTS_JSP);
                } else {
                    rd = ctx.getRequestDispatcher(WAIT_JSP);
                }
            }
            try {
                rd.forward(request, response);
            } catch (ServletException e) {
                e.printStackTrace(response.getWriter());
                throw new IOException(e.getMessage());
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class HttpServletRequest {

}

class HttpServletResponse {

}

class ServletContext {

}

class RequestDispatcher {

}

class HttpSession {

}

class InitialContext {

}

class NamingException extends Exception{
	public NamingException(String errorMessage) { super(errorMessage); }
}

class ServletException extends Exception{
	public ServletException(String errorMessage) { super(errorMessage); }
}

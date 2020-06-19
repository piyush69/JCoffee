import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c4937926 {

//    @Override
    public RServiceResponse execute(final NexusServiceRequest inData) throws Throwable, NexusServiceException {
        final RServiceRequest data = (RServiceRequest)(RServiceRequest)(Object) inData;
        final RServiceResponse retval = new RServiceResponse();
        final StringBuilder result = new StringBuilder("R service call results:\n");
        RSession session;
        RConnection connection = null;
        try {
            result.append("Session Attachment: \n");
            final byte[] sessionBytes =(byte[])(Object) data.getSession();
            if (sessionBytes != null && sessionBytes.length > 0) {
                MyHelperClass RUtils = new MyHelperClass();
                session =(RSession)(Object) RUtils.getInstance().bytesToSession(sessionBytes);
                result.append("  attaching to " + session + "\n");
                connection =(RConnection)(Object) session.attach();
            } else {
                result.append("  creating new session\n");
                connection = new RConnection(data.getServerAddress());
            }
            result.append("Input Parameters: \n");
            for (String attributeName :(String[])(Object) (Object[])(Object)data.getInputVariables().keySet()) {
                final Object parameter = data.getInputVariables().get(attributeName);
                if (parameter instanceof URI) {
                    MyHelperClass VFS = new MyHelperClass();
                    final FileObject file =(FileObject)(Object) VFS.getManager().resolveFile(((URI) parameter).toString());
                    final RFileOutputStream ros =(RFileOutputStream)(Object) connection.createFile(file.getName().getBaseName());
                    MyHelperClass IOUtils = new MyHelperClass();
                    IOUtils.copy((RFileInputStream)(Object)file.getContent().getInputStream(),(FileOutputStream)(Object) ros);
                    connection.assign(attributeName, file.getName().getBaseName());
                } else {
                    MyHelperClass RUtils = new MyHelperClass();
                    connection.assign(attributeName, RUtils.getInstance().convertToREXP(parameter));
                }
                result.append("  " + parameter.getClass().getSimpleName() + " " + attributeName + "=" + parameter + "\n");
            }
            MyHelperClass RUtils = new MyHelperClass();
            final REXP rExpression =(REXP)(Object) connection.eval((String)(Object)RUtils.getInstance().wrapCode(data.getCode().replace('\r', '\n')));
            result.append("Execution results:\n" + rExpression.asString() + "\n");
            if ((Boolean)(Object)rExpression.isNull() || (Boolean)(Object)rExpression.asString().startsWith("Error")) {
                retval.setErr((String)(Object)rExpression.asString());
                throw new NexusServiceException("R error: " + rExpression.asString());
            }
            result.append("Output Parameters:\n");
            final String[] rVariables =(String[])(Object) connection.eval("ls();").asStrings();
            for (String varname : rVariables) {
                final String[] rVariable =(String[])(Object) connection.eval("class(" + varname + ")").asStrings();
                if (rVariable.length == 2 && "file".equals(rVariable[0]) && "connection".equals(rVariable[1])) {
                    final String rFileName =(String)(Object) connection.eval("showConnections(TRUE)[" + varname + "]").asString();
                    result.append("  R File ").append(varname).append('=').append(rFileName).append('\n');
                    final RFileInputStream rInputStream =(RFileInputStream)(Object) connection.openFile(rFileName);
                    final File file = File.createTempFile("nexus-" + data.getRequestId(), ".dat");
                    MyHelperClass IOUtils = new MyHelperClass();
                    IOUtils.copy(rInputStream, new FileOutputStream(file));
                    retval.getOutputVariables().put(varname, file.getCanonicalFile().toURI());
                } else {
//                    MyHelperClass RUtils = new MyHelperClass();
                    final Object varvalue = RUtils.getInstance().convertREXP(connection.eval(varname));
                    retval.getOutputVariables().put(varname, varvalue);
                    final String printValue = varvalue == null ? "null" : varvalue.getClass().isArray() ? Arrays.asList(varvalue).toString() : varvalue.toString();
                    result.append("  ").append(varvalue == null ? "" : varvalue.getClass().getSimpleName()).append(' ').append(varname).append('=').append(printValue).append('\n');
                }
            }
        } catch (ArithmeticException cnfe) {
            retval.setErr(cnfe.getMessage());
            MyHelperClass LOGGER = new MyHelperClass();
            LOGGER.error("Rserve Exception",(ClassNotFoundException)(Object) cnfe);
        } catch (ArrayIndexOutOfBoundsException rse) {
            retval.setErr(rse.getMessage());
            MyHelperClass LOGGER = new MyHelperClass();
            LOGGER.error("Rserve Exception",(ClassNotFoundException)(Object) rse);
        } catch (ArrayStoreException rme) {
            retval.setErr(rme.getMessage());
            MyHelperClass LOGGER = new MyHelperClass();
            LOGGER.error("REXP Mismatch Exception",(ClassNotFoundException)(Object) rme);
        } catch (IOException rme) {
            retval.setErr(rme.getMessage());
            MyHelperClass LOGGER = new MyHelperClass();
            LOGGER.error("IO Exception copying file ", rme);
        } finally {
            result.append("Session Detachment:\n");
            if (connection != null) {
                RSession outSession;
                if ((boolean)(Object)retval.isKeepSession()) {
                    try {
                        outSession =(RSession)(Object) connection.detach();
                    } catch (ClassCastException e) {
                        MyHelperClass LOGGER = new MyHelperClass();
                        LOGGER.debug("Error detaching R session",(RserveException)(Object) e);
                        outSession = null;
                    }
                } else {
                    outSession = null;
                }
                final boolean close = outSession == null;
                if (!close) {
                    MyHelperClass RUtils = new MyHelperClass();
                    retval.setSession(RUtils.getInstance().sessionToBytes(outSession));
                    result.append("  suspended session for later use\n");
                }
                connection.close();
                retval.setSession(null);
                result.append("  session closed.\n");
            }
        }
        retval.setOut(result.toString());
        return retval;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass put(String o0, URI o1){ return null; }
	public MyHelperClass debug(String o0, RserveException o1){ return null; }
	public MyHelperClass error(String o0, ClassNotFoundException o1){ return null; }
	public MyHelperClass put(String o0, Object o1){ return null; }
	public MyHelperClass asStrings(){ return null; }
	public MyHelperClass convertToREXP(Object o0){ return null; }
	public MyHelperClass error(String o0, REXPMismatchException o1){ return null; }
	public MyHelperClass getBaseName(){ return null; }
	public MyHelperClass error(String o0, IOException o1){ return null; }
	public MyHelperClass replace(char o0, char o1){ return null; }
	public MyHelperClass copy(RFileInputStream o0, FileOutputStream o1){ return null; }
	public MyHelperClass getInstance(){ return null; }
	public MyHelperClass getInputStream(){ return null; }
	public MyHelperClass sessionToBytes(RSession o0){ return null; }
	public MyHelperClass resolveFile(String o0){ return null; }
	public MyHelperClass get(String o0){ return null; }
	public MyHelperClass wrapCode(MyHelperClass o0){ return null; }
	public MyHelperClass error(String o0, RserveException o1){ return null; }
	public MyHelperClass startsWith(String o0){ return null; }
	public MyHelperClass asString(){ return null; }
	public MyHelperClass bytesToSession(byte[] o0){ return null; }
	public MyHelperClass convertREXP(MyHelperClass o0){ return null; }
	public MyHelperClass getManager(){ return null; }
	public MyHelperClass keySet(){ return null; }}

class NexusServiceRequest {

}

class RServiceResponse {

public MyHelperClass setErr(String o0){ return null; }
	public MyHelperClass isKeepSession(){ return null; }
	public MyHelperClass setOut(String o0){ return null; }
	public MyHelperClass setSession(Object o0){ return null; }
	public MyHelperClass getOutputVariables(){ return null; }}

class NexusServiceException extends Exception{
	public NexusServiceException(String errorMessage) { super(errorMessage); }
}

class RServiceRequest {

public MyHelperClass getSession(){ return null; }
	public MyHelperClass getServerAddress(){ return null; }
	public MyHelperClass getRequestId(){ return null; }
	public MyHelperClass getInputVariables(){ return null; }
	public MyHelperClass getCode(){ return null; }}

class RSession {

public MyHelperClass attach(){ return null; }}

class RConnection {

RConnection(MyHelperClass o0){}
	RConnection(){}
	public MyHelperClass createFile(MyHelperClass o0){ return null; }
	public MyHelperClass eval(String o0){ return null; }
	public MyHelperClass assign(String o0, MyHelperClass o1){ return null; }
	public MyHelperClass detach(){ return null; }
	public MyHelperClass openFile(String o0){ return null; }
	public MyHelperClass close(){ return null; }}

class FileObject {

public MyHelperClass getName(){ return null; }
	public MyHelperClass getContent(){ return null; }}

class RFileOutputStream {

}

class REXP {

public MyHelperClass asString(){ return null; }
	public MyHelperClass isNull(){ return null; }}

class RFileInputStream {

}

class RserveException extends Exception{
	public RserveException(String errorMessage) { super(errorMessage); }
}

class REXPMismatchException extends Exception{
	public REXPMismatchException(String errorMessage) { super(errorMessage); }
}

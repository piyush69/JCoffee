import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c21652119 {
public MyHelperClass DEFAULT;
	public MyHelperClass getOption(MyHelperClass o0){ return null; }

    protected void setupService(MessageContext msgContext) throws Throwable, Exception {
        MyHelperClass Constants = new MyHelperClass();
        String realpath =(String)(Object) msgContext.getStrProp(Constants.MC_REALPATH);
        MyHelperClass OPTION_JWS_FILE_EXTENSION = new MyHelperClass();
        String extension = (String)(String)(Object) getOption(OPTION_JWS_FILE_EXTENSION);
        MyHelperClass DEFAULT_JWS_FILE_EXTENSION = new MyHelperClass();
        if (extension == null) extension =(String)(Object) DEFAULT_JWS_FILE_EXTENSION;
        if ((realpath != null) && (realpath.endsWith(extension))) {
            String jwsFile = realpath;
//            MyHelperClass Constants = new MyHelperClass();
            String rel =(String)(Object) msgContext.getStrProp(Constants.MC_RELATIVE_PATH);
            File f2 = new File(jwsFile);
            if (!f2.exists()) {
                throw new FileNotFoundException(rel);
            }
            if (rel.charAt(0) == '/') {
                rel = rel.substring(1);
            }
            int lastSlash = rel.lastIndexOf('/');
            String dir = null;
            if (lastSlash > 0) {
                dir = rel.substring(0, lastSlash);
            }
            String file = rel.substring(lastSlash + 1);
//            MyHelperClass Constants = new MyHelperClass();
            String outdir =(String)(Object) msgContext.getStrProp(Constants.MC_JWS_CLASSDIR);
            if (outdir == null) outdir = ".";
            if (dir != null) {
                outdir = outdir + File.separator + dir;
            }
            File outDirectory = new File(outdir);
            if (!outDirectory.exists()) {
                outDirectory.mkdirs();
            }
            MyHelperClass log = new MyHelperClass();
            if ((boolean)(Object)log.isDebugEnabled()) log.debug("jwsFile: " + jwsFile);
            String jFile = outdir + File.separator + file.substring(0, file.length() - extension.length() + 1) + "java";
            String cFile = outdir + File.separator + file.substring(0, file.length() - extension.length() + 1) + "class";
//            MyHelperClass log = new MyHelperClass();
            if ((boolean)(Object)log.isDebugEnabled()) {
//                MyHelperClass log = new MyHelperClass();
                log.debug("jFile: " + jFile);
//                MyHelperClass log = new MyHelperClass();
                log.debug("cFile: " + cFile);
//                MyHelperClass log = new MyHelperClass();
                log.debug("outdir: " + outdir);
            }
            File f1 = new File(cFile);
            String clsName = null;
            if (clsName == null) clsName = f2.getName();
            if (clsName != null && clsName.charAt(0) == '/') clsName = clsName.substring(1);
            clsName = clsName.substring(0, clsName.length() - extension.length());
            clsName = clsName.replace('/', '.');
//            MyHelperClass log = new MyHelperClass();
            if ((boolean)(Object)log.isDebugEnabled()) log.debug("ClsName: " + clsName);
            if (!f1.exists() || f2.lastModified() > f1.lastModified()) {
                MyHelperClass Messages = new MyHelperClass();
                log.debug((String)(Object)Messages.getMessage("compiling00", jwsFile));
//                MyHelperClass Messages = new MyHelperClass();
                log.debug((String)(Object)Messages.getMessage("copy00", jwsFile, jFile));
                FileReader fr = new FileReader(jwsFile);
                FileWriter fw = new FileWriter(jFile);
                char[] buf = new char[4096];
                int rc;
                while ((rc = fr.read(buf, 0, 4095)) >= 0) fw.write(buf, 0, rc);
                fw.close();
                fr.close();
//                MyHelperClass log = new MyHelperClass();
                log.debug("javac " + jFile);
                MyHelperClass CompilerFactory = new MyHelperClass();
                Compiler compiler =(Compiler)(Object) CompilerFactory.getCompiler();
                MyHelperClass ClasspathUtils = new MyHelperClass();
                compiler.setClasspath(ClasspathUtils.getDefaultClasspath(msgContext));
                compiler.setDestination(outdir);
                compiler.addFile(jFile);
                boolean result =(boolean)(Object) compiler.compile();
                (new File(jFile)).delete();
                if (!result) {
                    (new File(cFile)).delete();
                    MyHelperClass XMLUtils = new MyHelperClass();
                    Document doc =(Document)(Object) XMLUtils.newDocument();
                    Element root =(Element)(Object) doc.createElementNS("", "Errors");
                    StringBuffer message = new StringBuffer("Error compiling ");
                    message.append(jFile);
                    message.append(":\n");
                    List errors =(List)(Object) compiler.getErrors();
                    int count = errors.size();
                    for (int i = 0; i < count; i++) {
                        CompilerError error = (CompilerError) errors.get(i);
                        if (i > 0) message.append("\n");
                        message.append("Line ");
                        message.append(error.getStartLine());
                        message.append(", column ");
                        message.append(error.getStartColumn());
                        message.append(": ");
                        message.append(error.getMessage());
                    }
                    root.appendChild(doc.createTextNode(message.toString()));
//                    MyHelperClass Messages = new MyHelperClass();
                    throw(Throwable)(Object) new AxisFault("Server.compileError", Messages.getMessage("badCompile00", jFile), null, new Element[] { root });
                }
                MyHelperClass ClassUtils = new MyHelperClass();
                ClassUtils.removeClassLoader(clsName);
                MyHelperClass soapServices = new MyHelperClass();
                soapServices.remove(clsName);
            }
            MyHelperClass ClassUtils = new MyHelperClass();
            ClassLoader cl =(ClassLoader)(Object) ClassUtils.getClassLoader(clsName);
            if (cl == null) {
                cl =(ClassLoader)(Object) new JWSClassLoader(clsName, msgContext.getClassLoader(), cFile);
            }
            msgContext.setClassLoader(cl);
            MyHelperClass soapServices = new MyHelperClass();
            SOAPService rpc = (SOAPService)(SOAPService)(Object) soapServices.get(clsName);
            if (rpc == null) {
                rpc = new SOAPService(new RPCProvider());
                rpc.setName(clsName);
                MyHelperClass RPCProvider = new MyHelperClass();
                rpc.setOption(RPCProvider.OPTION_CLASSNAME, clsName);
                rpc.setEngine(msgContext.getAxisEngine());
//                MyHelperClass RPCProvider = new MyHelperClass();
                String allowed = (String)(String)(Object) getOption(RPCProvider.OPTION_ALLOWEDMETHODS);
                if (allowed == null) allowed = "*";
//                MyHelperClass RPCProvider = new MyHelperClass();
                rpc.setOption(RPCProvider.OPTION_ALLOWEDMETHODS, allowed);
//                MyHelperClass RPCProvider = new MyHelperClass();
                String scope = (String)(String)(Object) getOption(RPCProvider.OPTION_SCOPE);
                if (scope == null) scope =(String)(Object) DEFAULT.getName();
//                MyHelperClass RPCProvider = new MyHelperClass();
                rpc.setOption(RPCProvider.OPTION_SCOPE, scope);
                rpc.getInitializedServiceDesc(msgContext);
//                MyHelperClass soapServices = new MyHelperClass();
                soapServices.put(clsName, rpc);
            }
            rpc.setEngine(msgContext.getAxisEngine());
            rpc.init();
            msgContext.setService(rpc);
        }
        MyHelperClass log = new MyHelperClass();
        if ((boolean)(Object)log.isDebugEnabled()) {
//            MyHelperClass log = new MyHelperClass();
            log.debug("Exit: JWSHandler::invoke");
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass MC_REALPATH;
	public MyHelperClass MC_RELATIVE_PATH;
	public MyHelperClass OPTION_CLASSNAME;
	public MyHelperClass OPTION_ALLOWEDMETHODS;
	public MyHelperClass MC_JWS_CLASSDIR;
	public MyHelperClass OPTION_SCOPE;
public MyHelperClass getMessage(String o0, String o1){ return null; }
	public MyHelperClass removeClassLoader(String o0){ return null; }
	public MyHelperClass newDocument(){ return null; }
	public MyHelperClass get(String o0){ return null; }
	public MyHelperClass getCompiler(){ return null; }
	public MyHelperClass remove(String o0){ return null; }
	public MyHelperClass getName(){ return null; }
	public MyHelperClass put(String o0, SOAPService o1){ return null; }
	public MyHelperClass debug(String o0){ return null; }
	public MyHelperClass isDebugEnabled(){ return null; }
	public MyHelperClass getClassLoader(String o0){ return null; }
	public MyHelperClass getDefaultClasspath(MessageContext o0){ return null; }
	public MyHelperClass getMessage(String o0, String o1, String o2){ return null; }}

class MessageContext {

public MyHelperClass setService(SOAPService o0){ return null; }
	public MyHelperClass getStrProp(MyHelperClass o0){ return null; }
	public MyHelperClass getClassLoader(){ return null; }
	public MyHelperClass setClassLoader(ClassLoader o0){ return null; }
	public MyHelperClass getAxisEngine(){ return null; }}

class Compiler {

public MyHelperClass addFile(String o0){ return null; }
	public MyHelperClass setDestination(String o0){ return null; }
	public MyHelperClass getErrors(){ return null; }
	public MyHelperClass setClasspath(MyHelperClass o0){ return null; }
	public MyHelperClass compile(){ return null; }}

class Document {

public MyHelperClass createElementNS(String o0, String o1){ return null; }
	public MyHelperClass createTextNode(String o0){ return null; }}

class Element {

public MyHelperClass appendChild(MyHelperClass o0){ return null; }}

class CompilerError {

public MyHelperClass getStartColumn(){ return null; }
	public MyHelperClass getMessage(){ return null; }
	public MyHelperClass getStartLine(){ return null; }}

class AxisFault {

AxisFault(String o0, MyHelperClass o1, Object o2, Element[] o3){}
	AxisFault(){}}

class JWSClassLoader {

JWSClassLoader(String o0, MyHelperClass o1, String o2){}
	JWSClassLoader(){}}

class SOAPService {

SOAPService(){}
	SOAPService(RPCProvider o0){}
	public MyHelperClass setName(String o0){ return null; }
	public MyHelperClass setOption(MyHelperClass o0, String o1){ return null; }
	public MyHelperClass getInitializedServiceDesc(MessageContext o0){ return null; }
	public MyHelperClass init(){ return null; }
	public MyHelperClass setEngine(MyHelperClass o0){ return null; }}

class RPCProvider {

}

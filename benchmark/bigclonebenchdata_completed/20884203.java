import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c20884203 {
public static MyHelperClass getCliProc(AppContext o0){ return null; }
	public static MyHelperClass listen(AppContext o0, ServerSocket o1){ return null; }
public static MyHelperClass Util;
	public static MyHelperClass AppContext;
	public static MyHelperClass Context;
	public static MyHelperClass SchemeThread;
	public static MyHelperClass parseOpts(String[] o0){ return null; }
//	public MyHelperClass getCliProc(AppContext o0){ return null; }
	public static MyHelperClass printUsage(){ return null; }
//	public MyHelperClass listen(AppContext o0, ServerSocket o1){ return null; }
//public MyHelperClass Context;
//	public MyHelperClass SchemeThread;
//	public MyHelperClass Util;
//	public MyHelperClass AppContext;
//	public MyHelperClass parseOpts(String[] o0){ return null; }
//	public MyHelperClass printUsage(){ return null; }

    public static void main(String[] argv) throws Throwable, Exception {
        Map args =(Map)(Object) parseOpts(argv);
        if (args.get("help") != null) {
            printUsage();
            System.exit(0);
        } else if (args.get("version") != null) {
            System.out.println("SISC - The Second Interpreter of Scheme Code - " + Util.VERSION);
            System.exit(0);
        }
        Properties props = new Properties();
        String configFile = (String) args.get("properties");
        if (configFile != null) {
            try {
                URL url =(URL)(Object) Util.url(configFile);
                URLConnection conn = url.openConnection();
                conn.setDoInput(true);
                conn.setDoOutput(false);
                props.load(conn.getInputStream());
            } catch (MalformedURLException e) {
                System.err.println("WARNING: " + e.getMessage());
            } catch (IOException e) {
                System.err.println("WARNING: " + e.getMessage());
            }
        }
        AppContext ctx = new AppContext(props);
        Context.setDefaultAppContext(ctx);
        URL heap =(URL)(Object) AppContext.findHeap(Util.makeURL((String) args.get("heap")));
        if (heap == null) {
            System.err.println(Util.liMessage(Util.SISCB, "heapnotfound"));
            return;
        }
        if (!(Boolean)(Object)ctx.addHeap(AppContext.openHeap(heap))) return;
        Interpreter r =(Interpreter)(Object) Context.enter(ctx);
        boolean filesLoadedSuccessfully =(boolean)(Object) r.loadSourceFiles((String[]) ((Vector) args.get("files")).toArray(new String[0]));
        boolean noRepl = args.get("no-repl") != null;
        boolean call = args.get("call-with-args") != null;
        int returnCode = 0;
        String expr = (String) args.get("eval");
        if (expr != null) {
            Value v =(Value)(Object) Util.VOID;
            try {
                v =(Value)(Object) r.eval(expr);
                if (!call) System.out.println(v);
            } catch (SchemeException se) {
                se.printStackTrace();
                returnCode = 1;
            }
        }
        String func = (String) args.get("call-with-args");
        if (func != null) {
            Procedure fun = null;
            try {
                fun =(Procedure)(Object) Util.proc(r.eval(func));
            } catch (SchemeException se) {
                se.printStackTrace();
                returnCode = 1;
            }
            if (fun != null) {
                Vector av = (Vector) args.get("argv");
                Value[] sargs = new Value[(av == null ? 0 : av.size())];
                for (int i = 0; i < sargs.length; i++) sargs[i] =(Value)(Object) new SchemeString((String) av.elementAt(i));
                Value v =(Value)(Object) Util.VOID;
                try {
                    v =(Value)(Object) r.eval(fun, sargs);
                    if (noRepl) {
                        if ((Quantity)(Object)v instanceof Quantity) returnCode =(int)(Object) ((Quantity)(Quantity)(Object) v).indexValue(); else if (!((SchemeVoid)(Object)v instanceof SchemeVoid)) {
                            System.out.println(v);
                        }
                    }
                } catch (SchemeException se) {
                    se.printStackTrace();
                    returnCode = 1;
                }
            }
        }
        DynamicEnvironment dynenv =(DynamicEnvironment)(Object) r.dynenv;
        Context.exit();
        if (!noRepl) {
            String listen = (String) args.get("listen");
            if (listen != null) {
                int cidx = listen.indexOf(':');
                ServerSocket ssocket = cidx == -1 ? new ServerSocket(Integer.parseInt(listen), 50) : new ServerSocket(Integer.parseInt(listen.substring(cidx + 1)), 50, InetAddress.getByName(listen.substring(0, cidx)));
                System.out.println("Listening on " + ssocket.getInetAddress().toString() + ":" + ssocket.getLocalPort());
                System.out.flush();
                listen(ctx, ssocket);
            } else {
                REPL repl = new REPL(dynenv, getCliProc(ctx));
                repl.go();
                repl.primordialThread.thread.join();
                switch((int)(Object)repl.primordialThread.state) {
                    case(int)(Object) SchemeThread.FINISHED:
                        if ((Quantity)(Object)repl.primordialThread.rv instanceof Quantity) {
                            returnCode =(int)(Object) ((Quantity)(Quantity)(Object) repl.primordialThread.rv).intValue();
                        }
                        break;
                    case(int)(Object) SchemeThread.FINISHED_ABNORMALLY:
                        returnCode = 1;
                        break;
                }
            }
        } else if (returnCode == 0 && !filesLoadedSuccessfully) {
            returnCode = 1;
        }
        System.exit(returnCode);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass thread;
	public MyHelperClass rv;
	public MyHelperClass state;
	public MyHelperClass FINISHED_ABNORMALLY;
	public MyHelperClass VERSION;
	public MyHelperClass VOID;
	public MyHelperClass FINISHED;
	public MyHelperClass SISCB;
public MyHelperClass url(String o0){ return null; }
	public MyHelperClass openHeap(URL o0){ return null; }
	public MyHelperClass findHeap(MyHelperClass o0){ return null; }
	public MyHelperClass proc(MyHelperClass o0){ return null; }
	public MyHelperClass join(){ return null; }
	public MyHelperClass setDefaultAppContext(AppContext o0){ return null; }
	public MyHelperClass liMessage(MyHelperClass o0, String o1){ return null; }
	public MyHelperClass makeURL(String o0){ return null; }
	public MyHelperClass exit(){ return null; }
	public MyHelperClass enter(AppContext o0){ return null; }}

class AppContext {

AppContext(Properties o0){}
	AppContext(){}
	public MyHelperClass addHeap(MyHelperClass o0){ return null; }}

class Interpreter {
public MyHelperClass dynenv;
public MyHelperClass eval(String o0){ return null; }
	public MyHelperClass loadSourceFiles(String[] o0){ return null; }
	public MyHelperClass eval(Procedure o0, Value[] o1){ return null; }}

class Value {

}

class SchemeException extends Exception{
	public SchemeException(String errorMessage) { super(errorMessage); }
}

class Procedure {

}

class SchemeString {

SchemeString(String o0){}
	SchemeString(){}}

class Quantity {

public MyHelperClass intValue(){ return null; }
	public MyHelperClass indexValue(){ return null; }}

class SchemeVoid {

}

class DynamicEnvironment {

}

class REPL {
public MyHelperClass primordialThread;
REPL(){}
	REPL(DynamicEnvironment o0, MyHelperClass o1){}
	public MyHelperClass go(){ return null; }}

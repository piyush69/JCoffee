


class c16360226 {
public static MyHelperClass IOUtils;
	public static MyHelperClass modifyDatastreamControlGroup(String o0, String o1, String o2, String o3, String o4, String o5, boolean o6, boolean o7, boolean o8){ return null; }
	public static MyHelperClass getArgBoolean(String[] o0, int o1, boolean o2){ return null; }
	public static MyHelperClass reloadPolicies(String o0, String o1, String o2){ return null; }
//public MyHelperClass IOUtils;
//	public MyHelperClass reloadPolicies(String o0, String o1, String o2){ return null; }
//	public MyHelperClass modifyDatastreamControlGroup(String o0, String o1, String o2, String o3, String o4, String o5, boolean o6, boolean o7, boolean o8){ return null; }
//	public MyHelperClass getArgBoolean(String[] o0, int o1, boolean o2){ return null; }

    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Parameters:  method arg1 arg2 arg3 etc");
            System.out.println("");
            System.out.println("Methods:");
            System.out.println("    reloadpolicies");
            System.out.println("    migratedatastreamcontrolgroup");
            System.exit(0);
        }
        String method = args[0].toLowerCase();
        if (method.equals("reloadpolicies")) {
            if (args.length == 4) {
                try {
                    reloadPolicies(args[1], args[2], args[3]);
                    System.out.println("SUCCESS: Policies have been reloaded");
                    System.exit(0);
                } catch (Throwable th) {
                    th.printStackTrace();
                    System.err.println("ERROR: Reloading policies failed; see above");
                    System.exit(1);
                }
            } else {
                System.err.println("ERROR: Three arguments required: " + "http|https username password");
                System.exit(1);
            }
        } else if (method.equals("migratedatastreamcontrolgroup")) {
            if (args.length > 10) {
                System.err.println("ERROR: too many arguments provided");
                System.exit(1);
            }
            if (args.length < 7) {
                System.err.println("ERROR: insufficient arguments provided.  Arguments are: ");
                System.err.println("    protocol [http|https]");
                System.err.println("    user");
                System.err.println("    password");
                System.err.println("    pid - either");
                System.err.println("        a single pid, eg demo:object");
                System.err.println("        list of pids separated by commas, eg demo:object1,demo:object2");
                System.err.println("        name of file containing pids, eg file:///path/to/file");
                System.err.println("    dsid - either");
                System.err.println("        a single datastream id, eg DC");
                System.err.println("        list of ids separated by commas, eg DC,RELS-EXT");
                System.err.println("    controlGroup - target control group (note only M is implemented)");
                System.err.println("    addXMLHeader - add an XML header to the datastream [true|false, default false]");
                System.err.println("    reformat - reformat the XML [true|false, default false]");
                System.err.println("    setMIMETypeCharset - add charset=UTF-8 to the MIMEType [true|false, default false]");
                System.exit(1);
            }
            try {
                boolean addXMLHeader =(boolean)(Object) getArgBoolean(args, 7, false);
                boolean reformat =(boolean)(Object) getArgBoolean(args, 8, false);
                boolean setMIMETypeCharset =(boolean)(Object) getArgBoolean(args, 9, false);
                ;
                InputStream is =(InputStream)(Object) modifyDatastreamControlGroup(args[1], args[2], args[3], args[4], args[5], args[6], addXMLHeader, reformat, setMIMETypeCharset);
                IOUtils.copy(is,(PrintStream)(Object) System.out);
                is.close();
                System.out.println("SUCCESS: Datastreams modified");
                System.exit(0);
            } catch (Throwable th) {
                th.printStackTrace();
                System.err.println("ERROR: migrating datastream control group failed; see above");
                System.exit(1);
            }
        } else {
            System.err.println("ERROR: unrecognised method " + method);
            System.exit(1);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass copy(InputStream o0, PrintStream o1){ return null; }}

class InputStream {

public MyHelperClass close(){ return null; }}

class PrintStream {

}

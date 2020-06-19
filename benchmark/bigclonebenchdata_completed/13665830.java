import java.io.*;
import java.lang.ArithmeticException;
import java.lang.*;
import java.util.*;



class c13665830 {
public static MyHelperClass MetadataProfile;
//public MyHelperClass MetadataProfile;

    public static void main(String[] args) {
        Usage u =(Usage)(Object) new ccngetmeta();
        for (int i = 0; i < args.length - 3; i++) {
            MyHelperClass CommonArguments = new MyHelperClass();
            if (!(Boolean)(Object)CommonArguments.parseArguments(args, i, u)) {
                u.usage();
                System.exit(1);
            }
            MyHelperClass CommonParameters = new MyHelperClass();
            if ((int)(Object)CommonParameters.startArg > i + 1) i =(int)(Object) CommonParameters.startArg - 1;
        }
        MyHelperClass CommonParameters = new MyHelperClass();
        if (args.length !=(int)(Object) CommonParameters.startArg + 3) {
            u.usage();
            System.exit(1);
        }
        try {
            int readsize = 1024;
            MyHelperClass CCNHandle = new MyHelperClass();
            CCNHandle handle =(CCNHandle)(Object) CCNHandle.open();
//            MyHelperClass CommonParameters = new MyHelperClass();
            String metaArg = args[(int)(Object)CommonParameters.startArg + 1];
            if (!metaArg.startsWith("/")) metaArg = "/" + metaArg;
//            MyHelperClass CommonParameters = new MyHelperClass();
            ContentName fileName =(ContentName)(Object) MetadataProfile.getLatestVersion(ContentName.fromURI(args[(int)(Object)CommonParameters.startArg]), ContentName.fromNative(metaArg), CommonParameters.timeout, handle);
            if (fileName == null) {
//                MyHelperClass CommonParameters = new MyHelperClass();
                System.out.println("File " + args[(int)(Object)CommonParameters.startArg] + " does not exist");
                System.exit(1);
            }
            MyHelperClass VersioningProfile = new MyHelperClass();
            if ((boolean)(Object)VersioningProfile.hasTerminalVersion(fileName)) {
            } else {
                System.out.println("File " + fileName + " does not exist...  exiting");
                System.exit(1);
            }
//            MyHelperClass CommonParameters = new MyHelperClass();
            File theFile = new File(args[(int)(Object)CommonParameters.startArg + 2]);
            if (theFile.exists()) {
//                MyHelperClass CommonParameters = new MyHelperClass();
                System.out.println("Overwriting file: " + args[(int)(Object)CommonParameters.startArg + 1]);
            }
            FileOutputStream output = new FileOutputStream(theFile);
            long starttime = System.currentTimeMillis();
            CCNInputStream input;
//            MyHelperClass CommonParameters = new MyHelperClass();
            if ((boolean)(Object)CommonParameters.unversioned) input = new CCNInputStream(fileName, handle); else input =(CCNInputStream)(Object) new CCNFileInputStream(fileName, handle);
//            MyHelperClass CommonParameters = new MyHelperClass();
            if (CommonParameters.timeout != null) {
//                MyHelperClass CommonParameters = new MyHelperClass();
                input.setTimeout(CommonParameters.timeout);
            }
            byte[] buffer = new byte[readsize];
            int readcount = 0;
            long readtotal = 0;
            while ((readcount =(int)(Object) input.read(buffer)) != -1) {
                readtotal += readcount;
                output.write(buffer, 0, readcount);
                output.flush();
            }
//            MyHelperClass CommonParameters = new MyHelperClass();
            if ((boolean)(Object)CommonParameters.verbose) System.out.println("ccngetfile took: " + (System.currentTimeMillis() - starttime) + "ms");
//            MyHelperClass CommonParameters = new MyHelperClass();
            System.out.println("Retrieved content " + args[(int)(Object)CommonParameters.startArg + 1] + " got " + readtotal + " bytes.");
            System.exit(0);
        } catch (UncheckedIOException e) {
            System.out.println("Configuration exception in ccngetfile: " + e.getMessage());
            e.printStackTrace();
        } catch (ArithmeticException e) {
//            MyHelperClass CommonParameters = new MyHelperClass();
            System.out.println("Malformed name: " + args[(int)(Object)CommonParameters.startArg] + " " + e.getMessage());
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("Cannot write file or read content. " + e.getMessage());
            e.printStackTrace();
        }
        System.exit(1);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass verbose;
	public MyHelperClass unversioned;
	public MyHelperClass timeout;
	public MyHelperClass startArg;
public MyHelperClass hasTerminalVersion(ContentName o0){ return null; }
	public MyHelperClass open(){ return null; }
	public MyHelperClass parseArguments(String[] o0, int o1, Usage o2){ return null; }
	public MyHelperClass getLatestVersion(MyHelperClass o0, MyHelperClass o1, MyHelperClass o2, CCNHandle o3){ return null; }}

class Usage {

public MyHelperClass usage(){ return null; }}

class ccngetmeta {

}

class CCNHandle {

}

class ContentName {

public static MyHelperClass fromURI(String o0){ return null; }
	public static MyHelperClass fromNative(String o0){ return null; }}

class CCNInputStream {

CCNInputStream(ContentName o0, CCNHandle o1){}
	CCNInputStream(){}
	public MyHelperClass read(byte[] o0){ return null; }
	public MyHelperClass setTimeout(MyHelperClass o0){ return null; }}

class ConfigurationException extends Exception{
	public ConfigurationException(String errorMessage) { super(errorMessage); }
}

class MalformedContentNameStringException extends Exception{
	public MalformedContentNameStringException(String errorMessage) { super(errorMessage); }
}

class CCNFileInputStream {

CCNFileInputStream(ContentName o0, CCNHandle o1){}
	CCNFileInputStream(){}}

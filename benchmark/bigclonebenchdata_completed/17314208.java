import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c17314208 {
public MyHelperClass XAwareConfig;
	public MyHelperClass validateFile(MyHelperClass o0){ return null; }

    public static void main(final String[] args)  throws Throwable {
        if ((args.length < 1)) {
            String sUsage = "1. _BIZVIEW=<filename>or<XAware Bizview name> \r\n";
            sUsage += "2. _OUTPUT=DISPLAY|NONE|FILE \r\n";
            sUsage += "3. _GEN_OUT=<output filename> \r\n";
            sUsage += "4. _POST or _XADATA=<xml data file> \r\n";
            sUsage += "5. _UID<=user id> \r\n";
            sUsage += "6. _PWD=<password> \r\n";
            sUsage += "7. _URL=<appserver url> \r\n";
            sUsage += "8. <param>=<value> \r\n";
            System.out.println("Usage: java XABizDoc. Other optional parameters include\r\n" + sUsage);
            return;
        }
        final String sHomeDir = System.getProperty("xaware.home");
        if (sHomeDir == null) {
            System.out.println("System property xaware.home not set. Please set xaware.home to XAware installation root directory");
            return;
        }
        if (new File(sHomeDir).isDirectory() == false) {
            System.out.println(sHomeDir + " is not a valid directory. Please check value of xaware.home system property");
            return;
        }
        MyHelperClass version = new MyHelperClass();
        System.out.println("Starting XAServletBizDoc Version:" + version);
        String sUid = NULL; //new String();
        sUid = "";
        String sPwd = NULL; //new String();
        sPwd = "";
        String filename = args[0];
        MyHelperClass BIZVIEW = new MyHelperClass();
        if (args[0].startsWith((String)(Object)BIZVIEW)) {
//            MyHelperClass BIZVIEW = new MyHelperClass();
            filename = args[0].substring(BIZVIEW.length() + 1);
        }
        MyHelperClass XQUERY = new MyHelperClass();
        if (args[0].startsWith((String)(Object)XQUERY)) {
            MyHelperClass sXQuery = new MyHelperClass();
            sXQuery = args[0].substring(XQUERY.length() + 1);
        }
        for (int i = 1; i < args.length; i++) {
            MyHelperClass SAXDRIVER = new MyHelperClass();
            if (args[i].startsWith((String)(Object)SAXDRIVER)) {
                MyHelperClass saxDriverClass = new MyHelperClass();
                saxDriverClass = args[i].substring(SAXDRIVER.length() + 1);
                continue;
            }
            MyHelperClass OUTPUT = new MyHelperClass();
            if (args[i].startsWith((String)(Object)OUTPUT)) {
                MyHelperClass sOutput = new MyHelperClass();
                sOutput = args[i].substring(OUTPUT.length() + 1);
                continue;
            }
            MyHelperClass FACTORY = new MyHelperClass();
            if (args[i].startsWith((String)(Object)FACTORY)) {
                MyHelperClass sEjbJndiFactory = new MyHelperClass();
                sEjbJndiFactory = args[i].substring(FACTORY.length() + 1);
                continue;
            }
            MyHelperClass URL = new MyHelperClass();
            if (args[i].startsWith((String)(Object)URL)) {
                MyHelperClass sServletUrl = new MyHelperClass();
                sServletUrl = args[i].substring(URL.length() + 1);
                continue;
            }
            MyHelperClass COMPRESS = new MyHelperClass();
            if (args[i].startsWith((String)(Object)COMPRESS)) {
//                MyHelperClass COMPRESS = new MyHelperClass();
                final String sCompressString = args[i].substring(COMPRESS.length() + 1);
                if (sCompressString.compareTo("YES") == 0) {
                    boolean bCompress = NULL; //new boolean();
                    bCompress = true;
                }
                continue;
            }
            MyHelperClass GEN_OUT = new MyHelperClass();
            if (args[i].startsWith((String)(Object)GEN_OUT)) {
                MyHelperClass sGenOut = new MyHelperClass();
                sGenOut = args[i].substring(GEN_OUT.length() + 1);
                continue;
            }
            MyHelperClass UID = new MyHelperClass();
            if (args[i].startsWith((String)(Object)UID)) {
//                MyHelperClass sUid = new MyHelperClass();
                sUid = args[i].substring(UID.length() + 1);
                continue;
            }
            MyHelperClass PWD = new MyHelperClass();
            if (args[i].startsWith((String)(Object)PWD)) {
//                MyHelperClass sPwd = new MyHelperClass();
                sPwd = args[i].substring(PWD.length() + 1);
                continue;
            }
            MyHelperClass POST = new MyHelperClass();
            if (args[i].startsWith((String)(Object)POST)) {
                MyHelperClass sXmlDataFile = new MyHelperClass();
                sXmlDataFile = args[i].substring(POST.length() + 1);
//                MyHelperClass sXmlDataFile = new MyHelperClass();
                if (validateFile(sXmlDataFile) == false) {
                    System.err.println("Invalid POST value");
//                    MyHelperClass sXmlDataFile = new MyHelperClass();
                    sXmlDataFile = null;
                }
                continue;
            }
            MyHelperClass XADATA = new MyHelperClass();
            if (args[i].startsWith((String)(Object)XADATA)) {
                MyHelperClass sXmlDataFile = new MyHelperClass();
                sXmlDataFile = args[i].substring(XADATA.length() + 1);
//                MyHelperClass sXmlDataFile = new MyHelperClass();
                if (validateFile(sXmlDataFile) == false) {
                    System.err.println("Invalid XADATA value");
//                    MyHelperClass sXmlDataFile = new MyHelperClass();
                    sXmlDataFile = null;
                }
                continue;
            }
            MyHelperClass CONFIG = new MyHelperClass();
            if (args[i].startsWith((String)(Object)CONFIG)) {
                MyHelperClass sConfigFile = new MyHelperClass();
                sConfigFile = args[i].substring(CONFIG.length() + 1);
//                MyHelperClass sConfigFile = new MyHelperClass();
                if (validateFile(sConfigFile) == true) {
//                    MyHelperClass sConfigFile = new MyHelperClass();
                    XAwareConfig.SetConfigFile(sConfigFile);
                } else {
                    System.err.println("Invalid CONFIG value");
                }
                continue;
            }
        }
        String responseXML = "";
        try {
            String sServletUrl = NULL; //new String();
            sServletUrl += "?_BIZVIEW=" + filename;
            for (int i = 1; i < args.length; i++) {
                if (args[i].charAt(0) != '_') {
                    String arg = URLEncoder.encode(args[i]);
                    final int index = arg.indexOf("%3D");
                    if (index >= 0) {
                        final String tmp = arg.substring(0, index);
                        arg = tmp + "=" + arg.substring(index + 3);
                    }
//                    MyHelperClass sServletUrl = new MyHelperClass();
                    sServletUrl += "&"(MyHelperClass)(Object) + arg;
                }
            }
//            MyHelperClass sServletUrl = new MyHelperClass();
            final URL url = new URL((String)(Object)sServletUrl);
            final HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setDoInput(true);
            MyHelperClass sXmlDataFile = new MyHelperClass();
            if (sXmlDataFile != null && sXmlDataFile.length() > 0) {
                connection.setRequestMethod("POST");
            } else {
                connection.setRequestMethod("GET");
            }
            String sInputData = "";
//            MyHelperClass sXmlDataFile = new MyHelperClass();
            if (sXmlDataFile != null && sXmlDataFile.length() > 0) {
                SAXBuilder builder = null;
                MyHelperClass saxDriverClass = new MyHelperClass();
                if (saxDriverClass.length() > 0) {
//                    MyHelperClass saxDriverClass = new MyHelperClass();
                    builder = new SAXBuilder(saxDriverClass);
                } else {
                    builder = new SAXBuilder();
                }
//                MyHelperClass sXmlDataFile = new MyHelperClass();
                final Document mDoc = builder.build(new File((String)(Object)sXmlDataFile));
                final StringWriter x = new StringWriter();
                final XMLOutputter outputter = new XMLOutputter();
                outputter.output(mDoc, x);
                sInputData = x.toString();
            }
            if (sInputData.length() > 0) {
                if (connection.getDoOutput() == false) {
                    connection.setDoOutput(true);
                }
                final OutputStream outStream = connection.getOutputStream();
                outStream.write(sInputData.getBytes());
                outStream.close();
            }
            final InputStream instream = connection.getInputStream();
            final BufferedReader in = new BufferedReader(new InputStreamReader(instream));
            int inchar;
            final StringBuffer buf = new StringBuffer(1000);
            while ((inchar = in.read()) != -1) {
                buf.append((char) inchar);
            }
            responseXML = buf.toString();
        } catch (final IOException e) {
            System.out.println("IO exception:" + e.getMessage());
        } catch (final Exception e) {
            System.out.println("Unknown exception:" + e.getMessage());
        }
        MyHelperClass sOutput = new MyHelperClass();
        if ((sOutput.compareTo("STREAM") == 0) || (sOutput.compareTo("NONE") == 0)) {
            return;
        }
        MyHelperClass sGenOut = new MyHelperClass();
        if (sGenOut != null && sGenOut.length() > 0) {
            try {
//                MyHelperClass sGenOut = new MyHelperClass();
                final FileWriter fp = new FileWriter((String)(Object)sGenOut, false);
                fp.write(responseXML);
                fp.close();
            } catch (final IOException e) {
                System.out.println("IO exception saving to file:" + e.getMessage());
            }
        }
//        MyHelperClass sOutput = new MyHelperClass();
        if (sOutput != null && sOutput.compareTo("DISPLAY") == 0) {
            System.out.println(responseXML);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass length(){ return null; }
	public MyHelperClass compareTo(String o0){ return null; }}

class SAXBuilder {

SAXBuilder(MyHelperClass o0){}
	SAXBuilder(){}}

class Document {

}

class XMLOutputter {

public MyHelperClass output(Document o0, StringWriter o1){ return null; }}

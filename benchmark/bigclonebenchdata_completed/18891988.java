import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c18891988 {

    public static String getFile(String serviceName, String wsdlLocation, String endpoint) throws Throwable, AxisFault(Throwable)(Object) {
        MyHelperClass mLog = new MyHelperClass();
        mLog.debug("Downloading WSDL file from: " + wsdlLocation);
//        MyHelperClass mLog = new MyHelperClass();
        mLog.debug("Received endpoint: " + endpoint);
        String fileLocation = null;
        try {
            String tempDir = System.getProperty("java.io.tmpdir");
            URL url = new URL(wsdlLocation);
            String WSDLFile = tempDir + File.separator + serviceName + ".wsdl";
            String tmpWSDLFile = WSDLFile + ".tmp";
            File inputFile = new File(WSDLFile);
            File tmpFile = new File(tmpWSDLFile);
            if (!inputFile.exists() || inputFile.length() == 0) {
//                MyHelperClass mLog = new MyHelperClass();
                mLog.debug("Downloading the WSDL");
                inputFile.createNewFile();
                InputStream in = url.openStream();
                FileOutputStream out = new FileOutputStream(inputFile);
                URLConnection con = url.openConnection();
                int fileLength = con.getContentLength();
                MyHelperClass Channels = new MyHelperClass();
                ReadableByteChannel channelIn = Channels.newChannel(in);
                FileChannel channelOut =(FileChannel)(Object) out.getChannel();
                channelOut.transferFrom(channelIn, 0, fileLength);
                channelIn.close();
                channelOut.close();
                out.flush();
                out.close();
                in.close();
                MyHelperClass XMLUtils = new MyHelperClass();
                Document tmpDocument = XMLUtils.newDocument(new FileInputStream(inputFile));
                NodeList nl1 = tmpDocument.getElementsByTagName("wsdlsoap:address");
                for (int i = 0; i < nl1.getLength(); i++) {
                    Node node1 = nl1.item(i);
                    if (node1.getNodeName().equals("wsdlsoap:address")) {
                        ((Element)(Element)(Object) node1).setAttribute("location", endpoint);
                    }
                }
                FileOutputStream tmpOut = new FileOutputStream(tmpFile);
//                MyHelperClass XMLUtils = new MyHelperClass();
                XMLUtils.DocumentToStream(tmpDocument, tmpOut);
                tmpOut.flush();
                tmpOut.close();
                boolean retVal = inputFile.delete();
                if (retVal) {
                    retVal = tmpFile.renameTo(new File(WSDLFile));
                }
//                MyHelperClass mLog = new MyHelperClass();
                mLog.debug("Return Value: " + retVal);
            } else {
//                MyHelperClass mLog = new MyHelperClass();
                mLog.debug("The WSDL is already at the ServiceProvider");
            }
            fileLocation = WSDLFile;
        } catch (MalformedURLException mx) {
//            MyHelperClass mLog = new MyHelperClass();
            mLog.error("MalformedURLException: " + mx.getMessage() + ", cause: " + mx.getCause().getMessage());
            throw new AxisFault(mx.getMessage(), mx.getCause());
        } catch (IOException ix) {
//            MyHelperClass mLog = new MyHelperClass();
            mLog.error("IOException: " + ix.getMessage() + ", cause: " + ix.getCause().getMessage());
            throw new AxisFault(ix.getMessage(), ix.getCause());
        } catch (ParserConfigurationException px) {
//            MyHelperClass mLog = new MyHelperClass();
            mLog.error("ParserConfigurationException: " + px.getMessage() + ", cause: " + px.getCause().getMessage());
            throw new AxisFault(px.getMessage(), px.getCause());
        } catch (SAXException sx) {
//            MyHelperClass mLog = new MyHelperClass();
            mLog.error("SAXException: " + sx.getMessage() + ", cause: " + sx.getCause().getMessage());
            throw new AxisFault(sx.getMessage(), sx.getCause());
        }
        return fileLocation;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass newChannel(InputStream o0){ return null; }
	public MyHelperClass DocumentToStream(Document o0, FileOutputStream o1){ return null; }
	public MyHelperClass debug(String o0){ return null; }
	public MyHelperClass error(String o0){ return null; }
	public MyHelperClass newDocument(FileInputStream o0){ return null; }}

class AxisFault {

AxisFault(String o0, Throwable o1){}
	AxisFault(){}}

class ReadableByteChannel {

public MyHelperClass close(){ return null; }}

class FileChannel {

public MyHelperClass transferFrom(ReadableByteChannel o0, int o1, int o2){ return null; }
	public MyHelperClass close(){ return null; }}

class Document {

public MyHelperClass getElementsByTagName(String o0){ return null; }}

class NodeList {

public MyHelperClass item(int o0){ return null; }
	public MyHelperClass getLength(){ return null; }}

class Node {

public MyHelperClass getNodeName(){ return null; }}

class Element {

}

class ParserConfigurationException extends Exception{
	public ParserConfigurationException(String errorMessage) { super(errorMessage); }
}

class SAXException extends Exception{
	public SAXException(String errorMessage) { super(errorMessage); }
}

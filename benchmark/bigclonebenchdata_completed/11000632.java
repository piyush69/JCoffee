import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c11000632 {

    public final void provisionGSLAM()  throws Throwable {
        try {
            UUID[] slaUUID = new UUID[] { new UUID((byte[])(Object)"AG-1") };
            MyHelperClass sslamContext = new MyHelperClass();
            SLA[] slas =(SLA[])(Object) sslamContext.getSLARegistry().getIQuery().getSLA(slaUUID);
            for (SLA s : slas) {
                Party[] parties =(Party[])(Object) s.getParties();
                System.out.println("SLA Info :::" + s.getUuid().toString());
                for (Party p : parties) {
                    System.out.println("Printing gslam_epr value for Party" + p.getId() + "--" + p.getAgreementRole());
                    System.out.println(parties[0].getPropertyValue(new STND("gslam_epr")));
                }
            }
            MyHelperClass SLAState = new MyHelperClass();
            sslamContext.getSLARegistry().getIRegister().register(slas[0], slaUUID, SLAState.OBSERVED);
            String xmlFile2Send = System.getenv("SLASOI_HOME") + System.getProperty("file.separator") + "Integration" + System.getProperty("file.separator") + "soap" + System.getProperty("file.separator") + "provision.xml";
            String soapAction = "";
            URL url;
            MyHelperClass syntaxConverterNegotiationWSURL = new MyHelperClass();
            url = new URL((String)(Object)syntaxConverterNegotiationWSURL);
            URLConnection connection = url.openConnection();
            HttpURLConnection httpConn = (HttpURLConnection) connection;
            FileInputStream fin = new FileInputStream(xmlFile2Send);
            ByteArrayOutputStream bout = new ByteArrayOutputStream();
            MyHelperClass SOAPClient4XG = new MyHelperClass();
            SOAPClient4XG.copy(fin, bout);
            fin.close();
            byte[] b = bout.toByteArray();
            httpConn.setRequestProperty("Content-Length", String.valueOf(b.length));
            httpConn.setRequestProperty("Content-Type", "application/soap+xml; charset=UTF-8");
            httpConn.setRequestProperty("SOAPAction", soapAction);
            httpConn.setRequestMethod("POST");
            httpConn.setDoOutput(true);
            httpConn.setDoInput(true);
            OutputStream out = httpConn.getOutputStream();
            out.write(b);
            out.close();
            InputStreamReader isr = new InputStreamReader(httpConn.getInputStream());
            BufferedReader in = new BufferedReader(isr);
            String inputLine;
            StringBuffer response = new StringBuffer();
            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }
            in.close();
            javax.xml.parsers.DocumentBuilderFactory factory = javax.xml.parsers.DocumentBuilderFactory.newInstance();
            javax.xml.parsers.DocumentBuilder db;
            db = factory.newDocumentBuilder();
            org.xml.sax.InputSource inStream = new org.xml.sax.InputSource();
            inStream.setCharacterStream(new java.io.StringReader(response.toString()));
            System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n" + "####################################################" + "#################################################\n" + "####################################################" + "#################################################\n" + "Component Name: GSLAM\n" + "Interface Name: negotiate/coordinage\n" + "Operation Name: Provision\n" + "Input:Type " + "void" + "\n" + "####################################################" + "#################################################\n" + "####################################################" + "#################################################\n" + "######################################## RESPONSE" + "############################################\n\n");
            System.out.println(response.toString());
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ArithmeticException e) {
            e.printStackTrace();
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        } catch (ArrayStoreException e) {
            e.printStackTrace();
        } catch (ClassCastException e) {
            e.printStackTrace();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass OBSERVED;
public MyHelperClass getSLARegistry(){ return null; }
	public MyHelperClass register(SLA o0, UUID[] o1, MyHelperClass o2){ return null; }
	public MyHelperClass getSLA(UUID[] o0){ return null; }
	public MyHelperClass getIQuery(){ return null; }
	public MyHelperClass getIRegister(){ return null; }
	public MyHelperClass copy(FileInputStream o0, ByteArrayOutputStream o1){ return null; }}

class SLA {

public MyHelperClass getParties(){ return null; }
	public MyHelperClass getUuid(){ return null; }}

class Party {

public MyHelperClass getPropertyValue(STND o0){ return null; }
	public MyHelperClass getAgreementRole(){ return null; }
	public MyHelperClass getId(){ return null; }}

class STND {

STND(String o0){}
	STND(){}}

class ParserConfigurationException extends Exception{
	public ParserConfigurationException(String errorMessage) { super(errorMessage); }
}

class RegistrationFailureException extends Exception{
	public RegistrationFailureException(String errorMessage) { super(errorMessage); }
}

class SLAManagerContextException extends Exception{
	public SLAManagerContextException(String errorMessage) { super(errorMessage); }
}

class InvalidUUIDException extends Exception{
	public InvalidUUIDException(String errorMessage) { super(errorMessage); }
}

class UUID {

UUID(byte[] o0){}
	UUID(){}}

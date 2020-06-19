import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;import java.awt.*;



class c15700440 {

    private void getViolationsReportBySLATIdYearMonth() throws IOException {
        String xmlFile10Send = System.getenv("SLASOI_HOME") + System.getProperty("file.separator") + "Integration" + System.getProperty("file.separator") + "soap" + System.getProperty("file.separator") + "getViolationsReportBySLATIdYearMonth.xml";
        URL url10;
        MyHelperClass bmReportingWSUrl = new MyHelperClass();
        url10 = new URL((String)(Object)bmReportingWSUrl);
        URLConnection connection10 = url10.openConnection();
        HttpURLConnection httpConn10 = (HttpURLConnection) connection10;
        FileInputStream fin10 = new FileInputStream(xmlFile10Send);
        ByteArrayOutputStream bout10 = new ByteArrayOutputStream();
        MyHelperClass SOAPClient4XG = new MyHelperClass();
        SOAPClient4XG.copy(fin10, bout10);
        fin10.close();
        byte[] b10 = bout10.toByteArray();
        httpConn10.setRequestProperty("Content-Length", String.valueOf(b10.length));
        httpConn10.setRequestProperty("Content-Type", "application/soap+xml; charset=UTF-8");
        MyHelperClass soapAction = new MyHelperClass();
        httpConn10.setRequestProperty("SOAPAction",(String)(Object) soapAction);
        httpConn10.setRequestMethod("POST");
        httpConn10.setDoOutput(true);
        httpConn10.setDoInput(true);
        OutputStream out10 = httpConn10.getOutputStream();
        out10.write(b10);
        out10.close();
        InputStreamReader isr10 = new InputStreamReader(httpConn10.getInputStream());
        BufferedReader in10 = new BufferedReader(isr10);
        String inputLine10;
        StringBuffer response10 = new StringBuffer();
        while ((inputLine10 = in10.readLine()) != null) {
            response10.append(inputLine10);
        }
        in10.close();
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n" + "####################################################" + "#################################################\n" + "####################################################" + "#################################################\n" + "Component Name: Business Manager\n" + "Interface Name: getReport\n" + "Operation Name: getViolationsReportBySLATIdYearMonth\n" + "Input" + "ProductOfferID-1\n" + "PartyID-1\n" + "\n" + "####################################################" + "#################################################\n" + "####################################################" + "#################################################\n" + "######################################## RESPONSE" + "############################################\n\n");
        System.out.println("--------------------------------");
        System.out.println("Response\n" + response10.toString());
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass copy(FileInputStream o0, ByteArrayOutputStream o1){ return null; }}

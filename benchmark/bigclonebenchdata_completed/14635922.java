


class c14635922 {
public MyHelperClass hostname;
	public MyHelperClass URLPrefix;
	public MyHelperClass readURLConnection(HttpURLConnection o0){ return null; }
public MyHelperClass Logger;
	public MyHelperClass accessXMLRequest(){ return null; }

    public String contactService(String service, StringBuffer xmlRequest) throws Exception {
        MyHelperClass Logger = new MyHelperClass();
        Logger.debug(UPSConnections.class, "UPS CONNECTIONS ***** Started " + service + " " + new Date().toString() + " *****");
        HttpURLConnection connection;
        URL url;
        String response = "";
        try {
            MyHelperClass protocol = new MyHelperClass();
            Logger.debug(UPSConnections.class, "connect to " + protocol + "://" + hostname + "/" + URLPrefix + "/" + service);
//            MyHelperClass protocol = new MyHelperClass();
            if ((boolean)(Object)protocol.equalsIgnoreCase("https")) {
                java.security.Security.addProvider(new com.sun.net.ssl.internal.ssl.Provider());
                System.getProperties().put("java.protocol.handler.pkgs", "com.sun.net.ssl.internal.www.protocol");
//                MyHelperClass protocol = new MyHelperClass();
                url = new URL(protocol + "://" + hostname + "/" + URLPrefix + "/" + service);
                connection =(HttpURLConnection)(Object) (HttpsURLConnection)(HttpsURLConnection)(Object) url.openConnection();
            } else {
//                MyHelperClass protocol = new MyHelperClass();
                url = new URL(protocol + "://" + hostname + "/" + URLPrefix + "/" + service);
                connection = (HttpURLConnection)(HttpURLConnection)(Object) url.openConnection();
            }
//            MyHelperClass Logger = new MyHelperClass();
            Logger.debug(UPSConnections.class, "Establishing connection with " + url.toString());
            connection.setDoOutput(true);
            connection.setDoInput(true);
            connection.setUseCaches(false);
            OutputStream out =(OutputStream)(Object) connection.getOutputStream();
            StringBuffer request = new StringBuffer();
            request.append(accessXMLRequest());
            request.append(xmlRequest);
            out.write((request.toString()).getBytes());
            Logger.debug(UPSConnections.class, "Transmission sent to " + url.toString() + ":\n" + xmlRequest);
            out.close();
            try {
                response =(String)(Object) readURLConnection(connection);
            } catch (Exception e) {
                Logger.debug(UPSConnections.class, "Error in reading URL Connection" + e.getMessage());
                throw e;
            }
            Logger.debug(UPSConnections.class, "Response = " + response);
        } catch (Exception e1) {
            Logger.info(UPSConnections.class, "Error sending data to server" + e1.toString());
            Logger.debug(UPSConnections.class, "Error sending data to server" + e1.toString());
        } finally {
            Logger.info(UPSConnections.class, "****** Transmission Finished " + service + " " + new Date().toString() + " *********");
            Logger.debug(UPSConnections.class, "****** Transmission Finished " + service + " " + new Date().toString() + " *********");
        }
        return response;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass equalsIgnoreCase(String o0){ return null; }
	public MyHelperClass info(Class<UPSConnections> o0, String o1){ return null; }
	public MyHelperClass debug(Class<UPSConnections> o0, String o1){ return null; }}

class UPSConnections {

}

class Date {

}

class HttpURLConnection {

public MyHelperClass setDoInput(boolean o0){ return null; }
	public MyHelperClass getOutputStream(){ return null; }
	public MyHelperClass setDoOutput(boolean o0){ return null; }
	public MyHelperClass setUseCaches(boolean o0){ return null; }}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class HttpsURLConnection {

}

class OutputStream {

public MyHelperClass close(){ return null; }
	public MyHelperClass write(byte[] o0){ return null; }}

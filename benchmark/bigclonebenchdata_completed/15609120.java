


class c15609120 {
public MyHelperClass JOptionPane;
	public MyHelperClass logger;
	public MyHelperClass getPanel(){ return null; }
	public MyHelperClass readContents(HttpURLConnection o0){ return null; }

    private boolean serverOK(String serverAddress, String serverPort) {
        boolean status = false;
        MyHelperClass MolConvertInNodeModel = new MyHelperClass();
        String serverString = serverAddress + ":" + serverPort + MolConvertInNodeModel.SERVER_WSDL_PATH;
        System.out.println("connecting to " + serverString + "...");
        try {
            java.net.URL url = new java.net.URL(serverString);
            try {
                java.net.HttpURLConnection connection = (java.net.HttpURLConnection) url.openConnection();
                status =(boolean)(Object) readContents((HttpURLConnection)(Object)connection);
                if (status) {
                    JOptionPane.showMessageDialog(this.getPanel(), "Connection to Server is OK");
                }
            } catch (Exception connEx) {
                JOptionPane.showMessageDialog(this.getPanel(), connEx.getMessage());
                logger.error(connEx.getMessage());
            }
        } catch (java.net.MalformedURLException urlEx) {
            JOptionPane.showMessageDialog(this.getPanel(), urlEx.getMessage());
            logger.error(urlEx.getMessage());
        }
        return status;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass SERVER_WSDL_PATH;
public MyHelperClass showMessageDialog(MyHelperClass o0, String o1){ return null; }
	public MyHelperClass error(String o0){ return null; }}

class HttpURLConnection {

}

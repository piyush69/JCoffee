import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c7271200 {

    private void sendToFtp(String outputText)  throws Throwable {
        MyHelperClass PROPERTY_OUTPUT_FTP_USERNAME = new MyHelperClass();
        String uid = this.properties.get(PROPERTY_OUTPUT_FTP_USERNAME);
        MyHelperClass PROPERTY_OUTPUT_FTP_PASSWORD = new MyHelperClass();
        String pwd = this.properties.get(PROPERTY_OUTPUT_FTP_PASSWORD);
        MyHelperClass PROPERTY_OUTPUT_FTP_ADDRESS = new MyHelperClass();
        String address = this.properties.get(PROPERTY_OUTPUT_FTP_ADDRESS);
        int port = 21;
        try {
            MyHelperClass PROPERTY_OUTPUT_FTP_PORT = new MyHelperClass();
            port = Integer.valueOf(this.properties.get(PROPERTY_OUTPUT_FTP_PORT));
        } catch (Exception ex) {
            MyHelperClass Level = new MyHelperClass();
            LOG.log(Level.WARNING, "Could not read FTP port from properties. Using port 21");
        }
        MyHelperClass PROPERTY_OUTPUT_FTP_LOCATION = new MyHelperClass();
        String location = this.properties.get(PROPERTY_OUTPUT_FTP_LOCATION);
        MyHelperClass PROPERTY_OUTPUT_FTP_FILENAME = new MyHelperClass();
        String filename = this.properties.get(PROPERTY_OUTPUT_FTP_FILENAME);
        MyHelperClass Level = new MyHelperClass();
        LOG.log(Level.INFO, "Uploading text output to {0}:{1}/{2}/{3}", new Object[] { address, port, location, filename });
        FTPClient ftpClient = new FTPClient();
        try {
            ftpClient.connect(address, port);
            int reply = ftpClient.getReplyCode();
            MyHelperClass FTPReply = new MyHelperClass();
            if (!FTPReply.isPositiveCompletion(reply)) {
                ftpClient.disconnect();
                MyHelperClass Level = new MyHelperClass();
                LOG.log(Level.SEVERE, "Could not connect to FTP server: {0}", reply);
                return;
            }
            if (!ftpClient.login(uid, pwd)) {
                MyHelperClass Level = new MyHelperClass();
                LOG.log(Level.SEVERE, "Could not login to FTP server ({0}) with given credentials.", address);
                return;
            }
            MyHelperClass FTP = new MyHelperClass();
            ftpClient.setFileType(FTP.BINARY_FILE_TYPE);
            ftpClient.enterLocalPassiveMode();
            if (ftpClient.storeFile(location + "/" + filename, new ByteArrayInputStream(outputText.getBytes()))) {
                MyHelperClass Level = new MyHelperClass();
                LOG.log(Level.INFO, "Transfer complete");
            } else {
                MyHelperClass Level = new MyHelperClass();
                LOG.log(Level.WARNING, "Transfer incomplete");
            }
        } catch (SocketException ex) {
            MyHelperClass Level = new MyHelperClass();
            LOG.log(Level.SEVERE, "Could not transfer file.", ex.getMessage());
            MyHelperClass Level = new MyHelperClass();
            LOG.log(Level.FINE, "", ex);
        } catch (IOException ex) {
            MyHelperClass Level = new MyHelperClass();
            LOG.log(Level.SEVERE, "Could not transfer file.", ex.getMessage());
            MyHelperClass Level = new MyHelperClass();
            LOG.log(Level.FINE, "", ex);
        }
        if (ftpClient.isConnected()) {
            try {
                ftpClient.disconnect();
            } catch (IOException ex) {
                MyHelperClass Level = new MyHelperClass();
                LOG.log(Level.SEVERE, "Could not disconnect from FTP.", ex.getMessage());
                MyHelperClass Level = new MyHelperClass();
                LOG.log(Level.FINE, "", ex);
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class FTPClient {

}

import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;import java.awt.*;



class c9030329 {

    private HttpURLConnection sendData(URL url, String user, String password) throws IOException, IllegalArgumentException {
        String tmpAuthUserName = "";
        if (user != null) {
            tmpAuthUserName = user;
        }
        final String anAuthUserName = tmpAuthUserName;
        String tmpAuthPasswd = "";
        if (password != null) {
            tmpAuthPasswd = password;
        }
        final String anAuthPasswd = tmpAuthPasswd;
        Authenticator.setDefault(new Authenticator() {

            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(anAuthUserName, anAuthPasswd.toCharArray());
            }
        });
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("GET");
        conn.setReadTimeout(1000);
        conn.connect();
        return conn;
    }

}

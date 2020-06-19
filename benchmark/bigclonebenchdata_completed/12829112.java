import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;import java.awt.*;



class c12829112 {

    public String getDigest(String algorithm, String data) throws IOException, NoSuchAlgorithmException {
        MessageDigest md = java.security.MessageDigest.getInstance(algorithm);
        md.reset();
        md.update(data.getBytes());
        return md.digest().toString();
    }

}

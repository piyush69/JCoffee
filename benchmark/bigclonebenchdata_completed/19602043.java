import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;import java.awt.*;



class c19602043 {
public MyHelperClass domain;
	public MyHelperClass classes;
	public MyHelperClass getPermissions(){ return null; }

    public void RSClassLoader(Map<String, byte[]> classes, URL source) {
        try {
            CodeSource codeSource = new CodeSource(source, (CodeSigner[]) null);
            domain =(MyHelperClass)(Object) new ProtectionDomain(codeSource,(PermissionCollection)(Object) getPermissions());
            this.classes =(MyHelperClass)(Object) classes;
            String s = getClass().getResource("RSClassLoader.class").toString();
            s = s.replace("bot/RSClassLoader.class", "client/RandomAccessFile.class");
            URL url = new URL(s);
            InputStream is = null;
            try {
                ByteArrayOutputStream bos = new ByteArrayOutputStream(5000);
                is = new BufferedInputStream(url.openStream());
                byte[] buff = new byte[1024];
                int len = -1;
                while ((len = is.read(buff)) != -1) bos.write(buff, 0, len);
                byte[] data = bos.toByteArray();
                this.classes.put("org.rsbot.client.RandomAccessFile", data);
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                if (is != null) is.close();
            }
        } catch (final Exception ignored) {
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass put(String o0, byte[] o1){ return null; }}

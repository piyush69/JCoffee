import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;import java.awt.*;



class c12267657 {
public MyHelperClass url;

    public Reader create(final URI url) throws IOException {
        this.url =(MyHelperClass)(Object) url;
        if (!url.isAbsolute()) {
            return new FileReader(new File(url.toString()));
        }
        URLConnection connection = url.toURL().openConnection();
        connection.setDoInput(true);
        final InputStream inputStream = connection.getInputStream();
        return new InputStreamReader(inputStream);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

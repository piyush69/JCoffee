import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c18467319 {
public MyHelperClass IOUtils;

//        @Nullable
//        @Override
        public InputSource resolveEntity(final String publicId, final String systemId) throws Throwable, IOException {
            if (systemId.endsWith(".xml")) {
                return null;
            }
            InputSource inputSource = null;
            MyHelperClass PATTERN_DIRECTORY_PART = new MyHelperClass();
            final URL url =(URL)(Object) IOUtils.getResource(new File("system/dtd"), PATTERN_DIRECTORY_PART.matcher(systemId).replaceAll(""));
            final InputStream inputStream = url.openStream();
            try {
                final BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
                try {
                    inputSource = new InputSource(bufferedInputStream);
                } finally {
                    if (inputSource == null) {
                        bufferedInputStream.close();
                    }
                }
            } finally {
                if (inputSource == null) {
                    inputStream.close();
                }
            }
            return inputSource;
        }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass replaceAll(String o0){ return null; }
	public MyHelperClass getResource(File o0, MyHelperClass o1){ return null; }
	public MyHelperClass matcher(String o0){ return null; }}

class InputSource {

InputSource(){}
	InputSource(BufferedInputStream o0){}}

class Nullable {

}

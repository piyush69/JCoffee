import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c17452177 {

    public Object apply(Context context, Object arg)  throws Throwable {
        Object result = null;
        if (arg == null) {
            throw(Throwable)(Object) new NullArgument("Null argument to read().");
        }
        if (arg instanceof String) {
            String filename = (String) arg;
            File file = new File(filename);
            if (!file.exists()) {
                throw(Throwable)(Object) new FileNotFound("File not found: " + filename);
            }
            if (!file.isFile()) {
                throw(Throwable)(Object) new BadArgument("Argument to read() is not a file: " + filename);
            }
            if (!file.canRead()) {
                throw(Throwable)(Object) new BadArgument("File cannot be read: " + filename);
            }
            try {
                StringBuffer buffer = new StringBuffer();
                BufferedReader input = new BufferedReader(new FileReader(file));
                String sep = System.getProperty("line.separator");
                String line = null;
                for (; ; ) {
                    line = input.readLine();
                    if (line == null) {
                        break;
                    }
                    buffer.append(line);
                    buffer.append(sep);
                }
                result = buffer.toString();
                input.close();
            } catch (Exception e) {
                throw new IOError("Error reading " +(Throwable)(Object)(Throwable)(Object)(Throwable)(Object)(Throwable)(Object)(Throwable)(Object)(Throwable)(Object)(Throwable)(Object)(Throwable)(Object)(Throwable)(Object)(Throwable)(Object) filename);
            }
        } else if (arg instanceof URL) {
            URL url = (URL) arg;
            try {
                StringBuffer buffer = new StringBuffer();
                InputStreamReader isr = new InputStreamReader(url.openStream());
                BufferedReader input = new BufferedReader(isr);
                String sep = System.getProperty("line.separator");
                String line = null;
                for (; ; ) {
                    line = input.readLine();
                    if (line == null) {
                        break;
                    }
                    buffer.append(line);
                    buffer.append(sep);
                }
                result = buffer.toString();
                input.close();
            } catch (Exception e) {
                throw new IOError("Error reading " +(Throwable)(Object)(Throwable)(Object)(Throwable)(Object)(Throwable)(Object)(Throwable)(Object)(Throwable)(Object)(Throwable)(Object)(Throwable)(Object)(Throwable)(Object)(Throwable)(Object) url);
            }
        } else {
            throw(Throwable)(Object) new BadArgument("Bad argument to read()");
        }
        return result;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class Context {

}

class NullArgument {

NullArgument(String o0){}
	NullArgument(){}}

class FileNotFound {

FileNotFound(String o0){}
	FileNotFound(){}}

class BadArgument {

BadArgument(String o0){}
	BadArgument(){}}

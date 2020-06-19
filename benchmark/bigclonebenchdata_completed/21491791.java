import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c21491791 {
public MyHelperClass $(Reader o0, Writer o1){ return null; }
	public MyHelperClass $next(){ return null; }
	public MyHelperClass $declass(FileInputStream o0){ return null; }
	public MyHelperClass $(){ return null; }
	public MyHelperClass $declass(FileOutputStream o0){ return null; }

    public void run(String[] args) throws Throwable {
        FileInputStream input = new FileInputStream(args[0]);
        FileOutputStream output = new FileOutputStream(args[0] + ".out");
        Reader reader = $(Reader.class, $declass(input));
        Writer writer = $(Writer.class, $declass(output));
        Pump pump;
        if (args.length > 1 && "diag".equals(args[1])) {
            pump = $(new Reader() {

                int counter;

//                @ToContext(mode = InvocationMode.sideEffect)
                public int read(byte[] buffer, int off, int len) throws Exception {
                    Integer rd = (Integer) $next();
                    if (rd > 0) {
                        counter += rd;
                    }
                    return 0;
                }

//                @ToContext(mode = InvocationMode.sideEffect)
                public void close() throws Exception {
                    System.out.println("Read from input " + counter + " bytes.");
                }
            }, reader, writer, new Writer() {

                int counter;

//                @ToContext(mode = InvocationMode.sideEffect)
                public void write(byte[] buffer, int off, int len) throws Exception {
                    counter += len;
                }

//                @ToContext(mode = InvocationMode.sideEffect)
                public void close() throws Exception {
                    System.out.println("Written to output " + counter + " bytes.");
                }
            });
        } else {
            pump = $(reader, writer);
        }
        pump.pump();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class Pump {

}

class ToContext {

}

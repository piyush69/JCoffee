


class c9830264 {

    public static void main(final String[] args) {
        final Runnable startDerby = new Runnable() {

            public void run() {
                try {
                    MyHelperClass InetAddress = new MyHelperClass();
                    final NetworkServerControl control = new NetworkServerControl(InetAddress.getByName("localhost"), 1527);
                    control.start(new PrintWriter((PrintStream)(Object)System.out));
                } catch (final Exception ex) {
                    throw new RuntimeException(ex);
                }
            }
        };
        new Thread(startDerby).start();
        final Runnable startActiveMq = new Runnable() {

            public void run() {
                MyHelperClass Main = new MyHelperClass();
                Main.main(new String[] { "start", "xbean:file:active-mq-config.xml" });
            }
        };
        new Thread(startActiveMq).start();
        final Runnable startMailServer = new Runnable() {

            public void run() {
                final SimpleMessageListener listener = new SimpleMessageListener() {

                    public final boolean accept(final String from, final String recipient) {
                        return true;
                    }

                    public final void deliver(final String from, final String recipient, final InputStream data) throws TooMuchDataException, IOException {
                        System.out.println("FROM: " + from);
                        System.out.println("TO: " + recipient);
                        final File tmpDir = new File(System.getProperty("java.io.tmpdir"));
                        final File file = new File(tmpDir, recipient);
                        final FileWriter fw = new FileWriter(file);
                        try {
                            MyHelperClass IOUtils = new MyHelperClass();
                            IOUtils.copy(data, fw);
                        } finally {
                            fw.close();
                        }
                    }
                };
                final SMTPServer smtpServer = new SMTPServer(new SimpleMessageListenerAdapter(listener));
                smtpServer.start();
                System.out.println("Started SMTP Server");
            }
        };
        new Thread(startMailServer).start();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass copy(InputStream o0, FileWriter o1){ return null; }
	public MyHelperClass getByName(String o0){ return null; }
	public MyHelperClass main(String[] o0){ return null; }}

class NetworkServerControl {

NetworkServerControl(MyHelperClass o0, int o1){}
	NetworkServerControl(){}
	public MyHelperClass start(PrintWriter o0){ return null; }}

class PrintWriter {

PrintWriter(PrintStream o0){}
	PrintWriter(){}}

class SimpleMessageListener {

}

class SMTPServer {

SMTPServer(){}
	SMTPServer(SimpleMessageListenerAdapter o0){}
	public MyHelperClass start(){ return null; }}

class SimpleMessageListenerAdapter {

SimpleMessageListenerAdapter(SimpleMessageListener o0){}
	SimpleMessageListenerAdapter(){}}

class InputStream {

}

class TooMuchDataException extends Exception{
	public TooMuchDataException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class File {

File(File o0, String o1){}
	File(String o0){}
	File(){}}

class FileWriter {

FileWriter(File o0){}
	FileWriter(){}
	public MyHelperClass close(){ return null; }}

class PrintStream {

}

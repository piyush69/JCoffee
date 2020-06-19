


class c9830267 {

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

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass copy(InputStream o0, FileWriter o1){ return null; }}

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

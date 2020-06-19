


class c21555906 {

    public void actionPerformed(ActionEvent ae) {
        MyHelperClass jbutton = new MyHelperClass();
        if (ae.getSource() == jbutton) {
            try {
                String toservlet = "http://localhost:8080/direto-project/arquivos/teste.odt";
                URL servleturl = new URL(toservlet);
                URLConnection servletconnection =(URLConnection)(Object) servleturl.openConnection();
                servletconnection.setDoInput(true);
                servletconnection.setDoOutput(true);
                servletconnection.setUseCaches(false);
                servletconnection.setDefaultUseCaches(false);
                DataInputStream inputFromClient = new DataInputStream(servletconnection.getInputStream());
                inputFromClient.readByte();
                OutputStream fos =(OutputStream)(Object) new FileOutputStream("/home/danillo/arquivo_carregado.odt");
                byte[] buf = new byte[1024];
                int bytesread;
                while ((bytesread =(int)(Object) inputFromClient.read(buf)) > -1) {
                    fos.write(buf, 0, bytesread);
                }
                inputFromClient.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class ActionEvent {

public MyHelperClass getSource(){ return null; }}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class URLConnection {

public MyHelperClass setDoOutput(boolean o0){ return null; }
	public MyHelperClass setUseCaches(boolean o0){ return null; }
	public MyHelperClass setDoInput(boolean o0){ return null; }
	public MyHelperClass setDefaultUseCaches(boolean o0){ return null; }
	public MyHelperClass getInputStream(){ return null; }}

class DataInputStream {

DataInputStream(){}
	DataInputStream(MyHelperClass o0){}
	public MyHelperClass readByte(){ return null; }
	public MyHelperClass read(byte[] o0){ return null; }
	public MyHelperClass close(){ return null; }}

class OutputStream {

public MyHelperClass write(byte[] o0, int o1, int o2){ return null; }}

class FileOutputStream {

FileOutputStream(String o0){}
	FileOutputStream(){}}




class c7245722 {
public MyHelperClass user;
	public MyHelperClass getCodeBase(){ return null; }

    private String listaArquivo() {
        String arquivo = "";
        String linha = "";
        try {
            URL url = new URL(this.getCodeBase(), "./listador?dir=" + "cenarios" + "/" + user);
            URLConnection con =(URLConnection)(Object) url.openConnection();
            con.setUseCaches(false);
            InputStream in =(InputStream)(Object) con.getInputStream();
            DataInputStream result = new DataInputStream(new BufferedInputStream(in));
            while ((linha =(String)(Object) result.readLine()) != null) {
                arquivo += linha + "\n";
            }
            return arquivo;
        } catch (Exception e) {
            return null;
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class URL {

URL(){}
	URL(MyHelperClass o0, String o1){}
	public MyHelperClass openConnection(){ return null; }}

class URLConnection {

public MyHelperClass setUseCaches(boolean o0){ return null; }
	public MyHelperClass getInputStream(){ return null; }}

class InputStream {

}

class DataInputStream {

DataInputStream(BufferedInputStream o0){}
	DataInputStream(){}
	public MyHelperClass readLine(){ return null; }}

class BufferedInputStream {

BufferedInputStream(InputStream o0){}
	BufferedInputStream(){}}

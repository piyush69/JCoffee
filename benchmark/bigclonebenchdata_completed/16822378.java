


class c16822378 {
public MyHelperClass Conf;

    public String descargarArchivo(String miArchivo, String nUsuario) {
        try {
            URL url = new URL(Conf.descarga + nUsuario + "/" + miArchivo);
            URLConnection urlCon =(URLConnection)(Object) url.openConnection();
            System.out.println(urlCon.getContentType());
            InputStream is =(InputStream)(Object) urlCon.getInputStream();
            FileOutputStream fos = new FileOutputStream("D:/" + miArchivo);
            byte[] array = new byte[1000];
            int leido =(int)(Object) is.read(array);
            while (leido > 0) {
                fos.write(array, 0, leido);
                leido =(int)(Object) is.read(array);
            }
            is.close();
            fos.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "llego";
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass descarga;
}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class URLConnection {

public MyHelperClass getInputStream(){ return null; }
	public MyHelperClass getContentType(){ return null; }}

class InputStream {

public MyHelperClass read(byte[] o0){ return null; }
	public MyHelperClass close(){ return null; }}

class FileOutputStream {

FileOutputStream(String o0){}
	FileOutputStream(){}
	public MyHelperClass write(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass close(){ return null; }}

import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c7908426 {
public MyHelperClass ImageIO;
	public MyHelperClass Charset;
	public MyHelperClass JOptionPane;
	public MyHelperClass confirmarImagen(String o0){ return null; }
	public MyHelperClass setMessage(String o0){ return null; }

        private File magiaImagen(String titulo) throws Throwable, MalformedURLException, IOException {
            titulo = URLEncoder.encode("\"" + titulo + "\"", "UTF-8");
            setMessage("Buscando portada en google...");
            URL url = new URL("http://images.google.com/images?q=" + titulo + "&imgsz=small|medium|large|xlarge");
            setMessage("Buscando portada en google: conectando...");
            URLConnection urlCon = url.openConnection();
            urlCon.setRequestProperty("User-Agent", "MyBNavigator");
            BufferedReader in = new BufferedReader(new InputStreamReader(urlCon.getInputStream(),(String)(Object) Charset.forName("ISO-8859-1")));
            String inputLine;
            StringBuilder sb = new StringBuilder();
            while ((inputLine = in.readLine()) != null) {
                sb.append(inputLine);
            }
            inputLine = sb.toString();
            String busqueda = "<a href=/imgres?imgurl=";
            setMessage("Buscando portada en google: analizando...");
            while (inputLine.indexOf(busqueda) != -1) {
                int posBusqueda = inputLine.indexOf(busqueda) + busqueda.length();
                int posFinal = inputLine.indexOf("&", posBusqueda);
                String urlImagen = inputLine.substring(posBusqueda, posFinal);
                switch((int)(Object)confirmarImagen(urlImagen)) {
                    case(int)(Object) JOptionPane.YES_OPTION:
                        setMessage("Descargando imagen...");
                        URL urlImg = new URL(urlImagen);
                        String ext = urlImagen.substring(urlImagen.lastIndexOf(".") + 1);
                        File f = File.createTempFile("Ignotus", "." + ext);
                        BufferedImage image =(BufferedImage)(Object) ImageIO.read(urlImg);
                        FileOutputStream outer = new FileOutputStream(f);
                        ImageIO.write(image, ext, outer);
                        outer.close();
                        in.close();
                        return f;
                    case(int)(Object) JOptionPane.CANCEL_OPTION:
                        in.close();
                        return null;
                    default:
                        inputLine = inputLine.substring(posBusqueda + busqueda.length());
                }
            }
            return null;
        }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass CANCEL_OPTION;
	public MyHelperClass YES_OPTION;
public MyHelperClass read(URL o0){ return null; }
	public MyHelperClass forName(String o0){ return null; }
	public MyHelperClass write(BufferedImage o0, String o1, FileOutputStream o2){ return null; }}

class BufferedImage {

}

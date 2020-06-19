


class c16048516 {

    public static SVNConfiguracion load(URL urlConfiguracion) {
        SVNConfiguracion configuracion = null;
        try {
            XMLDecoder xenc = new XMLDecoder(urlConfiguracion.openStream());
            configuracion = (SVNConfiguracion)(SVNConfiguracion)(Object) xenc.readObject();
            configuracion.setFicheroConfiguracion(urlConfiguracion);
            xenc.close();
        } catch (Exception exception) {
            exception.printStackTrace();
        }
        return configuracion;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class URL {

public MyHelperClass openStream(){ return null; }}

class SVNConfiguracion {

public MyHelperClass setFicheroConfiguracion(URL o0){ return null; }}

class XMLDecoder {

XMLDecoder(MyHelperClass o0){}
	XMLDecoder(){}
	public MyHelperClass readObject(){ return null; }
	public MyHelperClass close(){ return null; }}

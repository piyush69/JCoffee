
import java.io.UncheckedIOException;


class c20426634 {

    protected QName _getServiceName(String wsdlLocation) throws IOException, WSDLException {
        URL url = new URL(wsdlLocation);
        InputStream is = null;
        QName service = null;
        try {
            is =(InputStream)(Object) url.openStream();
            MyHelperClass WSDLFactory = new MyHelperClass();
            WSDLReader reader =(WSDLReader)(Object) WSDLFactory.newInstance().newWSDLReader();
            Definition def =(Definition)(Object) reader.readWSDL(null, new InputSource(is));
            Map services =(Map)(Object) def.getServices();
            if ((int)(Object)services.size() == 1) {
                Service se = (Service)(Service)(Object) services.values().iterator().next();
                service =(QName)(Object) se.getQName();
            }
        } finally {
            if (is != null) {
                try {
                    is.close();
                } catch (UncheckedIOException e) {
                }
            }
        }
        return service;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass iterator(){ return null; }
	public MyHelperClass newInstance(){ return null; }
	public MyHelperClass newWSDLReader(){ return null; }
	public MyHelperClass next(){ return null; }}

class QName {

}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class WSDLException extends Exception{
	public WSDLException(String errorMessage) { super(errorMessage); }
}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openStream(){ return null; }}

class InputStream {

public MyHelperClass close(){ return null; }}

class WSDLReader {

public MyHelperClass readWSDL(Object o0, InputSource o1){ return null; }}

class Definition {

public MyHelperClass getServices(){ return null; }}

class InputSource {

InputSource(InputStream o0){}
	InputSource(){}}

class Map {

public MyHelperClass values(){ return null; }
	public MyHelperClass size(){ return null; }}

class Service {

public MyHelperClass getQName(){ return null; }}




class c2401851 {

//    @Override
    public InputSource resolveEntity(String publicId, String systemId) throws SAXException, IOException {
        URL url = new URL(System.getenv("plugg_home") + "/" + systemId);
        System.out.println("SystemId = " + systemId);
        return new InputSource(url.openStream());
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class InputSource {

InputSource(MyHelperClass o0){}
	InputSource(){}}

class SAXException extends Exception{
	public SAXException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openStream(){ return null; }}

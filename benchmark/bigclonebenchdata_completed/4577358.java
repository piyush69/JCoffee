


class c4577358 {

    private static boolean isXmlApplicationFile(URL url) throws java.io.IOException {
        MyHelperClass DEBUG = new MyHelperClass();
        if ((boolean)(Object)DEBUG) {
            System.out.println("Checking whether file is xml");
        }
        String firstLine;
        BufferedReader fileReader = null;
        try {
            fileReader =(BufferedReader)(Object) new BomStrippingInputStreamReader(url.openStream());
            firstLine =(String)(Object) fileReader.readLine();
        } finally {
            if (fileReader != null) fileReader.close();
        }
        if (firstLine == null) {
            return false;
        }
        MyHelperClass STARTOFXMLAPPLICATIONFILES = new MyHelperClass();
        for (String startOfXml :(String[])(Object) (Object[])(Object)STARTOFXMLAPPLICATIONFILES) {
            if (firstLine.length() >= startOfXml.length() && firstLine.substring(0, startOfXml.length()).equals(startOfXml)) {
//                MyHelperClass DEBUG = new MyHelperClass();
                if ((boolean)(Object)DEBUG) {
                    System.out.println("isXMLApplicationFile = true");
                }
                return true;
            }
        }
//        MyHelperClass DEBUG = new MyHelperClass();
        if ((boolean)(Object)DEBUG) {
            System.out.println("isXMLApplicationFile = false");
        }
        return false;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class URL {

public MyHelperClass openStream(){ return null; }}

class BufferedReader {

public MyHelperClass readLine(){ return null; }
	public MyHelperClass close(){ return null; }}

class BomStrippingInputStreamReader {

BomStrippingInputStreamReader(MyHelperClass o0){}
	BomStrippingInputStreamReader(){}}

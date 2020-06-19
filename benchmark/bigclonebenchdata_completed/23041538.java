


class c23041538 {

        private Properties getProperties(URL url) throws java.io.IOException {
            Properties cdrList = new Properties();
            java.io.InputStream stream =(java.io.InputStream)(Object)(InputStream)(Object) url.openStream();
            cdrList.load((InputStream)(Object)stream);
            stream.close();
            return cdrList;
        }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class URL {

public MyHelperClass openStream(){ return null; }}

class Properties {

public MyHelperClass load(InputStream o0){ return null; }}

class InputStream {

}

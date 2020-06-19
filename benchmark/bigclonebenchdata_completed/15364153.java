


class c15364153 {
public MyHelperClass storeConfiguration(Properties o0, String o1){ return null; }

    private void storeConfigurationPropertiesFile(java.net.URL url, String comp) {
        java.util.Properties p;
        try {
            p = new java.util.Properties();
            p.load(url.openStream());
        } catch (java.io.IOException ie) {
            System.err.println("error opening: " + url.getPath() + ": " + ie.getMessage());
            return;
        }
        storeConfiguration((Properties)(Object)p, comp);
        return;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class Properties {

}

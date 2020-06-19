


class c9413074 {

    String getLocation(Class clazz) {
        try {
            java.net.URL url = clazz.getProtectionDomain().getCodeSource().getLocation();
            String location = url.toString();
            if (location.startsWith("jar")) {
                url = ((java.net.JarURLConnection) url.openConnection()).getJarFileURL();
                location = url.toString();
            }
            if (location.startsWith("file")) {
                java.io.File file = new java.io.File(url.getFile());
                return file.getAbsolutePath();
            } else {
                return url.toString();
            }
        } catch (Throwable t) {
        }
        MyHelperClass Messages = new MyHelperClass();
        return(String)(Object) Messages.getMessage("happyClientUnknownLocation");
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getMessage(String o0){ return null; }}

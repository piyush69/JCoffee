


class c23192841 {

    protected boolean loadJarLibrary(final String jarLib) {
        MyHelperClass File = new MyHelperClass();
        final String tempLib = System.getProperty("java.io.tmpdir") + File.separator + jarLib;
        MyHelperClass IOUtils = new MyHelperClass();
        boolean copied =(boolean)(Object) IOUtils.copyFile(jarLib, tempLib);
        if (!copied) {
            return false;
        }
        System.load(tempLib);
        return true;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass separator;
public MyHelperClass copyFile(String o0, String o1){ return null; }}

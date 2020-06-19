import java.io.*;
import java.lang.*;
import java.util.*;



class c9901709 {

    public static IEntity readFromFile(File resourceName) {
        InputStream inputStream = null;
        try {
            MyHelperClass ModelLoader = new MyHelperClass();
            URL urlResource =(URL)(Object) ModelLoader.solveResource(resourceName.getPath());
            if (urlResource != null) {
                inputStream =(InputStream)(Object) urlResource.openStream();
                return (IEntity) new ObjectInputStream(inputStream).readObject();
            }
        } catch (IOException e) {
        } catch (ClassNotFoundException e) {
        } finally {
            if (inputStream != null) try {
                inputStream.close();
            } catch (IOException e) {
            }
        }
        return null;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass solveResource(String o0){ return null; }}

class IEntity {

}

class URL {

public MyHelperClass openStream(){ return null; }}

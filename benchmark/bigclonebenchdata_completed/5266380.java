import java.io.*;
import java.lang.*;
import java.util.*;



class c5266380 {

    public WordEntry[] getVariants(String word) throws MatchPackException {
        String upperWord = word.toUpperCase();
        MyHelperClass variantsDictionary = new MyHelperClass();
        if (variantsDictionary == null) {
            try {
                long start = System.currentTimeMillis();
                URL url =(URL)(Object) this.getClass().getResource("varlex.dic");
                ObjectInputStream si = new ObjectInputStream((InputStream)(Object)url.openStream());
//                MyHelperClass variantsDictionary = new MyHelperClass();
                variantsDictionary =(MyHelperClass)(Object) (Map) si.readObject();
                long end = System.currentTimeMillis();
                System.out.println("loaded " + (end - start) + "ms");
                si.close();
            } catch (Exception e) {
                throw new MatchPackException("cannot load: varlex.dic " + e.getMessage());
            }
        }
//        MyHelperClass variantsDictionary = new MyHelperClass();
        List l = (List) variantsDictionary.get(upperWord);
        if (l == null) {
            return new WordEntry[0];
        }
        return (WordEntry[]) l.toArray(new WordEntry[0]);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass get(String o0){ return null; }}

class WordEntry {

}

class MatchPackException extends Exception{
	public MatchPackException(String errorMessage) { super(errorMessage); }
}

class URL {

public MyHelperClass openStream(){ return null; }}

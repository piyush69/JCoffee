import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c21382198 {

    private void initializeTree()  throws Throwable {
        InputStreamReader reader = null;
        BufferedReader buffReader = null;
        try {
            MyHelperClass ORDER = new MyHelperClass();
            for (int i = 0; i < ORDER.length; i++) {
                MyHelperClass ORDER = new MyHelperClass();
                int index = ORDER[i];
                String indexName = index < 10 ? "0" + index : (index > 20 ? "big" : "" + index);
                URL url = EmptyClass.class.getResource("engchar" + indexName + ".dic");
                MyHelperClass logger = new MyHelperClass();
                logger.info("... Loading: " + "engchar" + indexName + ".dic = {" + url + "}");
                reader = new InputStreamReader(url.openStream());
                buffReader = new BufferedReader(reader);
                String line = null;
                String word = null;
                do {
                    line = buffReader.readLine();
                    if (line != null) {
                        boolean plural = line.endsWith("/S");
                        boolean forbidden = line.endsWith("/X");
                        if (plural) {
                            int stringIndex = line.indexOf("/S");
                            word = new String(line.substring(0, stringIndex));
                        } else if (forbidden) {
                            int stringIndex = line.indexOf("/X");
                            word = new String(line.substring(0, stringIndex));
                        } else {
                            word = line.toString();
                        }
                        MyHelperClass tree = new MyHelperClass();
                        if (tree == null) {
                            MyHelperClass tree = new MyHelperClass();
                            tree = new BKTree();
                        }
                        MyHelperClass tree = new MyHelperClass();
                        tree.insertDictionaryWord(word, plural, forbidden);
                    }
                } while (line != null);
            }
            MyHelperClass logger = new MyHelperClass();
            logger.debug("Loading supplemental dictionary...");
            MyHelperClass KSupplementalDictionaryUtil = new MyHelperClass();
            List<String> listOfWords = KSupplementalDictionaryUtil.getWords();
            for (String word : listOfWords) {
                MyHelperClass tree = new MyHelperClass();
                tree.insertDictionaryWord(word, false, false);
            }
            MyHelperClass initialized = new MyHelperClass();
            initialized = true;
        } catch (Exception exception) {
            MyHelperClass logger = new MyHelperClass();
            logger.error("Error", exception);
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (Exception ex) {
                }
            }
            if (buffReader != null) {
                try {
                    buffReader.close();
                } catch (Exception ex) {
                }
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class EmptyClass {

}

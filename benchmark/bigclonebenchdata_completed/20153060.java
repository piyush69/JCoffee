import java.io.*;
import java.lang.*;
import java.util.*;



class c20153060 {

    public static void openFile(PublicHubList hublist, String url) {
        BufferedReader fichAl;
        String linha;
        try {
            if (url.startsWith("http://")) fichAl = new BufferedReader(new InputStreamReader((new java.net.URL(url)).openStream())); else fichAl = new BufferedReader(new FileReader(url));
            while ((linha = fichAl.readLine()) != null) {
                try {
                    MyHelperClass DCHub = new MyHelperClass();
                    hublist.addDCHub(new DCHub(linha, DCHub.hublistFormater));
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass hublistFormater;
}

class PublicHubList {

public MyHelperClass addDCHub(DCHub o0){ return null; }}

class DCHub {

DCHub(String o0, MyHelperClass o1){}
	DCHub(){}}

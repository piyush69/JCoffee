import java.io.*;
import java.lang.*;
import java.util.*;



class c4955403 {
public MyHelperClass htmltextparser;
	public MyHelperClass HTMLFile;
	public MyHelperClass r;

    public void FetchTextFromWebPage(String path) {
        Parser parser;
        HTMLFile =(MyHelperClass)(Object) new File(path);
        byte[] html = new byte[new Long((long)(Object)HTMLFile.length()).intValue()];
        try {
            FileInputStream fis = new FileInputStream((String)(Object)HTMLFile);
            try {
                fis.read(html);
            } catch (IOException e) {
                e.printStackTrace();
            }
            ByteArrayInputStream ba_read = new ByteArrayInputStream(html);
            r =(MyHelperClass)(Object) new InputStreamReader(ba_read);
        } catch (FileNotFoundException e) {
            URL url = null;
            try {
                url = new URL(path);
                URLConnection connection = null;
                try {
                    connection =(URLConnection)(Object) url.openConnection();
                    connection.setDoInput(true);
                    InputStream inStream = null;
                    try {
                        inStream =(InputStream)(Object) connection.getInputStream();
                        BufferedReader input = new BufferedReader(new InputStreamReader(inStream));
                        StringBuffer sbr = new StringBuffer();
                        String line = null;
                        try {
                            while ((line = input.readLine()) != null) {
                                System.out.println(line);
                                sbr.append(line + "\n");
                            }
                        } catch (IOException e1) {
                            e1.printStackTrace();
                        }
                        File temp = new File("//home//wiki14//temp.txt");
                        if (!temp.exists()) {
                            if (!temp.createNewFile()) System.out.println("File caanot be created");
                        } else {
                            temp.delete();
                            if (!temp.createNewFile()) System.out.println("File caanot be created");
                        }
                        java.io.FileWriter fw = new java.io.FileWriter(temp);
                        fw.write(sbr.toString());
                        fw.close();
                        byte[] newbyte = new byte[new Long(sbr.length()).intValue()];
                        ByteArrayInputStream ba_read = new ByteArrayInputStream(newbyte);
                        r =(MyHelperClass)(Object) new InputStreamReader(ba_read);
                    } catch (IOException e1) {
                        e1.printStackTrace();
                    }
                } catch (UncheckedIOException e1) {
                    e1.printStackTrace();
                }
            } catch (UncheckedIOException e1) {
                e1.printStackTrace();
            }
        }
        parser =(Parser)(Object) new ParserDelegator();
        htmltextparser =(MyHelperClass)(Object) new HtmlTextParser();
        htmltextparser.initData();
        try {
            parser.parse(r, htmltextparser, true);
        } catch (UncheckedIOException e) {
            e.printStackTrace();
        }
        try {
            r.close();
        } catch (UncheckedIOException e) {
            e.printStackTrace();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass close(){ return null; }
	public MyHelperClass initData(){ return null; }
	public MyHelperClass length(){ return null; }}

class URL {

URL(){}
	URL(String o0){}
	public MyHelperClass openConnection(){ return null; }}

class URLConnection {

public MyHelperClass setDoInput(boolean o0){ return null; }
	public MyHelperClass getInputStream(){ return null; }}

class MalformedURLException extends Exception{
	public MalformedURLException(String errorMessage) { super(errorMessage); }
}

class ParserDelegator {

}

class HtmlTextParser {

}

class Parser {

public MyHelperClass parse(MyHelperClass o0, MyHelperClass o1, boolean o2){ return null; }}

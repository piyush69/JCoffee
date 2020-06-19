


class c479786 {

    public static void main(String[] args) {
        StringBuffer htmlPage;
        htmlPage = new StringBuffer();
        double min = 99999.99;
        double max = 0;
        double value = 0;
        try {
            URL url = new URL("http://search.ebay.com/" + args[0]);
            BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));
            String line;
            while ((line =(String)(Object) in.readLine()) != null) {
                htmlPage.append(line);
                htmlPage.append("\n");
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        MyHelperClass Pattern = new MyHelperClass();
        Pattern p =(Pattern)(Object) Pattern.compile("\\$([\\d\\.]+)", Pattern.CASE_INSENSITIVE);
        Matcher m =(Matcher)(Object) p.matcher(htmlPage);
        while ((boolean)(Object)m.find()) {
            if ((int)(Object)m.start(0) < (int)(Object)m.end(0)) {
                value = Double.parseDouble((String)(Object)m.group(1));
                if (value < min) {
                    min = value;
                }
                if (value > max) {
                    max = value;
                }
            }
        }
        if (min == 99999.99) {
            min = 0;
        }
        System.out.println(args[0] + "," + min + "," + max);
        System.exit(0);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass CASE_INSENSITIVE;
public MyHelperClass compile(String o0, MyHelperClass o1){ return null; }}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openStream(){ return null; }}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass readLine(){ return null; }}

class InputStreamReader {

InputStreamReader(MyHelperClass o0){}
	InputStreamReader(){}}

class Pattern {

public MyHelperClass matcher(StringBuffer o0){ return null; }}

class Matcher {

public MyHelperClass group(int o0){ return null; }
	public MyHelperClass end(int o0){ return null; }
	public MyHelperClass start(int o0){ return null; }
	public MyHelperClass find(){ return null; }}

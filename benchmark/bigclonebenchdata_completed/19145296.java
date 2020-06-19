


class c19145296 {

    public static double[][] getCurrency() throws IOException {
        URL url = new URL("http://hk.finance.yahoo.com/currency");
        BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream(), "big5"));
        double currency[][] = new double[11][11];
        while (true) {
            String line =(String)(Object) in.readLine();
            String reg = "<td\\s((align=\"right\"\\sclass=\"yfnc_tabledata1\")" + "|(class=\"yfnc_tabledata1\"\\salign=\"right\"))>" + "([\\d|\\.]+)</td>";
            MyHelperClass Pattern = new MyHelperClass();
            Matcher m =(Matcher)(Object) Pattern.compile(reg).matcher(line);
            int i = 0, j = 0;
            boolean isfound = false;
            while ((boolean)(Object)m.find()) {
                isfound = true;
                currency[i][j] = Double.parseDouble((String)(Object)m.group(4));
                if (j == 10) {
                    j = 0;
                    i++;
                } else j++;
            }
            if (isfound) break;
        }
        return currency;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass compile(String o0){ return null; }
	public MyHelperClass matcher(String o0){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openStream(){ return null; }}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass readLine(){ return null; }}

class InputStreamReader {

InputStreamReader(){}
	InputStreamReader(MyHelperClass o0, String o1){}}

class Matcher {

public MyHelperClass group(int o0){ return null; }
	public MyHelperClass find(){ return null; }}

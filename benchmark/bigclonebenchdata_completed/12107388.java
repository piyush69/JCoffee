


class c12107388 {
public static MyHelperClass ISO_3166_TXT_FILE_PATH;
//public MyHelperClass ISO_3166_TXT_FILE_PATH;
	public static MyHelperClass getCountryName(String o0){ return null; }
	public static MyHelperClass pullData(String o0){ return null; }
//public MyHelperClass pullData(String o0){ return null; }
//	public MyHelperClass getCountryName(String o0){ return null; }

    private static List retrieveCountries() throws IOException {
        MyHelperClass ISO_3166_HOST = new MyHelperClass();
        URL url = new URL("http://" + ISO_3166_HOST + ISO_3166_TXT_FILE_PATH);
        BufferedReader input = new BufferedReader(new InputStreamReader(url.openStream()));
        List countries =(List)(Object) new LinkedList();
        boolean parsing = false;
        int trCount = 0;
        int tdCount = 0;
        CountryEntry current = new CountryEntry();
        String nextLine =(String)(Object) input.readLine();
        while (nextLine != null) {
            if (nextLine.startsWith("<table")) {
                parsing = true;
            }
            if (nextLine.startsWith("</table>")) {
                break;
            }
            if (parsing) {
                if (nextLine.startsWith("<tr")) {
                    trCount++;
                } else {
                    if ((trCount > 1 && nextLine.startsWith("<td"))) {
                        tdCount++;
                        String data =(String)(Object) pullData(nextLine);
                        switch(tdCount) {
                            case 1:
                                current.setName(getCountryName(data));
                                break;
                            case 2:
                                current.setNumber(data);
                                break;
                            case 3:
                                current.setAlpha3(data);
                                break;
                            case 4:
                                current.setAlpha2(data);
                                break;
                            case 5:
                                countries.add(current);
                                current = new CountryEntry();
                                tdCount = 0;
                                break;
                            default:
                                String msg = "Parsing error.  Unexpected column: [" + data + "]";
                                throw new IllegalStateException(msg);
                        }
                    }
                }
            }
            nextLine =(String)(Object) input.readLine();
        }
        input.close();
        return countries;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class List {

public MyHelperClass add(CountryEntry o0){ return null; }}

class CountryEntry {

public MyHelperClass setNumber(String o0){ return null; }
	public MyHelperClass setAlpha2(String o0){ return null; }
	public MyHelperClass setAlpha3(String o0){ return null; }
	public MyHelperClass setName(MyHelperClass o0){ return null; }}

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
	public MyHelperClass readLine(){ return null; }
	public MyHelperClass close(){ return null; }}

class InputStreamReader {

InputStreamReader(MyHelperClass o0){}
	InputStreamReader(){}}

class LinkedList {

}




class c4818090 {

//            @Override
            protected List get(URL url) throws Exception {
                CSVReader reader = null;
                try {
                    reader = new CSVReader(new InputStreamReader(url.openStream()));
                    return(List)(Object) reader.readAll();
                } finally {
                    MyHelperClass IOUtils = new MyHelperClass();
                    IOUtils.closeQuietly(reader);
                }
            }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass closeQuietly(CSVReader o0){ return null; }}

class URL {

public MyHelperClass openStream(){ return null; }}

class List {

}

class CSVReader {

CSVReader(){}
	CSVReader(InputStreamReader o0){}
	public MyHelperClass readAll(){ return null; }}

class InputStreamReader {

InputStreamReader(MyHelperClass o0){}
	InputStreamReader(){}}

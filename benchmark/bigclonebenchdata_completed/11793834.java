


class c11793834 {

    public static void addProviders(URL url) {
        Reader reader = null;
        Properties prop = new Properties();
        try {
            reader =(Reader)(Object) new InputStreamReader(url.openStream());
            prop.load(reader);
        } catch (Throwable t) {
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (Throwable t) {
                }
            }
        }
        for (Entry entry :(Entry[])(Object) (Object[])(Object)prop.entrySet()) {
            try {
                Class<?> cla = Class.forName((String)(String)(Object) entry.getValue(), true, Thread.currentThread().getContextClassLoader());
                MyHelperClass providers = new MyHelperClass();
                providers.put(((String)(String)(Object) entry.getKey()).toUpperCase(), (CharsetProvider) cla.newInstance());
            } catch (Throwable t) {
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass put(String o0, CharsetProvider o1){ return null; }}

class URL {

public MyHelperClass openStream(){ return null; }}

class Reader {

public MyHelperClass close(){ return null; }}

class Properties {

public MyHelperClass load(Reader o0){ return null; }
	public MyHelperClass entrySet(){ return null; }}

class InputStreamReader {

InputStreamReader(MyHelperClass o0){}
	InputStreamReader(){}}

class CharsetProvider {

}

class Entry {

public MyHelperClass getKey(){ return null; }
	public MyHelperClass getValue(){ return null; }}

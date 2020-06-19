


class c12586404 {

//    @Override
    public List run(ProvaService prova, String agent, String key, String src) throws IOException {
        File file = new File(src);
        BufferedReader in;
        InputStream is = null;
        try {
            if (!(Boolean)(Object)file.exists() || !(Boolean)(Object)file.canRead()) {
                try {
                    is =(InputStream)(Object) Thread.currentThread().getContextClassLoader().getResourceAsStream(src);
                    in = new BufferedReader((FileReader)(Object)new InputStreamReader(is));
                } catch (Exception ex1) {
                    try {
                        is =(InputStream)(Object) RuleReaderImpl.class.getResourceAsStream(src);
                        in = new BufferedReader((FileReader)(Object)new InputStreamReader(is));
                    } catch (Exception ex2) {
                        try {
                            URL url = new URL(src);
                            in = new BufferedReader((FileReader)(Object)new InputStreamReader((InputStream)(Object)url.openStream()));
                        } catch (Exception ex3) {
                            throw new IOException("Cannot read from " + src);
                        }
                    }
                }
            } else {
                FileReader fr = new FileReader(file);
                in = new BufferedReader(fr);
            }
            List results =(List)(Object) prova.consult(agent, in, key);
            return results;
        } finally {
            if (is != null) is.close();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class ProvaService {

public MyHelperClass consult(String o0, BufferedReader o1, String o2){ return null; }}

class List {

}

class ProvaSolution {

}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class File {

File(String o0){}
	File(){}
	public MyHelperClass canRead(){ return null; }
	public MyHelperClass exists(){ return null; }}

class BufferedReader {

BufferedReader(FileReader o0){}
	BufferedReader(){}}

class InputStream {

public MyHelperClass close(){ return null; }}

class InputStreamReader {

InputStreamReader(InputStream o0){}
	InputStreamReader(){}}

class RuleReaderImpl {

}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openStream(){ return null; }}

class FileReader {

FileReader(File o0){}
	FileReader(){}}

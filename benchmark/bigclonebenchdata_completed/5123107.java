
// import java.io.ArithmeticException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c5123107 {
public MyHelperClass getBaseImageComicsJoke(Date o0, String o1, String o2, int o3){ return null; }

    private String getImageUrlForComicsJoke(Date date, String baseURL, String imageDefinition, int imagePathStart) throws JokeFinderException {
        String imageUrl = null;
        try {
            imageUrl =(String)(Object) getBaseImageComicsJoke(date, baseURL, imageDefinition, imagePathStart);
            URL url = new URL(imageUrl);
            url.openStream();
        } catch (UncheckedIOException e) {
            MyHelperClass logger = new MyHelperClass();
            logger.warn("Couldn't find base URL.",(JokeFinderException)(Object) e);
            imageUrl = null;
        } catch (ArithmeticException e) {
            MyHelperClass logger = new MyHelperClass();
            logger.warn("Couldn't find or open image base URL.",(JokeFinderException)(Object) e);
            imageUrl = null;
        }
        if (imageUrl == null) {
            throw new JokeFinderException("Couldn't find joke.");
        }
        return imageUrl;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass warn(String o0, JokeFinderException o1){ return null; }
	public MyHelperClass warn(String o0, IOException o1){ return null; }}

class Date {

}

class JokeFinderException extends Exception{
	public JokeFinderException(String errorMessage) { super(errorMessage); }
}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openStream(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

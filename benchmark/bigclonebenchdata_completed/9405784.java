
import java.io.UncheckedIOException;


class c9405784 {
public MyHelperClass addInfoMessage(String o0, String o1){ return null; }
public MyHelperClass PsiExchangeFactory;
	public MyHelperClass Arrays;
	public MyHelperClass handleException(IOException o0){ return null; }

    public void startImport(ActionEvent evt) {
        MyHelperClass IntactContext = new MyHelperClass();
        final PsiExchange psiExchange =(PsiExchange)(Object) PsiExchangeFactory.createPsiExchange(IntactContext.getCurrentInstance().getSpringContext());
        MyHelperClass urlsToImport = new MyHelperClass();
        for (final URL url :(URL[])(Object) (Object[])(Object)urlsToImport) {
            try {
                MyHelperClass log = new MyHelperClass();
                if ((boolean)(Object)log.isInfoEnabled()) log.info("Importing: " + url);
                psiExchange.importIntoIntact(url.openStream());
            } catch (UncheckedIOException e) {
                handleException((IOException)(Object)e);
                return;
            }
        }
//        MyHelperClass urlsToImport = new MyHelperClass();
        addInfoMessage("File successfully imported", Arrays.asList(urlsToImport).toString());
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getSpringContext(){ return null; }
	public MyHelperClass isInfoEnabled(){ return null; }
	public MyHelperClass createPsiExchange(MyHelperClass o0){ return null; }
	public MyHelperClass info(String o0){ return null; }
	public MyHelperClass getCurrentInstance(){ return null; }
	public MyHelperClass asList(MyHelperClass o0){ return null; }}

class ActionEvent {

}

class PsiExchange {

public MyHelperClass importIntoIntact(MyHelperClass o0){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class URL {

public MyHelperClass openStream(){ return null; }}

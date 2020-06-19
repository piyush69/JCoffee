


class c18451704 {

    public boolean isValidPage(BookPage page) {
        boolean isValid = false;
        try {
            MyHelperClass BookPage = new MyHelperClass();
            if (page.getType() == BookPage.TYPE_RESOURCE) {
                MyHelperClass dControl = new MyHelperClass();
                BookPagePreviewPanel panel = new BookPagePreviewPanel(dControl, true);
                panel.setCurrentBookPage(page);
                isValid = !page.getUri().equals("") && (boolean)(Object)panel.isValid();
//            MyHelperClass BookPage = new MyHelperClass();
            } else if (page.getType() == BookPage.TYPE_URL) {
                URL url = new URL(page.getUri());
                url.openStream().close();
                isValid = true;
//            MyHelperClass BookPage = new MyHelperClass();
            } else if (page.getType() == BookPage.TYPE_IMAGE) {
                if ((int)(Object)page.getUri().length() > 0) isValid = true;
            }
        } catch (Exception e) {
            isValid = false;
        }
        return isValid;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass TYPE_RESOURCE;
	public MyHelperClass TYPE_IMAGE;
	public MyHelperClass TYPE_URL;
public MyHelperClass close(){ return null; }
	public MyHelperClass length(){ return null; }}

class BookPage {

public MyHelperClass getType(){ return null; }
	public MyHelperClass getUri(){ return null; }}

class BookPagePreviewPanel {

BookPagePreviewPanel(MyHelperClass o0, boolean o1){}
	BookPagePreviewPanel(){}
	public MyHelperClass isValid(){ return null; }
	public MyHelperClass setCurrentBookPage(BookPage o0){ return null; }}

class URL {

URL(MyHelperClass o0){}
	URL(){}
	public MyHelperClass openStream(){ return null; }}

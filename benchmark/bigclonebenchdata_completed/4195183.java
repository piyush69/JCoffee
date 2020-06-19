


class c4195183 {

    public Image getURLImage(String url) {
        MyHelperClass images = new MyHelperClass();
        if (!(Boolean)(Object)images.containsKey(url)) {
            try {
                URL img = new URL(url);
//                MyHelperClass images = new MyHelperClass();
                images.put(url,(long)(Object) new Image(null, img.openStream()));
            } catch (Exception e) {
                throw new RuntimeException(e.getMessage() + ": " + url);
            }
        }
        MyHelperClass imageTimes = new MyHelperClass();
        imageTimes.put(url, System.currentTimeMillis());
//        MyHelperClass images = new MyHelperClass();
        return(Image)(Object) images.get(url);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass put(String o0, long o1){ return null; }
	public MyHelperClass get(String o0){ return null; }
	public MyHelperClass containsKey(String o0){ return null; }}

class Image {

Image(){}
	Image(Object o0, MyHelperClass o1){}}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openStream(){ return null; }}




class c8071138 {

    public void sendContent(OutputStream out, Range range, Map map, String string) throws IOException, NotAuthorizedException, BadRequestException {
        MyHelperClass file = new MyHelperClass();
        System.out.println("sendContent " + file);
//        MyHelperClass file = new MyHelperClass();
        RFileInputStream in = new RFileInputStream(file);
        try {
            MyHelperClass IOUtils = new MyHelperClass();
            IOUtils.copyLarge(in, out);
        } finally {
            in.close();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass copyLarge(RFileInputStream o0, OutputStream o1){ return null; }}

class OutputStream {

}

class Range {

}

class Map {

}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class NotAuthorizedException extends Exception{
	public NotAuthorizedException(String errorMessage) { super(errorMessage); }
}

class BadRequestException extends Exception{
	public BadRequestException(String errorMessage) { super(errorMessage); }
}

class RFileInputStream {

RFileInputStream(MyHelperClass o0){}
	RFileInputStream(){}
	public MyHelperClass close(){ return null; }}

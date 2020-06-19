


class c22080746 {

//    @Test
    public void testCarResource() throws Exception {
        DefaultHttpClient client = new DefaultHttpClient();
        System.out.println("**** CarResource Via @MatrixParam ***");
        HttpGet get = new HttpGet("http://localhost:9095/cars/matrix/mercedes/e55;color=black/2006");
        HttpResponse response =(HttpResponse)(Object) client.execute(get);
        MyHelperClass Assert = new MyHelperClass();
        Assert.assertEquals(200, response.getStatusLine().getStatusCode());
        BufferedReader reader = new BufferedReader(new InputStreamReader(response.getEntity().getContent()));
        String line =(String)(Object) reader.readLine();
        while (line != null) {
            System.out.println(line);
            line =(String)(Object) reader.readLine();
        }
        System.out.println("**** CarResource Via PathSegment ***");
        get = new HttpGet("http://localhost:9095/cars/segment/mercedes/e55;color=black/2006");
        response =(HttpResponse)(Object) client.execute(get);
//        MyHelperClass Assert = new MyHelperClass();
        Assert.assertEquals(200, response.getStatusLine().getStatusCode());
        reader = new BufferedReader(new InputStreamReader(response.getEntity().getContent()));
        line =(String)(Object) reader.readLine();
        while (line != null) {
            System.out.println(line);
            line =(String)(Object) reader.readLine();
        }
        System.out.println("**** CarResource Via PathSegments ***");
        get = new HttpGet("http://localhost:9095/cars/segments/mercedes/e55/amg/year/2006");
        response =(HttpResponse)(Object) client.execute(get);
//        MyHelperClass Assert = new MyHelperClass();
        Assert.assertEquals(200, response.getStatusLine().getStatusCode());
        reader = new BufferedReader(new InputStreamReader(response.getEntity().getContent()));
        line =(String)(Object) reader.readLine();
        while (line != null) {
            System.out.println(line);
            line =(String)(Object) reader.readLine();
        }
        System.out.println("**** CarResource Via PathSegment ***");
        get = new HttpGet("http://localhost:9095/cars/uriinfo/mercedes/e55;color=black/2006");
        response =(HttpResponse)(Object) client.execute(get);
//        MyHelperClass Assert = new MyHelperClass();
        Assert.assertEquals(200, response.getStatusLine().getStatusCode());
        reader = new BufferedReader(new InputStreamReader(response.getEntity().getContent()));
        line =(String)(Object) reader.readLine();
        while (line != null) {
            System.out.println(line);
            line =(String)(Object) reader.readLine();
        }
        System.out.println();
        System.out.println();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass assertEquals(int o0, MyHelperClass o1){ return null; }
	public MyHelperClass getStatusCode(){ return null; }
	public MyHelperClass getContent(){ return null; }}

class Test {

}

class DefaultHttpClient {

public MyHelperClass execute(HttpGet o0){ return null; }}

class HttpGet {

HttpGet(String o0){}
	HttpGet(){}}

class HttpResponse {

public MyHelperClass getStatusLine(){ return null; }
	public MyHelperClass getEntity(){ return null; }}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass readLine(){ return null; }}

class InputStreamReader {

InputStreamReader(){}
	InputStreamReader(MyHelperClass o0){}}

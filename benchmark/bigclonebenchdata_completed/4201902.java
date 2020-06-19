


class c4201902 {
public MyHelperClass assertEquals(int o0, MyHelperClass o1){ return null; }
	public MyHelperClass assertEquals(MyHelperClass o0, String o1){ return null; }
	public MyHelperClass assertEquals(String o0, MyHelperClass o1){ return null; }
public MyHelperClass getBatch(Gadget o0){ return null; }

    private String executeHttpPreload(HttpResponse response, String xml) throws Exception {
        MyHelperClass GADGET_URL = new MyHelperClass();
        GadgetSpec spec = new GadgetSpec(GADGET_URL, xml);
        RecordingRequestPipeline pipeline = new RecordingRequestPipeline(response);
        MyHelperClass containerConfig = new MyHelperClass();
        PipelinedDataPreloader preloader = new PipelinedDataPreloader(pipeline, containerConfig);
        String view;// = new String();
        view = "profile";
        MyHelperClass context = new MyHelperClass();
        Gadget gadget =(Gadget)(Object) (new Gadget().setContext(context).setSpec(spec).setCurrentView(spec.getView("profile")));
        Batch batch =(Batch)(Object) getBatch(gadget);
//        MyHelperClass context = new MyHelperClass();
        Collection tasks =(Collection)(Object) preloader.createPreloadTasks(context, batch);
        assertEquals(1, tasks.size());
        assertEquals(0, pipeline.requests.size());
        Collection result =(Collection)(Object) tasks.iterator().next().call().toJson();
        assertEquals(1, result.size());
        assertEquals(1, pipeline.requests.size());
        HttpRequest request =(HttpRequest)(Object) pipeline.requests.get(0);
        MyHelperClass HTTP_REQUEST_URL = new MyHelperClass();
        assertEquals(HTTP_REQUEST_URL, request.getUri().toString());
        assertEquals("POST", request.getMethod());
        assertEquals(60, request.getCacheTtl());
        return result.iterator().next().toString();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass next(){ return null; }
	public MyHelperClass setCurrentView(MyHelperClass o0){ return null; }
	public MyHelperClass size(){ return null; }
	public MyHelperClass toJson(){ return null; }
	public MyHelperClass setSpec(GadgetSpec o0){ return null; }
	public MyHelperClass call(){ return null; }
	public MyHelperClass get(int o0){ return null; }}

class HttpResponse {

}

class GadgetSpec {

GadgetSpec(){}
	GadgetSpec(MyHelperClass o0, String o1){}
	public MyHelperClass getView(String o0){ return null; }}

class RecordingRequestPipeline {
public MyHelperClass requests;
RecordingRequestPipeline(){}
	RecordingRequestPipeline(HttpResponse o0){}}

class PipelinedDataPreloader {

PipelinedDataPreloader(){}
	PipelinedDataPreloader(RecordingRequestPipeline o0, MyHelperClass o1){}
	public MyHelperClass createPreloadTasks(MyHelperClass o0, Batch o1){ return null; }}

class Gadget {

public MyHelperClass setContext(MyHelperClass o0){ return null; }}

class Collection {

public MyHelperClass size(){ return null; }
	public MyHelperClass iterator(){ return null; }}

class Callable {

}

class PreloadedData {

}

class HttpRequest {

public MyHelperClass getUri(){ return null; }
	public MyHelperClass getCacheTtl(){ return null; }
	public MyHelperClass getMethod(){ return null; }}

class Batch {

}

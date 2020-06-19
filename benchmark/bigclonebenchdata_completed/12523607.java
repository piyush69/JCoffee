


class c12523607 {

    public void render(ServiceContext serviceContext) throws Exception {
        if (serviceContext.getTemplateName() == null) throw new Exception("no Template defined for service: " + serviceContext.getServiceInfo().getRefName());
        File f = new File(serviceContext.getTemplateName());
        serviceContext.getResponse().setContentLength((int)(int)(Object) f.length());
        InputStream in =(InputStream)(Object) new FileInputStream(f);
        MyHelperClass IOUtils = new MyHelperClass();
        IOUtils.copy(in, serviceContext.getResponse().getOutputStream(), 0, (int)(int)(Object) f.length());
        in.close();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getOutputStream(){ return null; }
	public MyHelperClass setContentLength(int o0){ return null; }
	public MyHelperClass copy(InputStream o0, MyHelperClass o1, int o2, int o3){ return null; }
	public MyHelperClass getRefName(){ return null; }}

class ServiceContext {

public MyHelperClass getServiceInfo(){ return null; }
	public MyHelperClass getResponse(){ return null; }
	public MyHelperClass getTemplateName(){ return null; }}

class File {

File(MyHelperClass o0){}
	File(){}
	public MyHelperClass length(){ return null; }}

class InputStream {

public MyHelperClass close(){ return null; }}

class FileInputStream {

FileInputStream(File o0){}
	FileInputStream(){}}

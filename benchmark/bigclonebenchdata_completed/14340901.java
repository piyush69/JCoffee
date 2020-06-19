


class c14340901 {

    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext appContext = new ClassPathXmlApplicationContext("camel/exec-context.xml");
        CamelContext context =(CamelContext)(Object) appContext.getBean(CamelContext.class);
        Exchange exchange =(Exchange)(Object) new DefaultExchange(context);
        List arg =(List)(Object) new ArrayList();
        arg.add("/home/sumit/derby.log");
        arg.add("helios:cameltesting/");
        MyHelperClass ExecBinding = new MyHelperClass();
        exchange.getIn().setHeader(ExecBinding.EXEC_COMMAND_ARGS, arg);
        Exchange res =(Exchange)(Object) context.createProducerTemplate().send("direct:input", exchange);
        ExecResult result = (ExecResult)(ExecResult)(Object) res.getIn().getBody();
        System.out.println(result.getExitValue());
        System.out.println(result.getCommand());
        if (result.getStderr() != null) {
            MyHelperClass IOUtils = new MyHelperClass();
            IOUtils.copy(result.getStderr(), new FileOutputStream(new File("/home/sumit/error.log")));
        }
        if (result.getStdout() != null) {
            MyHelperClass IOUtils = new MyHelperClass();
            IOUtils.copy(result.getStdout(), new FileOutputStream(new File("/home/sumit/out.log")));
        }
        appContext.close();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass EXEC_COMMAND_ARGS;
public MyHelperClass getBody(){ return null; }
	public MyHelperClass send(String o0, Exchange o1){ return null; }
	public MyHelperClass setHeader(MyHelperClass o0, List o1){ return null; }
	public MyHelperClass copy(MyHelperClass o0, FileOutputStream o1){ return null; }}

class ClassPathXmlApplicationContext {

ClassPathXmlApplicationContext(String o0){}
	ClassPathXmlApplicationContext(){}
	public MyHelperClass getBean(Class<CamelContext> o0){ return null; }
	public MyHelperClass close(){ return null; }}

class CamelContext {

public MyHelperClass createProducerTemplate(){ return null; }}

class Exchange {

public MyHelperClass getIn(){ return null; }}

class DefaultExchange {

DefaultExchange(CamelContext o0){}
	DefaultExchange(){}}

class List {

public MyHelperClass add(String o0){ return null; }}

class ArrayList {

}

class ExecResult {

public MyHelperClass getExitValue(){ return null; }
	public MyHelperClass getStdout(){ return null; }
	public MyHelperClass getCommand(){ return null; }
	public MyHelperClass getStderr(){ return null; }}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}}

class File {

File(String o0){}
	File(){}}

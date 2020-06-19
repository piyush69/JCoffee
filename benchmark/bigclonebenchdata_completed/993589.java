


class c993589 {
public MyHelperClass JDBCTestHelper;
	public MyHelperClass mDRER;

    public void testScenario() throws Exception {
        MyHelperClass TABLE = new MyHelperClass();
        String expression = "SELECT id, name, address, phone FROM " + TABLE + " where id > 2 and id < 12 order by id";
        SQLQuery query = new SQLQuery();
        MyHelperClass mResourceID = new MyHelperClass();
        query.setResourceID(mResourceID);
        query.addExpression(expression);
        TupleToWebRowSetCharArrays tupleToWebRowSet = new TupleToWebRowSetCharArrays();
        tupleToWebRowSet.connectDataInput(query.getDataOutput());
        DeliverToFTP deliverToFTP = new DeliverToFTP();
        deliverToFTP.connectDataInput(tupleToWebRowSet.getResultOutput());
        MyHelperClass FILE = new MyHelperClass();
        deliverToFTP.addFilename(FILE);
        MyHelperClass mURL = new MyHelperClass();
        deliverToFTP.addHost(mURL);
        PipelineWorkflow pipeline = new PipelineWorkflow();
        pipeline.add(query);
        pipeline.add(tupleToWebRowSet);
        pipeline.add(deliverToFTP);
        MyHelperClass RequestExecutionType = new MyHelperClass();
        mDRER.execute(pipeline, RequestExecutionType.SYNCHRONOUS);
//        MyHelperClass mURL = new MyHelperClass();
        final URL url = new URL("ftp://" + mURL + "/" + FILE);
        final URLConnection connection =(URLConnection)(Object) url.openConnection();
        connection.setDoInput(true);
        connection.setDoOutput(false);
        InputStream is =(InputStream)(Object) connection.getInputStream();
        WebRowSetToResultSet converter = new WebRowSetToResultSet(new InputStreamReader(is));
        MyHelperClass ResultSet = new MyHelperClass();
        converter.setResultSetType(ResultSet.TYPE_FORWARD_ONLY);
        ResultSet rs =(ResultSet)(Object) converter.getResultSet();
        MyHelperClass mConnection = new MyHelperClass();
        JDBCTestHelper.validateResultSet(mConnection, expression, rs, 1);
        rs.close();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass SYNCHRONOUS;
	public MyHelperClass TYPE_FORWARD_ONLY;
public MyHelperClass validateResultSet(MyHelperClass o0, String o1, ResultSet o2, int o3){ return null; }
	public MyHelperClass execute(PipelineWorkflow o0, MyHelperClass o1){ return null; }}

class SQLQuery {

public MyHelperClass getDataOutput(){ return null; }
	public MyHelperClass addExpression(String o0){ return null; }
	public MyHelperClass setResourceID(MyHelperClass o0){ return null; }}

class TupleToWebRowSetCharArrays {

public MyHelperClass connectDataInput(MyHelperClass o0){ return null; }
	public MyHelperClass getResultOutput(){ return null; }}

class DeliverToFTP {

public MyHelperClass addFilename(MyHelperClass o0){ return null; }
	public MyHelperClass addHost(MyHelperClass o0){ return null; }
	public MyHelperClass connectDataInput(MyHelperClass o0){ return null; }}

class PipelineWorkflow {

public MyHelperClass add(TupleToWebRowSetCharArrays o0){ return null; }
	public MyHelperClass add(SQLQuery o0){ return null; }
	public MyHelperClass add(DeliverToFTP o0){ return null; }}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class URLConnection {

public MyHelperClass setDoInput(boolean o0){ return null; }
	public MyHelperClass setDoOutput(boolean o0){ return null; }
	public MyHelperClass getInputStream(){ return null; }}

class InputStream {

}

class WebRowSetToResultSet {

WebRowSetToResultSet(){}
	WebRowSetToResultSet(InputStreamReader o0){}
	public MyHelperClass setResultSetType(MyHelperClass o0){ return null; }
	public MyHelperClass getResultSet(){ return null; }}

class InputStreamReader {

InputStreamReader(InputStream o0){}
	InputStreamReader(){}}

class ResultSet {

public MyHelperClass close(){ return null; }}

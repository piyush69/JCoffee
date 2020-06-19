


class c19446033 {
public MyHelperClass assertEquals(MyHelperClass o0, MyHelperClass o1, MyHelperClass o2){ return null; }
	public MyHelperClass consume(MyHelperClass o0){ return null; }
public MyHelperClass statusCode(HttpResponse o0){ return null; }
	public MyHelperClass executePost(String o0, MyHelperClass o1){ return null; }
	public MyHelperClass content(HttpResponse o0){ return null; }
public MyHelperClass SC_CREATED;
	public MyHelperClass createRepositoryXml(String o0){ return null; }
	public MyHelperClass executeDeleteWithResponse(String o0){ return null; }

    protected void givenTestRepository(String repositoryId) throws Exception {
        HttpResponse response =(HttpResponse)(Object) executeDeleteWithResponse("/repositories/" + repositoryId);
        consume(response.getEntity());
        response =(HttpResponse)(Object) executePost("/repositories", createRepositoryXml(repositoryId));
        assertEquals(content(response), SC_CREATED, statusCode(response));
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class HttpResponse {

public MyHelperClass getEntity(){ return null; }}




class c19446036 {
public MyHelperClass assertThat(MyHelperClass o0, MyHelperClass o1){ return null; }
public MyHelperClass format(String o0, String o1, String o2, String o3, MyHelperClass o4){ return null; }
	public MyHelperClass consume(MyHelperClass o0){ return null; }
	public MyHelperClass executePost(String o0, StringEntity o1, BasicHeader o2){ return null; }
public MyHelperClass render(Repository[] o0){ return null; }
	public MyHelperClass executeDeleteWithResponse(MyHelperClass o0){ return null; }
public MyHelperClass is(int o0){ return null; }
	public MyHelperClass format(String o0, String o1){ return null; }

    protected void givenGroupRepository(String repoId, String providerId, Repository... memberRepos) throws AuthenticationException, UnsupportedEncodingException, IOException, ClientProtocolException {
        HttpResponse response =(HttpResponse)(Object) executeDeleteWithResponse(format("/repo_groups/%s", repoId));
        consume(response.getEntity());
        final StringEntity content = new StringEntity(format("{data:{id: '%s', name: '%s', provider: '%s', exposed: true, repositories: [%s]}}", repoId, repoId, providerId, render(memberRepos)));
        response =(HttpResponse)(Object) executePost("/repo_groups", content, new BasicHeader("Content-Type", "application/json"));
        consume(response.getEntity());
        assertThat(response.getStatusLine().getStatusCode(), is(201));
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getStatusCode(){ return null; }}

class Repository {

}

class AuthenticationException extends Exception{
	public AuthenticationException(String errorMessage) { super(errorMessage); }
}

class UnsupportedEncodingException extends Exception{
	public UnsupportedEncodingException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class ClientProtocolException extends Exception{
	public ClientProtocolException(String errorMessage) { super(errorMessage); }
}

class HttpResponse {

public MyHelperClass getStatusLine(){ return null; }
	public MyHelperClass getEntity(){ return null; }}

class StringEntity {

StringEntity(MyHelperClass o0){}
	StringEntity(){}}

class BasicHeader {

BasicHeader(String o0, String o1){}
	BasicHeader(){}}

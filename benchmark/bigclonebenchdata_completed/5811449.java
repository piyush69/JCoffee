import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c5811449 {
public MyHelperClass assertThat(String o0, MyHelperClass o1){ return null; }
	public MyHelperClass toByteArray(MyHelperClass o0){ return null; }
public MyHelperClass givenClosedStagingRepoWithRpm(MyHelperClass o0, String o1){ return null; }
	public MyHelperClass containsString(MyHelperClass o0){ return null; }
	public MyHelperClass givenGroupRepository(MyHelperClass o0, String o1){ return null; }
	public MyHelperClass executeGetWithResponse(String o0){ return null; }
public MyHelperClass ARTIFACT_ID_2;
	public MyHelperClass ARTIFACT_ID_1;
	public MyHelperClass is(int o0){ return null; }

//    @Test
    public void shouldProgateStagingRepoToYumGroupRepo() throws Throwable, Exception {
        MyHelperClass GROUP_REPO_ID = new MyHelperClass();
        givenGroupRepository(GROUP_REPO_ID, "maven2yum");
        MyHelperClass ARTIFACT_ID_1 = new MyHelperClass();
        givenClosedStagingRepoWithRpm(ARTIFACT_ID_1, "4.3.2");
        MyHelperClass ARTIFACT_ID_2 = new MyHelperClass();
        givenClosedStagingRepoWithRpm(ARTIFACT_ID_2, "2.3.4");
        MyHelperClass SECONDS = new MyHelperClass();
        wait(10,(int)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) SECONDS);
        MyHelperClass NEXUS_BASE_URL = new MyHelperClass();
        final HttpResponse response =(HttpResponse)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) executeGetWithResponse(NEXUS_BASE_URL + "/content/groups/staging-test-group/repodata/primary.xml.gz");
        MyHelperClass IOUtils = new MyHelperClass();
        final String repoContent = IOUtils.toString(new GZIPInputStream(new ByteArrayInputStream((Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(byte[])(Object)toByteArray(response.getEntity()))));
        assertThat((Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(String)(Object)response.getStatusLine().getStatusCode(), is(200));
        assertThat(repoContent, containsString(ARTIFACT_ID_1));
        assertThat(repoContent, containsString(ARTIFACT_ID_2));
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getStatusCode(){ return null; }}

class Test {

}

class HttpResponse {

public MyHelperClass getEntity(){ return null; }
	public MyHelperClass getStatusLine(){ return null; }}

class GZIPInputStream {

GZIPInputStream(){}
	GZIPInputStream(ByteArrayInputStream o0){}}

class Object {

public MyHelperClass toString(GZIPInputStream o0){ return null; }}

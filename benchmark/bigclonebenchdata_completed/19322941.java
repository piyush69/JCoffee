


class c19322941 {
public MyHelperClass assertThat(MyHelperClass o0, MyHelperClass o1){ return null; }
public MyHelperClass getResponse(HttpURLConnection o0){ return null; }
public MyHelperClass equalTo(String o0){ return null; }
	public MyHelperClass equalTo(int o0){ return null; }

//    @Test
    public void test_lookupResourceType_FullSearch_TwoWordsInMiddle() throws Exception {
        MyHelperClass baseUrl = new MyHelperClass();
        URL url = new URL(baseUrl + "/lookupResourceType/armor+plates");
        HttpURLConnection connection = (HttpURLConnection)(HttpURLConnection)(Object) url.openConnection();
        connection.setRequestMethod("GET");
        connection.setRequestProperty("Accept", "application/json");
        assertThat(connection.getResponseCode(), equalTo(200));
        assertThat(getResponse(connection), equalTo("[{\"itemTypeID\":25605,\"itemCategoryID\":4,\"name\":\"Armor Plates\",\"icon\":\"69_09\"},{\"itemTypeID\":25624,\"itemCategoryID\":4,\"name\":\"Intact Armor Plates\",\"icon\":\"69_10\"}]"));
        assertThat(connection.getHeaderField("Content-Type"), equalTo("application/json; charset=utf-8"));
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class Test {

}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class HttpURLConnection {

public MyHelperClass setRequestMethod(String o0){ return null; }
	public MyHelperClass setRequestProperty(String o0, String o1){ return null; }
	public MyHelperClass getHeaderField(String o0){ return null; }
	public MyHelperClass getResponseCode(){ return null; }}

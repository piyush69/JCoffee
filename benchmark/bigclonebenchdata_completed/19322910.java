


class c19322910 {
public MyHelperClass assertThat(MyHelperClass o0, MyHelperClass o1){ return null; }
public MyHelperClass getResponse(HttpURLConnection o0){ return null; }
public MyHelperClass equalTo(String o0){ return null; }
	public MyHelperClass equalTo(int o0){ return null; }

//    @Test
    public void test_blueprintTypeByTypeID() throws Exception {
        MyHelperClass baseUrl = new MyHelperClass();
        URL url = new URL(baseUrl + "/blueprintTypeByTypeID/20188");
        HttpURLConnection connection = (HttpURLConnection)(HttpURLConnection)(Object) url.openConnection();
        connection.setRequestMethod("GET");
        connection.setRequestProperty("Accept", "application/json");
        assertThat(connection.getResponseCode(), equalTo(200));
        assertThat(getResponse(connection), equalTo("{\"blueprintTypeID\":20188,\"blueprintTypeName\":\"Obelisk Blueprint\",\"productTypeID\":20187,\"productTypeName\":\"Obelisk\",\"productCategoryID\":6,\"techLevel\":1,\"productionTime\":1280000,\"researchProductivityTime\":7680000,\"researchMaterialTime\":5120000,\"researchCopyTime\":2560000,\"researchTechTime\":500000,\"productivityModifier\":256000,\"wasteFactor\":10,\"maxProductionLimit\":1,\"productVolume\":\"17550000\",\"productPortionSize\":1,\"dumpVersion\":\"cru16\"}"));
        assertThat(connection.getHeaderField("Content-Type"), equalTo("application/json; charset=utf-8"));
        connection = (HttpURLConnection)(HttpURLConnection)(Object) url.openConnection();
        connection.setRequestMethod("GET");
        connection.setRequestProperty("Accept", "application/xml");
        assertThat(connection.getResponseCode(), equalTo(200));
        assertThat(getResponse(connection), equalTo("<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?><invBlueprintTypeDto><blueprintTypeID>20188</blueprintTypeID><blueprintTypeName>Obelisk Blueprint</blueprintTypeName><dumpVersion>cru16</dumpVersion><maxProductionLimit>1</maxProductionLimit><productCategoryID>6</productCategoryID><productPortionSize>1</productPortionSize><productTypeID>20187</productTypeID><productTypeName>Obelisk</productTypeName><productVolume>17550000</productVolume><productionTime>1280000</productionTime><productivityModifier>256000</productivityModifier><researchCopyTime>2560000</researchCopyTime><researchMaterialTime>5120000</researchMaterialTime><researchProductivityTime>7680000</researchProductivityTime><researchTechTime>500000</researchTechTime><techLevel>1</techLevel><wasteFactor>10</wasteFactor></invBlueprintTypeDto>"));
        assertThat(connection.getHeaderField("Content-Type"), equalTo("application/xml; charset=utf-8"));
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

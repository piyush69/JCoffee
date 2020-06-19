


class c12330089 {

    public static void main(String[] args) throws Exception {
        final URL url = new URL("http://www.ebi.ac.uk/Tools/webservices/psicquic/registry/registry?action=ACTIVE&format=txt");
        BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));
        String str;
        Map psiqcuicServices =(Map)(Object) new HashMap();
        while ((str =(String)(Object) in.readLine()) != null) {
            final int idx = str.indexOf('=');
            psiqcuicServices.put(str.substring(0, idx), str.substring(idx + 1, str.length()));
        }
        in.close();
        System.out.println("Found " + psiqcuicServices.size() + " active service(s).");
        for (Object o : (Object[])(Object)psiqcuicServices.keySet()) {
            String serviceName = (String) o;
            String serviceUrl =(String)(Object) psiqcuicServices.get(serviceName);
            System.out.println(serviceName + " -> " + serviceUrl);
            UniversalPsicquicClient client = new UniversalPsicquicClient(serviceUrl);
            try {
                SearchResult result =(SearchResult)(Object) client.getByInteractor("brca2", 0, 50);
                System.out.println("Interactions found: " + result.getTotalCount());
                for (BinaryInteraction binaryInteraction :(BinaryInteraction[])(Object) (Object[])(Object)result.getData()) {
                    String interactorIdA =(String)(Object) binaryInteraction.getInteractorA().getIdentifiers().iterator().next().getIdentifier();
                    String interactorIdB =(String)(Object) binaryInteraction.getInteractorB().getIdentifiers().iterator().next().getIdentifier();
                    String interactionAc = "-";
                    if (!(Boolean)(Object)binaryInteraction.getInteractionAcs().isEmpty()) {
                        CrossReference cr = (CrossReference)(CrossReference)(Object) binaryInteraction.getInteractionAcs().iterator().next();
                        interactionAc =(String)(Object) cr.getIdentifier();
                    }
                    System.out.println("\tInteraction (" + interactionAc + "): " + interactorIdA + " interacts with " + interactorIdB);
                }
            } catch (Throwable e) {
                System.err.println("Service is down! " + serviceName + "(" + serviceUrl + ")");
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass next(){ return null; }
	public MyHelperClass isEmpty(){ return null; }
	public MyHelperClass getIdentifier(){ return null; }
	public MyHelperClass getIdentifiers(){ return null; }
	public MyHelperClass iterator(){ return null; }}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openStream(){ return null; }}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass readLine(){ return null; }
	public MyHelperClass close(){ return null; }}

class InputStreamReader {

InputStreamReader(MyHelperClass o0){}
	InputStreamReader(){}}

class Map {

public MyHelperClass put(String o0, String o1){ return null; }
	public MyHelperClass get(String o0){ return null; }
	public MyHelperClass size(){ return null; }
	public MyHelperClass keySet(){ return null; }}

class HashMap {

}

class UniversalPsicquicClient {

UniversalPsicquicClient(String o0){}
	UniversalPsicquicClient(){}
	public MyHelperClass getByInteractor(String o0, int o1, int o2){ return null; }}

class SearchResult {

public MyHelperClass getTotalCount(){ return null; }
	public MyHelperClass getData(){ return null; }}

class BinaryInteraction {

public MyHelperClass getInteractionAcs(){ return null; }
	public MyHelperClass getInteractorA(){ return null; }
	public MyHelperClass getInteractorB(){ return null; }}

class CrossReference {

public MyHelperClass getIdentifier(){ return null; }}

import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;import java.awt.*;



class c22395244 {

    public static void main(String[] args) {
        try {
            File fichierXSD = new File("D:/Users/Balley/données/gml/commune.xsd");
            URL urlFichierXSD = fichierXSD.toURI().toURL();
            InputStream isXSD = urlFichierXSD.openStream();
            MyHelperClass DocumentBuilderFactory = new MyHelperClass();
            DocumentBuilderFactory dbFactory =(DocumentBuilderFactory)(Object) DocumentBuilderFactory.newInstance();
            DocumentBuilder builder =(DocumentBuilder)(Object) dbFactory.newDocumentBuilder();
            Document documentXSD = ((Document)(Object)builder.parse(isXSD));
            ChargeurGMLSchema chargeur = new ChargeurGMLSchema(documentXSD);
            SchemaConceptuelJeu sc =(SchemaConceptuelJeu)(Object) chargeur.gmlSchema2schemaConceptuel(documentXSD);
            System.out.println(sc.getFeatureTypes().size());
            for (int i = 0; i < (int)(Object)sc.getFeatureTypes().size(); i++) {
                System.out.println(sc.getFeatureTypes().get(i).getTypeName());
                for (int j = 0; j < (int)(Object)sc.getFeatureTypes().get(i).getFeatureAttributes().size(); j++) {
                    System.out.println("    " + sc.getFeatureTypes().get(i).getFeatureAttributes().get(j).getMemberName() + " : " + sc.getFeatureTypes().get(i).getFeatureAttributes().get(j).getValueType());
                }
            }
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (UncheckedIOException e) {
            e.printStackTrace();
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getMemberName(){ return null; }
	public MyHelperClass getTypeName(){ return null; }
	public MyHelperClass get(int o0){ return null; }
	public MyHelperClass getFeatureAttributes(){ return null; }
	public MyHelperClass newInstance(){ return null; }
	public MyHelperClass getValueType(){ return null; }
	public MyHelperClass size(){ return null; }}

class DocumentBuilderFactory {

public MyHelperClass newDocumentBuilder(){ return null; }}

class DocumentBuilder {

public MyHelperClass parse(InputStream o0){ return null; }}

class Document {

}

class ChargeurGMLSchema {

ChargeurGMLSchema(){}
	ChargeurGMLSchema(Document o0){}
	public MyHelperClass gmlSchema2schemaConceptuel(Document o0){ return null; }}

class SchemaConceptuelJeu {

public MyHelperClass getFeatureTypes(){ return null; }}

class ParserConfigurationException extends Exception{
	public ParserConfigurationException(String errorMessage) { super(errorMessage); }
}

class SAXException extends Exception{
	public SAXException(String errorMessage) { super(errorMessage); }
}

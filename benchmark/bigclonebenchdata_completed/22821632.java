import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c22821632 {
public MyHelperClass fireEventOccurred(ParsingErrorEvent o0){ return null; }
	public MyHelperClass fireEventOccurred(GeneralOutputEvent o0){ return null; }
public MyHelperClass getTagValue(String o0, Element o1){ return null; }
public MyHelperClass rtOccin;
	public MyHelperClass mapping;
	public MyHelperClass anTypes;
	public MyHelperClass evidencetype;
	public MyHelperClass anRef;
	public MyHelperClass targets;
	public MyHelperClass anOrg;
	public MyHelperClass dsASSAY;
	public MyHelperClass anComment;
	public MyHelperClass Node;
	public MyHelperClass graph;
	public MyHelperClass ccActivity;
	public MyHelperClass rtActivity;
	public MyHelperClass dsTARGET;
	public MyHelperClass DocumentBuilderFactory;
	public MyHelperClass ccTarget;
	public MyHelperClass dsCHEMBL;
	public MyHelperClass anConf;
	public MyHelperClass initMetaData(){ return null; }
	public MyHelperClass getCurrentMethodName(){ return null; }

//    @Override
    public void start() throws Throwable, Exception {
        initMetaData();
        Map<String, Set<ONDEXConcept>> accessions = new HashMap<String, Set<ONDEXConcept>>();
        for (ONDEXConcept c : (Object[])(Object)graph.getConcepts()) {
            for (ConceptAccession ca : (Object[])(Object)c.getConceptAccessions()) {
                if (ca.getElementOf().equals(dsCHEMBL) && !accessions.containsKey(ca.getAccession())) accessions.put((String)(Object)ca.getAccession(), new HashSet<ONDEXConcept>());
                accessions.get(ca.getAccession()).add(c);
            }
        }
        System.out.println(accessions);
        int count = 0;
        for (String accession : accessions.keySet()) {
            URL url = new URL("https://www.ebi.ac.uk/chemblws/compounds/" + accession + "/bioactivities");
            HttpURLConnection uc = (HttpURLConnection) url.openConnection();
            int code = uc.getResponseCode();
            if (code != 200) {
                String response = uc.getResponseMessage();
                fireEventOccurred(new ParsingErrorEvent("HTTP/1.x " + code + " " + response, getCurrentMethodName()));
            } else {
                InputStream in = new BufferedInputStream(uc.getInputStream());
                DocumentBuilderFactory dbFactory =(DocumentBuilderFactory)(Object) DocumentBuilderFactory.newInstance();
                DocumentBuilder dBuilder =(DocumentBuilder)(Object) dbFactory.newDocumentBuilder();
                Document doc =(Document)(Object) dBuilder.parse(in);
                doc.getDocumentElement().normalize();
                NodeList nList =(NodeList)(Object) doc.getElementsByTagName("bioactivity");
                for (int temp = 0; temp < (int)(Object)nList.getLength(); temp++) {
                    Node nNode =(Node)(Object) nList.item(temp);
                    if (nNode.getNodeType() == Node.ELEMENT_NODE) {
                        Element eElement = (Element)(Element)(Object) nNode;
                        ONDEXConcept activity = graph.getFactory().createConcept(getTagValue("assay__chemblid", eElement), getTagValue("assay__description", eElement), dsCHEMBL, ccActivity, evidencetype);
                        activity.createConceptAccession((String)(Object)getTagValue("assay__chemblid", eElement), dsASSAY, false);
                        activity.createAttribute(anRef,(String)(Object) getTagValue("reference", eElement), true);
                        activity.createAttribute(anOrg,(String)(Object) getTagValue("organism", eElement), true);
                        String type =(String)(Object) getTagValue("bioactivity__type", eElement);
                        type = type.replace(" ", "_");
                        if (!(Boolean)(Object)anTypes.containsKey(type)) {
                            AttributeName an = graph.getMetaData().getFactory().createAttributeName(type, Double.class);
                            String units =(String)(Object) getTagValue("units", eElement);
                            if (graph.getMetaData().getUnit(units) == null) graph.getMetaData().getFactory().createUnit(units);
                            an.setUnit(graph.getMetaData().getUnit(units));
                            anTypes.put(type, an);
                        }
                        String value =(String)(Object) getTagValue("value", eElement);
                        try {
                            Double d = Double.valueOf(value);
                            activity.createAttribute(anTypes.get(type),(String)(Object) d, false);
                        } catch (NumberFormatException nfe) {
                        }
                        String comment =(String)(Object) getTagValue("activity__comment", eElement);
                        if (comment != null && comment.trim().length() > 0) {
                            if ((boolean)(Object)mapping.containsKey(comment)) comment = mapping.get(comment);
                            activity.createAttribute(anComment, comment, true);
                        }
                        count++;
                        Set<ONDEXConcept> compounds = accessions.get(accession);
                        for (ONDEXConcept c : compounds) {
                            graph.getFactory().createRelation(c, activity, rtActivity, evidencetype);
                        }
                        String key =(String)(Object) getTagValue("target__chemblid", eElement);
                        if (!(Boolean)(Object)targets.containsKey(key)) {
                            ONDEXConcept c = graph.getFactory().createConcept(key, dsCHEMBL, ccTarget, evidencetype);
                            c.createConceptName(getTagValue("target__name", eElement), true);
                            c.createConceptAccession(key, dsTARGET, false);
                            targets.put(key, c);
                        }
                        ONDEXConcept target =(ONDEXConcept)(Object) targets.get(key);
                        ONDEXRelation r = graph.getFactory().createRelation(activity, target, rtOccin, evidencetype);
                        r.createAttribute(anConf, Double.valueOf((String)(Object)getTagValue("target__confidence", eElement)), false);
                    }
                }
            }
        }
        fireEventOccurred(new GeneralOutputEvent("Total assays parsed:" + count, getCurrentMethodName()));
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass ELEMENT_NODE;
public MyHelperClass createUnit(String o0){ return null; }
	public MyHelperClass put(String o0, AttributeName o1){ return null; }
	public MyHelperClass createRelation(ONDEXConcept o0, ONDEXConcept o1, MyHelperClass o2, MyHelperClass o3){ return null; }
	public MyHelperClass getConcepts(){ return null; }
	public MyHelperClass getUnit(String o0){ return null; }
	public MyHelperClass createAttributeName(String o0, Class<Double o1){ return null; }
	public MyHelperClass normalize(){ return null; }
	public MyHelperClass newInstance(){ return null; }
	public MyHelperClass getFactory(){ return null; }
	public MyHelperClass getMetaData(){ return null; }
	public MyHelperClass put(String o0, ONDEXConcept o1){ return null; }
	public MyHelperClass createConcept(String o0, MyHelperClass o1, MyHelperClass o2, MyHelperClass o3){ return null; }
	public MyHelperClass containsKey(String o0){ return null; }
	public MyHelperClass get(String o0){ return null; }
	public MyHelperClass createConcept(MyHelperClass o0, MyHelperClass o1, MyHelperClass o2, MyHelperClass o3, MyHelperClass o4){ return null; }}

class ONDEXConcept {

public MyHelperClass createAttribute(MyHelperClass o0, String o1, boolean o2){ return null; }
	public MyHelperClass createConceptName(MyHelperClass o0, boolean o1){ return null; }
	public MyHelperClass createConceptAccession(String o0, MyHelperClass o1, boolean o2){ return null; }
	public MyHelperClass getConceptAccessions(){ return null; }}

class ConceptAccession {

public MyHelperClass getAccession(){ return null; }
	public MyHelperClass getElementOf(){ return null; }}

class ParsingErrorEvent {

ParsingErrorEvent(String o0, MyHelperClass o1){}
	ParsingErrorEvent(){}}

class DocumentBuilderFactory {

public MyHelperClass newDocumentBuilder(){ return null; }}

class DocumentBuilder {

public MyHelperClass parse(InputStream o0){ return null; }}

class Document {

public MyHelperClass getDocumentElement(){ return null; }
	public MyHelperClass getElementsByTagName(String o0){ return null; }}

class NodeList {

public MyHelperClass item(int o0){ return null; }
	public MyHelperClass getLength(){ return null; }}

class Node {

public MyHelperClass getNodeType(){ return null; }}

class Element {

}

class AttributeName {

}

class ONDEXRelation {

}

class GeneralOutputEvent {

GeneralOutputEvent(String o0, MyHelperClass o1){}
	GeneralOutputEvent(){}}

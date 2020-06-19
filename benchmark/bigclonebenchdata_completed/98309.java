


class c98309 {
public MyHelperClass getNextLine(BufferedReader o0){ return null; }
public MyHelperClass settings;
	public MyHelperClass tools;
	public MyHelperClass getMESHdescriptorfilename(){ return null; }

    public void readMESHDescriptorFileIntoFiles(String outfiledir) {
        String inputLine, ins;
        String filename =(String)(Object) getMESHdescriptorfilename();
        String uid = "";
        String name = "";
        String description = "";
        String element_of = "";
        Vector treenr = new Vector();
        Vector related = new Vector();
        Vector synonyms = new Vector();
        Vector actions = new Vector();
        Vector chemicals = new Vector();
        Vector allCASchemicals = new Vector();
        Set CAS =(Set)(Object) new TreeSet();
        Map treenr2uid =(Map)(Object) new TreeMap();
        Map uid2name =(Map)(Object) new TreeMap();
        String cut1, cut2;
        try {
            BufferedReader in = new BufferedReader(new FileReader(filename));
            String outfile = outfiledir + "\\mesh";
            BufferedWriter out_concept = new BufferedWriter(new FileWriter(outfile + "_concept.txt"));
            BufferedWriter out_concept_name = new BufferedWriter(new FileWriter(outfile + "_concept_name.txt"));
            BufferedWriter out_relation = new BufferedWriter(new FileWriter(outfile + "_relation.txt"));
            BufferedWriter cas_mapping = new BufferedWriter(new FileWriter(outfile + "to_cas_mapping.txt"));
            BufferedWriter ec_mapping = new BufferedWriter(new FileWriter(outfile + "to_ec_mapping.txt"));
            Connection db =(Connection)(Object) tools.openDB("kb");
            String query = "SELECT hierarchy_complete,uid FROM mesh_tree, mesh_graph_uid_name WHERE term=name";
            ResultSet rs =(ResultSet)(Object) tools.executeQuery(db, query);
            while ((boolean)(Object)rs.next()) {
                String db_treenr =(String)(Object) rs.getString("hierarchy_complete");
                String db_uid =(String)(Object) rs.getString("uid");
                treenr2uid.put(db_treenr, db_uid);
            }
            db.close();
            System.out.println("Reading in the DUIDs ...");
            BufferedReader in_for_mapping = new BufferedReader(new FileReader(filename));
            inputLine =(String)(Object) getNextLine(in_for_mapping);
            boolean leave = false;
            while ((in_for_mapping != null) && (inputLine != null)) {
                if (inputLine.startsWith("<DescriptorRecord DescriptorClass")) {
                    inputLine =(String)(Object) getNextLine(in_for_mapping);
                    cut1 = "<DescriptorUI>";
                    cut2 = "</DescriptorUI>";
                    String mesh_uid = inputLine.substring(cut1.length(), inputLine.indexOf(cut2));
                    if (mesh_uid.compareTo("D041441") == 0) leave = true;
                    inputLine =(String)(Object) getNextLine(in_for_mapping);
                    inputLine =(String)(Object) getNextLine(in_for_mapping);
                    cut1 = "<String>";
                    cut2 = "</String>";
                    String mesh_name = inputLine.substring(cut1.length(), inputLine.indexOf(cut2));
                    uid2name.put(mesh_uid, mesh_name);
                }
                inputLine =(String)(Object) getNextLine(in_for_mapping);
            }
            in_for_mapping.close();
            BufferedReader in_ec_numbers = new BufferedReader(new FileReader("e:\\projects\\ondex\\ec_concept_acc.txt"));
            Set ec_numbers =(Set)(Object) new TreeSet();
            String ec_line =(String)(Object) in_ec_numbers.readLine();
            while ((boolean)(Object)in_ec_numbers.ready()) {
                StringTokenizer st = new StringTokenizer(ec_line);
                st.nextToken();
                ec_numbers.add((String)(Object)st.nextToken());
                ec_line =(String)(Object) in_ec_numbers.readLine();
            }
            in_ec_numbers.close();
            tools.printDate();
            inputLine =(String)(Object) getNextLine(in);
            while (inputLine != null) {
                if (inputLine.startsWith("<DescriptorRecord DescriptorClass")) {
                    treenr.clear();
                    related.clear();
                    synonyms.clear();
                    actions.clear();
                    chemicals.clear();
                    boolean id_ready = false;
                    boolean line_read = false;
                    while ((inputLine != null) && (!inputLine.startsWith("</DescriptorRecord>"))) {
                        line_read = false;
                        if ((inputLine.startsWith("<DescriptorUI>")) && (!id_ready)) {
                            cut1 = "<DescriptorUI>";
                            cut2 = "</DescriptorUI>";
                            uid = inputLine.substring(cut1.length(), inputLine.indexOf(cut2));
                            inputLine =(String)(Object) getNextLine(in);
                            inputLine =(String)(Object) getNextLine(in);
                            cut1 = "<String>";
                            cut2 = "</String>";
                            name = inputLine.substring(cut1.length(), inputLine.indexOf(cut2));
                            id_ready = true;
                        }
                        if (inputLine.compareTo("<SeeRelatedList>") == 0) {
                            while ((inputLine != null) && (inputLine.indexOf("</SeeRelatedList>") == -1)) {
                                if (inputLine.startsWith("<DescriptorUI>")) {
                                    cut1 = "<DescriptorUI>";
                                    cut2 = "</DescriptorUI>";
                                    String id = inputLine.substring(cut1.length(), inputLine.indexOf(cut2));
                                    related.add(id);
                                }
                                inputLine =(String)(Object) getNextLine(in);
                                line_read = true;
                            }
                        }
                        if (inputLine.compareTo("<TreeNumberList>") == 0) {
                            while ((inputLine != null) && (inputLine.indexOf("</TreeNumberList>") == -1)) {
                                if (inputLine.startsWith("<TreeNumber>")) {
                                    cut1 = "<TreeNumber>";
                                    cut2 = "</TreeNumber>";
                                    String id = inputLine.substring(cut1.length(), inputLine.indexOf(cut2));
                                    treenr.add(id);
                                }
                                inputLine =(String)(Object) getNextLine(in);
                                line_read = true;
                            }
                        }
                        if (inputLine.startsWith("<Concept PreferredConceptYN")) {
                            boolean prefConcept = false;
                            if (inputLine.compareTo("<Concept PreferredConceptYN=\"Y\">") == 0) prefConcept = true;
                            while ((inputLine != null) && (inputLine.indexOf("</Concept>") == -1)) {
                                if (inputLine.startsWith("<CASN1Name>") && prefConcept) {
                                    cut1 = "<CASN1Name>";
                                    cut2 = "</CASN1Name>";
                                    String casn1 = inputLine.substring(cut1.length(), inputLine.indexOf(cut2));
                                    String chem_name = casn1;
                                    String chem_description = "";
                                    if (casn1.length() > chem_name.length() + 2) chem_description = casn1.substring(chem_name.length() + 2, casn1.length());
                                    String reg_number = "";
                                    inputLine =(String)(Object) getNextLine(in);
                                    if (inputLine.startsWith("<RegistryNumber>")) {
                                        cut1 = "<RegistryNumber>";
                                        cut2 = "</RegistryNumber>";
                                        reg_number = inputLine.substring(cut1.length(), inputLine.indexOf(cut2));
                                    }
                                    Vector chemical = new Vector();
                                    String type = "";
                                    if (reg_number.startsWith("EC")) {
                                        type = "EC";
                                        reg_number = reg_number.substring(3, reg_number.length());
                                    } else {
                                        type = "CAS";
                                    }
                                    chemical.add(type);
                                    chemical.add(reg_number);
                                    chemical.add(chem_name);
                                    chemical.add(chem_description);
                                    chemicals.add(chemical);
                                    if (type.compareTo("CAS") == 0) {
                                        if (!(Boolean)(Object)CAS.contains(reg_number)) {
                                            CAS.add(reg_number);
                                            allCASchemicals.add(chemical);
                                        }
                                    }
                                }
                                if (inputLine.startsWith("<ScopeNote>") && prefConcept) {
                                    cut1 = "<ScopeNote>";
                                    description = inputLine.substring(cut1.length(), inputLine.length());
                                }
                                if (inputLine.startsWith("<TermUI>")) {
                                    inputLine =(String)(Object) getNextLine(in);
                                    cut1 = "<String>";
                                    cut2 = "</String>";
                                    String syn = inputLine.substring(cut1.length(), inputLine.indexOf(cut2));
                                    if (syn.indexOf("&amp;") != -1) {
                                        String syn1 = syn.substring(0, syn.indexOf("&amp;"));
                                        String syn2 = syn.substring(syn.indexOf("amp;") + 4, syn.length());
                                        syn = syn1 + " & " + syn2;
                                    }
                                    if (name.compareTo(syn) != 0) synonyms.add(syn);
                                }
                                if (inputLine.startsWith("<PharmacologicalAction>")) {
                                    inputLine =(String)(Object) getNextLine(in);
                                    inputLine =(String)(Object) getNextLine(in);
                                    cut1 = "<DescriptorUI>";
                                    cut2 = "</DescriptorUI>";
                                    String act_ui = inputLine.substring(cut1.length(), inputLine.indexOf(cut2));
                                    actions.add(act_ui);
                                }
                                inputLine =(String)(Object) getNextLine(in);
                                line_read = true;
                            }
                        }
                        if (!line_read) inputLine =(String)(Object) getNextLine(in);
                    }
                    String pos_tag = "";
                    element_of = "MESHD";
                    String is_primary = "0";
                    out_concept.write(uid + "\t" + pos_tag + "\t" + description + "\t" + element_of + "\t");
                    out_concept.write(is_primary + "\n");
                    String name_stemmed = "";
                    String name_tagged = "";
                    element_of = "MESHD";
                    String is_unique = "0";
                    int is_preferred = 1;
                    String original_name = name;
                    String is_not_substring = "0";
                    out_concept_name.write(uid + "\t" + name + "\t" + name_stemmed + "\t");
                    out_concept_name.write(name_tagged + "\t" + element_of + "\t");
                    out_concept_name.write(is_unique + "\t" + is_preferred + "\t");
                    out_concept_name.write(original_name + "\t" + is_not_substring + "\n");
                    is_preferred = 0;
                    for (int i = 0; i < (int)(Object)synonyms.size(); i++) {
                        name = (String)(String)(Object) synonyms.get(i);
                        original_name = name;
                        out_concept_name.write(uid + "\t" + name + "\t" + name_stemmed + "\t");
                        out_concept_name.write(name_tagged + "\t" + element_of + "\t");
                        out_concept_name.write(is_unique + "\t" + is_preferred + "\t");
                        out_concept_name.write(original_name + "\t" + is_not_substring + "\n");
                    }
                    String rel_type = "is_r";
                    element_of = "MESHD";
                    String from_name = name;
                    for (int i = 0; i < (int)(Object)related.size(); i++) {
                        String to_uid = (String)(String)(Object) related.get(i);
                        String to_name = (String)(String)(Object) uid2name.get(to_uid);
                        out_relation.write(uid + "\t" + to_uid + "\t");
                        out_relation.write(rel_type + "\t" + element_of + "\t");
                        out_relation.write(from_name + "\t" + to_name + "\n");
                    }
                    rel_type = "is_a";
                    element_of = "MESHD";
                    related.clear();
                    for (int i = 0; i < (int)(Object)treenr.size(); i++) {
                        String tnr = (String)(String)(Object) treenr.get(i);
                        if (tnr.length() > 3) tnr = tnr.substring(0, tnr.lastIndexOf("."));
                        String rel_uid = (String)(String)(Object) treenr2uid.get(tnr);
                        if (rel_uid != null) related.add(rel_uid); else System.out.println(uid + ": No DUI found for " + tnr);
                    }
                    for (int i = 0; i < (int)(Object)related.size(); i++) {
                        String to_uid = (String)(String)(Object) related.get(i);
                        String to_name = (String)(String)(Object) uid2name.get(to_uid);
                        out_relation.write(uid + "\t" + to_uid + "\t");
                        out_relation.write(rel_type + "\t" + element_of + "\t");
                        out_relation.write(from_name + "\t" + to_name + "\n");
                    }
                    if ((int)(Object)related.size() == 0) System.out.println(uid + ": No is_a relations");
                    rel_type = "act";
                    element_of = "MESHD";
                    for (int i = 0; i < (int)(Object)actions.size(); i++) {
                        String to_uid = (String)(String)(Object) actions.get(i);
                        String to_name = (String)(String)(Object) uid2name.get(to_uid);
                        out_relation.write(uid + "\t" + to_uid + "\t");
                        out_relation.write(rel_type + "\t" + element_of + "\t");
                        out_relation.write(from_name + "\t" + to_name + "\n");
                    }
                    String method = "IMPM";
                    String score = "1.0";
                    for (int i = 0; i < (int)(Object)chemicals.size(); i++) {
                        Vector chemical = (Vector)(Vector)(Object) chemicals.get(i);
                        String type = (String)(String)(Object) chemical.get(0);
                        String chem = (String)(String)(Object) chemical.get(1);
                        if (!(Boolean)(Object)ec_numbers.contains(chem) && (type.compareTo("EC") == 0)) {
                            if (chem.compareTo("1.14.-") == 0) chem = "1.14.-.-"; else System.out.println("MISSING EC: " + chem);
                        }
                        String id = type + ":" + chem;
                        String entry = uid + "\t" + id + "\t" + method + "\t" + score + "\n";
                        if (type.compareTo("CAS") == 0) cas_mapping.write(entry); else ec_mapping.write(entry);
                    }
                } else inputLine =(String)(Object) getNextLine(in);
            }
            System.out.println("End import descriptors");
            tools.printDate();
            in.close();
            out_concept.close();
            out_concept_name.close();
            out_relation.close();
            cas_mapping.close();
            ec_mapping.close();
            outfile = outfiledir + "\\cas";
            out_concept = new BufferedWriter(new FileWriter(outfile + "_concept.txt"));
            out_concept_name = new BufferedWriter(new FileWriter(outfile + "_concept_name.txt"));
            BufferedWriter out_concept_acc = new BufferedWriter(new FileWriter(outfile + "_concept_acc.txt"));
            for (int i = 0; i < (int)(Object)allCASchemicals.size(); i++) {
                Vector chemical = (Vector)(Vector)(Object) allCASchemicals.get(i);
                String cas_id = "CAS:" + (String)(String)(Object) chemical.get(1);
                String cas_name = (String)(String)(Object) chemical.get(2);
                String cas_pos_tag = "";
                String cas_description = (String)(String)(Object) chemical.get(3);
                String cas_element_of = "CAS";
                String cas_is_primary = "0";
                out_concept.write(cas_id + "\t" + cas_pos_tag + "\t" + cas_description + "\t");
                out_concept.write(cas_element_of + "\t" + cas_is_primary + "\n");
                String cas_name_stemmed = "";
                String cas_name_tagged = "";
                String cas_is_unique = "0";
                String cas_is_preferred = "0";
                String cas_original_name = cas_name;
                String cas_is_not_substring = "0";
                out_concept_name.write(cas_id + "\t" + cas_name + "\t" + cas_name_stemmed + "\t");
                out_concept_name.write(cas_name_tagged + "\t" + cas_element_of + "\t");
                out_concept_name.write(cas_is_unique + "\t" + cas_is_preferred + "\t");
                out_concept_name.write(cas_original_name + "\t" + cas_is_not_substring + "\n");
                out_concept_acc.write(cas_id + "\t" + (String)(String)(Object) chemical.get(1) + "\t");
                out_concept_acc.write(cas_element_of + "\n");
            }
            out_concept.close();
            out_concept_name.close();
            out_concept_acc.close();
        } catch (Exception e) {
            settings.writeLog("Error while reading MESH descriptor file: " + e.getMessage());
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass writeLog(String o0){ return null; }
	public MyHelperClass openDB(String o0){ return null; }
	public MyHelperClass printDate(){ return null; }
	public MyHelperClass executeQuery(Connection o0, String o1){ return null; }}

class Vector {

public MyHelperClass size(){ return null; }
	public MyHelperClass add(String o0){ return null; }
	public MyHelperClass add(Vector o0){ return null; }
	public MyHelperClass get(int o0){ return null; }
	public MyHelperClass clear(){ return null; }}

class Set {

public MyHelperClass contains(String o0){ return null; }
	public MyHelperClass add(String o0){ return null; }}

class TreeSet {

}

class Map {

public MyHelperClass put(String o0, String o1){ return null; }
	public MyHelperClass get(String o0){ return null; }}

class TreeMap {

}

class BufferedReader {

BufferedReader(){}
	BufferedReader(FileReader o0){}
	public MyHelperClass readLine(){ return null; }
	public MyHelperClass ready(){ return null; }
	public MyHelperClass close(){ return null; }}

class FileReader {

FileReader(String o0){}
	FileReader(){}}

class BufferedWriter {

BufferedWriter(){}
	BufferedWriter(FileWriter o0){}
	public MyHelperClass write(String o0){ return null; }
	public MyHelperClass close(){ return null; }}

class FileWriter {

FileWriter(String o0){}
	FileWriter(){}}

class Connection {

public MyHelperClass close(){ return null; }}

class ResultSet {

public MyHelperClass next(){ return null; }
	public MyHelperClass getString(String o0){ return null; }}

class StringTokenizer {

StringTokenizer(String o0){}
	StringTokenizer(){}
	public MyHelperClass nextToken(){ return null; }}

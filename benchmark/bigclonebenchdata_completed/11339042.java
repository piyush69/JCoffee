import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c11339042 {
public MyHelperClass HttpUtils;
public MyHelperClass MimeConstants;
	public MyHelperClass TransformerFactory;
	public MyHelperClass PredictPortlet;
	public MyHelperClass FopFactory;
	public MyHelperClass NmrshiftdbConstants;
	public MyHelperClass ParseUtils;
	public MyHelperClass Velocity;
public MyHelperClass DBSamplePeer;
	public MyHelperClass DBMoleculePeer;
	public MyHelperClass JasperFillManager;
	public MyHelperClass JasperExportManager;
	public MyHelperClass DBCanonicalNamePeer;
	public MyHelperClass JRLoader;
	public MyHelperClass NmrshiftdbUserPeer;
	public MyHelperClass DBSpectrumTypePeer;
	public MyHelperClass TurbineDB;
	public MyHelperClass Statistics;
	public MyHelperClass ServletUtils;
	public MyHelperClass GeneralUtils;
	public MyHelperClass DBSpectrumPeer;
	public MyHelperClass getServletConfig(){ return null; }

    public void doPost(HttpServletRequest req, HttpServletResponse res) throws Throwable, ServletException, IOException {
        PrintWriter out = null;
        ServletOutputStream outstream = null;
        try {
            String action =(String)(Object) req.getParameter("nmrshiftdbaction");
            String relativepath =(String)(Object) ServletUtils.expandRelative(this.getServletConfig(), "/WEB-INF");
            TurbineConfig tc = new TurbineConfig(relativepath + "..", relativepath + getServletConfig().getInitParameter("properties"));
            tc.init();
            int spectrumId = -1;
            DBSpectrum spectrum = null;
            Export export = null;
            String format =(String)(Object) req.getParameter("format");
            if (action.equals("test")) {
                try {
                    res.setContentType("text/plain");
                    out =(PrintWriter)(Object) res.getWriter();
                    List l =(List)(Object) DBSpectrumPeer.executeQuery("select SPECTRUM_ID from SPECTRUM limit 1");
                    if (l.size() > 0) spectrumId =(int)(Object) ((Record) l.get(0)).getValue(1).asInt();
                    out.write("success");
                } catch (Exception ex) {
                    out.write("failure");
                }
            } else if (action.equals("rss")) {
                int numbertoexport = 10;
                out =(PrintWriter)(Object) res.getWriter();
                if (req.getParameter("numbertoexport") != null) {
                    try {
                        numbertoexport = Integer.parseInt((String)(Object)req.getParameter("numbertoexport"));
                        if (numbertoexport < 1 || numbertoexport > 20) throw new NumberFormatException("Number to small/large");
                    } catch (NumberFormatException ex) {
                        out.println("The parameter <code>numbertoexport</code>must be an integer from 1 to 20");
                    }
                }
                res.setContentType("text/xml");
                RssWriter rssWriter = new RssWriter();
                rssWriter.setWriter(res.getWriter());
                AtomContainerSet soac = new AtomContainerSet();
                String query = "select distinct MOLECULE.MOLECULE_ID from MOLECULE, SPECTRUM where SPECTRUM.MOLECULE_ID = MOLECULE.MOLECULE_ID and SPECTRUM.REVIEW_FLAG =\"true\" order by MOLECULE.DATE desc;";
                List l =(List)(Object) NmrshiftdbUserPeer.executeQuery(query);
                for (int i = 0; i < numbertoexport; i++) {
                    if (i == l.size()) break;
                    DBMolecule mol =(DBMolecule)(Object) DBMoleculePeer.retrieveByPK(new NumberKey(((Record) l.get(i)).getValue(1).asInt()));
                    IMolecule cdkmol =(IMolecule)(Object) mol.getAsCDKMoleculeAsEntered(1);
                    soac.addAtomContainer(cdkmol);
                    rssWriter.getLinkmap().put(cdkmol, mol.getEasylink(req));
                    rssWriter.getDatemap().put(cdkmol, mol.getDate());
                    rssWriter.getTitlemap().put(cdkmol, mol.getChemicalNamesAsOneStringWithFallback());
                    rssWriter.getCreatormap().put(cdkmol, mol.getNmrshiftdbUser().getUserName());
                    rssWriter.setCreator(GeneralUtils.getAdminEmail(getServletConfig()));
                    Vector v =(Vector)(Object) mol.getDBCanonicalNames();
                    for (int k = 0; k < v.size(); k++) {
                        DBCanonicalName canonName = (DBCanonicalName) v.get(k);
                        if ((String)(Object)canonName.getDBCanonicalNameType().getCanonicalNameType() == "INChI") {
                            rssWriter.getInchimap().put(cdkmol, canonName.getName());
                            break;
                        }
                    }
                    rssWriter.setTitle("NMRShiftDB");
                    rssWriter.setLink("http://www.nmrshiftdb.org");
                    rssWriter.setDescription("NMRShiftDB is an open-source, open-access, open-submission, open-content web database for chemical structures and their nuclear magnetic resonance data");
                    rssWriter.setPublisher("NMRShiftDB.org");
                    rssWriter.setImagelink("http://www.nmrshiftdb.org/images/nmrshift-logo.gif");
                    rssWriter.setAbout("http://www.nmrshiftdb.org/NmrshiftdbServlet?nmrshiftdbaction=rss");
                    Collection coll = new ArrayList();
                    Vector spectra =(Vector)(Object) mol.selectSpectra(null);
                    for (int k = 0; k < spectra.size(); k++) {
                        Element el =(Element)(Object) ((DBSpectrum) spectra.get(k)).getCmlSpect();
                        Element el2 =(Element)(Object) el.getChildElements().get(0);
                        el.removeChild(el2);
                        coll.add(el2);
                    }
                    rssWriter.getMultiMap().put(cdkmol, coll);
                }
                rssWriter.write(soac);
            } else if (action.equals("getattachment")) {
                res.setContentType("application/zip");
                outstream =(ServletOutputStream)(Object) res.getOutputStream();
                DBSample sample =(DBSample)(Object) DBSamplePeer.retrieveByPK(new NumberKey(req.getParameter("sampleid")));
                outstream.write(sample.getAttachment());
            } else if (action.equals("createreport")) {
                res.setContentType("application/pdf");
                outstream =(ServletOutputStream)(Object) res.getOutputStream();
                boolean yearly = req.getParameter("style").equals("yearly");
                int yearstart = Integer.parseInt((String)(Object)req.getParameter("yearstart"));
                int yearend = Integer.parseInt((String)(Object)req.getParameter("yearend"));
                int monthstart = 0;
                int monthend = 0;
                if (!yearly) {
                    monthstart = Integer.parseInt((String)(Object)req.getParameter("monthstart"));
                    monthend = Integer.parseInt((String)(Object)req.getParameter("monthend"));
                }
                int type = Integer.parseInt((String)(Object)req.getParameter("type"));
                JasperReport jasperReport = (JasperReport)(JasperReport)(Object) JRLoader.loadObject(relativepath + "/reports/" + (yearly ? "yearly" : "monthly") + "_report_" + type + ".jasper");
                Map parameters = new HashMap();
                if (yearly) parameters.put("HEADER", "Report for years " + yearstart + " - " + yearend); else parameters.put("HEADER", "Report for " + monthstart + "/" + yearstart + " - " + monthend + "/" + yearend);
                DBConnection dbconn =(DBConnection)(Object) TurbineDB.getConnection();
                Connection conn =(Connection)(Object) dbconn.getConnection();
                Statement stmt =(Statement)(Object) conn.createStatement();
                ResultSet rs = null;
                if (type == 1) {
                    rs =(ResultSet)(Object) stmt.executeQuery("select YEAR(DATE) as YEAR, " + (yearly ? "" : " MONTH(DATE) as MONTH, ") + "AFFILIATION_1, AFFILIATION_2, MACHINE.NAME as NAME, count(*) as C, sum(WISHED_SPECTRUM like '%13C%' or WISHED_SPECTRUM like '%variable temperature%' or WISHED_SPECTRUM like '%ID sel. NOE%' or WISHED_SPECTRUM like '%solvent suppression%' or WISHED_SPECTRUM like '%standard spectrum%') as 1_D, sum(WISHED_SPECTRUM like '%H,H-COSY%' or WISHED_SPECTRUM like '%NOESY%' or WISHED_SPECTRUM like '%HMQC%' or WISHED_SPECTRUM like '%HMBC%') as 2_D, sum(OTHER_WISHED_SPECTRUM!='') as SPECIAL, sum(OTHER_NUCLEI!='') as HETERO, sum(PROCESS='self') as SELF, sum(PROCESS='robot') as ROBOT, sum(PROCESS='worker') as OPERATOR from (SAMPLE join TURBINE_USER using (USER_ID)) join MACHINE on MACHINE.MACHINE_ID=SAMPLE.MACHINE where YEAR(DATE)>=" + yearstart + " and YEAR(DATE)<=" + yearend + " and LOGIN_NAME<>'testuser' group by YEAR, " + (yearly ? "" : "MONTH, ") + "AFFILIATION_1, AFFILIATION_2, MACHINE.NAME");
                } else if (type == 2) {
                    rs =(ResultSet)(Object) stmt.executeQuery("select YEAR(DATE) as YEAR, " + (yearly ? "" : " MONTH(DATE) as MONTH, ") + "MACHINE.NAME as NAME, count(*) as C, sum(WISHED_SPECTRUM like '%13C%' or WISHED_SPECTRUM like '%variable temperature%' or WISHED_SPECTRUM like '%ID sel. NOE%' or WISHED_SPECTRUM like '%solvent suppression%' or WISHED_SPECTRUM like '%standard spectrum%') as 1_D, sum(WISHED_SPECTRUM like '%H,H-COSY%' or WISHED_SPECTRUM like '%NOESY%' or WISHED_SPECTRUM like '%HMQC%' or WISHED_SPECTRUM like '%HMBC%') as 2_D, sum(OTHER_WISHED_SPECTRUM!='') as SPECIAL, sum(OTHER_NUCLEI!='') as HETERO, sum(PROCESS='self') as SELF, sum(PROCESS='robot') as ROBOT, sum(PROCESS='worker') as OPERATOR from (SAMPLE join TURBINE_USER using (USER_ID)) join MACHINE on MACHINE.MACHINE_ID=SAMPLE.MACHINE group by YEAR, " + (yearly ? "" : "MONTH, ") + "MACHINE.NAME");
                }
                JasperPrint jasperPrint =(JasperPrint)(Object) JasperFillManager.fillReport(jasperReport, parameters, new JRResultSetDataSource(rs));
                JasperExportManager.exportReportToPdfStream(jasperPrint, outstream);
                dbconn.close();
            } else if (action.equals("exportcmlbyinchi")) {
                res.setContentType("text/xml");
                out =(PrintWriter)(Object) res.getWriter();
                String inchi =(String)(Object) req.getParameter("inchi");
                String spectrumtype =(String)(Object) req.getParameter("spectrumtype");
                Criteria crit = new Criteria();
                crit.add(DBCanonicalNamePeer.NAME, inchi);
                crit.addJoin(DBCanonicalNamePeer.MOLECULE_ID, DBSpectrumPeer.MOLECULE_ID);
                crit.addJoin(DBSpectrumPeer.SPECTRUM_TYPE_ID, DBSpectrumTypePeer.SPECTRUM_TYPE_ID);
                crit.add(DBSpectrumTypePeer.NAME, spectrumtype);
                try {
                    GeneralUtils.logToSql(crit.toString(), null);
                } catch (Exception ex) {
                }
                Vector spectra =(Vector)(Object) DBSpectrumPeer.doSelect(crit);
                if (spectra.size() == 0) {
                    out.write("No such molecule or spectrum");
                } else {
                    Element cmlElement = new Element("cml");
                    cmlElement.addAttribute(new Attribute("convention", "nmrshiftdb-convention"));
                    cmlElement.setNamespaceURI("http://www.xml-cml.org/schema");
                    Element parent =(Element)(Object) ((DBSpectrum) spectra.get(0)).getDBMolecule().getCML(1);
                    Node cmldoc =(Node)(Object) parent.getChild(0);
                    ((Element)(Element)(Object) cmldoc).setNamespaceURI("http://www.xml-cml.org/schema");
                    parent.removeChildren();
                    cmlElement.appendChild(cmldoc);
                    for (int k = 0; k < spectra.size(); k++) {
                        Element parentspec =(Element)(Object) ((DBSpectrum) spectra.get(k)).getCmlSpect();
                        Node spectrumel =(Node)(Object) parentspec.getChild(0);
                        parentspec.removeChildren();
                        cmlElement.appendChild(spectrumel);
                        ((Element)(Element)(Object) spectrumel).setNamespaceURI("http://www.xml-cml.org/schema");
                    }
                    out.write((int)(Object)cmlElement.toXML());
                }
            } else if (action.equals("namelist")) {
                res.setContentType("application/zip");
                outstream =(ServletOutputStream)(Object) res.getOutputStream();
                ByteArrayOutputStream baos = new ByteArrayOutputStream();
                ZipOutputStream zipout = new ZipOutputStream(baos);
                Criteria crit = new Criteria();
                crit.addJoin(DBMoleculePeer.MOLECULE_ID, DBSpectrumPeer.MOLECULE_ID);
                crit.add(DBSpectrumPeer.REVIEW_FLAG, "true");
                Vector v =(Vector)(Object) DBMoleculePeer.doSelect(crit);
                for (int i = 0; i < v.size(); i++) {
                    if (i % 500 == 0) {
                        if (i != 0) {
                            zipout.write(new String("<p>The list is continued <a href=\"nmrshiftdb.names." + i + ".html\">here</a></p></body></html>").getBytes());
                            zipout.closeEntry();
                        }
                        zipout.putNextEntry(new ZipEntry("nmrshiftdb.names." + i + ".html"));
                        zipout.write(new String("<html><body><h1>This is a list of strcutures in <a href=\"http://www.nmrshiftdb.org\">NMRShiftDB</a>, starting at " + i + ", Its main purpose is to be found by search engines</h1>").getBytes());
                    }
                    DBMolecule mol = (DBMolecule) v.get(i);
                    zipout.write(new String("<p><a href=\"" + mol.getEasylink(req) + "\">").getBytes());
                    Vector cannames =(Vector)(Object) mol.getDBCanonicalNames();
                    for (int k = 0; k < cannames.size(); k++) {
                        zipout.write(new String(((DBCanonicalName) cannames.get(k)).getName() + " ").getBytes());
                    }
                    Vector chemnames =(Vector)(Object) mol.getDBChemicalNames();
                    for (int k = 0; k < chemnames.size(); k++) {
                        zipout.write(new String(((DBChemicalName) chemnames.get(k)).getName() + " ").getBytes());
                    }
                    zipout.write(new String("</a>. Information we have got: NMR spectra").getBytes());
                    Vector spectra =(Vector)(Object) mol.selectSpectra();
                    for (int k = 0; k < spectra.size(); k++) {
                        zipout.write(new String(((DBSpectrum) spectra.get(k)).getDBSpectrumType().getName() + ", ").getBytes());
                    }
                    if ((boolean)(Object)mol.hasAny3d()) zipout.write(new String("3D coordinates, ").getBytes());
                    zipout.write(new String("File formats: CML, mol, png, jpeg").getBytes());
                    zipout.write(new String("</p>").getBytes());
                }
                zipout.write(new String("</body></html>").getBytes());
                zipout.closeEntry();
                zipout.close();
                InputStream is = new ByteArrayInputStream(baos.toByteArray());
                byte[] buf = new byte[32 * 1024];
                int nRead = 0;
                while ((nRead = is.read(buf)) != -1) {
                    outstream.write(buf, 0, nRead);
                }
            } else if (action.equals("predictor")) {
                if (req.getParameter("symbol") == null) {
                    res.setContentType("text/plain");
                    out =(PrintWriter)(Object) res.getWriter();
                    out.write("please give the symbol to create the predictor for in the request with symbol=X (e. g. symbol=C");
                }
                res.setContentType("application/zip");
                outstream =(ServletOutputStream)(Object) res.getOutputStream();
                ByteArrayOutputStream baos = new ByteArrayOutputStream();
                ZipOutputStream zipout = new ZipOutputStream(baos);
                String filename = "org/openscience/nmrshiftdb/PredictionTool.class";
                zipout.putNextEntry(new ZipEntry(filename));
                JarInputStream jip = new JarInputStream(new FileInputStream((String)(Object)ServletUtils.expandRelative(getServletConfig(), "/WEB-INF/lib/nmrshiftdb-lib.jar")));
                JarEntry entry =(JarEntry)(Object) jip.getNextJarEntry();
                while ((int)(Object)entry.getName().indexOf("PredictionTool.class") == -1) {
                    entry =(JarEntry)(Object) jip.getNextJarEntry();
                }
                for (int i = 0; i < (int)(Object)entry.getSize(); i++) {
                    zipout.write((byte[])(Object)jip.read());
                }
                zipout.closeEntry();
                zipout.putNextEntry(new ZipEntry("nmrshiftdb.csv"));
                int i = 0;
                DBConnection conn =(DBConnection)(Object) TurbineDB.getConnection();
                HashMap mapsmap = new HashMap();
                while (true) {
                    Statement stmt =(Statement)(Object) conn.createStatement();
                    ResultSet rs =(ResultSet)(Object) stmt.executeQuery("select HOSE_CODE, VALUE, SYMBOL from HOSE_CODES where CONDITION_TYPE='m' and WITH_RINGS=0 and SYMBOL='" + req.getParameter("symbol") + "' limit " + (i * 1000) + ", 1000");
                    int m = 0;
                    while ((boolean)(Object)rs.next()) {
                        String code =(String)(Object) rs.getString(1);
                        Double value = new Double((double)(Object)rs.getString(2));
                        String symbol =(String)(Object) rs.getString(3);
                        if (mapsmap.get(symbol) == null) {
                            mapsmap.put(symbol, new HashMap());
                        }
                        for (int spheres = 6; spheres > 0; spheres--) {
                            StringBuffer hoseCodeBuffer = new StringBuffer();
                            StringTokenizer st = new StringTokenizer(code, "()/");
                            for (int k = 0; k < spheres; k++) {
                                if (st.hasMoreTokens()) {
                                    String partcode = st.nextToken();
                                    hoseCodeBuffer.append(partcode);
                                }
                                if (k == 0) {
                                    hoseCodeBuffer.append("(");
                                } else if (k == 3) {
                                    hoseCodeBuffer.append(")");
                                } else {
                                    hoseCodeBuffer.append("/");
                                }
                            }
                            String hoseCode = hoseCodeBuffer.toString();
                            if (((HashMap) mapsmap.get(symbol)).get(hoseCode) == null) {
                                ((HashMap) mapsmap.get(symbol)).put(hoseCode, new ArrayList());
                            }
                            ((ArrayList) ((HashMap) mapsmap.get(symbol)).get(hoseCode)).add(value);
                        }
                        m++;
                    }
                    i++;
                    stmt.close();
                    if (m == 0) break;
                }
                Set keySet = mapsmap.keySet();
                Iterator it = keySet.iterator();
                while (it.hasNext()) {
                    String symbol = (String) it.next();
                    HashMap hosemap = ((HashMap) mapsmap.get(symbol));
                    Set keySet2 = hosemap.keySet();
                    Iterator it2 = keySet2.iterator();
                    while (it2.hasNext()) {
                        String hoseCode = (String) it2.next();
                        ArrayList list = ((ArrayList) hosemap.get(hoseCode));
                        double[] values = new double[list.size()];
                        for (int k = 0; k < list.size(); k++) {
                            values[k] = ((Double) list.get(k)).doubleValue();
                        }
                        zipout.write(new String(symbol + "|" + hoseCode + "|" + Statistics.minimum(values) + "|" + Statistics.average(values) + "|" + Statistics.maximum(values) + "\r\n").getBytes());
                    }
                }
                zipout.closeEntry();
                zipout.close();
                InputStream is = new ByteArrayInputStream(baos.toByteArray());
                byte[] buf = new byte[32 * 1024];
                int nRead = 0;
                i = 0;
                while ((nRead = is.read(buf)) != -1) {
                    outstream.write(buf, 0, nRead);
                }
            } else if (action.equals("exportspec") || action.equals("exportmol")) {
                if (spectrumId > -1) spectrum =(DBSpectrum)(Object) DBSpectrumPeer.retrieveByPK(new NumberKey(spectrumId)); else spectrum = DBSpectrumPeer.retrieveByPK(new NumberKey(req.getParameter("spectrumid")));
                export = new Export(spectrum);
            } else if (action.equals("exportmdl")) {
                res.setContentType("text/plain");
                outstream =(ServletOutputStream)(Object) res.getOutputStream();
                DBMolecule mol =(DBMolecule)(Object) DBMoleculePeer.retrieveByPK(new NumberKey(req.getParameter("moleculeid")));
                outstream.write(mol.getStructureFile(Integer.parseInt((String)(Object)req.getParameter("coordsetid")), false).getBytes());
            } else if (action.equals("exportlastinputs")) {
                format = action;
            } else if (action.equals("printpredict")) {
                res.setContentType("text/html");
                out =(PrintWriter)(Object) res.getWriter();
                HttpSession session =(HttpSession)(Object) req.getSession();
                VelocityContext context = PredictPortlet.getContext(session, true, true, new StringBuffer(), getServletConfig(), req, true);
                StringWriter w = new StringWriter();
                Velocity.mergeTemplate("predictprint.vm", "ISO-8859-1", context, w);
                out.println(w.toString());
            } else {
                res.setContentType("text/html");
                out =(PrintWriter)(Object) res.getWriter();
                out.println("No valid action");
            }
            if (format == null) format = "";
            if (format.equals("pdf") || format.equals("rtf")) {
                res.setContentType("application/" + format);
                out =(PrintWriter)(Object) res.getWriter();
            }
            if (format.equals("docbook")) {
                res.setContentType("application/zip");
                outstream =(ServletOutputStream)(Object) res.getOutputStream();
            }
            if (format.equals("svg")) {
                res.setContentType("image/x-svg");
                out =(PrintWriter)(Object) res.getWriter();
            }
            if (format.equals("tiff")) {
                res.setContentType("image/tiff");
                outstream =(ServletOutputStream)(Object) res.getOutputStream();
            }
            if (format.equals("jpeg")) {
                res.setContentType("image/jpeg");
                outstream =(ServletOutputStream)(Object) res.getOutputStream();
            }
            if (format.equals("png")) {
                res.setContentType("image/png");
                outstream =(ServletOutputStream)(Object) res.getOutputStream();
            }
            if (format.equals("mdl") || format.equals("txt") || format.equals("cml") || format.equals("cmlboth") || format.indexOf("exsection") == 0) {
                res.setContentType("text/plain");
                out =(PrintWriter)(Object) res.getWriter();
            }
            if (format.equals("simplehtml") || format.equals("exportlastinputs")) {
                res.setContentType("text/html");
                out =(PrintWriter)(Object) res.getWriter();
            }
            if (action.equals("exportlastinputs")) {
                int numbertoexport = 4;
                if (req.getParameter("numbertoexport") != null) {
                    try {
                        numbertoexport = Integer.parseInt((String)(Object)req.getParameter("numbertoexport"));
                        if (numbertoexport < 1 || numbertoexport > 20) throw new NumberFormatException("Number to small/large");
                    } catch (NumberFormatException ex) {
                        out.println("The parameter <code>numbertoexport</code>must be an integer from 1 to 20");
                    }
                }
                NmrshiftdbUser user = null;
                try {
                    user =(NmrshiftdbUser)(Object) NmrshiftdbUserPeer.getByName(req.getParameter("username"));
                } catch (NmrshiftdbException ex) {
                    out.println("Seems <code>username</code> is not OK: " + ex.getMessage());
                }
                if (user != null) {
                    List l = NmrshiftdbUserPeer.executeQuery("SELECT LAST_DOWNLOAD_DATE FROM TURBINE_USER  where LOGIN_NAME=\"" + user.getUserName() + "\";");
                    Date lastDownloadDate =(Date)(Object) ((Record) l.get(0)).getValue(1).asDate();
                    if (((new Date().getTime() - lastDownloadDate.getTime()) / 3600000) < 24) {
                        out.println("Your last download was at " + lastDownloadDate + ". You may download your last inputs only once a day. Sorry for this, but we need to be carefull with resources. If you want to put your last inputs on your homepage best use some sort of cache (e. g. use wget for downlaod with crond and link to this static resource))!");
                    } else {
                        NmrshiftdbUserPeer.executeStatement("UPDATE TURBINE_USER SET LAST_DOWNLOAD_DATE=NOW() where LOGIN_NAME=\"" + user.getUserName() + "\";");
                        Vector<String> parameters = new Vector<String>();
                        String query = "select distinct MOLECULE.MOLECULE_ID from MOLECULE, SPECTRUM where SPECTRUM.MOLECULE_ID = MOLECULE.MOLECULE_ID and SPECTRUM.REVIEW_FLAG =\"true\" and SPECTRUM.USER_ID=" + user.getUserId() + " order by MOLECULE.DATE desc;";
                        l =(List)(Object) NmrshiftdbUserPeer.executeQuery(query);
                        String url = HttpUtils.getRequestURL(req).toString();
                        url = url.substring(0, url.length() - 17);
                        for (int i = 0; i < numbertoexport; i++) {
                            if (i == l.size()) break;
                            DBMolecule mol =(DBMolecule)(Object) DBMoleculePeer.retrieveByPK(new NumberKey(((Record) l.get(i)).getValue(1).asInt()));
                            parameters.add(new String("<a href=\"" + url + "/portal/pane0/Results?nmrshiftdbaction=showDetailsFromHome&molNumber=" + mol.getMoleculeId() + "\"><img src=\"" + HttpUtils.getRequestURL(req).toString() + "?nmrshiftdbaction=exportmol&spectrumid=" + ((DBSpectrum) mol.getDBSpectrums().get(0)).getSpectrumId() + "&format=jpeg&size=150x150&backcolor=12632256\"></a>"));
                        }
                        VelocityContext context = new VelocityContext();
                        context.put("results", parameters);
                        StringWriter w = new StringWriter();
                        Velocity.mergeTemplate("lateststructures.vm", "ISO-8859-1", context, w);
                        out.println(w.toString());
                    }
                }
            }
            if (action.equals("exportspec")) {
                if (format.equals("txt")) {
                    String lastsearchtype =(String)(Object) req.getParameter("lastsearchtype");
                    if (lastsearchtype.equals(NmrshiftdbConstants.TOTALSPECTRUM) || lastsearchtype.equals(NmrshiftdbConstants.SUBSPECTRUM)) {
                        List l = ParseUtils.parseSpectrumFromSpecFile(req.getParameter("lastsearchvalues"));
                        spectrum.initSimilarity(l, lastsearchtype.equals(NmrshiftdbConstants.SUBSPECTRUM));
                    }
                    Vector v =(Vector)(Object) spectrum.getOptions();
                    DBMolecule mol =(DBMolecule)(Object) spectrum.getDBMolecule();
                    out.print(mol.getChemicalNamesAsOneString(false) + (int)(Object)mol.getMolecularFormula(false) + "; " + mol.getMolecularWeight() + " Dalton\n\r");
                    out.print("\n\rAtom\t");
                    if ((String)(Object)spectrum.getDBSpectrumType().getElementSymbol() == ("H")) out.print("Mult.\t");
                    out.print("Meas.");
                    if (lastsearchtype.equals(NmrshiftdbConstants.TOTALSPECTRUM) || lastsearchtype.equals(NmrshiftdbConstants.SUBSPECTRUM)) {
                        out.print("\tInput\tDiff");
                    }
                    out.print("\n\r");
                    out.print("No.\t");
                    if ((String)(Object)spectrum.getDBSpectrumType().getElementSymbol() == ("H")) out.print("\t");
                    out.print("Shift");
                    if (lastsearchtype.equals(NmrshiftdbConstants.TOTALSPECTRUM) || lastsearchtype.equals(NmrshiftdbConstants.SUBSPECTRUM)) {
                        out.print("\tShift\tM-I");
                    }
                    out.print("\n\r");
                    for (int i = 0; i < v.size(); i++) {
                        out.print(((ValuesForVelocityBean) v.get(i)).getDisplayText() + "\t" + ((ValuesForVelocityBean) v.get(i)).getRange());
                        if (lastsearchtype.equals(NmrshiftdbConstants.TOTALSPECTRUM) || lastsearchtype.equals(NmrshiftdbConstants.SUBSPECTRUM)) {
                            out.print("\t" + ((ValuesForVelocityBean) v.get(i)).getNameForElements() + "\t" + ((ValuesForVelocityBean) v.get(i)).getDelta());
                        }
                        out.print("\n\r");
                    }
                }
                if (format.equals("simplehtml")) {
                    String i1 =(String)(Object) export.getImage(false, "jpeg", ServletUtils.expandRelative(this.getServletConfig(), "/nmrshiftdbhtml") + "/tmp/" + System.currentTimeMillis(), true);
                    export.pictures[0] = new File(i1).getName();
                    String i2 =(String)(Object) export.getImage(true, "jpeg", ServletUtils.expandRelative(this.getServletConfig(), "/nmrshiftdbhtml") + "/tmp/" + System.currentTimeMillis(), true);
                    export.pictures[1] = new File(i2).getName();
                    String docbook =(String)(Object) export.getHtml();
                    out.print(docbook);
                }
                if (format.equals("pdf") || format.equals("rtf")) {
                    String svgSpec =(String)(Object) export.getSpecSvg(400, 200);
                    String svgspecfile = relativepath + "/tmp/" + System.currentTimeMillis() + "s.svg";
                    new FileOutputStream(svgspecfile).write(svgSpec.getBytes());
                    export.pictures[1] = svgspecfile;
                    String molSvg =(String)(Object) export.getMolSvg(true);
                    String svgmolfile = relativepath + "/tmp/" + System.currentTimeMillis() + "m.svg";
                    new FileOutputStream(svgmolfile).write(molSvg.getBytes());
                    export.pictures[0] = svgmolfile;
                    String docbook =(String)(Object) export.getDocbook("pdf", "SVG");
                    TransformerFactory tFactory = TransformerFactory.newInstance();
                    Transformer transformer = tFactory.newTransformer(new StreamSource("file:" + GeneralUtils.getNmrshiftdbProperty("docbookxslpath", getServletConfig()) + "/fo/docbook.xsl"));
                    ByteArrayOutputStream baos = new ByteArrayOutputStream();
                    transformer.transform(new StreamSource(new StringReader(docbook)), new StreamResult(baos));
                    FopFactory fopFactory = FopFactory.newInstance();
                    FOUserAgent foUserAgent = fopFactory.newFOUserAgent();
                    OutputStream out2 = new ByteArrayOutputStream();
                    Fop fop = fopFactory.newFop(format.equals("rtf") ? MimeConstants.MIME_RTF : MimeConstants.MIME_PDF, foUserAgent, out2);
                    TransformerFactory factory = TransformerFactory.newInstance();
                    transformer = factory.newTransformer();
                    Source src = new StreamSource(new StringReader(baos.toString()));
                    Result res2 = new SAXResult(fop.getDefaultHandler());
                    transformer.transform(src, res2);
                    out.print(out2.toString());
                }
                if (format.equals("docbook")) {
                    String i1 = relativepath + "/tmp/" + System.currentTimeMillis() + ".svg";
                    new FileOutputStream(i1).write(export.getSpecSvg(300, 200).getBytes());
                    export.pictures[0] = new File(i1).getName();
                    String i2 = relativepath + "/tmp/" + System.currentTimeMillis() + ".svg";
                    new FileOutputStream(i2).write(export.getMolSvg(true).getBytes());
                    export.pictures[1] = new File(i2).getName();
                    String docbook =(String)(Object) export.getDocbook("pdf", "SVG");
                    String docbookfile = relativepath + "/tmp/" + System.currentTimeMillis() + ".xml";
                    new FileOutputStream(docbookfile).write(docbook.getBytes());
                    ByteArrayOutputStream baos = export.makeZip(new String[] { docbookfile, i1, i2 });
                    outstream.write((MyHelperClass)(Object)baos.toByteArray());
                }
                if (format.equals("svg")) {
                    out.print(export.getSpecSvg(400, 200));
                }
                if (format.equals("tiff") || format.equals("jpeg") || format.equals("png")) {
                    InputStream is = new FileInputStream((String)(Object)export.getImage(false, format, relativepath + "/tmp/" + System.currentTimeMillis(), true));
                    byte[] buf = new byte[32 * 1024];
                    int nRead = 0;
                    while ((nRead = is.read(buf)) != -1) {
                        outstream.write(buf, 0, nRead);
                    }
                }
                if (format.equals("cml")) {
                    out.print(spectrum.getCmlSpect().toXML());
                }
                if (format.equals("cmlboth")) {
                    Element cmlElement = new Element("cml");
                    cmlElement.addAttribute(new Attribute("convention", "nmrshiftdb-convention"));
                    cmlElement.setNamespaceURI("http://www.xml-cml.org/schema");
                    Element parent = spectrum.getDBMolecule().getCML(1, spectrum.getDBSpectrumType().getName().equals("1H"));
                    Node cmldoc = parent.getChild(0);
                    ((Element) cmldoc).setNamespaceURI("http://www.xml-cml.org/schema");
                    parent.removeChildren();
                    cmlElement.appendChild(cmldoc);
                    Element parentspec =(Element)(Object) spectrum.getCmlSpect();
                    Node spectrumel =(Node)(Object) parentspec.getChild(0);
                    parentspec.removeChildren();
                    cmlElement.appendChild(spectrumel);
                    ((Element)(Element)(Object) spectrumel).setNamespaceURI("http://www.xml-cml.org/schema");
                    out.write((int)(Object)cmlElement.toXML());
                }
                if (format.indexOf("exsection") == 0) {
                    StringTokenizer st = new StringTokenizer(format, "-");
                    st.nextToken();
                    String template = st.nextToken();
                    Criteria crit = new Criteria();
                    crit.add(DBSpectrumPeer.USER_ID, spectrum.getUserId());
                    Vector v = spectrum.getDBMolecule().getDBSpectrums(crit);
                    VelocityContext context = new VelocityContext();
                    context.put("spectra", v);
                    context.put("molecule", spectrum.getDBMolecule());
                    StringWriter w = new StringWriter();
                    Velocity.mergeTemplate("exporttemplates/" + template, "ISO-8859-1", context, w);
                    out.write(w.toString());
                }
            }
            if (action.equals("exportmol")) {
                int width = -1;
                int height = -1;
                if (req.getParameter("size") != null) {
                    StringTokenizer st = new StringTokenizer((String)(Object)req.getParameter("size"), "x");
                    width = Integer.parseInt(st.nextToken());
                    height = Integer.parseInt(st.nextToken());
                }
                boolean shownumbers = true;
                if (req.getParameter("shownumbers") != null && req.getParameter("shownumbers").equals("false")) {
                    shownumbers = false;
                }
                if (req.getParameter("backcolor") != null) {
                    export.backColor = new Color(Integer.parseInt((String)(Object)req.getParameter("backcolor")));
                }
                if (req.getParameter("markatom") != null) {
                    export.selected = Integer.parseInt((String)(Object)req.getParameter("markatom")) - 1;
                }
                if (format.equals("svg")) {
                    out.print(export.getMolSvg(true));
                }
                if (format.equals("tiff") || format.equals("jpeg") || format.equals("png")) {
                    InputStream is = new FileInputStream(export.getImage(true, format, relativepath + "/tmp/" + System.currentTimeMillis(), width, height, shownumbers, null));
                    byte[] buf = new byte[32 * 1024];
                    int nRead = 0;
                    while ((nRead = is.read(buf)) != -1) {
                        outstream.write(buf, 0, nRead);
                    }
                }
                if (format.equals("mdl")) {
                    out.println(spectrum.getDBMolecule().getStructureFile(1, false));
                }
                if (format.equals("cml")) {
                    out.println(spectrum.getDBMolecule().getCMLString(1));
                }
            }
            if (out != null) out.flush(); else outstream.flush();
        } catch (Exception ex) {
            ex.printStackTrace();
            out.print(GeneralUtils.logError(ex, "NmrshiftdbServlet", null, true));
            out.flush();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass SPECTRUM_TYPE_ID;
	public MyHelperClass SUBSPECTRUM;
	public MyHelperClass TOTALSPECTRUM;
	public MyHelperClass MIME_RTF;
	public MyHelperClass MIME_PDF;
	public MyHelperClass REVIEW_FLAG;
	public MyHelperClass USER_ID;
	public MyHelperClass NAME;
	public MyHelperClass MOLECULE_ID;
public MyHelperClass fillReport(JasperReport o0, Map o1, JRResultSetDataSource o2){ return null; }
	public MyHelperClass getStructureFile(int o0, boolean o1){ return null; }
	public MyHelperClass toXML(){ return null; }
	public MyHelperClass retrieveByPK(NumberKey o0){ return null; }
	public MyHelperClass getName(){ return null; }
	public MyHelperClass asDate(){ return null; }
	public MyHelperClass getContext(HttpSession o0, boolean o1, boolean o2, StringBuffer o3, MyHelperClass o4, HttpServletRequest o5, boolean o6){ return null; }
	public MyHelperClass mergeTemplate(String o0, String o1, VelocityContext o2, StringWriter o3){ return null; }
	public MyHelperClass logToSql(String o0, Object o1){ return null; }
	public MyHelperClass getNmrshiftdbProperty(String o0, MyHelperClass o1){ return null; }
	public MyHelperClass getInitParameter(String o0){ return null; }
	public MyHelperClass expandRelative(MyHelperClass o0, String o1){ return null; }
	public MyHelperClass put(IMolecule o0, MyHelperClass o1){ return null; }
	public MyHelperClass minimum(double[] o0){ return null; }
	public MyHelperClass loadObject(String o0){ return null; }
	public MyHelperClass newInstance(){ return null; }
	public MyHelperClass getConnection(){ return null; }
	public MyHelperClass getCML(int o0){ return null; }
	public MyHelperClass indexOf(String o0){ return null; }
	public MyHelperClass getByName(MyHelperClass o0){ return null; }
	public MyHelperClass doSelect(Criteria o0){ return null; }
	public MyHelperClass put(IMolecule o0, Collection o1){ return null; }
	public MyHelperClass getCML(int o0, boolean o1){ return null; }
	public MyHelperClass parseSpectrumFromSpecFile(MyHelperClass o0){ return null; }
	public MyHelperClass getBytes(){ return null; }
	public MyHelperClass getCanonicalNameType(){ return null; }
	public MyHelperClass maximum(double[] o0){ return null; }
	public MyHelperClass asInt(){ return null; }
	public MyHelperClass logError(Exception o0, String o1, Object o2, boolean o3){ return null; }
	public MyHelperClass getDBSpectrums(Criteria o0){ return null; }
	public MyHelperClass get(int o0){ return null; }
	public MyHelperClass exportReportToPdfStream(JasperPrint o0, ServletOutputStream o1){ return null; }
	public MyHelperClass getCMLString(int o0){ return null; }
	public MyHelperClass getAdminEmail(MyHelperClass o0){ return null; }
	public MyHelperClass getElementSymbol(){ return null; }
	public MyHelperClass average(double[] o0){ return null; }
	public MyHelperClass getUserName(){ return null; }
	public MyHelperClass executeQuery(String o0){ return null; }}

class HttpServletRequest {

public MyHelperClass getSession(){ return null; }
	public MyHelperClass getParameter(String o0){ return null; }}

class HttpServletResponse {

public MyHelperClass getOutputStream(){ return null; }
	public MyHelperClass setContentType(String o0){ return null; }
	public MyHelperClass getWriter(){ return null; }}

class ServletException extends Exception{
	public ServletException(String errorMessage) { super(errorMessage); }
}

class ServletOutputStream {

public MyHelperClass write(MyHelperClass o0){ return null; }
	public MyHelperClass flush(){ return null; }
	public MyHelperClass write(byte[] o0, int o1, int o2){ return null; }}

class TurbineConfig {

TurbineConfig(){}
	TurbineConfig(String o0, String o1){}
	public MyHelperClass init(){ return null; }}

class DBSpectrum {

public MyHelperClass getDBMolecule(){ return null; }
	public MyHelperClass getUserId(){ return null; }
	public MyHelperClass getCmlSpect(){ return null; }
	public MyHelperClass getDBSpectrumType(){ return null; }
	public MyHelperClass getOptions(){ return null; }
	public MyHelperClass getSpectrumId(){ return null; }}

class Export {
public MyHelperClass[] pictures;
	public MyHelperClass backColor;
	public MyHelperClass selected;
Export(DBSpectrum o0){}
	Export(){}
	public MyHelperClass getMolSvg(boolean o0){ return null; }
	public MyHelperClass getSpecSvg(int o0, int o1){ return null; }
	public MyHelperClass getHtml(){ return null; }
	public MyHelperClass makeZip(String[] o0){ return null; }
	public MyHelperClass getImage(boolean o0, String o1, String o2, boolean o3){ return null; }
	public MyHelperClass getDocbook(String o0, String o1){ return null; }
	public MyHelperClass getImage(boolean o0, String o1, String o2, int o3, int o4, boolean o5, Object o6){ return null; }}

class Record {

public MyHelperClass getValue(int o0){ return null; }}

class RssWriter {

public MyHelperClass setPublisher(String o0){ return null; }
	public MyHelperClass getMultiMap(){ return null; }
	public MyHelperClass getTitlemap(){ return null; }
	public MyHelperClass setCreator(MyHelperClass o0){ return null; }
	public MyHelperClass setLink(String o0){ return null; }
	public MyHelperClass setTitle(String o0){ return null; }
	public MyHelperClass getLinkmap(){ return null; }
	public MyHelperClass getInchimap(){ return null; }
	public MyHelperClass getCreatormap(){ return null; }
	public MyHelperClass setDescription(String o0){ return null; }
	public MyHelperClass setAbout(String o0){ return null; }
	public MyHelperClass write(AtomContainerSet o0){ return null; }
	public MyHelperClass setImagelink(String o0){ return null; }
	public MyHelperClass setWriter(MyHelperClass o0){ return null; }
	public MyHelperClass getDatemap(){ return null; }}

class AtomContainerSet {

public MyHelperClass addAtomContainer(IMolecule o0){ return null; }}

class DBMolecule {

public MyHelperClass getNmrshiftdbUser(){ return null; }
	public MyHelperClass getChemicalNamesAsOneString(boolean o0){ return null; }
	public MyHelperClass getMolecularWeight(){ return null; }
	public MyHelperClass getChemicalNamesAsOneStringWithFallback(){ return null; }
	public MyHelperClass getEasylink(HttpServletRequest o0){ return null; }
	public MyHelperClass getDBChemicalNames(){ return null; }
	public MyHelperClass getDate(){ return null; }
	public MyHelperClass getStructureFile(int o0, boolean o1){ return null; }
	public MyHelperClass getMoleculeId(){ return null; }
	public MyHelperClass selectSpectra(){ return null; }
	public MyHelperClass getAsCDKMoleculeAsEntered(int o0){ return null; }
	public MyHelperClass getDBSpectrums(){ return null; }
	public MyHelperClass getDBCanonicalNames(){ return null; }
	public MyHelperClass selectSpectra(Object o0){ return null; }
	public MyHelperClass getMolecularFormula(boolean o0){ return null; }
	public MyHelperClass hasAny3d(){ return null; }}

class NumberKey {

NumberKey(int o0){}
	NumberKey(MyHelperClass o0){}
	NumberKey(){}}

class IMolecule {

}

class DBCanonicalName {

public MyHelperClass getDBCanonicalNameType(){ return null; }
	public MyHelperClass getName(){ return null; }}

class Element {

Element(){}
	Element(String o0){}
	public MyHelperClass getChild(int o0){ return null; }
	public MyHelperClass setNamespaceURI(String o0){ return null; }
	public MyHelperClass getChildElements(){ return null; }
	public MyHelperClass removeChild(Element o0){ return null; }
	public MyHelperClass appendChild(Node o0){ return null; }
	public MyHelperClass toXML(){ return null; }
	public MyHelperClass addAttribute(Attribute o0){ return null; }
	public MyHelperClass removeChildren(){ return null; }}

class DBSample {

public MyHelperClass getAttachment(){ return null; }}

class JasperReport {

}

class DBConnection {

public MyHelperClass createStatement(){ return null; }
	public MyHelperClass getConnection(){ return null; }
	public MyHelperClass close(){ return null; }}

class Connection {

public MyHelperClass createStatement(){ return null; }}

class Statement {

public MyHelperClass executeQuery(String o0){ return null; }
	public MyHelperClass close(){ return null; }}

class ResultSet {

public MyHelperClass getString(int o0){ return null; }
	public MyHelperClass next(){ return null; }}

class JasperPrint {

}

class JRResultSetDataSource {

JRResultSetDataSource(ResultSet o0){}
	JRResultSetDataSource(){}}

class Criteria {

public MyHelperClass add(MyHelperClass o0, String o1){ return null; }
	public MyHelperClass addJoin(MyHelperClass o0, MyHelperClass o1){ return null; }}

class Attribute {

Attribute(String o0, String o1){}
	Attribute(){}}

class Node {

}

class ZipOutputStream {

ZipOutputStream(){}
	ZipOutputStream(ByteArrayOutputStream o0){}
	public MyHelperClass closeEntry(){ return null; }
	public MyHelperClass write(byte[] o0){ return null; }
	public MyHelperClass putNextEntry(ZipEntry o0){ return null; }
	public MyHelperClass close(){ return null; }}

class ZipEntry {

ZipEntry(String o0){}
	ZipEntry(){}}

class DBChemicalName {

public MyHelperClass getName(){ return null; }}

class JarInputStream {

JarInputStream(FileInputStream o0){}
	JarInputStream(){}
	public MyHelperClass getNextJarEntry(){ return null; }
	public MyHelperClass read(){ return null; }}

class JarEntry {

public MyHelperClass getName(){ return null; }
	public MyHelperClass getSize(){ return null; }}

class HttpSession {

}

class VelocityContext {

public MyHelperClass put(String o0, Vector<String o1){ return null; }
	public MyHelperClass put(String o0, Vector o1){ return null; }
	public MyHelperClass put(String o0, MyHelperClass o1){ return null; }}

class NmrshiftdbUser {

public MyHelperClass getUserName(){ return null; }
	public MyHelperClass getUserId(){ return null; }}

class NmrshiftdbException extends Exception{
	public NmrshiftdbException(String errorMessage) { super(errorMessage); }
}

class ValuesForVelocityBean {

public MyHelperClass getDelta(){ return null; }
	public MyHelperClass getRange(){ return null; }
	public MyHelperClass getDisplayText(){ return null; }
	public MyHelperClass getNameForElements(){ return null; }}

class TransformerFactory {

public MyHelperClass newTransformer(){ return null; }}

class Transformer {

}

class StreamSource {

StreamSource(String o0){}
	StreamSource(){}
	StreamSource(StringReader o0){}}

class StreamResult {

StreamResult(ByteArrayOutputStream o0){}
	StreamResult(){}}

class FopFactory {

public MyHelperClass newFOUserAgent(){ return null; }}

class FOUserAgent {

}

class Fop {

public MyHelperClass getDefaultHandler(){ return null; }}

class Source {

}

class Result {

}

class SAXResult {

}

class Color {

}


import java.io.UncheckedIOException;


class c20287675 {
public MyHelperClass createHtml(JobResources o0, ResultAccess o1, Tree o2, HttpServletRequest o3, HttpServletResponse o4, List o5, boolean o6){ return null; }
	public MyHelperClass getSeqList(HttpServletRequest o0){ return null; }
public MyHelperClass getRequestType(HttpServletRequest o0){ return null; }
public MyHelperClass PrintFactory;
	public MyHelperClass IOUtils;
	public MyHelperClass ContextUtil;
	public MyHelperClass RequestType;
	public MyHelperClass ImageFactory;
	public MyHelperClass ConvertFactory;
	public MyHelperClass getLog(){ return null; }
	public MyHelperClass getPathId(String o0){ return null; }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String pathInfo =(String)(Object) request.getPathInfo();
        getLog().info("Process request " + pathInfo);
        if (null != pathInfo) {
            String pathId =(String)(Object) getPathId(pathInfo);
            JobResources res =(JobResources)(Object) ContextUtil.getJobResource(pathId);
            if (null != res) {
                RequestType requType =(RequestType)(Object) getRequestType(request);
                ResultAccess access = new ResultAccess(res);
                Collection uIdColl =(Collection)(Object) res.getUniqIds();
                boolean isFiltered = false;
                {
                    List postSeqIds =(List)(Object) getSeqList(request);
                    if (!(Boolean)(Object)postSeqIds.isEmpty()) {
                        isFiltered = true;
                        uIdColl =(Collection)(Object) access.loadIds(postSeqIds);
                    }
                }
                try {
                    if ((requType.equals(RequestType.FASTA)) || (requType.equals(RequestType.SWISSPROT))) {
                        OutputStreamWriter out = null;
                        out = new OutputStreamWriter(response.getOutputStream());
                        for (Long uid :(Long[])(Object) (Object[])(Object)uIdColl) {
                            if (requType.equals(RequestType.FASTA)) {
                                SwissProt sw =(SwissProt)(Object) access.getSwissprotEntry(uid);
                                if (null != sw) {
                                    PrintFactory.instance().print(ConvertFactory.instance().SwissProt2fasta(sw), out);
                                } else {
                                    System.err.println("Not able to read Swissprot entry " + uid + " in project " + res.getBaseDir());
                                }
                            } else if (requType.equals(RequestType.SWISSPROT)) {
                                File swissFile =(File)(Object) res.getSwissprotFile(uid);
                                if ((boolean)(Object)swissFile.exists()) {
                                    InputStream in = null;
                                    try {
                                        in =(InputStream)(Object) new FileInputStream(swissFile);
                                        IOUtils.copy(in, out);
                                    } catch (UncheckedIOException e) {
                                        e.printStackTrace();
                                        System.err.println("Problems with reading file to output stream " + swissFile);
                                    } finally {
                                        IOUtils.closeQuietly(in);
                                    }
                                } else {
                                    System.err.println("Swissprot file does not exist: " + swissFile);
                                }
                            }
                        }
                        out.flush();
                    } else {
                        if ((int)(Object)uIdColl.size() <= 2) {
                            isFiltered = false;
                            uIdColl =(Collection)(Object) res.getUniqIds();
                        }
                        Tree tree =(Tree)(Object) access.getTreeByUniquId(uIdColl);
                        if (requType.equals(RequestType.TREE)) {
                            response.getWriter().write(tree.toNewHampshireX());
                        } else if (requType.equals(RequestType.PNG)) {
                            List sp =(List)(Object) access.getSwissprotEntriesByUniquId(uIdColl);
                            ImageMap map =(ImageMap)(Object) ImageFactory.instance().createProteinCard(sp, tree, true, res);
                            response.setContentType("image/png");
                            response.addHeader("Content-Disposition", "filename=ProteinCards.png");
                            ImageFactory.instance().printPNG(map.getImage(), response.getOutputStream());
                            response.getOutputStream().flush();
                        } else if (requType.equals(RequestType.HTML)) {
                            List sp =(List)(Object) access.getSwissprotEntriesByUniquId(uIdColl);
                            createHtml(res, access, tree, request, response, sp, isFiltered);
                        }
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                    getLog().error("Problem with Request: " + pathInfo + "; type " + requType, e);
                }
            } else {
                getLog().error("Resource is null: " + pathId + "; path " + pathInfo);
            }
        } else {
            getLog().error("PathInfo is null!!!");
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass FASTA;
	public MyHelperClass TREE;
	public MyHelperClass PNG;
	public MyHelperClass HTML;
	public MyHelperClass SWISSPROT;
public MyHelperClass getJobResource(String o0){ return null; }
	public MyHelperClass error(String o0, Exception o1){ return null; }
	public MyHelperClass closeQuietly(InputStream o0){ return null; }
	public MyHelperClass SwissProt2fasta(SwissProt o0){ return null; }
	public MyHelperClass printPNG(MyHelperClass o0, MyHelperClass o1){ return null; }
	public MyHelperClass write(MyHelperClass o0){ return null; }
	public MyHelperClass flush(){ return null; }
	public MyHelperClass instance(){ return null; }
	public MyHelperClass info(String o0){ return null; }
	public MyHelperClass error(String o0){ return null; }
	public MyHelperClass print(MyHelperClass o0, OutputStreamWriter o1){ return null; }
	public MyHelperClass createProteinCard(List o0, Tree o1, boolean o2, JobResources o3){ return null; }
	public MyHelperClass copy(InputStream o0, OutputStreamWriter o1){ return null; }}

class HttpServletRequest {

public MyHelperClass getPathInfo(){ return null; }}

class HttpServletResponse {

public MyHelperClass getOutputStream(){ return null; }
	public MyHelperClass getWriter(){ return null; }
	public MyHelperClass addHeader(String o0, String o1){ return null; }
	public MyHelperClass setContentType(String o0){ return null; }}

class ServletException extends Exception{
	public ServletException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class JobResources {

public MyHelperClass getUniqIds(){ return null; }
	public MyHelperClass getSwissprotFile(Long o0){ return null; }
	public MyHelperClass getBaseDir(){ return null; }}

class RequestType {

}

class ResultAccess {

ResultAccess(){}
	ResultAccess(JobResources o0){}
	public MyHelperClass getSwissprotEntry(Long o0){ return null; }
	public MyHelperClass getSwissprotEntriesByUniquId(Collection o0){ return null; }
	public MyHelperClass getTreeByUniquId(Collection o0){ return null; }
	public MyHelperClass loadIds(List o0){ return null; }}

class Collection {

public MyHelperClass size(){ return null; }}

class List {

public MyHelperClass isEmpty(){ return null; }}

class OutputStreamWriter {

OutputStreamWriter(MyHelperClass o0){}
	OutputStreamWriter(){}
	public MyHelperClass flush(){ return null; }}

class SwissProt {

}

class File {

public MyHelperClass exists(){ return null; }}

class InputStream {

}

class FileInputStream {

FileInputStream(File o0){}
	FileInputStream(){}}

class Tree {

public MyHelperClass toNewHampshireX(){ return null; }}

class ImageMap {

public MyHelperClass getImage(){ return null; }}




class c3843254 {
public MyHelperClass StringTools;

    public void doGet(HttpServletRequest request_, HttpServletResponse response) throws IOException, ServletException {
        Writer out = null;
        DatabaseAdapter dbDyn = null;
        PreparedStatement st = null;
        try {
            RenderRequest renderRequest = null;
            RenderResponse renderResponse = null;
            MyHelperClass ContentTypeTools = new MyHelperClass();
            ContentTypeTools.setContentType(response, ContentTypeTools.CONTENT_TYPE_UTF8);
            out =(Writer)(Object) response.getWriter();
            AuthSession auth_ = (AuthSession)(AuthSession)(Object) renderRequest.getUserPrincipal();
            if (auth_ == null) {
                throw new IllegalStateException("You have not enough right to execute this operation");
            }
            PortletSession session =(PortletSession)(Object) renderRequest.getPortletSession();
            MyHelperClass DatabaseAdapter = new MyHelperClass();
            dbDyn =(DatabaseAdapter)(Object) DatabaseAdapter.getInstance();
            MyHelperClass PortletService = new MyHelperClass();
            String index_page =(String)(Object) PortletService.url("mill.price.index", renderRequest, renderResponse);
            Long id_shop = null;
            MyHelperClass ShopPortlet = new MyHelperClass();
            if (renderRequest.getParameter((String)(Object)ShopPortlet.NAME_ID_SHOP_PARAM) != null) {
//                MyHelperClass ShopPortlet = new MyHelperClass();
                id_shop =(Long)(Object) PortletService.getLong(renderRequest,(String)(Object) ShopPortlet.NAME_ID_SHOP_PARAM);
            } else {
//                MyHelperClass ShopPortlet = new MyHelperClass();
                Long id_ = (Long)(Long)(Object) session.getAttribute(ShopPortlet.ID_SHOP_SESSION);
                if (id_ == null) {
                    response.sendRedirect(index_page);
                    return;
                }
                id_shop = id_;
            }
//            MyHelperClass ShopPortlet = new MyHelperClass();
            session.removeAttribute(ShopPortlet.ID_SHOP_SESSION);
//            MyHelperClass ShopPortlet = new MyHelperClass();
            session.setAttribute(ShopPortlet.ID_SHOP_SESSION, id_shop);
            if ((boolean)(Object)auth_.isUserInRole("webmill.edit_price_list")) {
//                MyHelperClass PortletService = new MyHelperClass();
                Long id_item =(Long)(Object) PortletService.getLong(renderRequest, "id_item");
                if (id_item == null) throw new IllegalArgumentException("id_item not initialized");
                MyHelperClass RequestTools = new MyHelperClass();
                if (RequestTools.getString(renderRequest, "action").equals("update")) {
                    dbDyn.getConnection().setAutoCommit(false);
                    String sql_ = "delete from WM_PRICE_ITEM_DESCRIPTION a " + "where exists " + " ( select null from WM_PRICE_LIST b " + "   where b.id_shop = ? and b.id_item = ? and " + "         a.id_item=b.id_item ) ";
                    try {
                        st =(PreparedStatement)(Object) dbDyn.prepareStatement(sql_);
                        MyHelperClass RsetTools = new MyHelperClass();
                        RsetTools.setLong(st, 1, id_shop);
//                        MyHelperClass RsetTools = new MyHelperClass();
                        RsetTools.setLong(st, 2, id_item);
                        st.executeUpdate();
                    } catch (Exception e0001) {
                        dbDyn.rollback();
                        MyHelperClass ExceptionTools = new MyHelperClass();
                        out.write("Error #1 - " + ExceptionTools.getStackTrace(e0001, 20, "<br>"));
                        return;
                    } finally {
                        MyHelperClass DatabaseManager = new MyHelperClass();
                        DatabaseManager.close(st);
                        st = null;
                    }
                    sql_ = "insert into WM_PRICE_ITEM_DESCRIPTION " + "(ID_PRICE_ITEM_DESCRIPTION, ID_ITEM, TEXT)" + "(select seq_WM_PRICE_ITEM_DESCRIPTION.nextval, ID_ITEM, ? " + " from WM_PRICE_LIST b where b.ID_SHOP = ? and b.ID_ITEM = ? )";
                    try {
                        int idx = 0;
                        int offset = 0;
                        int j = 0;
//                        MyHelperClass RequestTools = new MyHelperClass();
                        byte[] b =(byte[])(Object) StringTools.getBytesUTF(RequestTools.getString(renderRequest, "n"));
                        st =(PreparedStatement)(Object) dbDyn.prepareStatement(sql_);
                        MyHelperClass StringTools = new MyHelperClass();
                        while ((idx =(int)(Object) StringTools.getStartUTF(b, 2000, offset)) != -1) {
                            st.setString(1, new String(b, offset, idx - offset, "utf-8"));
                            MyHelperClass RsetTools = new MyHelperClass();
                            RsetTools.setLong(st, 2, id_shop);
//                            MyHelperClass RsetTools = new MyHelperClass();
                            RsetTools.setLong(st, 3, id_item);
                            st.addBatch();
                            offset = idx;
                            if (j > 10) break;
                            j++;
                        }
                        int[] updateCounts =(int[])(Object) st.executeBatch();
                        MyHelperClass log = new MyHelperClass();
                        if ((boolean)(Object)log.isDebugEnabled()) log.debug("Number of updated records - " + updateCounts);
                        dbDyn.commit();
                    } catch (Exception e0) {
                        dbDyn.rollback();
                        MyHelperClass ExceptionTools = new MyHelperClass();
                        out.write("Error #2 - " + ExceptionTools.getStackTrace(e0, 20, "<br>"));
                        return;
                    } finally {
                        dbDyn.getConnection().setAutoCommit(true);
                        if (st != null) {
                            MyHelperClass DatabaseManager = new MyHelperClass();
                            DatabaseManager.close(st);
                            st = null;
                        }
                    }
                }
//                MyHelperClass RequestTools = new MyHelperClass();
                if (RequestTools.getString(renderRequest, "action").equals("new_image") && renderRequest.getParameter("id_image") != null) {
//                    MyHelperClass PortletService = new MyHelperClass();
                    Long id_image =(Long)(Object) PortletService.getLong(renderRequest, "id_image");
                    dbDyn.getConnection().setAutoCommit(false);
                    String sql_ = "delete from WM_IMAGE_PRICE_ITEMS a " + "where exists " + " ( select null from WM_PRICE_LIST b " + "where b.id_shop = ? and b.id_item = ? and " + "a.id_item=b.id_item ) ";
                    try {
                        st =(PreparedStatement)(Object) dbDyn.prepareStatement(sql_);
                        MyHelperClass RsetTools = new MyHelperClass();
                        RsetTools.setLong(st, 1, id_shop);
//                        MyHelperClass RsetTools = new MyHelperClass();
                        RsetTools.setLong(st, 2, id_item);
                        st.executeUpdate();
                    } catch (Exception e0001) {
                        dbDyn.rollback();
                        MyHelperClass ExceptionTools = new MyHelperClass();
                        out.write("Error #3 - " + ExceptionTools.getStackTrace(e0001, 20, "<br>"));
                        return;
                    } finally {
                        MyHelperClass DatabaseManager = new MyHelperClass();
                        DatabaseManager.close(st);
                        st = null;
                    }
                    sql_ = "insert into WM_IMAGE_PRICE_ITEMS " + "(id_IMAGE_PRICE_ITEMS, id_item, ID_IMAGE_DIR)" + "(select seq_WM_IMAGE_PRICE_ITEMS.nextval, id_item, ? " + " from WM_PRICE_LIST b where b.id_shop = ? and b.id_item = ? )";
                    try {
                        st =(PreparedStatement)(Object) dbDyn.prepareStatement(sql_);
                        MyHelperClass RsetTools = new MyHelperClass();
                        RsetTools.setLong(st, 1, id_image);
//                        MyHelperClass RsetTools = new MyHelperClass();
                        RsetTools.setLong(st, 2, id_shop);
//                        MyHelperClass RsetTools = new MyHelperClass();
                        RsetTools.setLong(st, 3, id_item);
                        int updateCounts =(int)(Object) st.executeUpdate();
                        MyHelperClass log = new MyHelperClass();
                        if ((boolean)(Object)log.isDebugEnabled()) log.debug("Number of updated records - " + updateCounts);
                        dbDyn.commit();
                    } catch (Exception e0) {
                        dbDyn.rollback();
                        MyHelperClass log = new MyHelperClass();
                        log.error("Error insert image", e0);
                        MyHelperClass ExceptionTools = new MyHelperClass();
                        out.write("Error #4 - " + ExceptionTools.getStackTrace(e0, 20, "<br>"));
                        return;
                    } finally {
                        dbDyn.getConnection().setAutoCommit(true);
                        MyHelperClass DatabaseManager = new MyHelperClass();
                        DatabaseManager.close(st);
                        st = null;
                    }
                }
                if (true) throw new Exception("Need refactoring");
            }
        } catch (Exception e) {
            MyHelperClass log = new MyHelperClass();
            log.error(e);
            MyHelperClass ExceptionTools = new MyHelperClass();
            out.write(ExceptionTools.getStackTrace(e, 20, "<br>"));
        } finally {
            MyHelperClass DatabaseManager = new MyHelperClass();
            DatabaseManager.close(dbDyn, st);
            st = null;
            dbDyn = null;
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass CONTENT_TYPE_UTF8;
	public MyHelperClass ID_SHOP_SESSION;
	public MyHelperClass NAME_ID_SHOP_PARAM;
public MyHelperClass close(DatabaseAdapter o0, PreparedStatement o1){ return null; }
	public MyHelperClass setContentType(HttpServletResponse o0, MyHelperClass o1){ return null; }
	public MyHelperClass debug(String o0){ return null; }
	public MyHelperClass isDebugEnabled(){ return null; }
	public MyHelperClass getBytesUTF(MyHelperClass o0){ return null; }
	public MyHelperClass setLong(PreparedStatement o0, int o1, Long o2){ return null; }
	public MyHelperClass setAutoCommit(boolean o0){ return null; }
	public MyHelperClass error(Exception o0){ return null; }
	public MyHelperClass getInstance(){ return null; }
	public MyHelperClass getStartUTF(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass close(PreparedStatement o0){ return null; }
	public MyHelperClass url(String o0, RenderRequest o1, RenderResponse o2){ return null; }
	public MyHelperClass getLong(RenderRequest o0, String o1){ return null; }
	public MyHelperClass error(String o0, Exception o1){ return null; }
	public MyHelperClass getStackTrace(Exception o0, int o1, String o2){ return null; }
	public MyHelperClass getString(RenderRequest o0, String o1){ return null; }}

class HttpServletRequest {

}

class HttpServletResponse {

public MyHelperClass sendRedirect(String o0){ return null; }
	public MyHelperClass getWriter(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class ServletException extends Exception{
	public ServletException(String errorMessage) { super(errorMessage); }
}

class Writer {

public MyHelperClass write(String o0){ return null; }
	public MyHelperClass write(MyHelperClass o0){ return null; }}

class DatabaseAdapter {

public MyHelperClass commit(){ return null; }
	public MyHelperClass rollback(){ return null; }
	public MyHelperClass prepareStatement(String o0){ return null; }
	public MyHelperClass getConnection(){ return null; }}

class PreparedStatement {

public MyHelperClass executeBatch(){ return null; }
	public MyHelperClass setString(int o0, String o1){ return null; }
	public MyHelperClass addBatch(){ return null; }
	public MyHelperClass executeUpdate(){ return null; }}

class RenderRequest {

public MyHelperClass getParameter(String o0){ return null; }
	public MyHelperClass getPortletSession(){ return null; }
	public MyHelperClass getUserPrincipal(){ return null; }}

class RenderResponse {

}

class AuthSession {

public MyHelperClass isUserInRole(String o0){ return null; }}

class PortletSession {

public MyHelperClass getAttribute(MyHelperClass o0){ return null; }
	public MyHelperClass removeAttribute(MyHelperClass o0){ return null; }
	public MyHelperClass setAttribute(MyHelperClass o0, Long o1){ return null; }}

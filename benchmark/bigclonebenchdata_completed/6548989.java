import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c6548989 {
public MyHelperClass DB;
	public MyHelperClass Msg;
	public MyHelperClass windowContainer;
	public MyHelperClass renderGoals(int o0, Panelchildren o1){ return null; }
	public MyHelperClass registerWindow(Tabpanel o0){ return null; }
public MyHelperClass EnvWeb;
	public MyHelperClass Util;
	public MyHelperClass Executions;
	public MyHelperClass dashboardThread;
	public MyHelperClass logger;
	public MyHelperClass dashboardRunnable;
	public MyHelperClass Events;
	public MyHelperClass Level;
	public MyHelperClass stripHtml(String o0, boolean o1){ return null; }

    private void createHomeTab()  throws Throwable {
        Tabpanel homeTab = new Tabpanel();
        MyHelperClass EnvWeb = new MyHelperClass();
        windowContainer.addWindow(homeTab, Msg.getMsg(EnvWeb.getCtx(), "Home").replaceAll("&", ""), false);
        Portallayout portalLayout = new Portallayout();
        portalLayout.setWidth("100%");
        portalLayout.setHeight("100%");
        portalLayout.setStyle("position: absolute; overflow: auto");
        homeTab.appendChild(portalLayout);
        Portalchildren portalchildren = null;
        int currentColumnNo = 0;
        String sql = "SELECT COUNT(DISTINCT COLUMNNO) " + "FROM PA_DASHBOARDCONTENT " + "WHERE (AD_CLIENT_ID=0 OR AD_CLIENT_ID=?) AND ISACTIVE='Y'";
//        MyHelperClass EnvWeb = new MyHelperClass();
        int noOfCols =(int)(Object) DB.getSQLValue(null, sql, EnvWeb.getCtx().getAD_Client_ID());
        int width = noOfCols <= 0 ? 100 : 100 / noOfCols;
        sql = "SELECT x.*, m.AD_MENU_ID " + "FROM PA_DASHBOARDCONTENT x " + "LEFT OUTER JOIN AD_MENU m ON x.AD_WINDOW_ID=m.AD_WINDOW_ID " + "WHERE (x.AD_CLIENT_ID=0 OR x.AD_CLIENT_ID=?) AND x.ISACTIVE='Y' " + "ORDER BY x.COLUMNNO, x.AD_CLIENT_ID, x.LINE ";
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        try {
            MyHelperClass DB = new MyHelperClass();
            pstmt =(PreparedStatement)(Object) DB.prepareStatement(sql, null);
//            MyHelperClass EnvWeb = new MyHelperClass();
            pstmt.setInt(1, EnvWeb.getCtx().getAD_Client_ID());
            rs =(ResultSet)(Object) pstmt.executeQuery();
            while ((boolean)(Object)rs.next()) {
                int columnNo =(int)(Object) rs.getInt("ColumnNo");
                if (portalchildren == null || currentColumnNo != columnNo) {
                    portalchildren = new Portalchildren();
                    portalLayout.appendChild(portalchildren);
                    portalchildren.setWidth(width + "%");
                    portalchildren.setStyle("padding: 5px");
                    currentColumnNo = columnNo;
                }
                Panel panel = new Panel();
                panel.setStyle("margin-bottom:10px");
                panel.setTitle(rs.getString("Name"));
                String description =(String)(Object) rs.getString("Description");
                if (description != null) panel.setTooltiptext(description);
                String collapsible =(String)(Object) rs.getString("IsCollapsible");
                panel.setCollapsible(collapsible.equals("Y"));
                panel.setBorder("normal");
                portalchildren.appendChild(panel);
                Panelchildren content = new Panelchildren();
                panel.appendChild(content);
                boolean panelEmpty = true;
                String htmlContent =(String)(Object) rs.getString("HTML");
                if (htmlContent != null) {
                    StringBuffer result = new StringBuffer("<html><head>");
                    URL url = getClass().getClassLoader().getResource("org/compiere/images/PAPanel.css");
                    InputStreamReader ins;
                    try {
                        ins = new InputStreamReader(url.openStream());
                        BufferedReader bufferedReader = new BufferedReader(ins);
                        String cssLine;
                        while ((cssLine = bufferedReader.readLine()) != null) result.append(cssLine + "\n");
                    } catch (IOException e1) {
                        MyHelperClass Level = new MyHelperClass();
                        logger.log(Level.SEVERE, e1.getLocalizedMessage(), e1);
                    }
                    result.append("</head><body><div class=\"content\">\n");
                    result.append(stripHtml(htmlContent, false) + "<br>\n");
                    result.append("</div>\n</body>\n</html>\n</html>");
                    Html html = new Html();
                    html.setContent(result.toString());
                    content.appendChild(html);
                    panelEmpty = false;
                }
                int AD_Window_ID =(int)(Object) rs.getInt("AD_Window_ID");
                if (AD_Window_ID > 0) {
                    int AD_Menu_ID =(int)(Object) rs.getInt("AD_Menu_ID");
                    ToolBarButton btn = new ToolBarButton(String.valueOf(AD_Menu_ID));
                    MMenu menu = new MMenu(EnvWeb.getCtx(), AD_Menu_ID, null);
                    btn.setLabel(menu.getName());
                    btn.addEventListener(Events.ON_CLICK, this);
                    content.appendChild(btn);
                    panelEmpty = false;
                }
                int PA_Goal_ID =(int)(Object) rs.getInt("PA_Goal_ID");
                if (PA_Goal_ID > 0) {
                    StringBuffer result = new StringBuffer("<html><head>");
                    URL url = getClass().getClassLoader().getResource("org/compiere/images/PAPanel.css");
                    InputStreamReader ins;
                    try {
                        ins = new InputStreamReader(url.openStream());
                        BufferedReader bufferedReader = new BufferedReader(ins);
                        String cssLine;
                        while ((cssLine = bufferedReader.readLine()) != null) result.append(cssLine + "\n");
                    } catch (IOException e1) {
                        logger.log(Level.SEVERE, e1.getLocalizedMessage(), e1);
                    }
                    result.append("</head><body><div class=\"content\">\n");
                    result.append(renderGoals(PA_Goal_ID, content));
                    result.append("</div>\n</body>\n</html>\n</html>");
                    Html html = new Html();
                    html.setContent(result.toString());
                    content.appendChild(html);
                    panelEmpty = false;
                }
                String url =(String)(Object) rs.getString("ZulFilePath");
                if (url != null) {
                    try {
                        Component component =(Component)(Object) Executions.createComponents(url, content, null);
                        if (component != null) {
                            if ((DashboardPanel)(Object)component instanceof DashboardPanel) {
                                DashboardPanel dashboardPanel = (DashboardPanel)(DashboardPanel)(Object) component;
                                if (!(Boolean)(Object)dashboardPanel.getChildren().isEmpty()) {
                                    content.appendChild(dashboardPanel);
                                    dashboardRunnable.add(dashboardPanel);
                                    panelEmpty = false;
                                }
                            } else {
                                content.appendChild(component);
                                panelEmpty = false;
                            }
                        }
                    } catch (Exception e) {
                        logger.log(Level.WARNING, "Failed to create components. zul=" + url, e);
                    }
                }
                if (panelEmpty) panel.detach();
            }
        } catch (Exception e) {
            logger.log(Level.WARNING, "Failed to create dashboard content", e);
        } finally {
            Util.closeCursor(pstmt, rs);
        }
        registerWindow(homeTab);
        if (!(Boolean)(Object)portalLayout.getDesktop().isServerPushEnabled()) portalLayout.getDesktop().enableServerPush(true);
        dashboardRunnable.refreshDashboard();
        dashboardThread =(MyHelperClass)(Object) new Thread((Runnable)(Object)dashboardRunnable, "UpdateInfo");
        dashboardThread.setDaemon(true);
        dashboardThread.start();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass ON_CLICK;
	public MyHelperClass SEVERE;
	public MyHelperClass WARNING;
public MyHelperClass getMsg(MyHelperClass o0, String o1){ return null; }
	public MyHelperClass getAD_Client_ID(){ return null; }
	public MyHelperClass log(MyHelperClass o0, String o1, Exception o2){ return null; }
	public MyHelperClass replaceAll(String o0, String o1){ return null; }
	public MyHelperClass refreshDashboard(){ return null; }
	public MyHelperClass closeCursor(PreparedStatement o0, ResultSet o1){ return null; }
	public MyHelperClass log(MyHelperClass o0, String o1, IOException o2){ return null; }
	public MyHelperClass isEmpty(){ return null; }
	public MyHelperClass getSQLValue(Object o0, String o1, MyHelperClass o2){ return null; }
	public MyHelperClass addWindow(Tabpanel o0, MyHelperClass o1, boolean o2){ return null; }
	public MyHelperClass add(DashboardPanel o0){ return null; }
	public MyHelperClass start(){ return null; }
	public MyHelperClass getCtx(){ return null; }
	public MyHelperClass createComponents(String o0, Panelchildren o1, Object o2){ return null; }
	public MyHelperClass setDaemon(boolean o0){ return null; }
	public MyHelperClass prepareStatement(String o0, Object o1){ return null; }
	public MyHelperClass isServerPushEnabled(){ return null; }
	public MyHelperClass enableServerPush(boolean o0){ return null; }}

class Tabpanel {

public MyHelperClass appendChild(Portallayout o0){ return null; }}

class Portallayout {

public MyHelperClass getDesktop(){ return null; }
	public MyHelperClass setHeight(String o0){ return null; }
	public MyHelperClass appendChild(Portalchildren o0){ return null; }
	public MyHelperClass setWidth(String o0){ return null; }
	public MyHelperClass setStyle(String o0){ return null; }}

class Portalchildren {

public MyHelperClass appendChild(Panel o0){ return null; }
	public MyHelperClass setWidth(String o0){ return null; }
	public MyHelperClass setStyle(String o0){ return null; }}

class PreparedStatement {

public MyHelperClass setInt(int o0, MyHelperClass o1){ return null; }
	public MyHelperClass executeQuery(){ return null; }}

class ResultSet {

public MyHelperClass getString(String o0){ return null; }
	public MyHelperClass getInt(String o0){ return null; }
	public MyHelperClass next(){ return null; }}

class Panel {

public MyHelperClass setTooltiptext(String o0){ return null; }
	public MyHelperClass setTitle(MyHelperClass o0){ return null; }
	public MyHelperClass detach(){ return null; }
	public MyHelperClass appendChild(Panelchildren o0){ return null; }
	public MyHelperClass setBorder(String o0){ return null; }
	public MyHelperClass setStyle(String o0){ return null; }
	public MyHelperClass setCollapsible(boolean o0){ return null; }}

class Panelchildren {

public MyHelperClass appendChild(ToolBarButton o0){ return null; }
	public MyHelperClass appendChild(DashboardPanel o0){ return null; }
	public MyHelperClass appendChild(Component o0){ return null; }
	public MyHelperClass appendChild(Html o0){ return null; }}

class Html {

public MyHelperClass setContent(String o0){ return null; }}

class ToolBarButton {

ToolBarButton(String o0){}
	ToolBarButton(){}
	public MyHelperClass addEventListener(MyHelperClass o0, c6548989 o1){ return null; }
	public MyHelperClass setLabel(MyHelperClass o0){ return null; }}

class MMenu {

MMenu(){}
	MMenu(MyHelperClass o0, int o1, Object o2){}
	public MyHelperClass getName(){ return null; }}

class Component {

}

class DashboardPanel {

public MyHelperClass getChildren(){ return null; }}

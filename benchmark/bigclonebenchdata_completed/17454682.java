import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c17454682 {
public MyHelperClass writeLink(XMLStreamWriter o0, MyHelperClass o1, Integer o2){ return null; }
	public MyHelperClass fireStatusEvent(StatusEvent o0){ return null; }
public MyHelperClass GuiStrings;
	public MyHelperClass _messenger;
	public MyHelperClass exportMediafile(XMLStreamWriter o0, MediafileIf o1, Integer o2){ return null; }
	public MyHelperClass exportCoveritem(XMLStreamWriter o0, ZipOutputStream o1, CoveritemIf o2, Integer o3){ return null; }
	public MyHelperClass exportCd(XMLStreamWriter o0, CdIf o1, Integer o2){ return null; }
	public MyHelperClass exportAlbum(XMLStreamWriter o0, AlbumIf o1, Integer o2){ return null; }

//    @Override
    public void run()  throws Throwable {
        try {
            MyHelperClass LOG = new MyHelperClass();
            if ((boolean)(Object)LOG.isDebugEnabled()) {
//                MyHelperClass LOG = new MyHelperClass();
                LOG.debug("Backupthread started");
            }
            MyHelperClass _file = new MyHelperClass();
            if ((boolean)(Object)_file.exists()) {
//                MyHelperClass _file = new MyHelperClass();
                _file.delete();
            }
//            MyHelperClass _file = new MyHelperClass();
            final ZipOutputStream zOut = new ZipOutputStream(new FileOutputStream((String)(Object)_file));
            zOut.setLevel(9);
            final File xmlFile = File.createTempFile("mp3db", ".xml");
            final OutputStream ost = new FileOutputStream(xmlFile);
            MyHelperClass XMLOutputFactory = new MyHelperClass();
            final XMLStreamWriter writer =(XMLStreamWriter)(Object) XMLOutputFactory.newInstance().createXMLStreamWriter(ost, "UTF-8");
            writer.writeStartDocument("UTF-8", "1.0");
            writer.writeCharacters("\n");
            writer.writeStartElement("mp3db");
            MyHelperClass Main = new MyHelperClass();
            writer.writeAttribute("version", Integer.toString((int)(Object)Main.ENGINEVERSION));
            final MediafileDAO mfDAO = new MediafileDAO();
            final AlbumDAO aDAO = new AlbumDAO();
            final CdDAO cdDAO = new CdDAO();
            final CoveritemDAO ciDAO = new CoveritemDAO();
            int itemCount = 0;
            try {
                itemCount += (int)(Object)mfDAO.getCount();
                itemCount += (int)(Object)aDAO.getCount();
                itemCount += (int)(Object)cdDAO.getCount();
                itemCount += (int)(Object)ciDAO.getCount();
                MyHelperClass StatusEventType = new MyHelperClass();
                fireStatusEvent(new StatusEvent(this,(Exception)(Object) StatusEventType.MAX_VALUE,(String)(Object) itemCount));
            } catch (final Exception e) {
//                MyHelperClass LOG = new MyHelperClass();
                LOG.error("Error getting size", e);
                MyHelperClass StatusEventType = new MyHelperClass();
                fireStatusEvent(new StatusEvent(this,(Exception)(Object) StatusEventType.MAX_VALUE,(String)(Object) -1));
            }
            int cdCounter = 0;
            int mediafileCounter = 0;
            int albumCounter = 0;
            int coveritemCounter = 0;
            int counter = 0;
            final List<CdIf> data =(List<CdIf>)(Object) cdDAO.getCdsOrderById();
            if (data.size() > 0) {
                final Map<Integer, Integer> albums = new HashMap<Integer, Integer>();
                final Iterator<CdIf> it = data.iterator();
                MyHelperClass _break = new MyHelperClass();
                while (it.hasNext() && !(Boolean)(Object)_break) {
                    final CdIf cd = it.next();
                    final Integer cdId = Integer.valueOf(cdCounter++);
                    MyHelperClass TypeConstants = new MyHelperClass();
                    writer.writeStartElement((String)(Object)TypeConstants.XML_CD);
                    exportCd(writer, cd, cdId);
                    MyHelperClass StatusEventType = new MyHelperClass();
                    fireStatusEvent(new StatusEvent(this,(Exception)(Object) StatusEventType.NEW_VALUE,(String)(Object) ++counter));
                    final List<MediafileIf> files =(List<MediafileIf>)(Object) cd.getMediafiles();
                    final Iterator<MediafileIf> mfit = files.iterator();
                    MediafileIf mf;
//                    MyHelperClass _break = new MyHelperClass();
                    while (mfit.hasNext() && !(Boolean)(Object)_break) {
                        mf = mfit.next();
                        final Integer mfId = Integer.valueOf(mediafileCounter++);
//                        MyHelperClass TypeConstants = new MyHelperClass();
                        writer.writeStartElement((String)(Object)TypeConstants.XML_MEDIAFILE);
                        exportMediafile(writer, mf, mfId);
//                        MyHelperClass StatusEventType = new MyHelperClass();
                        fireStatusEvent(new StatusEvent(this,(Exception)(Object) StatusEventType.NEW_VALUE,(String)(Object) ++counter));
                        final AlbumIf a =(AlbumIf)(Object) mf.getAlbum();
                        if (a != null) {
                            Integer inte;
                            if (albums.containsKey(a.getAid())) {
                                inte = albums.get(a.getAid());
//                                MyHelperClass TypeConstants = new MyHelperClass();
                                writeLink(writer, TypeConstants.XML_ALBUM, inte);
                            } else {
                                inte = Integer.valueOf(albumCounter++);
//                                MyHelperClass TypeConstants = new MyHelperClass();
                                writer.writeStartElement((String)(Object)TypeConstants.XML_ALBUM);
                                exportAlbum(writer, a, inte);
//                                MyHelperClass StatusEventType = new MyHelperClass();
                                fireStatusEvent(new StatusEvent(this,(Exception)(Object) StatusEventType.NEW_VALUE,(String)(Object) ++counter));
                                albums.put((Integer)(Object)a.getAid(), inte);
//                                MyHelperClass _break = new MyHelperClass();
                                if ((boolean)(Object)a.hasCoveritems() && !(Boolean)(Object)_break) {
                                    final List<CoveritemIf> covers =(List<CoveritemIf>)(Object) a.getCoveritems();
                                    final Iterator<CoveritemIf> coit = covers.iterator();
//                                    MyHelperClass _break = new MyHelperClass();
                                    while (coit.hasNext() && !(Boolean)(Object)_break) {
                                        final Integer coveritemId = Integer.valueOf(coveritemCounter++);
                                        exportCoveritem(writer, zOut, coit.next(), coveritemId);
//                                        MyHelperClass StatusEventType = new MyHelperClass();
                                        fireStatusEvent(new StatusEvent(this,(Exception)(Object) StatusEventType.NEW_VALUE,(String)(Object) ++counter));
                                    }
                                }
                                writer.writeEndElement();
                            }
                            MyHelperClass GenericDAO = new MyHelperClass();
                            GenericDAO.getEntityManager().close();
                        }
                        writer.writeEndElement();
                    }
                    writer.writeEndElement();
                    writer.flush();
                    it.remove();
                    MyHelperClass GenericDAO = new MyHelperClass();
                    GenericDAO.getEntityManager().close();
                }
            }
            writer.writeEndElement();
            writer.writeEndDocument();
            writer.flush();
            writer.close();
            ost.flush();
            ost.close();
            MyHelperClass _break = new MyHelperClass();
            if ((boolean)(Object)_break) {
                zOut.close();
//                MyHelperClass _file = new MyHelperClass();
                _file.delete();
            } else {
                zOut.putNextEntry(new ZipEntry("mp3.xml"));
                MyHelperClass FileUtils = new MyHelperClass();
                final InputStream xmlIn =(InputStream)(Object) FileUtils.openInputStream(xmlFile);
                MyHelperClass IOUtils = new MyHelperClass();
                IOUtils.copy(xmlIn, zOut);
                xmlIn.close();
                zOut.close();
            }
            xmlFile.delete();
            MyHelperClass StatusEventType = new MyHelperClass();
            fireStatusEvent(new StatusEvent(this, StatusEventType.FINISH));
        } catch (final Exception e) {
            MyHelperClass LOG = new MyHelperClass();
            if ((boolean)(Object)LOG.isDebugEnabled()) {
//                MyHelperClass LOG = new MyHelperClass();
                LOG.debug("Error backup database", e);
            }
            fireStatusEvent(new StatusEvent(this, e, ""));
            MyHelperClass MessageEventTypeEnum = new MyHelperClass();
            _messenger.fireMessageEvent(new MessageEvent(this, "ERROR", MessageEventTypeEnum.ERROR, GuiStrings.getInstance().getString("error.backup"), e));
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass MAX_VALUE;
	public MyHelperClass XML_MEDIAFILE;
	public MyHelperClass ERROR;
	public MyHelperClass ENGINEVERSION;
	public MyHelperClass NEW_VALUE;
	public MyHelperClass XML_CD;
	public MyHelperClass XML_ALBUM;
	public MyHelperClass FINISH;
public MyHelperClass copy(InputStream o0, ZipOutputStream o1){ return null; }
	public MyHelperClass getEntityManager(){ return null; }
	public MyHelperClass isDebugEnabled(){ return null; }
	public MyHelperClass newInstance(){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass exists(){ return null; }
	public MyHelperClass getInstance(){ return null; }
	public MyHelperClass createXMLStreamWriter(OutputStream o0, String o1){ return null; }
	public MyHelperClass debug(String o0, Exception o1){ return null; }
	public MyHelperClass error(String o0, Exception o1){ return null; }
	public MyHelperClass getString(String o0){ return null; }
	public MyHelperClass debug(String o0){ return null; }
	public MyHelperClass delete(){ return null; }
	public MyHelperClass openInputStream(File o0){ return null; }}

class ZipOutputStream {

ZipOutputStream(){}
	ZipOutputStream(FileOutputStream o0){}
	public MyHelperClass putNextEntry(ZipEntry o0){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass setLevel(int o0){ return null; }}

class XMLStreamWriter {

public MyHelperClass writeAttribute(String o0, String o1){ return null; }
	public MyHelperClass writeEndDocument(){ return null; }
	public MyHelperClass writeStartDocument(String o0, String o1){ return null; }
	public MyHelperClass writeStartElement(String o0){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass flush(){ return null; }
	public MyHelperClass writeEndElement(){ return null; }
	public MyHelperClass writeCharacters(String o0){ return null; }}

class MediafileDAO {

public MyHelperClass getCount(){ return null; }}

class AlbumDAO {

public MyHelperClass getCount(){ return null; }}

class CdDAO {

public MyHelperClass getCount(){ return null; }
	public MyHelperClass getCdsOrderById(){ return null; }}

class CoveritemDAO {

public MyHelperClass getCount(){ return null; }}

class StatusEvent {

StatusEvent(c17454682 o0, Exception o1, String o2){}
	StatusEvent(c17454682 o0, MyHelperClass o1){}
	StatusEvent(){}}

class CdIf {

public MyHelperClass getMediafiles(){ return null; }}

class MediafileIf {

public MyHelperClass getAlbum(){ return null; }}

class AlbumIf {

public MyHelperClass getAid(){ return null; }
	public MyHelperClass getCoveritems(){ return null; }
	public MyHelperClass hasCoveritems(){ return null; }}

class CoveritemIf {

}

class ZipEntry {

ZipEntry(String o0){}
	ZipEntry(){}}

class MessageEvent {

}

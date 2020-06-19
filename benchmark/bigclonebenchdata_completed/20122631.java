import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c20122631 {
public MyHelperClass TextContentAnchorType;
public MyHelperClass docController;
	public MyHelperClass ControlCharacter;
	public MyHelperClass sourceUtils;
	public MyHelperClass SourceType;

    public void insertQuotation(final String sText, final Source aSource) throws Throwable, ConfigHandlerError,(Throwable)(Object) Exception {
        final XTextDocument xTextDocument = (XTextDocument) this.docController.getXInterface(XTextDocument.class, this.docController.getXFrame().getController().getModel());
        final XMultiServiceFactory xMultiServiceFactory = (XMultiServiceFactory) this.docController.getXInterface(XMultiServiceFactory.class, xTextDocument);
        final XText xText = xTextDocument.getText();
        final XTextViewCursor xTextViewCursor = ((XTextViewCursorSupplier) this.docController.getXInterface(XTextViewCursorSupplier.class, this.docController.getXFrame().getController())).getViewCursor();
        final XTextRange xTextRange = xTextViewCursor.getStart();
        if (aSource.getSourceType() == SourceType.QUOTE || aSource.getSourceType() == SourceType.WEBQUOTE || aSource.getSourceType() == SourceType.WEBQUOTE) {
            final XPropertySet xQuoteProps = (XPropertySet) this.docController.getXInterface(XPropertySet.class, xTextViewCursor);
            if (this.docController.getTemplateController().isIndentation()) {
                xText.insertControlCharacter(xTextViewCursor, ControlCharacter.PARAGRAPH_BREAK, false);
                xQuoteProps.setPropertyValue("ParaStyleName", new String("Quotations"));
            }
            xQuoteProps.setPropertyValue("CharStyleName", new String("Citation"));
            final Object aBookmark = xMultiServiceFactory.createInstance("com.sun.star.text.Bookmark");
            this.sourceUtils.setNameToObject(aBookmark, this.docController.getLanguageController().__("Quote: ") + aSource.getShortinfo());
            final XTextContent xTextContent = (XTextContent) this.docController.getXInterface(XTextContent.class, aBookmark);
            xText.insertTextContent(xTextRange, xTextContent, false);
            this.sourceUtils.insertBibliographyEntry(xMultiServiceFactory, xTextRange, aSource, sText);
            if (this.docController.getTemplateController().isIndentation()) {
                xText.insertControlCharacter(xTextViewCursor, ControlCharacter.PARAGRAPH_BREAK, false);
                xQuoteProps.setPropertyValue("ParaStyleName", new String(this.docController.getLanguageController().__("Default")));
            }
            xQuoteProps.setPropertyValue("CharStyleName", new String(this.docController.getLanguageController().__("Default")));
        } else if (aSource. void getSourceType() == SourceType.IMAGE || aSource.getSourceType() == SourceType.TABLE) {
            xText.insertControlCharacter(xTextRange, ControlCharacter.PARAGRAPH_BREAK, false);
            final XTextFrame xFrame = this.sourceUtils.getTextFrame(aSource.getShortinfo(), xMultiServiceFactory);
            xText.insertTextContent(xTextRange, xFrame, false);
            final XText xFrameText = xFrame.getText();
            final XTextCursor xFrameCursor = xFrameText.createTextCursor();
            final Size aNewSize = new Size();
            XPropertySet xBaseFrameProps = null;
            final Size aPageTextAreaSize = this.sourceUtils.getPageTextAreaSize(xTextDocument, xTextViewCursor);
            if (aSource.getSourceType() == SourceType.IMAGE) {
                try {
                    this.sourceUtils.setNameToObject(xFrame, this.docController.getLanguageController().__("Caption illustration: ") + aSource.getShortinfo());
                    final XNameContainer xBitmapContainer = (XNameContainer) this.docController.getXInterface(XNameContainer.class, xMultiServiceFactory.createInstance("com.sun.star.drawing.BitmapTable"));
                    final XTextContent xImage = (XTextContent) this.docController.getXInterface(XTextContent.class, xMultiServiceFactory.createInstance("com.sun.star.text.TextGraphicObject"));
                    this.sourceUtils.setNameToObject(xImage, this.docController.getLanguageController().__("Illustration: ") + aSource.getShortinfo());
                    final String graphicURL = this.docController.getPathUtils().getFileURLFromSystemPath(((Image) aSource).getFile().getPath(), ((Image) aSource).getFile().getPath());
                    xBaseFrameProps = (XPropertySet) this.docController.getXInterface(XPropertySet.class, xImage);
                    xBaseFrameProps.setPropertyValue("AnchorType", TextContentAnchorType.AT_PARAGRAPH);
                    xBaseFrameProps.setPropertyValue("GraphicURL", graphicURL);
                    final MessageDigest md = MessageDigest.getInstance("MD5");
                    md.update(graphicURL.getBytes(), 0, graphicURL.length());
                    final String internalName = new BigInteger(1, md.digest()).toString(16);
                    xBitmapContainer.insertByName(internalName, graphicURL);
                    final String internalURL = (String) (xBitmapContainer.getByName(internalName));
                    xBaseFrameProps.setPropertyValue("GraphicURL", internalURL);
                    float imageRatio = (float) this.sourceUtils.getImageSize(((Image) aSource).getFile()).Height / (float) this.sourceUtils.getImageSize(((Image) aSource).getFile()).Width;
                    final Size aUsedAreaSize = new Size(this.sourceUtils.getImageSize(((Image) aSource).getFile()).Width * 26, this.sourceUtils.getImageSize(((Image) aSource).getFile()).Height * 26);
                    if (aUsedAreaSize.Width >= aPageTextAreaSize.Width) {
                        aNewSize.Width = aPageTextAreaSize.Width;
                        aNewSize.Height = (int) (aPageTextAreaSize.Width * imageRatio);
                    } else {
                        aNewSize.Width = aUsedAreaSize.Width;
                        aNewSize.Height = aUsedAreaSize.Height;
                    }
                    xFrameText.insertTextContent(xFrameCursor, xImage, false);
                    xBitmapContainer.removeByName(internalName);
                } catch (final NoSuchAlgorithmException e) {
                    new ASTError(e).severe();
                }
                this.sourceUtils.insertCaption(xFrame, aSource, this.docController.getLanguageController().__("Illustration"), xMultiServiceFactory);
            } else if (aSource.getSourceType() == SourceType.TABLE) {
                this.sourceUtils.setNameToObject(xFrame, this.docController.getLanguageController().__("Caption table: ") + aSource.getShortinfo());
                xBaseFrameProps = this.sourceUtils.createTextEmbeddedObjectCalc(xMultiServiceFactory);
                this.sourceUtils.setNameToObject(xBaseFrameProps, this.docController.getLanguageController().__("Table: ") + aSource.getShortinfo());
                xFrameText.insertTextContent(xFrameCursor, (XTextContent) this.docController.getXInterface(XTextContent.class, xBaseFrameProps), false);
                final XEmbeddedObjectSupplier2 xEmbeddedObjectSupplier = (XEmbeddedObjectSupplier2) this.docController.getXInterface(XEmbeddedObjectSupplier2.class, xBaseFrameProps);
                final XEmbeddedObject xEmbeddedObject = xEmbeddedObjectSupplier.getExtendedControlOverEmbeddedObject();
                long nAspect = xEmbeddedObjectSupplier.getAspect();
                final Size aVisualAreaSize = xEmbeddedObject.getVisualAreaSize(nAspect);
                final XComponent xComponent = xEmbeddedObjectSupplier.getEmbeddedObject();
                XSpreadsheets xSpreadsheets = ((XSpreadsheetDocument) this.docController.getXInterface(XSpreadsheetDocument.class, xComponent)).getSheets();
                final XIndexAccess xIndexAccess = (XIndexAccess) this.docController.getXInterface(XIndexAccess.class, xSpreadsheets);
                final XSpreadsheet xSpreadsheet = (XSpreadsheet) this.docController.getXInterface(XSpreadsheet.class, xIndexAccess.getByIndex(0));
                final XSheetLinkable xSheetLinkable = (XSheetLinkable) this.docController.getXInterface(XSheetLinkable.class, xSpreadsheet);
                xSheetLinkable.link(this.docController.getPathUtils().getFileURLFromSystemPath(((Table) aSource).getFile().getPath(), ((Table) aSource).getFile().getPath()), "", "", "", com.sun.star.sheet.SheetLinkMode.NORMAL);
                final CellRangeAddress aUsedArea = this.sourceUtils.getUsedArea(xSpreadsheet);
                final Size aUsedAreaSize = this.sourceUtils.calcCellRangeSize(xSpreadsheets, aUsedArea);
                if ((aUsedAreaSize.Width != aVisualAreaSize.Width) || (aUsedAreaSize.Height != aVisualAreaSize.Height)) {
                    aNewSize.Height = (aUsedAreaSize.Height > aPageTextAreaSize.Height) ? aPageTextAreaSize.Height : aUsedAreaSize.Height;
                    aNewSize.Width = (aUsedAreaSize.Width > aPageTextAreaSize.Width) ? aPageTextAreaSize.Width : aUsedAreaSize.Width;
                    xEmbeddedObject.setVisualAreaSize(nAspect, aNewSize);
                }
                this.sourceUtils.insertCaption(xFrame, aSource, this.docController.getLanguageController().__("Table"), xMultiServiceFactory);
            }
            xBaseFrameProps.setPropertyValue("Width", aNewSize.Width);
            xBaseFrameProps.setPropertyValue("Height", aNewSize.Height);
            final XShape xShape = (XShape) this.docController.getXInterface(XShape.class, xFrame);
            xShape.setSize(aNewSize);
        }
        final XTextFieldsSupplier xTextFieldsSupplier = (XTextFieldsSupplier) this.docController.getXInterface(XTextFieldsSupplier.class, xMultiServiceFactory);
        final XRefreshable xRefreshable = (XRefreshable) this.docController.getXInterface(XRefreshable.class, xTextFieldsSupplier.getTextFields());
        xRefreshable.refresh();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass TABLE;
	public MyHelperClass WEBQUOTE;
	public MyHelperClass QUOTE;
	public MyHelperClass PARAGRAPH_BREAK;
	public MyHelperClass IMAGE;
public MyHelperClass insertBibliographyEntry(XMultiServiceFactory o0, XTextRange o1, Source o2, String o3){ return null; }
	public MyHelperClass getXInterface(Class<XPropertySet o0, XTextContent o1){ return null; }
	public MyHelperClass getXInterface(Class<XEmbeddedObjectSupplier2 o0, XPropertySet o1){ return null; }
	public MyHelperClass getXFrame(){ return null; }
	public MyHelperClass getTemplateController(){ return null; }
	public MyHelperClass getXInterface(Class<XPropertySet o0, XTextViewCursor o1){ return null; }
	public MyHelperClass getPathUtils(){ return null; }
	public MyHelperClass getXInterface(Class<XMultiServiceFactory o0, XTextDocument o1){ return null; }
	public MyHelperClass createTextEmbeddedObjectCalc(XMultiServiceFactory o0){ return null; }
	public MyHelperClass getXInterface(Class<XTextContent o0, XPropertySet o1){ return null; }
	public MyHelperClass getXInterface(Class<XTextContent o0, Object o1){ return null; }
	public MyHelperClass getLanguageController(){ return null; }
	public MyHelperClass getPageTextAreaSize(XTextDocument o0, XTextViewCursor o1){ return null; }}

class Source {

public MyHelperClass getShortinfo(){ return null; }
	public MyHelperClass getSourceType(){ return null; }}

class ConfigHandlerError {

}

class XTextDocument {

public MyHelperClass getText(){ return null; }}

class XMultiServiceFactory {

public MyHelperClass createInstance(String o0){ return null; }}

class XText {

public MyHelperClass insertTextContent(XTextRange o0, XTextFrame o1, boolean o2){ return null; }
	public MyHelperClass createTextCursor(){ return null; }
	public MyHelperClass insertTextContent(XTextCursor o0, XTextContent o1, boolean o2){ return null; }
	public MyHelperClass insertTextContent(XTextRange o0, XTextContent o1, boolean o2){ return null; }}

class XTextViewCursor {

public MyHelperClass getStart(){ return null; }}

class XTextViewCursorSupplier {

public MyHelperClass getViewCursor(){ return null; }}

class XTextRange {

}

class XPropertySet {

public MyHelperClass setPropertyValue(String o0, String o1){ return null; }}

class XTextContent {

}

class XTextFrame {

public MyHelperClass getText(){ return null; }}

class XTextCursor {

}

class Size {
public MyHelperClass Width;
	public MyHelperClass Height;
}

class XNameContainer {

public MyHelperClass removeByName(String o0){ return null; }
	public MyHelperClass insertByName(String o0, String o1){ return null; }
	public MyHelperClass getByName(String o0){ return null; }}

class ASTError {

ASTError(NoSuchAlgorithmException o0){}
	ASTError(){}}

class XEmbeddedObjectSupplier2 {

public MyHelperClass getEmbeddedObject(){ return null; }
	public MyHelperClass getExtendedControlOverEmbeddedObject(){ return null; }
	public MyHelperClass getAspect(){ return null; }}

class XEmbeddedObject {

public MyHelperClass getVisualAreaSize(long o0){ return null; }}

class XComponent {

}

class Image {

}

class XSpreadsheets {

}

class XSpreadsheetDocument {

}

class XIndexAccess {

}

class XSpreadsheet {

}

class XSheetLinkable {

}

public class DocumentRegistry{
    private PDFDocument pdfDocument  = new PDFDocument();
    private SpreadsheetDocument spreadsheetDocument= new SpreadsheetDocument();  
    private TextDocument textDocument  = new TextDocument() ;
    public DocumentRegistry(){
    }

    public Document createPDFDocument(String filename, String author, int pageCount){
        PDFDocument clone = (PDFDocument) pdfDocument.clone();
        clone.setFilename(filename);
        clone.setAuthor(author);
        clone.setPageCount(pageCount);
        return clone;
    }
    public Document createSpreadDocument(String spreadSheetName, int rowCount, int columnCount){
        SpreadsheetDocument clone = (SpreadsheetDocument) spreadsheetDocument.clone();
        clone.setspreadSheetName(spreadSheetName);
        clone.setrowCount(rowCount);
        clone.setPageCount(columnCount);
        return clone;
    }
    public Document createTextDocument(String filename, String encoding, int wordCount){
        TextDocument clone = (TextDocument) textDocument.clone();
        clone.setfilepath(filename);
        clone.setencoding(encoding);
        clone.setPageCount(wordCount);
        return clone;
    }
    
}

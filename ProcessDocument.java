public class ProcessDocument{
    public static void main(String[] args) {
       DocumentRegistry documentRegistry = new DocumentRegistry(); 
       PDFDocument pdfDocument1 = (PDFDocument) documentRegistry.createPDFDocument("annual_report_20245.pdf","ACME CORP",150);
       PDFDocument pdfDocument2 = (PDFDocument) documentRegistry.createPDFDocument("summary_report.pdf","ACME CORP",30);
       SpreadsheetDocument spreadsheetDocument = (SpreadsheetDocument) documentRegistry.createSpreadDocument("sales_data_q1.xlxs",1000, 20);
       TextDocument textDocument = (TextDocument) documentRegistry.createTextDocument("meeting_notes.txt","UTF-6", 250);
       pdfDocument1.open();
       System.out.println(pdfDocument1.getType());
       spreadsheetDocument.open();
       System.out.println(spreadsheetDocument.getType());
       textDocument.open();
       System.out.println(textDocument.getType());
       pdfDocument2.open();


    }

}
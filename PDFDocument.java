public class PDFDocument implements Document {
    private String filename =  "default.pdf";
    private String author = "none";
    private int pageCount = 0;

    public PDFDocument(String filename, String author, int pageCount) {
        System.out.println("Creating a PDF Document Prototype");
        this.filename = filename;
        this.author = author;
        this.pageCount = pageCount;
    }

    PDFDocument(){};

    public Document clone(){
        return new PDFDocument(this.filename,this.author, this.pageCount);
    }
        
    @Override
    public void open() {
        System.out.println("Opening PDF Document: " + filename + " by " + author + "( " + pageCount  + ") pages ");
    }

    @Override
    public String getType() {
        return "Type : PDF, File: " + filename + ",Author: " + author + ", Pages " + pageCount;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }
    
}






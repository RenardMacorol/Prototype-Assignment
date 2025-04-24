public class SpreadsheetDocument implements Document {
    private String spreadSheetName;
    private int rowCount;
    private int columnCount;

    public SpreadsheetDocument(String spreadSheetName, int rowCount, int columnCount) {
        System.out.println("Creating a Spreadsheet Document Prototype");
        this.spreadSheetName = spreadSheetName;
        this.rowCount = rowCount;
        this.columnCount = columnCount;
    }

    SpreadsheetDocument(){};

    public Document clone(){
        return new SpreadsheetDocument(this.spreadSheetName,this.rowCount, this.columnCount);
    }
        
    @Override
    public void open() {
        System.out.println("Opening SpreadsheetDocument Document: " + spreadSheetName + "Rows: " +  "( " +  rowCount+ ")"  +  "Column" +  "( " +  columnCount+ ")");
    }

    @Override
    public String getType() {
        return "Type : Spreadsheet, Name: " + spreadSheetName + ",Rowss: " + rowCount + ", columnCount " + columnCount;
    }

    public String getspreadSheetName() {
        return spreadSheetName;
    }

    public void setspreadSheetName(String spreadSheetName) {
        this.spreadSheetName = spreadSheetName;
    }

    public int getrowCount() {
        return rowCount;
    }

    public void setrowCount(int rowCount) {
        this.rowCount = rowCount;
    }

    public int getPageCount() {
        return columnCount;
    }

    public void setPageCount(int columnCount) {
        this.columnCount = columnCount;
    }
    
}

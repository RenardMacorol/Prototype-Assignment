public class TextDocument implements Document {
    private String filepath;
    private String encoding;
    private int wordCount;

    public TextDocument(String filepath, String encoding, int wordCount) {
        System.out.println("Creating a Text Document Prototype");
        this.filepath = filepath ;
        this.encoding = encoding;
        this.wordCount = wordCount;
    }

    TextDocument(){};

    public Document clone(){
        return new TextDocument(this.filepath,this.encoding, this.wordCount);
    }
        
    @Override
    public void open() {
        System.out.println("Opening Text Document: " + filepath + " Encoding:  " + encoding + "(" + wordCount + "words)");
    }

    @Override
    public String getType() {
        return "Type : Text, Path: " + filepath + ",Encoding: " + encoding + ", Words: " + wordCount;
    }

    public String getfilepath() {
        return filepath;
    }

    public void setfilepath(String filepath) {
        this.filepath = filepath;
    }

    public String getencoding() {
        return encoding;
    }

    public void setencoding(String encoding) {
        this.encoding = encoding;
    }

    public int getPageCount() {
        return wordCount;
    }

    public void setPageCount(int wordCount) {
        this.wordCount = wordCount;
    }
    
}

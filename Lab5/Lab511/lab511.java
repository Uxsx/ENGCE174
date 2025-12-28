import java.util.Scanner;

class Document {
    protected String title;

    public Document(String title) {
        this.title = title;
    }

    public void displayDetails() {
        System.out.println("Document: " + title);
    }
}

class TextDocument extends Document {
    protected int wordCount;

    public TextDocument(String title, int wordCount) {
        super(title);
        this.wordCount = wordCount;
    }

    @Override
    public void displayDetails() {
        System.out.println("Text: " + title + ", Words: " + wordCount);
    }
}

class PDFDocument extends Document {
    protected int pageCount;

    public PDFDocument(String title, int pageCount) {
        super(title);
        this.pageCount = pageCount;
    }

    @Override
    public void displayDetails() {
        System.out.println("PDF: " + title + ", Pages: " + pageCount);
    }
}

public class lab511 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Document[] docs = new Document[4];

        for (int i = 0; i < 2; i++) {
            String textTitle = scanner.nextLine();
            int words = Integer.parseInt(scanner.nextLine());
            docs[i * 2] = new TextDocument(textTitle, words);

            String pdfTitle = scanner.nextLine();
            int pages = Integer.parseInt(scanner.nextLine());
            docs[i * 2 + 1] = new PDFDocument(pdfTitle, pages);
        }

        int totalPages = 0;
        for (Document d : docs) {
            if (d instanceof PDFDocument) {
                PDFDocument pdf = (PDFDocument) d;
                totalPages += pdf.pageCount;
            }
        }

        for (Document d : docs) {
            d.displayDetails();
        }

        System.out.println("Total Pages: " + totalPages);
        
        scanner.close();
    }
}
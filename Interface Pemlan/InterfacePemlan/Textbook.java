package InterfacePemlan;

public class Textbook extends Book implements BookOperations {
    private String subject;

    public Textbook(String title, String author, int year, String subjectnya){
        super(title, author, year);
        this.subject = subjectnya;
    }
    @Override
    public void borrowBook() {
        if(!isBorrowed()){
            setBorrowed(true);
            System.out.println("Textbook\t: " + getTitle() + " borrowed successfully");
        } else {
            System.out.println("Textbook\t: " + getTitle() + " is already borrowed");
        }
    }

    @Override
    public void returnBook() {
        if(isBorrowed()){
            setBorrowed(false);
            System.out.println("Textbook\t: " + getTitle() + " returned successfully");
        } else {
            System.out.println("Textbook\t: " + getTitle() + " is not borrowed");
        }
    }

    public void displayInfo(){
        super.displayInfo();
        System.out.println("Subject\t\t: " + this.subject);
        System.out.println();
    }
}

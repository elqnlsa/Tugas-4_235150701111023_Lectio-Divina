package InterfacePemlan;

public class Novel extends Book implements BookOperations {

    private String genre;

    public Novel(String title, String author, int year, String genrenya) {
        super(title, author, year);
        this.genre = genrenya;

        //TODO Auto-generated constructor stub
    }

    @Override
    public void borrowBook() {
        if(!isBorrowed()){
            setBorrowed(true);
            System.out.println("Novel : " + getTitle() + " borrowed successfully");
        } else {
            System.out.println("Novel : " + getTitle() + " is already borrowed");
        }
    }

    @Override
    public void returnBook() {
        if(isBorrowed()){
            setBorrowed(false);
            System.out.println("Novel\t\t: " + getTitle() + " returned successfully");
        } else {
            System.out.println("Novel\t\t: " + getTitle() + " is not borrowed");
        }
    }

    public void displayInfo(){
        super.displayInfo();
        System.out.println("Genre\t\t: " + this.genre);
        System.out.println();
    }
    
    
}

package InterfacePemlan;

public class Magazine extends Book implements BookOperations{

    private String category;

    public Magazine(String title, String author, int year, String kategori) {
        super(title, author, year);
        this.category = kategori;
        //TODO Auto-generated constructor stub
    }

    @Override
    public void borrowBook() {
            if(!isBorrowed()){
                setBorrowed(true);
                System.out.println("Magazine\t: " + getTitle() + " borrowed successfully");
            } else {
                System.out.println("Magazine\t: " + getTitle() + " is already borrowed");
            }
        }
    
        @Override
        public void returnBook() {
            if(isBorrowed()){
                setBorrowed(false);
                System.out.println("Magazine\t: " + getTitle() + " returned successfully");
            } else {
                System.out.println("Magazine\t: " + getTitle() + " is not borrowed");
            }
        }
    
        public void displayInfo(){
            super.displayInfo();
            System.out.println("Category\t: " + this.category);
            System.out.println();
        }
    
}

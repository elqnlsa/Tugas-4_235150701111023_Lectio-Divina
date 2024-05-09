package InterfacePemlan;

public class Main {
    public static void main(String[] args) {
        Textbook textbook = new Textbook("History of Western Philosophy", "Normal Melchert", 2013, "Philosophy");
        Novel novel = new Novel("Harry Potter and The Philosopher's Stone", "J.K Rowling", 1997, "Fantasy");
        Magazine magazine = new Magazine("Vogue Vol. II", "Vogue Magazine", 2018, "Social");

        System.out.println("====================== Book Information ========================");
        System.out.println();
        textbook.displayInfo();
        novel.displayInfo();
        magazine.displayInfo();

        System.out.println("================= Borrowing and Returning Books =================");
        System.out.println();
        textbook.borrowBook();
        textbook.returnBook();
        novel.returnBook();
        magazine.borrowBook();
        System.out.println();
        System.out.println("===================================================================");

    }
}

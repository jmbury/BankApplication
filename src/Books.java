public class Books {
    String bookName;
    String author;
    int numberOfPages;

    public Books(String bookName, String author, int numberOfPages) {
        this.bookName = bookName;
        this.author = author;
        this.numberOfPages = numberOfPages;


    }
    public String toString(){
        return "tytuł: " +bookName + "Autor: " + author + "Liczba stron: " + numberOfPages;
    }
    public String getAuthor(){
        return author;
    }
    public void setAuthor(String author){
        this.author=author;
    }

    public int getNumberOfPages(){
        return numberOfPages;
    }
    public void setNumberOfPages(int numberOfPages){
        this.numberOfPages=numberOfPages;
    }


}

public class Main {
    public static void main(String[] args){

        Books book1 = new Books ("1984 ", "Orwell ", 250);
        Books book2 = new Books("Alicja w krainie czarów ", "Carroll ", 136);
        Books book3 = new Books("Nowy Wspaniały Świat ", "Huxley ", 176);

        System.out.println(book1.toString());
        book1.setAuthor("George Orwell ");
        System.out.println(book1.toString());

        System.out.println(book2.toString());
        System.out.println(book2.getNumberOfPages());
        book2.setNumberOfPages(567);
        System.out.println(book2.toString());
    }

}

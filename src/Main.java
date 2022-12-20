public class Main {
    public static void main(String[] args) {
        // Первая книга
        System.out.println("Первая книга");
        Author gabriel = new Author("Габриэль", "Гарсиа Маркес");
        Book oneHundredYearsOfSolitude  = new Book("Сто лет одиночества", gabriel, 1967);
        System.out.println("Название книги: " + oneHundredYearsOfSolitude.getBookName());
        System.out.println("Автор книги: " + gabriel.getSurname() + " " + gabriel.getNamename());
        System.out.println("Год публикации: " + oneHundredYearsOfSolitude.getYearOfPublication());
        System.out.println();
        // Вторая книга
        System.out.println("Вторая книга");
        Author alexander = new Author("Александр", "Пушкин");
        Book eugeneOnegin  = new Book("Евгений Онегин", alexander, 1833);
        System.out.println("Название книги: " + eugeneOnegin.getBookName());
        System.out.println("Автор книги: " + alexander.getSurname() + " " + alexander.getNamename());
        System.out.println("Год публикации: " + eugeneOnegin.getYearOfPublication());
        eugeneOnegin.setYearOfPublication(1837);
        System.out.println("Год публикации второго полного издания: " + eugeneOnegin.getYearOfPublication());
    }
}
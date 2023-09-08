/*
 * CS2050 - Computer Science II - Fall 2023
 * Instructor: Thyago Mota
 * Student:
 * Description: Homework 01 - Book
 */

public class Book {
    public String title;
    public String author;
    public String genre;
    public int pages;

    private static final String DEFAULT_GENRE = "fiction";
    private static final int DEFAULT_PAGES = 10;
    private static final int LONG_BOOK = 300;

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getGenre() {
        return genre;
    }

    public int getPages() {
        return pages;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", genre='" + genre + '\'' +
                ", pages=" + pages +
                '}';
    }
    public Book(String title, String author, String genre, int pages){
        this.title = title;
        this.author = author;
        if(genre.equals("fiction")){
            this.genre = genre;
        }
        else if(genre.equals("non-fiction")){
            this.genre = genre;
        }
        else if(genre.equals("technical")){
            this.genre = genre;
        }
        else if(genre.equals("biography")){
            this.genre = genre;
        }else {
            this.genre = DEFAULT_GENRE;
        }
        if(pages<10){
            this.pages = DEFAULT_PAGES;
        }
        else{
            this.pages = pages;
        }
    }

    public boolean isLong(){
        if(pages>LONG_BOOK){
            return true;
        }else
            return false;
    }

}

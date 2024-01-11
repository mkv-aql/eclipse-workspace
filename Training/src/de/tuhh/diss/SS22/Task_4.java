package de.tuhh.diss.SS22;

public class Task_4 {

	public static void main(String[] args) {
	    Book book = new Book("The Great Gatsby", "F. Scott Fitzgerald", 180);
	    MusicAlbum album = new MusicAlbum("The Wall", "Pink Floyd", 26);
	    Media[] mediaArray = {book, album};
	    Library library = new Library(mediaArray);
	    library.printMedia();
	}


}

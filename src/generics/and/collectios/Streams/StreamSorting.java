package generics.and.collectios.Streams;

import java.util.Arrays;
import java.util.List;



public class StreamSorting {

	
	public static void main(String[] args){
		
		List<Book> books = Arrays.asList(
				new Book("Ludlum","Thinking in Java"), 
				new Book("Ludlum","Java in 24 hrs"), 
				new Book("Ludlum","Java Recipies")
				); 
		//valid sortings 
		books.stream().sorted(Book::compareTo).forEach(b->System.out.println(b.getIsbn()));
		books.stream().sorted((a,b) -> a.isbn.compareTo(b.isbn)).forEach(b->System.out.println(b.getIsbn()));
		
		//invalid sortings
		books.stream().sorted().forEach(b->System.out.println(b.getIsbn()));
		
	}
	
	
	public static class Book{ 
		String isbn; 
		String title;
		public Book(String isbn, String title)
		{ this.isbn = isbn; this.title = title; }
		public String getIsbn() {
			return isbn;
		}
		public void setIsbn(String isbn) {
			this.isbn = isbn;
		}
		public String getTitle() {
			return title;
		}
		public void setTitle(String title) {
			this.title = title;
		}
		
		public static int compareTo (Book a, Book b) {
			return a.isbn.compareTo(b.isbn);
		}
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			
			result = prime * result + ((isbn == null) ? 0 : isbn.hashCode());
			result = prime * result + ((title == null) ? 0 : title.hashCode());
			return result;
		}
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Book other = (Book) obj;
			
			if (isbn == null) {
				if (other.isbn != null)
					return false;
			} else if (!isbn.equals(other.isbn))
				return false;
			if (title == null) {
				if (other.title != null)
					return false;
			} else if (!title.equals(other.title))
				return false;
			return true;
		}
		
	}
}

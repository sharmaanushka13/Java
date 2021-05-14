package CollectionFramework;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.TreeMap;
import java.util.TreeSet;

 class MovieDetails {
	String movie_Name;
	String Hero;
	String Villain;
	String Genre;

	public MovieDetails(String movie_Name, String hero, String villain, String genre) {
		super();
		this.movie_Name = movie_Name;
		Hero = hero;
		Villain = villain;
		Genre = genre;
	}

	public String getMovie_Name() {
		return movie_Name;
	}

	public void setMovie_Name(String movie_Name) {
		this.movie_Name = movie_Name;
	}

	public String getHero() {
		return Hero;
	}

	public void setHero(String hero) {
		Hero = hero;
	}

	public String getVillain() {
		return Villain;
	}

	public void setVillain(String villain) {
		Villain = villain;
	}

	public String getGenre() {
		return Genre;
	}

	public void setGenre(String genre) {
		Genre = genre;
	}

	@Override
	public String toString() {
		return "Movie_Details [movie_Name=" + movie_Name + ", Hero=" + Hero + ", Villain=" + Villain + ", Genre="
				+ Genre + "]";
	}

}
public class Movies {

	public static void main(String[] args) {
		List<MovieDetails> movie = Arrays.asList(new MovieDetails("Master", "Thalaphathy", "Vjs", "Action"),
				new MovieDetails("Thuppaki", "Thalaphathy", "Vidyuth", "Military"),
				new MovieDetails("Mersal", "Thalaphathy", "Daniel", "Family_Entertainment"));
		Collections.sort(movie, new Comparator<MovieDetails>() {

			@Override
			public int compare(MovieDetails o1, MovieDetails o2) {
				return o1.movie_Name.compareTo(o2.movie_Name);

			}

		});

		printallmovie(movie);
		remove_movie(movie, "Mersal");

	}

	private static void printallmovie(List<MovieDetails> movie) {
		for (MovieDetails p : movie)
			System.out.println(p);
	}

	public static void remove_movie(List<MovieDetails> movie, String name) {
		movie.remove(name);

	}

}

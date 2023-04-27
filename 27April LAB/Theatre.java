package TheaterMovies;

import jakarta.persistence.*;

@Entity
@Table(name="Theatre_info")
public class Theatre {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@Column(name= "movie_name")
	private String movie_name;
	private String location;
	public String getmoviename() {
		return movie_name;
	}
	public String getMovie_name() {
		return movie_name;
	}
	public void setMovie_name(String movie_name) {
		this.movie_name = movie_name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public Theatre(String movie_name, String location) {
		super();
		this.movie_name = movie_name;
		this.location = location;
	}
	@Override
	public String toString() {
		return "Theatre [movie_name=" + movie_name + ", location=" + location + "]";
	}
	
}

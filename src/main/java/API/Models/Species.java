package API.Models;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class Species extends BaseModel{
	private List<String> films;

	@JsonProperty("skin_colors")
	private String skinColors;
	private String homeworld;
	private String edited;
	private String created;

	@JsonProperty("eve_colors")
	private String eyeColors;
	private String language;
	private String classification;
	private List<String> people;
	private String url;

	@JsonProperty("hair_colors")
	private String hairColors;

	@JsonProperty("average_height")
	private String averageHeight;
	private String designation;

	@JsonProperty("average_lifespan")
	private String averageLifespan;

	public List<String> getFilms(){
		return films;
	}

	public String getSkinColors(){
		return skinColors;
	}

	public String getHomeworld(){
		return homeworld;
	}

	public String getEdited(){
		return edited;
	}

	public String getCreated(){
		return created;
	}

	public String getEyeColors(){
		return eyeColors;
	}

	public String getLanguage(){
		return language;
	}

	public String getClassification(){
		return classification;
	}

	public List<String> getPeople(){
		return people;
	}

	public String getUrl(){
		return url;
	}

	public String getHairColors(){
		return hairColors;
	}

	public String getAverageHeight(){
		return averageHeight;
	}

	public String getName(){
		return name;
	}

	public String getDesignation(){
		return designation;
	}

	public String getAverageLifespan(){
		return averageLifespan;
	}

	@Override
 	public String toString(){
		return 
			"Species{" +
			"films = '" + films + '\'' + 
			",skin_colors = '" + skinColors + '\'' + 
			",homeworld = '" + homeworld + '\'' + 
			",edited = '" + edited + '\'' + 
			",created = '" + created + '\'' + 
			",eye_colors = '" + eyeColors + '\'' + 
			",language = '" + language + '\'' + 
			",classification = '" + classification + '\'' + 
			",people = '" + people + '\'' + 
			",url = '" + url + '\'' + 
			",hair_colors = '" + hairColors + '\'' + 
			",average_height = '" + averageHeight + '\'' + 
			",name = '" + name + '\'' + 
			",designation = '" + designation + '\'' + 
			",average_lifespan = '" + averageLifespan + '\'' + 
			"}";
		}
}
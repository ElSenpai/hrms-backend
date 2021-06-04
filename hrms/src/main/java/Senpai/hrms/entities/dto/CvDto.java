package Senpai.hrms.entities.dto;

import java.util.List;

import Senpai.hrms.entities.concretes.Ability;
import Senpai.hrms.entities.concretes.CoverLetter;
import Senpai.hrms.entities.concretes.Education;
import Senpai.hrms.entities.concretes.Experience;
import Senpai.hrms.entities.concretes.Image;
import Senpai.hrms.entities.concretes.JobHunter;
import Senpai.hrms.entities.concretes.Language;
import Senpai.hrms.entities.concretes.Link;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CvDto {

	private JobHunter jobhunter;
	private Image image;
	private List<CoverLetter> coverletters;
	private List<Education> educations;
	private List<Experience> experiences;
	private List<Ability>	abilities;
	private List<Language> languages;
	private List<Link> links;
	
	
	
}

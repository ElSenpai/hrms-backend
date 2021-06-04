package Senpai.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Senpai.hrms.business.abstracts.AbilityService;
import Senpai.hrms.business.abstracts.CoverLetterService;
import Senpai.hrms.business.abstracts.EducationService;
import Senpai.hrms.business.abstracts.ExperienceService;
import Senpai.hrms.business.abstracts.ImageService;
import Senpai.hrms.business.abstracts.JobHunterService;
import Senpai.hrms.business.abstracts.LanguageService;
import Senpai.hrms.business.abstracts.LinkService;
import Senpai.hrms.business.abstracts.UserService;
import Senpai.hrms.core.utilities.results.DataResult;
import Senpai.hrms.core.utilities.results.ErrorResult;
import Senpai.hrms.core.utilities.results.Result;
import Senpai.hrms.core.utilities.results.SuccessDataResult;
import Senpai.hrms.core.utilities.results.SuccessResult;
import Senpai.hrms.dataAccess.abstracts.JobHunterDao;

import Senpai.hrms.entities.concretes.JobHunter;
import Senpai.hrms.entities.dto.CvDto;
@Service
public class JobHunterManager implements JobHunterService {
	
	private JobHunterDao jobHunterDao;
	private AbilityService abilityService;
	private CoverLetterService LetterService;
	private EducationService educationService;
	private ExperienceService experienceService;
	private ImageService imageService;
	private LanguageService languageService;
	private LinkService linkService;

	
		
	

	@Autowired
	public JobHunterManager(JobHunterDao jobHunterDao, AbilityService abilityService, CoverLetterService letterService,
			EducationService educationService, ExperienceService experienceService, ImageService imageService,
			LanguageService languageService, LinkService linkService) {
		super();
		this.jobHunterDao = jobHunterDao;
		this.abilityService = abilityService;
		LetterService = letterService;
		this.educationService = educationService;
		this.experienceService = experienceService;
		this.imageService = imageService;
		this.languageService = languageService;
		this.linkService = linkService;
	}

	@Override
	public Result add(JobHunter jobHunt) {
		
		
		
		
        this.jobHunterDao.save(jobHunt);
              return new SuccessResult("Condidate Added");
		
	}

	@Override
	public DataResult<List<JobHunter>> getAll() {
		// TODO Auto-generated method stub
		return new SuccessDataResult<List<JobHunter>>( this.jobHunterDao.findAll(),"Condidates Listed");
	}

	@Override
	public DataResult<CvDto> getCv(int jobHunterId) {
		CvDto cv=new CvDto();
		cv.setJobhunter(this.get(jobHunterId).getData());
		cv.setAbilities(this.abilityService.getByJobhunter(jobHunterId).getData());
		cv.setCoverletters(this.LetterService.getByJobhunter(jobHunterId).getData());
		cv.setEducations(this.educationService.getByJobhunterOrderByGraduationDateDesc(jobHunterId).getData());
		cv.setExperiences(this.experienceService.getByJobhunterOrderByLeaveDateDesc(jobHunterId).getData());
		cv.setImage(this.imageService.getByJobhunter(jobHunterId).getData());
		cv.setLanguages(this.languageService.getByJobhunter(jobHunterId).getData());
		cv.setLinks(this.linkService.getByJobhunter(jobHunterId).getData());
		
		return new SuccessDataResult<CvDto>(cv);
	}

	@Override
	public DataResult<JobHunter> get(int id) {
		// TODO Auto-generated method stub
		return new SuccessDataResult<JobHunter>(this.jobHunterDao.findById(id).get());
	}


    
   
	
}


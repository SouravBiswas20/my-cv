package MyCvApplication;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import model.CV;

import static org.assertj.core.api.Assertions.*;



public class MyCvApplication {

	private static final Logger logger = LogManager.getLogger(MyCvApplication.class);
	
	private CV mycv;
	
	@BeforeClass
	public void setup_cv() {
		
		mycv =CV.builder().name("Sourav Biswas").
				age(28).address("Bangalore,karnataka,india").email("Sourav121@gmail.com").
				phone("03227-225343").profession("Automation_Test_Engineer").build();
		
		logger.info("CV object built successfully");
	}
	
	
	@Test
	public void display_cv() {
		
		logger.info("<=== My_CV ===>");
		logger.info(mycv.toString());
		
	}
	
	@AfterClass
	public void validate_cv() {
		
		assertThat(mycv.getName()).isNotBlank();
		assertThat(mycv.getAge()).isGreaterThan(0);
		assertThat(mycv.getAddress()).isNotBlank();
		assertThat(mycv.getEmail()).contains("@");
		assertThat(mycv.getPhone()).isNotBlank();
		assertThat(mycv.getAddress()).isNotBlank();
		
		logger.info("all data validate");
		
		
		
	}
	
	
	
}

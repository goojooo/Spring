package resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import beans.Adrress;
import beans.Student;

@Configuration
public class SpringConfigFile {
	@Bean
	public Adrress createAddObj()
	{
		Adrress addr = new Adrress();
		addr.setHousen(101);
		addr.setCity("Nagpur");
		addr.setPincode(440008);
		return addr;
	}
	@Bean
	public Student createStuObj()
	{
		Student std = new Student();
		std.setRollno(102);
		std.setName("Nanna");
		std.setAddress(createAddObj());
		return std;
	}
}

package resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import bean.Address;
import bean.Sudent;

@Configuration
public class SpringConfigFile {

	@Bean
	public Address createAddObj()
	{
		Address addr = new Address();
		
		addr.setHno(100);
		addr.setCity("NGP");
		addr.setPincode(440008);
		return addr;
	}
	@Bean
	public Sudent createStdObj()
	{
		Sudent std = new Sudent();
		std.setName("xxx");
		std.setRollno(9);
//		std.setAddress(createAddObj());
		return std;
	}
}

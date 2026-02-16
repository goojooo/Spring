package tester;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import bean.WishMessageGenerator;

public class GenerateWishMsgTester {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext ctx =
                new ClassPathXmlApplicationContext("applicationContext.xml");
//    	FileSystemXmlApplicationContext ctx = FileSystemXmlApplicationContext("C:\\Users\\kdaha\\OneDrive\\Desktop\\Adv_Java\\Spring_Workspace\\ITPspringOne\\src\\cfg\\applicationContext.xml");

        WishMessageGenerator generator =
                ctx.getBean("wmg", WishMessageGenerator.class);

        String msg = generator.generateWishMessage("Naya");

        System.out.println(msg);

        ctx.close();
    }
}

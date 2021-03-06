package priv.henryyu.privatebox.base;

import java.io.File;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import priv.henryyu.privatebox.controller.UserController;
import priv.henryyu.privatebox.repository.RoleRepository;
import priv.henryyu.privatebox.service.UserService;

/**
 * XXX class
 * 
 * @author HenryYu
 * @date 2018年1月8日上午11:41:12
 * @version 1.0.0
 */
@Component
public class Startup implements CommandLineRunner{

	@Autowired
	private UserService userService;
	@Autowired
	private RoleRepository roleRepository;
	@Override
	public void run(String... arg0) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Is first time run this application:"+userService.isFirstTime());
		String path = Thread.currentThread().getContextClassLoader().getResource("").getPath()+"files";
		File folder=new File(path);
		if(!folder.exists()) {
			folder.mkdir();
			System.out.println("Generate File Folder");
		}
		System.out.println("PrivateBox Run");
	}

}
 


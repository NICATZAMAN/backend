package me.eltacshikhsaidov.dailytech1;

//import me.eltacshikhsaidov.dailytech1.entities.User;
//import me.eltacshikhsaidov.dailytech1.services.UserService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StartApplication /*implements CommandLineRunner*/ {

    /*private UserService userService;

    @Autowired
    public void setUserService(UserService userService) {
        this.userService = userService;
    }*/

    public static void main(String[] args) {
        SpringApplication.run(StartApplication.class, args);
    }

    /*@Override
    public void run(String... strings) throws Exception {
        User newAdmin = new User("eltac@gmail.com", "ADMIN", "12345");
        userService.createAdmin(newAdmin);
    }*/
}

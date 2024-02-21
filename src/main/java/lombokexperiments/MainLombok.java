package lombokexperiments;

import lombokexperiments.dto.User;
import lombokexperiments.dto.UserLombok;
import lombokexperiments.dto.UserWith;

public class MainLombok {
    //psvm
    public static void main(String[] args) {
        User user = new User("aaa", "hjhfsh");
        System.out.println("user: " + user.getName());

        UserWith userWith = new UserWith();
        userWith.withName("name");
        userWith.withPassword("gfjdhdh");
        System.out.println(userWith.getPassword() + " user with");

        UserWith userWith1 = new UserWith()
                .withName("jhg")
                .withPassword("jfj");

        System.out.println("userWith1 " + userWith1.getName());

        UserWith userWith2 = new UserWith()
                .withPassword("hjkhkg");

        //Lombok
        UserLombok userLombok = UserLombok.builder()
                .name("hhg")
                .password("fhjgd")
                .build();

        System.out.println("lombok " + userLombok.getName());

    }
}

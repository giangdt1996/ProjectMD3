package ra.view;

import ra.config.InputMethods;
import ra.controller.UserController;
import ra.model.RoleName;
import ra.model.User;

public class StoreManager {
    private User userLogin;
    private static UserController userController = new UserController();
    public static void main(String[] args) {
        while(true){
            Navbar.menuStore();
            System.out.println("Enter your choice");
            int choice = InputMethods.getInteger();
            switch (choice){
                case 1:
                break;
                case 2:
                    break;
                    case 3:
                    break;
                    case 4:
System.exit(0);
                    break;
                default:
                    System.out.println("Please choice 1-4");
            }
        }
    }
    public static void login(){
        System.out.println("------------Sign In------------");
        System.out.println("Enter your username");
        String userName = InputMethods.getString();
        System.out.println("Enter your password");
        String passWord = InputMethods.getString();
        //kiem tra dang nhap
        User user = userController.login(username,password);
        if(user==null){
            System.err.println("");
        }else{
            if(user.getRoles().contains(RoleName.ADMIN)){
                userLogin = user;
            };
        }


    }
    public static void register(){
        System.out.println("------------Sign Up------------");

    }

}

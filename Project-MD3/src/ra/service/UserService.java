package ra.service;

import ra.config.Constants;
import ra.model.User;
import ra.ultil.DataBase;

import java.util.List;

public class UserService implements IGenericService<User, Integer>{
    List<User> users ;

    public UserService() {
        List<User> list= (List<User>)DataBase.readFromFile(DataBase.USER_PATH);
        if(list==null){
            this.users=list;
        }
    }

    @Override
    public List<User> findAll() {
        return null;
    }

    @Override
    public void save(User user) {
        if(findById(user.getId())==null){
            //add
            users.add(user);
        }
        else{
            //update
            users.set(users.indexOf(findById(user.getId())),user);

        }
DataBase.writeToFile(users,DataBase.USER_PATH);
    }

    @Override
    public void delete(Integer id) {
        users.remove(findById(id));
        DataBase.writeToFile(users,DataBase.USER_PATH);

    }

    @Override
    public User findById(Integer id) {
        for (User u:users){
            if(u.getId()==id){
                return u;
            }
        }
        return null;
    }
    public void changeStatus(int idUser){
        User user = findById(idUser);
        if(user==null){
            System.out.println(Constants.NOT_FOUND);
        }
        user.setStatus(!user.isStatus());
        save(user);
    }
    public User login(String username, String password){
        for (User u : users) {
        }
        if(u.getUserName()){
            
        }
    }
}

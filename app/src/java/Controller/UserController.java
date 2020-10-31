/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DAO.DAO;
import Model.User;
import java.util.List;

/**
 *
 * @author mariomthree
 */
public class UserController {

    DAO dao = new DAO();

    public void createUser(User user) {
        dao.create(user);
    }

    public List<User> read() {
        return (List<User>) dao.read(User.class);
    }

    public void updateUser(User user) {
        dao.update(user);
    }

    public void deleteUser(User user) {
        dao.delete(user);
    }

    public void deleteUser(long id) {
        User user = (User) dao.findById(User.class, id);
        dao.delete(user);
    }

    public User findById(long id) {
        return (User) dao.findById(User.class, id);
    }

}

package HomeWork5.Personal;

import HomeWork5.Personal.Controllers.UserController;
import HomeWork5.Personal.Model.FileOperation;
import HomeWork5.Personal.Model.FileOperationImpl;
import HomeWork5.Personal.Model.Repository;
import HomeWork5.Personal.Model.RepositoryFile;
import HomeWork5.Personal.Model.RepositoryFileAnother;
import HomeWork5.Personal.View.ViewUser;

public class Program {
   public static void main(String[] args) {
    FileOperation fileOperation = new FileOperationImpl("HomeWork5/Personal/Users.txt");
    FileOperation fileOperationNew = new FileOperationImpl("HomeWork5/Personal/UsersNew.txt");
    Repository repository = new RepositoryFile(fileOperation);
    Repository repositoryAnother = new RepositoryFileAnother(fileOperationNew);
    UserController controller = new UserController(repository);
    UserController controllerAnother = new UserController(repositoryAnother);
    ViewUser show1 = new ViewUser(controller);
    ViewUser show2 = new ViewUser(controllerAnother);
    show1.run();
    show2.run();
   }

}

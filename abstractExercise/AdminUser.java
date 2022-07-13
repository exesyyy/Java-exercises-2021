package abstractExercise;

public class AdminUser extends AbstractUser {

    public AdminUser(int user_id, String name, String password) {
        super(user_id, name, password);
    }

    @Override
    public boolean canPerformACtion(ActionCategory category) {
        return true;
    }

}

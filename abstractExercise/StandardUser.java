package abstractExercise;

public class StandardUser extends AbstractUser {

    protected boolean banned;

    public StandardUser(int user_id, String name, String password, boolean banned) {
        super(user_id, name, password);
        this.banned = banned;
    }

    public boolean getBanned() {
        return banned;
    }

    public void setBanned(boolean banned) {
        this.banned = banned;
    }


    @Override
    public boolean canPerformACtion(ActionCategory category) {
        switch (category) {
            case MODIFICACARRELLO:
            case ACQUISTACARRELLO:
            case CAMBIAPASSWORD:
                return true;
            default:
                return false;

        }
    }
}

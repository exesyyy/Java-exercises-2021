package abstractExercise;

public class EmployeeUser extends AbstractUser {

    private int idEmployee;

    public EmployeeUser(int user_id, String name, String password, int idEmployee) {
        super(user_id, name, password);
        this.idEmployee = idEmployee;
    }

    public int getIdEmployee() {
        return idEmployee;
    }


    @Override
    public boolean canPerformACtion(ActionCategory category) {
        switch (category) {
            case MODIFICACARRELLO:
            case ACQUISTACARRELLO:
            case CAMBIAPASSWORD:
            case MODIFICAINFOPRODOTTO:
            case MODIFICACATEGORIAPRODOTTO:
            case MODIFICAUTENTESTANDARD:
            case BANUSER:
                return true;
            default:
                return false;
        }
    }
}

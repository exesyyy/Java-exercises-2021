package abstractExercise;

public class Main {

    public static void main(String[] args) {

        StandardUser std_user = new StandardUser(1, "Tommy", "abcd", false);

        EmployeeUser emp_user = new EmployeeUser(2, "Luca", "1234", 100);

        AdminUser adm_user = new AdminUser(3, "Mauro", "abcd123");

        System.out.println(std_user.canPerformACtion(ActionCategory.MODIFICACARRELLO));

        System.out.println(emp_user.canPerformACtion(ActionCategory.MODIFICAUTENTEAMMNISTRATORE));

        System.out.println(adm_user.canPerformACtion(ActionCategory.MODIFICACARRELLO));

        System.out.println(emp_user.canPerformACtion(ActionCategory.CAMBIAPASSWORD));

        System.out.println(adm_user.canPerformACtion(ActionCategory.MODIFICAUTENTESTANDARD));
    }
}

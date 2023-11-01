public abstract class Teacher {
    //  сделала класс абстрактным
    protected String firstName;
    protected String lastName;
//  сделала поля защищёнными

    protected Teacher(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
// Убрала возможность получать и переписывать защищённые поля

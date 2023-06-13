package SemDZ_3.program.exceptions;

public class UncorrectNumberPhoneException extends RuntimeException {
    public UncorrectNumberPhoneException() {
        super("Не корректен номер телефона !!! Должны быть только цифры.");
    }
}

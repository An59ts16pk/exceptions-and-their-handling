package SemDZ_3h.program.exceptions;

public class UncorrectNumberPhoneException extends RuntimeException {
    public UncorrectNumberPhoneException() {
        super("Не корректен номер телефона !!! Должны быть только цифры.");
    }
}

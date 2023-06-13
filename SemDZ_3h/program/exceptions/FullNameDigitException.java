package SemDZ_3h.program.exceptions;

public class FullNameDigitException extends RuntimeException{
    public FullNameDigitException() {
        super("Одно или более символов в ФИО являются цифрой !!!");
    }
}

package SemDZ_3h.program.exceptions;

public class BigLengthArrayException extends RuntimeException{
    public BigLengthArrayException() {
        super("Введено данных больше необходимого !!!");
    }
}

package SemDZ_3.program.exceptions;

public class BigLengthArrayException extends RuntimeException{
    public BigLengthArrayException() {
        super("Введено данных больше необходимого !!!");
    }
}

package SemDZ_3.program.exceptions;

public class SmallLengthArrayException extends RuntimeException{
    public SmallLengthArrayException() {
        super("Введено недостаточно данных !!!");
    }
}

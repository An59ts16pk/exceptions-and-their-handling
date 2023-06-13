package SemDZ_3h.program.exceptions;

public class FullNameEmptyException extends RuntimeException {
    public FullNameEmptyException() {
        super("Одно или более значений ФИО не заданы !!!");
    }
}

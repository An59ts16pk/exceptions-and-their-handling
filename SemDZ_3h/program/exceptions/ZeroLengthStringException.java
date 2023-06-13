package SemDZ_3h.program.exceptions;

public class ZeroLengthStringException extends RuntimeException {
   public ZeroLengthStringException() {
    super("Введена пустая строка !!!");
   }
}

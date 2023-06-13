package SemDZ_3.program.exceptions;

public class ZeroLengthStringException extends RuntimeException {
   public ZeroLengthStringException() {
    super("Введена пустая строка !!!");
   }
}

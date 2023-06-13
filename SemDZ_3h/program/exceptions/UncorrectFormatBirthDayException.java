package SemDZ_3h.program.exceptions;

public class UncorrectFormatBirthDayException extends RuntimeException{
    public UncorrectFormatBirthDayException() {
        super("Не корректный формат даты рождения !!! Нужный формат - dd.mm.yyyy");
    }
}

package SemDZ_3.program.exceptions;

public class UncorrectGender extends RuntimeException {
    public UncorrectGender() {
        super("Не корректное значение пол !!! Должен быть символ 'm' или 'f'");
    }
}

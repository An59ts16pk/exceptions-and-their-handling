package SemDZ_3h.program.workClasses;

import java.util.regex.Pattern;

import SemDZ_3h.program.abstractClasses.VerifyBirthDayAC;
import SemDZ_3h.program.exceptions.UncorrectFormatBirthDayException;

public class VerifyBirthDay extends VerifyBirthDayAC{
    private static Pattern DATE_PATTERN = Pattern.compile(
      "^\\d{2}.\\d{2}.\\d{4}$");

    @Override
    public boolean verifyBirthDay(String[] arr) {
        if (!DATE_PATTERN.matcher(arr[3]).matches())
            throw new UncorrectFormatBirthDayException();     
        return true;
    }
}

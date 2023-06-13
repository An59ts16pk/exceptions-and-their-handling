package SemDZ_3.program.workClasses;

import SemDZ_3.program.abstractClasses.ArrayStringAC;
import SemDZ_3.program.exceptions.SmallLengthArrayException;
import SemDZ_3.program.exceptions.BigLengthArrayException;

public class ArrayString extends ArrayStringAC{
    @Override
    public String[] arrayString(String str) {
        String[] result = str.split(" ");
        int arrayLength = result.length;
        if (arrayLength < 6)
            throw new SmallLengthArrayException();
        else if (arrayLength > 6)
            throw new BigLengthArrayException();
        return result;
    }
}

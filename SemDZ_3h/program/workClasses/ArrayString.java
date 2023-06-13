package SemDZ_3h.program.workClasses;

import SemDZ_3h.program.abstractClasses.ArrayStringAC;
import SemDZ_3h.program.exceptions.SmallLengthArrayException;
import SemDZ_3h.program.exceptions.BigLengthArrayException;

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

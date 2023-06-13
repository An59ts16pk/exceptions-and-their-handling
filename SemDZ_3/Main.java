package SemDZ_3;
/*
 * Напишите приложение, которое будет запрашивать у пользователя следующие данные, разделенные пробелом:
 * Фамилия Имя Отчество датарождения номертелефона пол
 * Форматы данных:
 *       фамилия, имя, отчество - строки
 *       датарождения - строка формата dd.mm.yyyy
 *       номертелефона - целое беззнаковое число без форматирования
 *       пол - символ латиницей f или m.
 * 1. Приложение должно проверить введенные данные по количеству.
 *    Если количество не совпадает с требуемым, бросить исключение, обработать его и показать пользователю
 *    сообщение, что он ввел меньше и больше данных, чем требуется.
 * 2. Приложение должно попытаться распарсить полученные значения и выделить из них требуемые параметры.
 *    Если форматы данных не совпадают, нужно бросить исключение, соответствующее типу проблемы. Можно
 *    использовать встроенные типы java и создать свои. Исключение должно быть корректно обработано,
 *    пользователю выведено сообщение с информацией, что именно неверно.
 * 3. Если всё введено и обработано верно, должен создаться файл с названием, равным фамилии, в него в одну
 *    строку должны записаться полученные данные, вида:
 *       <Фамилия><Имя><Отчество><датарождения> <номертелефона><пол>
 *    Однофамильцы должны записаться в один и тот же файл, в отдельные строки.
 *    Не забудьте закрыть соединение с файлом.
 *    При возникновении проблемы с чтением-записью в файл, исключение должно быть корректно обработано,
 *    пользователь должен увидеть стектрейс ошибки.
*/

import java.io.IOException;

import SemDZ_3.program.Programm;
import SemDZ_3.program.workClasses.InputData;
import SemDZ_3.program.workClasses.ArrayString;
import SemDZ_3.program.workClasses.VerifyFullName;
import SemDZ_3.program.workClasses.VerifyBirthDay;
import SemDZ_3.program.workClasses.VerifyNumberPhone;
import SemDZ_3.program.workClasses.VerifyGender;
import SemDZ_3.program.workClasses.FindFileInFolder;
import SemDZ_3.program.workClasses.StringToWrite;
import SemDZ_3.program.workClasses.WriteToFile;

public class Main {
    public static void main(String[] args) throws IOException {
        String folder = "SemDZ_3/filesData/";
        Programm program = new Programm(new InputData(), new ArrayString(),
                                        new VerifyFullName(), new VerifyBirthDay(),
                                        new VerifyNumberPhone(), new VerifyGender(),
                                        new WriteToFile(new FindFileInFolder(), new StringToWrite(), folder));

        program.run();
    }
}

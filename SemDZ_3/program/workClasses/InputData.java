package SemDZ_3.program.workClasses;

import SemDZ_3.program.abstractClasses.InputDataAC;
import SemDZ_3.program.exceptions.ZeroLengthStringException;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class InputData extends InputDataAC{
    // ввод данных
    @Override
    public String inputData() throws IOException{
        String info = """
            Введите одной строкой разделённые пробелом -
            Фамилия Имя Отчество датарождения номертелефона пол;
            Форматы данных:
                фамилия, имя, отчество - строки
                датарождения - строка формата dd.mm.yyyy
                номер телефона - целое беззнаковое число без форматирования
                пол - символ латиницей f или m    
            Например:
            Sidorov Petr Petrovich 19.02.1998 79047893256 m
            \nВведите данные:
            """;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print(info);
        String data = reader.readLine();
        if(data.equals("")) 
            throw new ZeroLengthStringException();
        return data;
    }
}

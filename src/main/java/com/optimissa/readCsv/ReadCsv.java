package com.optimissa.readCsv;

import com.opencsv.CSVParser;
import com.opencsv.CSVParserBuilder;
import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;
import com.opencsv.bean.CsvToBeanBuilder;
import com.opencsv.exceptions.CsvException;

import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class ReadCsv {

    public static void main(String[] args) throws IOException, CsvException {

        String fileName = "C:\\Users\\luis.monzon\\Desktop\\CSVFileJava\\festivity_currencies_YYYYMMDD.csv";

        //C:\\Users\\luis.monzon\\Desktop\\CSVFileJava\\intake-java-ficheros-develop\\files\\festivity_currencies_YYYYMMDD.csv"
        try (CSVReader reader = new CSVReader(new FileReader(fileName))) {
            List<String[]> r = reader.readAll();
            // r.forEach(x -> System.out.println(Arrays.toString(x)));

            for (String[] strings : r) {
                System.out.println(Arrays.toString(strings));
            }
        }

        // USE SEPARATOR 
        // CSVParser csvParser = new CSVParserBuilder().withSeparator(';').build(); // custom separator
        // try (CSVReader reader = new CSVReaderBuilder(
        //         new FileReader(fileName))
        //         .withCSVParser(csvParser) // custom CSV parser
        //         .withSkipLines(1) // skip the first line, header info
        //         .build()) {
        //     List<String[]> r = reader.readAll();
        //     r.forEach(x -> System.out.println(Arrays.toString(x)));
        // }

        //csv to object
        // List<Concurrency> beans = new CsvToBeanBuilder(new FileReader(fileName))
        //         .withType(Concurrency.class)
        //         .build()
        //         .parse();

        // beans.forEach(System.out::println);

    }

}
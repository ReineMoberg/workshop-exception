package se.lexicon.exceptions.workshop;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

import se.lexicon.exceptions.workshop.data_access.NameService;
import se.lexicon.exceptions.workshop.domain.Person;
import se.lexicon.exceptions.workshop.exceptions.DuplicateNameException;
import se.lexicon.exceptions.workshop.fileIO.CSVReader_Writer;

public class Main {

	public static void main(String[] args) {
		
		List <String> maleFirstNames = CSVReader_Writer.getMaleFirstNames();
        List <String> femaleFirstNames = CSVReader_Writer.getFemaleFirstNames();

        List <String> lastNames = null;
        try {
            lastNames = CSVReader_Writer.getLastNames();
        } catch (FileNotFoundException e) {         //Is a sub-class of IOException
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        NameService nameService = new NameService(maleFirstNames, femaleFirstNames,lastNames);

        Person test = nameService.getNewRandomPerson();
        System.out.println(test);

       /* try {
            nameService.addMaleFirstName("Liam");
        } catch (DuplicateNameException e) {
            System.out.println(e.getMessage());
        }*/

        /*try{
            nameService.addFemaleFirstName("Ester");
        } catch (DuplicateNameException e) {
            System.out.println(e.getMessage());
        }*/

        /*try{
            nameService.addFemaleFirstName("Linda");
        } catch (DuplicateNameException e) {
            System.out.println(e.getMessage());
        }*/
    }

}

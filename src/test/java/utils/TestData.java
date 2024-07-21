package utils;
import java.util.Locale;

import com.github.javafaker.Faker;

public class TestData {

    private static final Faker faker = new Faker(new Locale("en"));

    public String email = getRandomEmail(),
            oneCharacterValue = getRandomOneCharacterValue();

    public static String getRandomEmail(){
        return faker.internet().emailAddress();
    }

    public static String getRandomOneCharacterValue(){
        return faker.lorem().characters(1);
    }



}

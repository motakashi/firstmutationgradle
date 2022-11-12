package org.example.firstmutationgradle;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzGeneratorTest {

    FizzBuzzGenerator fizzBuzzGenerator = new FizzBuzzGenerator();

    @Test
    public void 引数30を渡した場合FizzBuzzが返却される() {

        int input = 30;

        String actual = fizzBuzzGenerator.generate(input);

        assertEquals("FizzBuzz", actual);
    }

    @Test
    public void 引数6を渡した場合Fizzが返却される() {

        int input = 6;

        String actual = fizzBuzzGenerator.generate(input);

        assertEquals("Fizz", actual);
    }

    @Test
    public void 引数10を渡した場合Buzzが返却される() {

        int input = 10;

        String actual = fizzBuzzGenerator.generate(input);

        assertEquals("Buzz", actual);
    }

    @Test
    public void 引数13を渡した場合13が返却される() {

        int input = 13;

        String actual = fizzBuzzGenerator.generate(input);

        assertEquals(String.valueOf(input), actual);
    }
}
package by.clevertec;

import by.clevertec.util.TestUtil;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Map;
import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

class MainTest {

    @Nested
    class Task4 {

        @Test
        void checkTask4ReturnCount() {
            long expected = 476;
            long actual = Main.task4();

            assertEquals(expected, actual);
        }
    }

    @Nested
    class Task5 {

        @Test
        void checkTask5ReturnFalse() {
            boolean actual = Main.task5();

            assertFalse(actual);
        }
    }

    @Nested
    class Task6 {

        @Test
        void checkTask6ReturnFalse() {
            boolean actual = !Main.task6();

            assertFalse(actual);
        }
    }

    @Nested
    class Task7 {

        @Test
        void checkTask6ReturnTrue() {
            boolean actual = Main.task7();

            assertTrue(actual);
        }
    }

    @Nested
    class Task8 {

        @Test
        void checkTask8ReturnExpected() {
            long expected = 48;
            long actual = Main.task8();

            assertEquals(expected, actual);
        }
    }

    @Nested
    class Task9 {

        @Test
        void checkTask9ReturnShortestLength3() {
            long expected = 3;
            long actual = Main.task9();

            assertEquals(expected, actual);
        }
    }

    @Nested
    class Task10 {

        @Test
        void checkTask10ReturnSumAge25329() {
            long expected = 25329;
            long actual = Main.task10();

            assertEquals(expected, actual);
        }
    }

    @Nested
    class Task11 {

        @Test
        void checkTask10ReturnAvgAge() {
            double expected = 25.8;
            double actual = Main.task11();

            assertEquals(expected, actual);
        }
    }

    @Nested
    class Task20 {

        @Test
        void checkTask20ReturnExpectedMathematics() {
            String expected = "Mathematics";
            String actual = Main.task20(TestUtil.getStudents(), TestUtil.getExaminations());

            assertEquals(expected, actual);
        }

        @Test
        void checkTask20ReturnNoExpected() {
            String expected = "Physics";
            String actual = Main.task20(TestUtil.getStudents(), TestUtil.getExaminations());

            assertNotEquals(expected, actual);
        }

        @Test
        void checkTask20ReturnExpectedPhysics() {
            String expected = "Physics";
            String actual = Main.task20(TestData.students, TestData.examinations);

            assertEquals(expected, actual);
        }

        @Test
        void checkTask20ThrowNoSuchElementException() {
            assertAll(() -> assertThrows(NoSuchElementException.class, () -> {
                        Main.task20(new ArrayList<>(), new ArrayList<>());
                    }),
                    () -> assertThrows(NoSuchElementException.class, () -> {
                        Main.task20(new ArrayList<>(), TestUtil.getExaminations());
                    })
            );
        }
    }

    @Nested
    class Task21 {

        @Test
        void checkTask21ReturnExpected() {
            int expectedSize = 11;
            int expectedC2 = 11;
            String expectedGroupNameC2 = "C-2";
            Map<String, Long> actual = Main.task21();

            assertAll(
                    () -> assertEquals(expectedSize, actual.size()),
                    () -> assertEquals(expectedC2, actual.get(expectedGroupNameC2))
            );
        }
    }

}

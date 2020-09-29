import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BonusServiceTest {

    @Test
    void shouldCfculateForRegisteredAndUnderLimit() {
        BonusService service = new BonusService();

        // подготавливаем данные:
        long amount = 1000_60;
        boolean registered = true;
        long expected = 30;

        // вызываем целевой метод:
        long actual = service.calculate(amount, registered);

        assertEquals(expected, actual);
    }

    @Test
    void shouldCfculateForRegisteredAndOverLimit() {
        BonusService service = new BonusService();

        // подготавливаем данные:
        long amount = 1_000_000_60;
        boolean registered = true;
        long expected = 500;

        // вызываем целевой метод:
        long actual = service.calculate(amount, registered);

        assertEquals(expected, actual);
    }
 @Test
        void shouldCalculateForNotRegisteredAndUnderLimit() {
            BonusService service = new BonusService();
            long amount = 1000_60;
            boolean registered = false;
            long expected = 10;
            long actual = service.calculate(amount, registered);
            assertEquals(expected, actual);
        }

        @Test
        void shouldCalculateForNotRegisteredAndOverLimit() {
            BonusService service = new BonusService();
            long amount = 1_000_000_60;
            boolean registered = false;
            long expected = 500;
            long actual = service.calculate(amount, registered);
            assertEquals(expected, actual);

    }
}

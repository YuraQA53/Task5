import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import ru.netology.sqr.SQRService;

public class SQRServiceTest {
    SQRService sqrService = new SQRService();

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/data.csv")
    void calculateSQR(int expected, int minNumber, int maxNumber) {
        int actual = sqrService.calculateSQR(minNumber, maxNumber);
        Assertions.assertEquals(expected, actual);
    }

}

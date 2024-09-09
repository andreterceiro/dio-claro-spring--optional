import javax.naming.NameNotFoundException;

import java.security.cert.PKIXRevocationChecker.Option;
import java.util.Optional;

/**
 * Class to mak manual tests of optionals
 */
public class OptionalTest {
    /**
     * Main method to execute the manual tests
     * @param args CLI args (ignored)
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        Optional<String> name = OptionalTest.getStudentById(1);
        System.out.println(name);
        System.out.println(name.isPresent());

        System.out.println("------------------------");

        name = OptionalTest.getStudentById(5);
        System.out.println(name);
        System.out.println(name.isPresent());
    }

    public static Optional<String> getStudentById(int id) {
        if (id == 1) {
            return Optional.of("Mamãe");
        } else if (id == 2) {
            return Optional.of("Papai");
        } else if (id == 3) {
            return Optional.of("Irmãzinha");
        } else if (id == 4) {
            return Optional.of("eu");
        }
        return Optional.empty();
    }
}

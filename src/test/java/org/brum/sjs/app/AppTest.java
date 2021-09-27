package org.brum.sjs.app;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;


@SpringBootTest(classes = App.class)
@Transactional("transactionManager")
class AppTest {

    @Test
        void main() {
    }

    @Test
        void commandLineRunner() {
    }
}
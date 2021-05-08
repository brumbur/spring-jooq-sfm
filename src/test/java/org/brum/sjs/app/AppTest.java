package org.brum.sjs.app;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;


@SpringBootTest(classes = App.class)
@Transactional("transactionManager")
@RunWith(SpringJUnit4ClassRunner.class)
class AppTest {

    @Test
    void main() {
    }

    @Test
    void commandLineRunner() {
    }
}
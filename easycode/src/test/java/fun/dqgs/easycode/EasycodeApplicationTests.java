package fun.dqgs.easycode;

import fun.dqgs.easycode.dao.ItemsDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EasycodeApplicationTests {

    @Autowired
    ItemsDao itemsDao;
    @Test
    public void contextLoads() {
        System.out.println(itemsDao.queryById(1));
    }

}

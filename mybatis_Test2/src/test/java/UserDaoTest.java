import com.itheima.dao.Impl.UserDaoImpl;
import com.itheima.pojo.Student;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class UserDaoTest {
    private SqlSessionFactory sqlSessionFactory;
    @Before
    public void before() throws IOException {
        InputStream resourceAsStream = Resources.getResourceAsStream("SqlMapConfig.xml");
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        sqlSessionFactory = sqlSessionFactoryBuilder.build(resourceAsStream);
        resourceAsStream.close();
    }
    @Test
    public void test() throws Exception {
        UserDaoImpl userDao = new UserDaoImpl(sqlSessionFactory);
        List<Student> students = userDao.queryStudentList();
        for (int i = 0; i < students.size(); i++) {
            Student student =  students.get(i);
            System.out.println(student);
        }
    }
}

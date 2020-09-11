package cn.cdw.demo.mapper;

import cn.cdw.demo.pojo.Student;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @author DW-CHEN
 * 测试多对多
 */
public class TestManyToManyMapper {
    public static void main(String[] args) throws IOException {
        InputStream resourceAsStream = Resources.getResourceAsStream("MyBatisConfig.xml");

        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
        SqlSession sqlSession = sqlSessionFactory.openSession(true);

        ManyToManyMapper mapper = sqlSession.getMapper(ManyToManyMapper.class);
        List<Student> all = mapper.findAll();

        for (Student student : all) {
            System.out.println(student);
        }

        sqlSession.close();
        resourceAsStream.close();
    }
}

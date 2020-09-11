package cn.cdw.demo.mapper;

import cn.cdw.demo.pojo.Classes;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @author DW-CHEN
 * 测试
 */
public class TestOneToManyMapper {
    public static void main(String[] args) throws IOException {
        InputStream resourceAsStream = Resources.getResourceAsStream("MyBatisConfig.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
        SqlSession sqlSession = sqlSessionFactory.openSession(true);

        OneToManyMapper mapper = sqlSession.getMapper(OneToManyMapper.class);
        List<Classes> all = mapper.findAll();

        for (Classes classes : all) {
            System.out.println(classes);
        }

        sqlSession.close();
        resourceAsStream.close();
    }
}

package cn.cdw.demo.mapper;

import cn.cdw.demo.pojo.Card;
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
public class TestOnToOneMapper {
    public static void main(String[] args) throws IOException {
        InputStream resourceAsStream = Resources.getResourceAsStream("MyBatisConfig.xml");

        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
        SqlSession sqlSession = sqlSessionFactory.openSession(true);

        OneToOneMapper mapper = sqlSession.getMapper(OneToOneMapper.class);
        List<Card> all = mapper.findAll();

        for (Card card : all) {
            System.out.println(card);
        }

        sqlSession.close();
        resourceAsStream.close();
    }
}

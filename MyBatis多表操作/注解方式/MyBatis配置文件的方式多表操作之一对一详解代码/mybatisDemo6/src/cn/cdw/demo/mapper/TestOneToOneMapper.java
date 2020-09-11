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
 * 测试一对一关联关系
 */
public class TestOneToOneMapper {
    public static void main(String[] args) throws IOException {
        InputStream resourceAsStream = Resources.getResourceAsStream("MyBatisConfig.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
        SqlSession sqlSession = sqlSessionFactory.openSession(true);

        OneToOneMapper mapper = sqlSession.getMapper(OneToOneMapper.class);
        List<Card> cards = mapper.oneToOne();

        for (Card card : cards) {
            System.out.println(card);
        }

        sqlSession.close();
        resourceAsStream.close();
    }
}

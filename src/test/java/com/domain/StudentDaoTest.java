package com.domain;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
public class StudentDaoTest {
   private StudentDao studentDao;
    @Before
    public void before(){
       studentDao=new StudentDao();
    }
     @Test
    public void testSortByAge(){
         Student s1=new Student("zhangsan","15121324",28);
         Student s2=new Student("zhang1san","15121324",14);
         Student s3=new Student("zhang2san","15121324",18);
         Student act[]=studentDao.sortByAge(new Student[]{s1,s2,s3});
         assertThat(act[0],is(s2));
         assertThat(act[1],is(s3));
         assertThat(act[2],is(s1));
         assertThat("abc",is(startsWith("a")));
         //assertArrayEquals(new Student[]{s3,s2,s1},act);
     }
}

package com.huaxincem.capweixinmall;

import com.huaxincem.capweixinmall.util.RemoveUntil;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
class RemoveTest {

    /**
     * 程序 1：3个或更多连续的相同字符，从字符串中删除它们,依次循环打印
     *
     * @throws Exception
     */
    @Test
    void testRemoveDuplicates() throws Exception {
            // 输入字符串
            String input = "aabccccbbad";

            // 预期输出结果
            String[] expectedOutput = {"aabccccbbad","aabbbad", "aaad", "d"};

            // 调用方法进行替换
            List<String> output = RemoveUntil.removeDuplicates(input);

            // 检查结果数量是否与预期相符
            assertEquals(expectedOutput.length, output.size(), "输出结果数量不匹配");

            // 逐个检查每个输出结果
            for (int i = 0; i < expectedOutput.length; i++) {
                assertEquals(expectedOutput[i], output.get(i), "第 " + (i+1) + " 步输出结果不正确");
            }
    }

    /**
     * 程序 1：3个或更多连续的相同字符，从字符串中删除它们,依次循环打印
     *
     * @throws Exception
     */
    @Test
    void testReplaceDuplicates() throws Exception {
        // 输入字符串
        String input = "abccccbad";

        // 预期输出结果
        String[] expectedOutput = {"abccccbad","abbbad", "aaad", "d"};

        // 调用方法进行替换
        List<String> output = RemoveUntil.replaceDuplicates(input);

        // 检查结果数量是否与预期相符
        assertEquals(expectedOutput.length, output.size(), "输出结果数量不匹配");

        // 逐个检查每个输出结果
        for (int i = 0; i < expectedOutput.length; i++) {
            assertEquals(expectedOutput[i], output.get(i), "第 " + (i+1) + " 步输出结果不正确");
        }
    }
}


package com.gu.chatroom;

import com.gu.chatroom.tools.GuTool;
import org.junit.Assert;
import org.junit.Test;

/**
 * @className: com.gu.chatroom.GuToolTest
 * @description: GuToolTest - TODO
 * @version: v1.0.0
 * @date: 2019/6/25 18:09
 * @author: haoduor
 */
public class GuToolTest {

    @Test
    public void ReflectTest() {
        String b = null;
        User user = new User("A", 1, false, b);

        Assert.assertFalse("测试", GuTool.checkNotNull(user));
    }

}

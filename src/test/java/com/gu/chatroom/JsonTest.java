package com.gu.chatroom;

import com.alibaba.fastjson.JSONObject;
import org.junit.Test;

/**
 * @className: com.gu.chatroom.JsonTest
 * @description: JsonTest - TODO
 * @version: v1.0.0
 * @date: 2019/6/25 15:37
 * @author: haoduor
 */
public class JsonTest {

    @Test
    public void getTest() {
        JSONObject json = new JSONObject();
        json.put("a", "A");

        String test = (String)json.get("b");
        System.out.println(test);
    }

}

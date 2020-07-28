package com.zoe.tecsun.test;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.zoe.tecsun.vo.ItemError;
import com.zoe.tecsun.vo.RuleDataVO;
import springfox.documentation.spring.web.json.Json;

import java.util.List;
import java.util.stream.Collectors;

/**
 * <p>标题: </p>
 * <p>描述: </p>
 * <p>版权: Copyright (c) 2020</p>
 * <p>公司: 智业软件股份有限公司</p>
 *
 * @version: 1.0
 * @author: huangdesheng
 * @date: 2020-07-10
 */
public class JSONTest {
    public static void main(String[] args) {

        String data = "[{deCode:'code_1',deValue:''.deText:''},{deCode:'code_2',deValue:''.deText:''},{deCode:'code_3',deValue:''" +
                ".deText:''},{deCode:'code_3',deValue:''.deText:''}]";
        List<RuleDataVO> ruleList = JSON.parseArray(data, RuleDataVO.class);
        System.out.println(ruleList);
        ruleList.stream().map(e ->"code_1".equals(e.getDeCode())).forEach(System.out::println);

        /**
         *JSONObject的定义
         * JSONObject=json对象{key1:value1,key2:value2,key3:value3}
         */
        JSONObject drug = new JSONObject();
        drug.put("drugName", "盐酸丁卡因注射液");
        drug.put("drugCode", "HXUDP000000000000MED0000342809");
        drug.put("dosformName", "注射剂");
        System.out.println("药品名称"+drug);

        /**
         * JSONArray的定义
         */
        JSONArray studentList = new JSONArray();
        JSONObject student = new JSONObject();
        student.put("name","黄天杰");
        student.put("age",30);

        JSONObject student1 = new JSONObject();
        student1.put("name", "刘胜关");
        student1.put("age", 24);

        JSONObject student2 = new JSONObject();
        student2.put("name", "覃春榜");
        student2.put("age", 31);

        studentList.add(student);
        studentList.add(student1);
        studentList.add(student2);

        System.out.println("++++++++分割线+++++++++");
        System.out.println(studentList);

        //将JSONObject转成字符串
        String string = JSON.toJSONString(student);
        System.out.println("学生的json对象字符串"+string);//输出显示的时候没有引号的，但是其实他就是字符串"{"name":"黄天杰","age":30}"

        //将字符串转成JSON对象
        JSONObject studentObject = JSON.parseObject(string);
        System.out.println(studentObject);

    }
}

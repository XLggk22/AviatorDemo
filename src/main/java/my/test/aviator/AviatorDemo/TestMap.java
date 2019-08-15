package my.test.aviator.AviatorDemo;

import java.io.File;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

public class TestMap {

	public static void main(String[] args) {
//		String str = "{"+
//				""1111,2222": {"+
//			"top": "200",
//			"foot": "100",
//			"step": [{
//				"condition": "0<x<=5000",
//				"method": "fixed",
//				"value": "1.5"
//			}, {
//				"condition": "x>5000",
//				"method": "percent",
//				"value": "0.0025"
//			}]
//		},
//		"all": {
//			"top": "200",
//			"foot": "100",
//			"step": [{
//				"condition": "x>0",
//				"method": "percent",
//				"value": "0.0025"
//			}]
//		}
//	}
//		JSONObject jsonObject = new JSONObject();
//		jsonObject.put("top", 1);
//		System.out.println(jsonObject.get("foot"));
//		String str = "0<x<=5000";
//		BigDecimal transAmnt = new BigDecimal(3000);
//		String replace = str.replace("x", transAmnt+" && "+transAmnt);
//		System.out.println(replace);
		
//		String str = "{\"bankCode或all\":{\"top\":\"\",\"foot\":\"\",\"step\":[{\"condition\":\"\",\"method\":\"fixed或percent\",\"value\":\"\"}]}}";
//		JSONObject parseObject = JSON.parseObject("{\"bankCode或all\":{\"top\":\"\",\"foot\":\"\",\"step\":[{\"condition\":\"\",\"method\":\"fixed或percent\",\"value\":\"\"}]}}");
//		System.out.println(parseObject);
//		System.out.println(JSON.parseObject(str, String.class));
		
		Map<String, Object> map = new HashMap<>();
		List<String> code = new ArrayList<>();
		code.add("111");
		code.add("222");
		map.put("name", "rao");
		map.put("code", code);
		Set<Entry<String, Object>> entrySet = map.entrySet();
		System.out.println(map instanceof Map);
		for (Entry<String, Object> entry : entrySet) {
			String key = entry.getKey();
			Object value = entry.getValue();
			System.out.println(value.getClass());
			System.out.println(value instanceof List);
		}
		
//		File file = new File("E:/app/smy-pcs/jetty/profile/");
//		file.mkdirs();
		
	}
}

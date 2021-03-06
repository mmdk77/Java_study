package com.sds.json;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class ProfileApp {
	FileReader fr;
	BufferedReader buf_rd;
	
	String path ="C:/java_workspace/GUI0811/res/member.json";
	
	public ProfileApp() {
		// TODO Auto-generated constructor stub
		
		try {
			fr = new FileReader(path);
			buf_rd = new BufferedReader(fr);
			String data= null;	
			StringBuffer sb = new StringBuffer();
			while((data = buf_rd.readLine())!=null){
				//System.out.println(data);				
				sb.append(data);//String의 데이터를 쌓음.
			}
			
			//데이터가 쌓이는지 확인 - System.out.println("sb의 값"+sb.toString());
			
			//JSON파싱
			JSONParser json = new JSONParser();
			JSONObject jsonObj = (JSONObject)json.parse(sb.toString());
			JSONArray jsonArr= (JSONArray)jsonObj.get("members");
			
			//JSON 데이터내의 크기 - System.out.println(jsonArr.size());
			
			for(int i=0;i<jsonArr.size();i++){
				JSONObject member =(JSONObject)jsonArr.get(i);
				System.out.println(member.get("name")+","+member.get("gender")+","
				+(member.get("photo")+","+member.get("age")));	
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			System.out.println("JSON문법 오류");
			e.printStackTrace();
		}
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ProfileApp();
	}

}

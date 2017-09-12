package org.practice;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URL;
import java.nio.charset.Charset;

import org.json.JSONException;
import org.json.JSONObject;

public class JsonReader {

  private static String readAll(Reader rd) throws IOException {
    StringBuilder sb = new StringBuilder();
    int cp;
    while ((cp = rd.read()) != -1) {
      sb.append((char) cp);
    }
    return sb.toString();
  }

  public static JSONObject readJsonFromUrl(String url) throws IOException, JSONException {
    InputStream is = new URL(url).openStream();
    try {
      BufferedReader rd = new BufferedReader(new InputStreamReader(is, Charset.forName("UTF-8")));
      String jsonText = readAll(rd);
      JSONObject json = new JSONObject(jsonText);
      return json;
    } finally {
      is.close();
    }
  }

  public static void main(String[] args) throws IOException, JSONException {
    JSONObject json = readJsonFromUrl("http://business.talentify.in/t2c/user/10270/complex");
    System.out.println(json.toString());
    System.out.println(json.get("id"));
    System.err.println(((JSONObject) json.getJSONArray("tasks").get(0)).get("id"));
    /*JSONArray jsonarr= (JSONArray) json.getJSONArray("tasks");
    int i = 0;
    for (Object object : jsonarr) {
    	//System.out.println(i+" this -> "+object.toString());
    	System.err.println(((JSONObject) object).get("id"));
    	i++;
	}*/
    
    //print courses
    //((JSONObject)json.getJSONArray("courses").get(0)).getJSONArray("modules").get(0)
    System.err.println(((JSONObject)((JSONObject)((JSONObject)json.getJSONArray("courses").get(0)).getJSONArray("modules").get(0)).getJSONArray("sessions").get(0)).getJSONArray("lessons").get(0));
    
  }
}
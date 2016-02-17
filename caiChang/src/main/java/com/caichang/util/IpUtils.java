package com.caichang.util;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

import org.springframework.stereotype.Component;

@Component
public class IpUtils {
	
	private final String strUrl = "http://1212.ip138.com/ic.asp";

	public String getWebIp() {
		try {
			URL url = new URL(strUrl);
			BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));
			String s = "";
			StringBuffer sb = new StringBuffer("");
			String webContent = "";
			while ((s = br.readLine()) != null) {
				sb.append(s + "rn");
			}

			br.close();
			webContent = sb.toString();
			int start = webContent.indexOf("[") + 1;
			int end = webContent.indexOf("]");
			System.out.println("webContent=" + webContent);
			System.out.println("start=" + start);
			System.out.println("end=" + end);
			if (start < 0 || end < 0) {
				return null;
			}
			webContent = webContent.substring(start, end);
			return webContent;

		} catch (Exception e) {
			e.printStackTrace();
			return "error open url:" + strUrl;
		}
	}
}
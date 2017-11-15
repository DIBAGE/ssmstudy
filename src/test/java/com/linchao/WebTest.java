package com.linchao;

import org.junit.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

/**
 * @author : linchao
 * @date : 2017/11/15.
 * @description :
 */
public class WebTest {
    BufferedReader in;
    @Test
    public void sendURL() {
        String urlStr = "http://quote.eastmoney.com/center/index.html#zyzs_0_1";
        for(int i = 0; i < 1; i++){
            try {
                URL realUrl = new URL(urlStr);
                // 打开和URL之间的连接
                URLConnection connection = realUrl.openConnection();
                // 设置通用的请求属性
                connection.setRequestProperty("accept", "*/*");
                connection.setRequestProperty("connection", "Keep-Alive");
                connection.setRequestProperty("user-agent",
                        "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1;SV1)");
                // 建立实际的连接
                connection.connect();
                in = new BufferedReader(new InputStreamReader(
                        connection.getInputStream(),"gbk"));


                String line;
                String result = null;
                while ((line = in.readLine()) != null) {
                    result += line + "\n";
                }
                System.out.println(result);
            } catch (MalformedURLException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
            finally {
                try {
                    if (in != null) {
                        in.close();
                    }
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }
        }

    }

}

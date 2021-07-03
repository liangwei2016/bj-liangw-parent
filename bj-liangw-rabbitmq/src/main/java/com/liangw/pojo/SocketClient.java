//package com.liangw.pojo;
//
//import java.io.BufferedReader;
//import java.io.InputStream;
//import java.io.InputStreamReader;
//import java.io.OutputStream;
//import java.net.Socket;
//
///**
// * @Title SocketClient
// * @Description
// * @Author yaoxinxin
// * @Date 2020/12/10 10:08
// */
//public class SocketClient {
//
//    public static void main(String[] args) {
//
//        OutputStream out=null;
//        InputStream in=null;
//        Socket socket=null;
//        try {
//            socket=new Socket("idocrap.eidlink.com",9989);
//            out=socket.getOutputStream();
//            out.write("呼叫服务器，收到请回答".getBytes());
//            socket.shutdownOutput();
//            //获取输入流，并读取服务器端的响应信息
//            in=socket.getInputStream();
//            BufferedReader br=new BufferedReader(new InputStreamReader(in));
//            StringBuilder sb=new StringBuilder();
//            String info=null;
//            while ((info=br.readLine())!=null){
//                sb.append(info);
//            }
//            System.out.println("收到服务端回复："+sb.toString());
//            br.close();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }finally {
//            try {
//                out.flush();
//                out.close();
//                in.close();
//                socket.close();
//            }catch (Exception e){
//                e.printStackTrace();
//            }
//        }
//    }
//
//}

package com.example.user_interface;

import java.net.*;
import java.io.*;
class MyClient{

    Integer mySocket;
    Socket s;
    DataInputStream din;
    DataOutputStream dout;

    public MyClient(Integer socket) {
        try {
            s = new Socket("localhost",socket);
            din=new DataInputStream(s.getInputStream());
            dout=new DataOutputStream(s.getOutputStream());
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void send(Person person){
        try {
            dout.writeUTF(person.toString());
            dout.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String sendRecive(String jsonPerson) throws IOException {
        try {
            dout.writeUTF(jsonPerson);
            dout.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
        String str1 = din.readUTF();
        while(str1.length() < 4 ){
            str1 = din.readUTF();
        }
        return din.readUTF();
    }

    public static void main(String args[])throws Exception{
//        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        String str="",str2="";
//        while(!str.equals("stop")){
//            str=br.readLine();
//            dout.writeUTF(str);
//            dout.flush();
//            str2=din.readUTF();
            System.out.println("Server says: "+str2);
        }
}
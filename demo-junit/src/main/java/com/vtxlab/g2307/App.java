package com.vtxlab.g2307;

import java.util.PriorityQueue;

/**
 * Hello world!
 *
 */
public class App 
{
    public static int add(int x, int y){
        return x+y;
    }

    public static int minus(int x,int y){
        return x-y;
    }


    public static int minExtraChar(String s, String[] dictionary) {
        PriorityQueue<String> q = new PriorityQueue<>((e1,e2)->e2.length()-e1.length());
        for(String k: dictionary){
            q.add(k);
        }
        StringBuilder sb = new StringBuilder(s);
        while(!(q.isEmpty())){
            String temp = q.poll();
            int exist = sb.indexOf(temp);
            if(exist!=-1){
                sb.delete(exist,exist+temp.length());
            }
        }
        return sb.length();
    }


    public static void main( String[] args )
    {
        
    }
}

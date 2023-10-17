package lession_6;

public class Lab6_4 {
    public static void main(String[] args) {
        String url = "https://google.com";

// Check "http" or "https"
       if (url.startsWith("https://" )){
           System.out.println("Host is https.");
       }
// Check what domain name is

        String r1 = url.substring(url.indexOf("/")+2,url.lastIndexOf("."));
        System.out.println("Domain name is :" + r1 + ".");
// Check .com or .net
        if (url.contains(".com")){
            System.out.println("It has .com.");
        }
        }

            }



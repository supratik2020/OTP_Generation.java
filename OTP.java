
Related Articles
▲
Related Articles
Java Implementation of Deffi-Hellman Algorithm between Client and Server
Socket Programming in Java
Introducing Threads in Socket Programming in Java
Multi-threaded chat Application in Java | Set 1 (Server Side Programming)
Multi-threaded Chat Application in Java | Set 2 (Client Side Programming)
A Group chat application in Java
Generating Password and OTP in Java
Playfair Cipher with Examples
Hill Cipher
Vigenère Cipher
Caesar Cipher in Cryptography
Substitution Cipher
Keyword Cipher
Difference between Monoalphabetic Cipher and Polyalphabetic Cipher
Difference between Block Cipher and Stream Cipher
Block Cipher modes of Operation
Data encryption standard (DES) | Set 1
Difference between AES and DES ciphers
RSA Algorithm in Cryptography
Implementation of Diffie-Hellman Algorithm
Must Do Coding Questions for Companies like Amazon, Microsoft, Adobe, ...
Practice for cracking any coding interview
Must Do Coding Questions Company-wise
Must Do Coding Questions for Product Based Companies
GET and POST requests using Python
Socket Programming in C/C++
Top 10 Projects For Beginners To Practice HTML and CSS Skills
Working with csv files in Python
Fast I/O for Competitive Programming
Differences between Procedural and Object Oriented Programming

Generating Password and OTP in Java
Difficulty Level : Easy
Last Updated : 15 Oct, 2019
You may go through Generate a One Time Password or Unique Identification URL article before this for better understanding.

Generating Password and OTP in Java
Many a time we forget our passwords and we opt for Forget password option and within no time we get a new password at our registered email-ID or phone no. to login our account. And every time we get a different password.
Sometimes we access our bank accounts while shopping from an online store or many more ways, in order to verify our transition from the bank account, they send us OTP(One Time Password) on our registered phone no. or our email-ID, within no time.

The following code explains how to generate such Passwords and OTP within no time and what code we can use if in case we need to do so.

Method 1:

Java program explaining the generation of Password





// Java code to explain how to generate random
// password
  
// Here we are using random() method of util
// class in Java
import java.util.*;
  
public class NewClass
{
    public static void main(String[] args)
    {
        // Length of your password as I have choose
        // here to be 8
        int length = 10;
        System.out.println(geek_Password(length));
    }
  
    // This our Password generating method
    // We have use static here, so that we not to
    // make any object for it
    static char[] geek_Password(int len)
    {
        System.out.println("Generating password using random() : ");
        System.out.print("Your new password is : ");
  
        // A strong password has Cap_chars, Lower_chars,
        // numeric value and symbols. So we are using all of
        // them to generate our password
        String Capital_chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String Small_chars = "abcdefghijklmnopqrstuvwxyz";
        String numbers = "0123456789";
                String symbols = "!@#$%^&*_=+-/.?<>)";
  
  
        String values = Capital_chars + Small_chars +
                        numbers + symbols;
  
        // Using random method
        Random rndm_method = new Random();
  
        char[] password = new char[len];
  
        for (int i = 0; i < len; i++)
        {
            // Use of charAt() method : to get character value
            // Use of nextInt() as it is scanning the value as int
            password[i] =
              values.charAt(rndm_method.nextInt(values.length()));
  
        }
        return password;
    }
}
Note : The password we are generating will change every time. As we have used random() method to generate the password.
Output :

Generating password using random() : 
Your new password is : KHeCZBTM;-
Java program explaining the generation of OTP(One Time Password)


// Java code to explain how to generate OTP
  
// Here we are using random() method of util
// class in Java
import java.util.*;
  
public class NewClass
{
    static char[] OTP(int len)
    {
        System.out.println("Generating OTP using random() : ");
        System.out.print("You OTP is : ");
  
        // Using numeric values
        String numbers = "0123456789";
  
        // Using random method
        Random rndm_method = new Random();
  
        char[] otp = new char[len];
  
        for (int i = 0; i < len; i++)
        {
            // Use of charAt() method : to get character value
            // Use of nextInt() as it is scanning the value as int
            otp[i] =
             numbers.charAt(rndm_method.nextInt(numbers.length()));
        }
        return otp;
    }
    public static void main(String[] args)
    {
        int length = 4;
        System.out.println(OTP(length));
    }
}

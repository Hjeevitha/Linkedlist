package main_package.linkedlist;

import java.util.Scanner;

public class Linear_search {
	static Node head,temp;  

	public static void main(String[] args) { 

	 Scanner s = new Scanner(System.in); 


	boolean flag=true; 

	 while(flag) 

	 { 

	 Node n = new Node(); 

	 System.out.println("enter the data:"); 

	 n.data=s.nextInt(); 

	 if(head==null) 

	 { 

	 temp=head=n; 

	 } 

	 else 

	 { 

	 temp.adnextnode=n; 

	 temp=n; 

	 } 

	 System.out.println("Do you want to create another node:\n1.yes\n2.no"); 

	 int choice=s.nextInt(); 

	 if(choice==1) 

	 { 

	 flag=true; 

	 } 

	 else 

	 break; 

	 } 

	 System.out.println("`````````````````````````````````"); 

	 System.out.println("elements present in the list are:"); 

	 System.out.println("```````````````````````````````````"); 

	 temp=head; 

	 while(temp!=null) 

	 { 

	 System.out.println(temp.data); 

	 temp=temp.adnextnode; 

	 } 

	 System.out.println("`````````````````````````````````````"); 

	 System.out.println("enter the element to search"); 

	 int ele=s.nextInt(); 

	 temp=head; 

	 boolean ele_found=false; 

	 while(temp!=null) 

	 { 

	 if(temp.data==ele) 

	 { 

	 ele_found=true; 

	 break; 

	 } 

	 temp=temp.adnextnode; 

	 } 

	 if(ele_found==true) 

	 { 

	 System.out.println("element found"); 

	 } 

	 else 

	 System.out.println("element not found"); 

	  

	 

	} 

}

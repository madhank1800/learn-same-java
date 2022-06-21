public class lab470{
public static void main (String[] args){
student st1=new student(99,"sri");
System.out.println(st1);
System.out.println("\n***default limplementation***");

String cname=st1.getClass().getName();
int hc=st1.hashcode();
String hx=Integer.toHexString(hc);
String msg=cname+"@"+hx;
System.out.println(msg);
}
}
public class  student{
int sid;
String name;

student(int sid,String name){
this.sid=sid;
this.name=name;

}
}


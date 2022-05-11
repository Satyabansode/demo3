create table Employee(int id not null auto_increment, empName varchar(25),address varchar(35),primmary key(id));

create schema emp;

select max(empsalary)as "2nd max salary" from Employee where 



public class Duplicate{


String str="Hello world Hello";
String lowercase=str.toLowercase();
String a[]=lowercase.split(" ");

for(int i=0;i<str.length;i++)
{
for(int j=i+1;j<str.length;j++)
{
if(a[i]==a[j])
{
System.out.println(a[i]);
}
}
}


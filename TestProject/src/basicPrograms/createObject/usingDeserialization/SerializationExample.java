package basicPrograms.createObject.usingDeserialization;

import java.io.*;

class SerailizationExample{

public static void main(String args[]){
try
{

//Creating the object
Employee emp=new Employee(198054,"Andrew");

//Creates a stream and writes the object
FileOutputStream employeeout=new FileOutputStream("employee.txt");
ObjectOutputStream out=new ObjectOutputStream(employeeout);
out.writeObject(emp);
out.flush();

//closes the output stream
out.close();
System.out.println("Successfully Created");
}
catch(Exception e){
System.out.println(e);
}
}
}
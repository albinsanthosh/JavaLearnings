package basicPrograms.createObject;

import java.lang.reflect.*;

public class CreateObjectExample5{

private String str;

CreateObjectExample5(){
}

public void setName(String str){
this.str=str;
}

public static void main(String[] args){
try{
Constructor<CreateObjectExample5> constructor = CreateObjectExample5.class.getDeclaredConstructor();
CreateObjectExample5 r=constructor.newInstance();
r.setName("JavaTpoint");
System.out.println(r.str);
}
catch(Exception e){
e.printStackTrace();
}
}
}
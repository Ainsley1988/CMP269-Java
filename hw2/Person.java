// package hw2;



public class Person implements PersonInterface{
    private String name;
    private int age;
    private String ssn;

public Person(){

    this.name = "UN";
    this.age = 0;
    this.ssn = "000-00-0000";

}

public Person(String name,int age,String ssn){

    if(name == null){
        this.name = "UN";
    } else{
        this.name = name;
    }

    if (age < 0){
        this.age = 0;
    } else {

 this.age = age;
    }

    if(ssn == null){
        this.ssn = "000-00-0000";
    } else{
        this.ssn = ssn;
    }
    
}


public void setName(String name){
    this.name = name;
}

public String getName(){
    return this.name;
}
public void setAge(int age){

    this.age = age ;

}

public int getAge(){

    return this.age;
}

public void setSsn(String ssn){


    this.ssn = ssn;

}


public String getSsn(){

    return this.ssn;

}


public PersonInterface copy(){

String newName;
String newSSN;
if(this.name == null){
    newName = "UN";

}else{
    newName = new String(this.name);
}

if(this.ssn == null){
    newSSN = "000-00-0000";
}
else{
    newSSN = new String(this.ssn);
}

    return new Person(newName,this.age,newSSN);

}

    
}

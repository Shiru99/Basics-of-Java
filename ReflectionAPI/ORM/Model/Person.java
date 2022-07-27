package ReflectionAPI.ORM.Model;

import ReflectionAPI.ORM.Annotations.Column;
import ReflectionAPI.ORM.Annotations.PrimaryKey;

public class Person{
    @PrimaryKey(name="p_id")
    private String name;

    @Column(name = "c_age")
    private int age;

    @Column(name = "c_address")
    private String address;

    public Person(){

    }
    
    public Person(String name, int age, String address){
        this.name = name;
        this.age = age;
        this.address = address;
    }
    
    public String getName(){
        return name;
    }
    
    public int getAge(){
        return age;
    }
    
    public String getAddress(){
        return address;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public void setAddress(String address){
        this.address = address;
    }

    @Override
    public String toString(){
        return "Person [name=" + name + ", age=" + age + ", address=" + address + "]";
    }
}


package ReflectionAPI.ORM;


import java.sql.SQLException;

import ReflectionAPI.ORM.Model.Person;
import ReflectionAPI.ORM.ORM.EntityManger;

public class MainClass {
    public static void main(String[] args) {

        // MetaModel<Person> metaModel = new MetaModel<>(Person.class);
        // System.out.println(metaModel.getClazz());

        // PrimaryKeyField primaryKey = metaModel.getPrimaryKey(); 
        // List<ColumnField> columns = metaModel.getColumns();

        // System.out.println(primaryKey.getName() + " " + primaryKey.getType().getSimpleName());

        // for (ColumnField column : columns) {
        //     System.out.print(column.getName()+" " + column.getType().getSimpleName() + ", ");
        // }
        // System.out.println();



        /* Write on DB */

        EntityManger<Person> entityManger =  EntityManger.of(Person.class);

        Person p1 = new Person("James", 22, "London");
        Person p2 = new Person("Jane", 24, "New York");
        Person p3 = new Person("Jack", 25, "Tokyo");
         
        // try {
        //     entityManger.insert(p1);
        //     entityManger.insert(p2);
        //     entityManger.insert(p3);
        // } catch (SQLException e) {
        //     e.printStackTrace();
        // }

        
        /* Read on DB */

        Person p = entityManger.find(Person.class,"James");
        System.out.println(p);

    }
}


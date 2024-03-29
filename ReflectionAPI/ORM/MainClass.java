package ReflectionAPI.ORM;


import ReflectionAPI.ORM.BeanManager.BeanManager;
import ReflectionAPI.ORM.Model.Person;
import ReflectionAPI.ORM.ORM.EntityManger;
import ReflectionAPI.ORM.ORM.EntityMangerWithInject;

public class MainClass {
    public static void main(String[] args) throws Exception {

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

        /* M-1 : Without Injecting Connection */
        // EntityManger<Person> entityManger =  EntityManger.of(Person.class);

        /* M-2 : With Injecting Connection */
        BeanManager beanManager = BeanManager.getInstance();
        EntityMangerWithInject<Person> entityManger =  beanManager.getInstance(EntityMangerWithInject.class);

        Person p1 = new Person("James", 22, "London");
        Person p2 = new Person("Jane", 24, "New York");
        Person p3 = new Person("Jack", 25, "Tokyo");
         

        entityManger.insert(p1);
        entityManger.insert(p2);
        entityManger.insert(p3);
        

        
        /* Read on DB */

        Person p4 = entityManger.find(Person.class,"John");
        Person p5 = entityManger.find(Person.class,"James");

        System.out.println(p5);


        /* Delete from DB */

        Person p6 = entityManger.delete(Person.class, "John");
        Person p7 = entityManger.delete(Person.class, "James");
        System.out.println("Deleted : " + p7);

        Person p8 = entityManger.delete(Person.class, "Jane");
        Person p9 = entityManger.delete(Person.class, "Jack");

    }
}


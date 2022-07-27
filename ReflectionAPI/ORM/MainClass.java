package ReflectionAPI.ORM;


import java.util.List;

import ReflectionAPI.ORM.Model.Person;
import ReflectionAPI.ORM.Utils.ColumnFields;
import ReflectionAPI.ORM.Utils.MetaModel;
import ReflectionAPI.ORM.Utils.PrimaryKeyField;

public class MainClass {
    public static void main(String[] args) {

        MetaModel<Person> metaModel = new MetaModel<>(Person.class);
        System.out.println(metaModel.getClazz());

        PrimaryKeyField primaryKey = metaModel.getPrimaryKey(); 
        List<ColumnFields> columns = metaModel.getColumns();

        System.out.println(primaryKey.getName() + " " + primaryKey.getType().getSimpleName());

        for (ColumnFields column : columns) {
            System.out.print(column.getName()+" " + column.getType().getSimpleName() + ", ");
        }
        System.out.println();


    }
}


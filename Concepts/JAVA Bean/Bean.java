/**
 Beans are special type of Pojos. There are some restrictions on POJO to be a bean.

1. All JavaBeans are POJOs but not all POJOs are JavaBeans.
2. Serializable i.e. they should implement Serializable interface. Still, some POJOs who don’t implement a Serializable interface are called POJOs because Serializable is a marker interface and therefore not of many burdens.
3. Fields should be private. This is to provide complete control on fields.
4. Fields should have getters or setters or both.
5. A no-arg constructor should be there in a bean.
6. Fields are accessed only by constructor or getter setters.
 */
public class Bean {

    public static void main(String[] args) {
        javaBeanDemo obj = new javaBeanDemo();
        obj.setName("Abhi");
    }
}

/**
 * InnerBean
 */
class javaBeanDemo{
    private String name;
    javaBeanDemo(){

    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    
}
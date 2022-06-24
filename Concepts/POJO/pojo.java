// A POJO should not:
// Extend prespecified classes, Ex: public class GFG extends javax.servlet.http.HttpServlet { … } is not a POJO class.
// Implement prespecified interfaces, Ex: public class Bar implements javax.ejb.EntityBean { … } is not a POJO class.
// Contain prespecified annotations, Ex: @javax.persistence.Entity public class Baz { … } is not a POJO class.
public class pojo{
    public static void main(String[] args) {
        
    }
}

class pojoStructure{
    int num;
    String name;
}
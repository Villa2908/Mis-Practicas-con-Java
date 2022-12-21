package clasesInterfaces;

public class CocheCRUDImpl implements CocheCRUD{

    public CocheCRUDImpl(){}
    public String save(){
        return "Hola, soy el metodo save";
    }

    public String findAll(){
        return "Hola, soy el metodo findAll";
    }

    public String delete(){
        return "Hola, soy el metodo delete";
    }
}

package db;

public class DbException extends RuntimeException{

    private static final long serialVersionUID = 1L;
    //Criar DbException permite isolar erros de banco de dados do resto da aplicação
    
    public DbException(String msg){
        super(msg);
    }
}

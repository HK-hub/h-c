package sample.compiler.core.lexer.exception;


import lombok.Data;
import lombok.ToString;
import sample.compiler.core.lexer.status.CommentStatus;

/**
 * @author : HK意境
 * @ClassName : CommentMismatchException
 * @date : 2022/3/13 16:19
 * @description : 注释不匹配异常
 * @Todo :
 * @Bug :
 * @Modified :
 * @Version : 1.0
 */
@Data
@ToString
public class CommentMismatchException extends WordAnalyzerException{

    private int row ;
    private int col ;
    private String message ;

    public CommentMismatchException(CommentStatus status){
        super("CommentMismatchException");
        this.row = status.row;
        this.col = status.column ;
        this.message = "CommentMismatchException";

    }


}

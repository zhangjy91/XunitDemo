package DemoXunit;

/**
 * Created by duzhe on 2018/12/18.
 *
 * @Description:
 */
public class Login {


    /**
     * 模拟登陆校验方法
     * @param name 用户名
     * @param pwd 密码
     * @return 登陆返回信息
     */
    public String userLogin(String name,String pwd){

        if(name == null || name.equals("") || pwd ==null || pwd.equals("")){
            System.out.println("为空判断");
            return "用户名或密码不能为空";

        }else if (name == "admin" || name.equals("admin")){
            System.out.println("管理员");
            return "欢迎管理员";

        }else{
            System.out.println("正常用户");
            return "欢迎"+name;

        }
    }
}
public class Test05 {
    public static void main(String[] args) {
        BaseMange bm = new UserMange();
        bm.action("admin","add");
        BaseMange bm1 =new StudentMange();
        bm1.action("teacher","查询");

    }
}

abstract class BaseMange {
    public void action(String userName, String method) {
        if ("admin".equals(userName)||"teacher".equals(userName)) {
            execute(method);
        } else {
            System.out.println("无权限");
        }
    }

    abstract void execute(String method);
}

class UserMange extends BaseMange {

    @Override
    void execute(String method) {
        if("add".equals(method)){
            System.out.println("增加");
        }else if ("get".equals(method)){
            System.out.println("查询");
        }
    }
}
class StudentMange extends BaseMange{

    @Override
    void execute(String method) {
        if("查询".equals(method)){
            System.out.println("学号");
        }else if ("get".equals(method)){
            System.out.println("查询");
        }


    }
}
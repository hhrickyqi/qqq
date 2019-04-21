import java.util.Arrays;

public class Demo04 {
    public static void main(String[] args) {
//        System.err.println("这是错误！");
//        int[] a = {1,4,6,7,8};
//        int[] b = new int[a.length];
//        System.arraycopy(a,2,b,1,3);
//        System.out.println(Arrays.toString(b));
//
        System.out.println(System.getProperty("java.version"));
        /**
         * java.version	Java 运行时环境版本
         * java.home	Java 安装目录
         * os.name	操作系统的名称
         * os.version	操作系统的版本
         * user.name	用户的账户名称
         * user.home	用户的主目录
         * user.dir	用户的当前工作目录
         */
        Runtime rt = Runtime.getRuntime();
        System.out.println("处理器数量：" + rt.availableProcessors() + " 个");
        System.out.println("Jvm总内存数 ：" + rt.totalMemory() + " byte");
        System.out.println("Jvm空闲内存数： " + rt.freeMemory() + " byte");
        System.out.println("Jvm可用最大内存数： " + rt.maxMemory() + " byte");

    }
}

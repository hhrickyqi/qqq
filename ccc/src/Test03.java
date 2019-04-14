import java.util.Arrays;

public class Test03 {
    public static void main(String[] args) {
        CosmeticManager cm = new CosmeticManager();
        cm.addCosmetic(new Cosmetic("大宝","国产",20));
        cm.addCosmetic(new Cosmetic("雅诗兰黛","进口",10));
        cm.addCosmetic(new Cosmetic("曼秀雷敦","进口",15));
        cm.addCosmetic(new Cosmetic("雅诗兰黛","进口",15));
        cm.addCosmetic(new Cosmetic("曼秀雷敦","进口",10));
        cm.printInfo();
        System.out.println();
        SortCosmeticManager scm = new SortCosmeticManager();
        scm.addCosmetic(new Cosmetic("大宝","国产",20));
        scm.addCosmetic(new Cosmetic("雅诗兰黛","进口",10));
        scm.addCosmetic(new Cosmetic("曼秀雷敦","进口",15));
        scm.addCosmetic(new Cosmetic("雅诗兰黛","进口",15));
        scm.addCosmetic(new Cosmetic("曼秀雷敦","进口",10));
        scm.printInfo();
        System.out.println();
        TypeCosmeticManager tcm = new TypeCosmeticManager();
        tcm.addCosmetic(new Cosmetic("大宝","国产",20));
        tcm.addCosmetic(new Cosmetic("雅诗兰黛","进口",10));
        tcm.addCosmetic(new Cosmetic("曼秀雷敦","进口",15));
        tcm.addCosmetic(new Cosmetic("balabala","进口",13));
        tcm.addCosmetic(new Cosmetic("曼秀雷敦","进口",15));
        tcm.printInfo();

    }
}
class CosmeticManager{
    Cosmetic[] cosmetics = new  Cosmetic[5];
    int count = 0;
    /*进货功能*/
    public void addCosmetic(Cosmetic c){
        if(count == cosmetics.length){
            cosmetics = Arrays.copyOf(cosmetics,cosmetics.length - 1);
        }
        cosmetics[count++] = c;
    }
public void  printInfo(){
        for(Cosmetic c :cosmetics){
            if(null != c){
                System.out.println(c);

            }

        }
    }
}
/*只输出进口化妆品*/
class TypeCosmeticManager extends CosmeticManager{
    public void printInfo(){
        for(int i = 0;i < count; i++){
            if(cosmetics[i].getType().equals("进口")){
                System.out.println(cosmetics[i]);
            }
        }
    }
}
/*按单价排序*/
class SortCosmeticManager extends CosmeticManager{
    public void printInfo(){
        for(int i = 0;i < count;i++){
            int minIndex = i;
            for(int j = i + 1;j < count;j++){
                if(null != cosmetics[minIndex]&&null != cosmetics[j]){
                    if(cosmetics[minIndex].getPrice() > cosmetics[j].getPrice()){
                        minIndex = j;
                    }
                }
            }
            if(minIndex != i){
                Cosmetic cosmetic = cosmetics[minIndex];
                cosmetics[minIndex] = cosmetics[i];
                cosmetics[i] = cosmetic;
            }
        }
        for(Cosmetic c :cosmetics){
            System.out.println(c);
        }
    }
}
class Cosmetic{
    private String name;
    private String type;
    private int price;

    public Cosmetic(String name, String type, int price) {
        this.name = name;
        this.type = type;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Cosmetic{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", price=" + price +
                '}';
    }
}

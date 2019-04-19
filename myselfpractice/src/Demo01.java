import java.util.Arrays;

public class Demo01 {
    public static void main(String[] args) {
        CosmeticManager cm = new CosmeticManager();
        /*cm.addCosmatic(new Cosmetic("曼秀雷敦","进口",31));
        cm.addCosmatic(new Cosmetic("大宝","国产",15));
        cm.addCosmatic(new Cosmetic("欧莱雅","进口",32));
        cm.printInfo();*/
        System.out.println("----------");
        /*SortCosmeticManager scm = new SortCosmeticManager();
        scm.addCosmatic(new Cosmetic("曼秀雷敦","进口",31));
        scm.addCosmatic(new Cosmetic("大宝","国产",15));
        scm.addCosmatic(new Cosmetic("欧莱雅","进口",32));
        scm.printInfo();*/
        InmprtCosmeticManager icm = new InmprtCosmeticManager();
        icm.addCosmatic(new Cosmetic("曼秀雷敦","进口",31));
        icm.addCosmatic(new Cosmetic("大宝","国产",15));
        icm.addCosmatic(new Cosmetic("欧莱雅","进口",32));
        icm.printInfo();



    }
}
class SortCosmeticManager extends CosmeticManager{
    public void printInfo(){
        for(int i = 0;i < count;i++){
            int minIndex = i;
            for (int j = i + 1;j < count;j++){
                if(cosmetics[minIndex].getPrice()>cosmetics[j].getPrice()){
                    minIndex = j;
                }
            }
            if(minIndex !=i){
                Cosmetic cosmetic = cosmetics[minIndex];
                cosmetics[minIndex] = cosmetics[i];
                cosmetics[i] = cosmetic;
            }
        }
        for(Cosmetic c:cosmetics){
            if(null != c){
                System.out.println(c);
            }
        }
    }
}
class InmprtCosmeticManager extends CosmeticManager{
    public void printInfo(){
        for (int i = 0;i < count;i++){
            if(cosmetics[i].getType().equals("进口")){
                System.out.println(cosmetics[i]);
            }
        }
    }
}
class CosmeticManager{
    public Cosmetic[] cosmetics= new Cosmetic[3];
    public static int count = 0;
    public void addCosmatic(Cosmetic c){
        if(count == cosmetics.length){
            cosmetics = Arrays.copyOf(cosmetics,cosmetics.length + 1);
        }
        cosmetics[count++] = c;
    }
    public void printInfo(){
        for(Cosmetic c:cosmetics){
            if(null != c){
                System.out.println(c);
            }
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
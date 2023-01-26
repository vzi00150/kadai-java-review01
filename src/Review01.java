
public class Review01 {

    public static void main(String[] args) {

        // 商品価格
        int price = 1500;

        //消費税の計算メソッドを呼ぶ
        int consumptionTax = tax(price);

        //税込み価格の計算
        int taxIncludedPrice = price + consumptionTax;

        System.out.println(price + "円の商品の税込価格は" + taxIncludedPrice + "円（消費税は" + consumptionTax + "円）です。");
    }

    public static int tax(int price) {
        //税率定義(単位は％)
        int taxRate = 10;

        //消費税の計算
        double result = price * ((double) taxRate / 100);

        //整数値にキャスト
        return (int)result;
    }
}

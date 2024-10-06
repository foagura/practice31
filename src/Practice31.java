abstract class Store {    // 抽象クラスの定義
    abstract void payment();    // 抽象メソッドの定義
}

class StoreA extends Store {
    void payment() {    // 継承した抽象メソッドの実装
        System.out.println("レジでスタッフが商品の会計をする");
    }
}

class StoreB extends Store {
    void payment() {    // 継承した抽象メソッドの実装
        System.out.println("セルフレジで商品の会計をする");
    }
}

class StoreC extends Store {
    void payment() {    // 継承した抽象メソッドの実装
        System.out.println("発券機で食券を購入する");
    }
}

public class Practice31 {
    public static void main(String[] args) {
        StoreA sa = new StoreA();
        StoreB sb = new StoreB();
        StoreC sc = new StoreC();

        sa.payment();
        sb.payment();
        sc.payment();
    }
}

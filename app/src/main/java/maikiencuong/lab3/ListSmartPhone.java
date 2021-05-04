package maikiencuong.lab3;

import java.util.ArrayList;

public class ListSmartPhone {
    private static ListSmartPhone newInstance= null;
    private ArrayList<SmartPhone> phones ;

    public ListSmartPhone() {
        phones = new ArrayList<SmartPhone>();
        SmartPhone vsWhite = new SmartPhone("Điện Thoại Vsmart Joy 3 Trắng - Hàng chính hãng",632,1890000,1590000,R.drawable.vs_bac);
        SmartPhone vsBlue = new SmartPhone("Điện Thoại Vsmart Joy 3 Xanh - Hàng chính hãng",838,1790000,1590000,R.drawable.vsmart_live_xanh);
        SmartPhone vsBlack = new SmartPhone("Điện Thoại Vsmart Joy 3 Đen - Hàng chính hãng",158,1990000,1890000,R.drawable.vsmart_black_star);
        SmartPhone vsRed = new SmartPhone("Điện Thoại Vsmart Joy 3 Đỏ - Hàng chính hãng",401,2090000,2000000,R.drawable.vs_red_a);

        phones.add(vsWhite);
        phones.add(vsBlue);
        phones.add(vsRed);
        phones.add(vsBlack);
    }

    public static ListSmartPhone getNewInstance() {
        if (newInstance==null)
            newInstance = new ListSmartPhone();
        return newInstance;
    }

    public ArrayList<SmartPhone> getPhones() {
        return phones;
    }
}

package pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public class CatatanKeuangan {
    public AndroidDriver<MobileElement> driver;
    public CatatanKeuangan(AndroidDriver<MobileElement> driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(id = "com.android.permissioncontroller:id/permission_allow_button")
    private MobileElement btnAllow;
    @AndroidFindBy(id = "android:id/button1")
    private MobileElement btnOK;
    @AndroidFindBy(id = "android:id/button2")
    private MobileElement btnTutup;

    @AndroidFindBy(id = "com.chad.financialrecord:id/fabMenu")
    private MobileElement btnAdd;

    @AndroidFindBy(id = "com.chad.financialrecord:id/btnExpense")
    private MobileElement btnPengeluaran;

    @AndroidFindBy(id = "com.chad.financialrecord:id/btnIncome")
    private MobileElement btnPemasukan;

    @AndroidFindBy(id = "com.chad.financialrecord:id/tvDate")
    private MobileElement btnTanggal;

    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"01 Maret 2023\"]")
    private MobileElement btnPilihTanggal1;

    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"02 Maret 2023\"]")
    private MobileElement btnPilihTanggal2;

    @AndroidFindBy(id = "com.chad.financialrecord:id/spCategory")
    private MobileElement btnKategori;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[5]/android.widget.LinearLayout/android.widget.TextView")
    private MobileElement btnMobil;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[10]/android.widget.LinearLayout/android.widget.TextView")
    private MobileElement btnPenjualan;

    @AndroidFindBy(id = "com.chad.financialrecord:id/etAmount")
    private MobileElement jumlah;
    @AndroidFindBy(id = "com.chad.financialrecord:id/etNote")
    private MobileElement keterangan;

    @AndroidFindBy(id = "com.chad.financialrecord:id/btSave")
    private MobileElement btnSave;

    @AndroidFindBy(id = "com.chad.financialrecord:id/tvDesc")
    private MobileElement deskripsi;

//    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.view.ViewGroup[2]/android.widget.RelativeLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.TextView[2]")
//    private MobileElement uangKeluar;
//
//    @AndroidFindBy(id = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.view.ViewGroup[2]/android.widget.RelativeLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.TextView[1]")
//    private MobileElement uangMasuk;

    public void setUp(){
        btnAllow.click();
        btnTutup.click();
    }

    public void pengeluaran(){
        btnAdd.click();
        btnPengeluaran.click();
        btnTanggal.click();
        btnPilihTanggal2.click();
        btnOK.click();
        btnKategori.click();
        btnMobil.click();
        jumlah.sendKeys("300000");
        keterangan.sendKeys("Bensin");
        btnSave.click();
    }

    public void pemasukan(){
        btnAdd.click();
        btnPemasukan.click();
        btnTanggal.click();
        btnPilihTanggal1.click();
        btnOK.click();
        btnKategori.click();
        btnPenjualan.click();
        jumlah.sendKeys("1000000");
        keterangan.sendKeys("Jual Ganja");
        btnSave.click();
    }

    public String getTxtDesc() {
        return deskripsi.getText();
    }

//    public String getTxtKeluar() {
//        return uangKeluar.getText();
//    }
//    public String getTxtMasuk() {
//        return uangMasuk.getText();
//    }
}
